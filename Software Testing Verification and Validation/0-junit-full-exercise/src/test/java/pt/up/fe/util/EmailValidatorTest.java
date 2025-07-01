package pt.up.fe.util;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class EmailValidatorTest {

  @Test
  public void ensureThatEmailValidatorReturnsTrueForValidEmail() {
    assertTrue(EmailValidator.isValidEmail("lars.vogel@gmail.com"));
  }

  @Test
  @DisplayName("Ensure that the usage of a subdomain is still valid, see https://en.wikipedia.org/wiki/Subdomain")
  public void emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
    assertTrue(EmailValidator.isValidEmail("lars.vogel@edu.fe.up.pt"));
  }

  @Test
  @DisplayName("Ensure that a missiong top level domain returns false")
  public void emailValidator_InvalidEmailNoTld_ReturnsFalse() {
    assertFalse(EmailValidator.isValidEmail("lars.vogel@pt"));
  }

  @Test
  public void emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
    assertFalse(EmailValidator.isValidEmail("lars.vogel@gmail..com"));
  }

  @Test
  public void emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
    assertFalse(EmailValidator.isValidEmail("@gmail.com"));
  }

  @Test
  public void emailValidator_EmptyString_ReturnsFalse() {
    assumeTrue(System.getProperty("os.name").contains("Mac"));
    assertFalse(EmailValidator.isValidEmail(""));
  }

  @Test
  @EnabledOnOs(value = OS.MAC, disabledReason = "This test should only run on a Mac")
  public void emailValidator_NullEmail_ReturnsFalse() {
    assertFalse(EmailValidator.isValidEmail(null));
  }
}
