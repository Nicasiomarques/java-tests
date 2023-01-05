package learning_test.services;
import java.math.BigDecimal;
import java.math.RoundingMode;

import learning_test.entities.Employee;

public class BonusService {
  public BigDecimal calculateBonus(Employee employee) {
    BigDecimal value = employee.getSalary().multiply(new BigDecimal("0.1"));
    BigDecimal bonus = (value.compareTo(new BigDecimal("1000")) > 0) ? BigDecimal.ZERO : value;
    return bonus.setScale(2, RoundingMode.HALF_UP);
  }
}
