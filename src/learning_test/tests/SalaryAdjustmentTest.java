package learning_test.tests;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;
import learning_test.entities.Employee;
import learning_test.entities.Performance;

public class SalaryAdjustmentTest {
  public void testEmployeePerformance(Performance performance, String salary, String salaryExpected) {
    // Arrange
    SalaryAdjustment sut = new SalaryAdjustment();
    Employee employee = new Employee("john doe", LocalDate.now(), new BigDecimal(salary));
    // Act
    sut.adjust(employee, performance);
    // Assert
    Assert.assertEquals(new BigDecimal(salaryExpected), employee.getSalary());
  }

  @Test
  public void adjustmentShouldBe3PercentWhenPerformanceIsDesiring() {
    testEmployeePerformance(Performance.DESIRING, "1000.00", "1030.00");
  }

  @Test
  public void adjustmentShouldBe15PercentWhenPerformanceIsGod() {
    testEmployeePerformance(Performance.GOOD, "1000.00", "1150.00");
  }

  @Test
  public void adjustmentShouldBe20PercentWhenPerformanceIsGreat() {
    testEmployeePerformance(Performance.GREAT, "1000.00", "1200.00");
  }
}
