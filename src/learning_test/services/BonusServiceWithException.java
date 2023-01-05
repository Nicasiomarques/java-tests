package learning_test.services;
import java.math.BigDecimal;
import java.math.RoundingMode;

import learning_test.entities.Employee;

public class BonusServiceWithException {
  public BigDecimal calculateBonus(Employee employee) {
    BigDecimal value = employee.getSalary().multiply(new BigDecimal("0.1"));
    if (value.compareTo(new BigDecimal("1000")) > 0) {
      throw new IllegalArgumentException("Funcionario ganha mais de 10000 por isso não pode receber bonus!.");
    }
    return value.setScale(2, RoundingMode.HALF_UP);
  }
}
