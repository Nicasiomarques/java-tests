package learning_test.services;

import java.math.BigDecimal;

import learning_test.entities.Employee;
import learning_test.entities.Performance;

public class SalaryAdjustmentService {
  public void adjust(Employee employee, Performance performance) {
    BigDecimal salary = employee.getSalary();
    employee.adjustSalary(salary.multiply(performance.percentageReadjust()).add(salary));
  }
}
