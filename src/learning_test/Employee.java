package learning_test;
import java.math.BigDecimal;
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
    return salary;
  }

  public LocalDate getCreatedAt() {
    return createdAt;
  }
}
