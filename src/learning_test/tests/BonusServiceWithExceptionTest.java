package learning_test.tests;

import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;

import learning_test.entities.Employee;
import learning_test.services.BonusServiceWithException;

public class BonusServiceWithExceptionTest {
  BonusServiceWithException bonusService = new BonusServiceWithException();

  void withSalary(String salary, String expectedBonus) {
    BigDecimal bonus = bonusService.calculateBonus(
        new Employee("John", LocalDate.now(), new BigDecimal(salary)));
    Assert.assertEquals(new BigDecimal(expectedBonus), bonus);
  }

  @Test
  public void ShouldBe100When10PercentOfSalaryIsLessThen1000() {
    withSalary("1000", "100.00");
  }

  @Test
  public void ShouldBe100When10PercentOfSalaryIs1000() {
    withSalary("10000", "1000.00");
  }

  @Test
  public void ShouldReturnAnIllegallyExceptionWhenBonusIsGreaterThen1000() {
    Employee employee = new Employee("John", LocalDate.now(), new BigDecimal("10001"));
    Assert.assertThrows(IllegalArgumentException.class, () -> bonusService.calculateBonus(employee));

    try {
      bonusService.calculateBonus(employee);
      Assert.fail("Should not get here!");
    } catch (IllegalArgumentException e) {
      Assert.assertEquals("Funcionario ganha mais de 10000 por isso não pode receber bonus!.", e.getMessage());
    }
  }
}
