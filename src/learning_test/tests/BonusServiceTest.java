package learning_test.tests;

import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;

import learning_test.entities.Employee;
import learning_test.services.BonusService;

public class BonusServiceTest {
  BonusService bonusService = new BonusService();

  void withSalary(String salary, String expectedBonus) {
    BigDecimal bonus = bonusService.calculateBonus(
      new Employee("John", LocalDate.now(), new BigDecimal(salary))
    );
    Assert.assertEquals(new BigDecimal(expectedBonus), bonus);
  }
  
  @Test
  public void ShouldBeZeroWhen10PercentOfSalaryIsGreaterThen1000() {
    withSalary("25000", "0.00");
  }

  @Test
  public void ShouldBe100When10PercentOfSalaryIsLessThen1000() {
    withSalary("1000", "100.00");
  }

  @Test
  public void ShouldBe100When10PercentOfSalaryIs1000() {
    withSalary("10000", "1000.00");
  }
}
