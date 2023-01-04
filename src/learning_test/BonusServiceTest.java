package learning_test;

import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;

public class BonusServiceTest {
  @Test
  public void ShouldBeZeroWhen10PercentOfSalaryIsGreaterThen1000() {
    BonusService bonusService = new BonusService();
    BigDecimal bonus = bonusService.calculateBonus(
      new Employee("John", LocalDate.now(), new BigDecimal("25000"))
    );
    Assert.assertEquals(
      new BigDecimal("0.00"),
      bonus
    );
  }

  @Test
  public void ShouldBe100When10PercentOfSalaryIsLessThen1000() {
    BonusService bonusService = new BonusService();
    BigDecimal bonus = bonusService.calculateBonus(
      new Employee("John", LocalDate.now(), new BigDecimal("1000"))
    );
    Assert.assertEquals(
      new BigDecimal("100.00"),
      bonus
    );
  }

  @Test
  public void ShouldBe100When10PercentOfSalaryIs1000() {
    BonusService bonusService = new BonusService();
    BigDecimal bonus = bonusService.calculateBonus(
      new Employee("John", LocalDate.now(), new BigDecimal("10000"))
    );
    Assert.assertEquals(
      new BigDecimal("1000.00"),
      bonus
    );
  }
}
