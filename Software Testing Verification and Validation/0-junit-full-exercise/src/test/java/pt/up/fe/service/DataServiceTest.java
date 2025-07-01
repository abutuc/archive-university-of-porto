package pt.up.fe.service;

import static org.junit.jupiter.api.Assertions.*;
import static pt.up.fe.model.Race.*;

import java.time.Duration;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import pt.up.fe.model.Movie;
import pt.up.fe.model.Race;
import pt.up.fe.model.Ring;
import pt.up.fe.model.TolkienCharacter;
import pt.up.fe.service.DataService;

class DataServiceTest {

  private DataService dataService;

  @BeforeEach
  public void setup() {
    this.dataService = new DataService();
  }

  @Test
  public void ensureThatInitializationOfTolkeinCharactorsWorks() {
    TolkienCharacter frodo = new TolkienCharacter("Frodo", 33, HOBBIT);
    assertEquals(33, frodo.getAge());
    assertEquals("Frodo", frodo.getName());
    assertNotEquals("Frodon", frodo.getName());
  }

  @Test
  public void ensureFellowShipCharacterAccessByNameReturnsNullForUnknownCharacter() {
    assertNull(dataService.getFellowshipCharacter("Lars"));
  }

  @Test
  public void ensureFellowShipCharacterAccessByNameWorksGivenCorrectNameIsGiven() {
    TolkienCharacter frodo = dataService.getFellowshipCharacter("Frodo");
    assertEquals("Frodo", frodo.getName());
  }

  @Test
  public void ensureThatEqualsWorksForCharaters() {
    Object jake = new TolkienCharacter("Jake", 43, HOBBIT);
    Object sameJake = jake;
    Object jakeClone = new TolkienCharacter("Jake", 12, HOBBIT);
    assertTrue(jake.equals(sameJake));
    assertFalse(jake.equals(jakeClone));
  }

  @Test
  public void checkInheritance() {
    TolkienCharacter tolkienCharacter = this.dataService.getFellowship().get(0);
    assertNotEquals(tolkienCharacter.getClass(), Movie.class);
  }

  @Test
  public void ensureThatFrodoAndGandalfArePartOfTheFellowsip() {
    assertAll(
            () -> assertNotNull(this.dataService.getFellowshipCharacter("Frodo")),
            () -> assertNotNull(this.dataService.getFellowshipCharacter("Gandalf"))
    );
  }

  @Test
  public void ensureThatOneRingBearerIsPartOfTheFellowship() {
    List<TolkienCharacter> fellowship = this.dataService.getFellowship();
    Collection<TolkienCharacter> ringBearers = this.dataService.getRingBearers().values();
    int numberOfRingBearers = ringBearers.size();
    ringBearers.removeAll(fellowship);
    assertNotEquals(numberOfRingBearers, ringBearers.size());
  }

  @Tag("slow")
  @DisplayName("Ensure that we can call getFellowShip multiple times")
  @RepeatedTest(1000)
  public void ensureThatWeCanRetrieveFellowshipMultipleTimes() {
    this.dataService = new DataService();
    assertNotNull(dataService.getFellowship());
  }

  @Test
  public void ensureOrdering() {
    List<TolkienCharacter> fellowship = this.dataService.getFellowship();
    List<String> fellowshipNames = fellowship.stream().map(TolkienCharacter::getName).toList();
    List<String> orderedFellowshipNames = List.of("Frodo", "Sam", "Merry", "Pippin", "Gandalf", "Legolas", "Gimli", "Aragorn", "Boromir");
    assertEquals(orderedFellowshipNames, fellowshipNames);
  }

  @Test
  public void ensureAge() {
    List<TolkienCharacter> fellowship = this.dataService.getFellowship();
    assertTrue(fellowship.stream().allMatch(e -> hasValidAge(e.getRace(), e.getAge())));
  }

  @Test
  public void ensureThatFellowsStayASmallGroup() {
    List<TolkienCharacter> fellowship = this.dataService.getFellowship();
    assertThrows(IndexOutOfBoundsException.class, () -> fellowship.get(20));
  }

  @Test
  public void ensureServiceDoesNotRunToLong() {
    assertTimeout(Duration.ofSeconds(3), () -> this.dataService.update());
  }

  private boolean hasValidAge(Race race, int age) {
    if (race == HOBBIT || race == MAN) return age  < 100;
    else if (race == ELF || race == DWARF || race == MAIA) return age > 100;
    return true;
  }
}
