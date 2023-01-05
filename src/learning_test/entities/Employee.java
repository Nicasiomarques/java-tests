package learning_test.entities;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Employee {
  private String name;
  private BigDecimal salary;
  private LocalDate createdAt;

  public Employee(String name, LocalDate createdAt, BigDecimal salary) {
    this.name = name;
    this.salary = salary;
    this.createdAt = createdAt;
  }

  public String getName() {
    return name;
  }

  public BigDecimal getSalary() {
    return salary.setScale(2, RoundingMode.HALF_UP);
  }

  public void adjustSalary(BigDecimal adjustedSalary) {
    this.salary = adjustedSalary;
  }

  public LocalDate getCreatedAt() {
    return createdAt;
  }
}
