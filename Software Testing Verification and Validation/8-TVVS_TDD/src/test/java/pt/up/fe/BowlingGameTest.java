package pt.up.fe;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    private static final BowlingGame bowlingGame = new BowlingGame();

    @Test
    public void testBowlingGameWithoutSparesOrStrikes() {
        List<BowlingFrame> frames = new ArrayList<>();
        frames.add(new BowlingFrame("2", "3"));
        frames.add(new BowlingFrame("5", "3"));
        frames.add(new BowlingFrame("1", "1"));
        frames.add(new BowlingFrame("3", "3"));
        frames.add(new BowlingFrame("2", "3"));
        frames.add(new BowlingFrame("7", "2"));
        frames.add(new BowlingFrame("1", "8"));
        frames.add(new BowlingFrame("5", "4"));
        frames.add(new BowlingFrame("2", "2"));
        frames.add(new BowlingFrame("3", "5"));

        assertEquals(65, bowlingGame.getScore(frames));

    }

    @Test
    public void testBowlingGameWithSpares() {
        List<BowlingFrame> frames = new ArrayList<>();
        frames.add(new BowlingFrame("2", "/"));
        frames.add(new BowlingFrame("5", "3"));
        frames.add(new BowlingFrame("1", "1"));
        frames.add(new BowlingFrame("3", "/"));
        frames.add(new BowlingFrame("2", "3"));
        frames.add(new BowlingFrame("7", "/"));
        frames.add(new BowlingFrame("1", "8"));
        frames.add(new BowlingFrame("5", "/"));
        frames.add(new BowlingFrame("2", "2"));
        frames.add(new BowlingFrame("3", "5"));

        assertEquals(86, bowlingGame.getScore(frames));
    }

    @Test
    public void testBowlingGameWithStrikes() {
        List<BowlingFrame> frames = new ArrayList<>();
        frames.add(new BowlingFrame("X", null));
        frames.add(new BowlingFrame("5", "3"));
        frames.add(new BowlingFrame("1", "1"));
        frames.add(new BowlingFrame("X", null));
        frames.add(new BowlingFrame("2", "3"));
        frames.add(new BowlingFrame("7", "2"));
        frames.add(new BowlingFrame("1", "8"));
        frames.add(new BowlingFrame("X", null));
        frames.add(new BowlingFrame("2", "2"));
        frames.add(new BowlingFrame("3", "5"));

        assertEquals(92, bowlingGame.getScore(frames));
    }

    @Test
    public void testBowlingGameWithStrikesAndSpares() {
        List<BowlingFrame> frames = new ArrayList<>();
        frames.add(new BowlingFrame("X", null));
        frames.add(new BowlingFrame("5", "/"));
        frames.add(new BowlingFrame("1", "1"));
        frames.add(new BowlingFrame("X", null));
        frames.add(new BowlingFrame("2", "3"));
        frames.add(new BowlingFrame("7", "/"));
        frames.add(new BowlingFrame("1", "8"));
        frames.add(new BowlingFrame("X", null));
        frames.add(new BowlingFrame("2", "2"));
        frames.add(new BowlingFrame("3", "5"));

        assertEquals(99, bowlingGame.getScore(frames));
    }

    @Test
    public void testBowlingGameWithAFinalRoundSpare() {
        List<BowlingFrame> frames = new ArrayList<>();
        frames.add(new BowlingFrame("X", null));
        frames.add(new BowlingFrame("5", "/"));
        frames.add(new BowlingFrame("1", "1"));
        frames.add(new BowlingFrame("X", null));
        frames.add(new BowlingFrame("2", "3"));
        frames.add(new BowlingFrame("7", "/"));
        frames.add(new BowlingFrame("1", "8"));
        frames.add(new BowlingFrame("X", null));
        frames.add(new BowlingFrame("2", "2"));
        frames.add(new BowlingFrame("3", "/"));
        frames.add(new BowlingFrame("3", null));

        assertEquals(107, bowlingGame.getScore(frames));
    }

    @Test
    public void testBowlingGameWithAFinalRoundStrike() {
        List<BowlingFrame> frames = new ArrayList<>();
        frames.add(new BowlingFrame("X", null));
        frames.add(new BowlingFrame("5", "/"));
        frames.add(new BowlingFrame("1", "1"));
        frames.add(new BowlingFrame("X", null));
        frames.add(new BowlingFrame("2", "3"));
        frames.add(new BowlingFrame("7", "/"));
        frames.add(new BowlingFrame("1", "8"));
        frames.add(new BowlingFrame("X", null));
        frames.add(new BowlingFrame("2", "X"));
        frames.add(new BowlingFrame("3", "5"));

        assertEquals(117, bowlingGame.getScore(frames));
    }




}
