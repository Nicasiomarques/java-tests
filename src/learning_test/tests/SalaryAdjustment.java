package learning_test.tests;

import java.math.BigDecimal;

import learning_test.entities.Employee;

public class SalaryAdjustment {
  public void adjust(Employee employee, Performance performance) {
    BigDecimal salary = employee.getSalary();
    if (Performance.DESIRING == performance) {
      employee.adjustSalary(salary.multiply(new BigDecimal("0.03")).add(salary));
    } else if (Performance.GOOD == performance) {
      employee.adjustSalary(salary.multiply(new BigDecimal("0.15")).add(salary));
    }
  }
}
