package learning_test.tests;

import java.math.BigDecimal;

import learning_test.entities.Employee;
import learning_test.entities.Performance;

public class SalaryAdjustment {
  public void adjust(Employee employee, Performance performance) {
    BigDecimal salary = employee.getSalary();
    employee.adjustSalary(salary.multiply(performance.percentageReadjust()).add(salary));
  }
}
