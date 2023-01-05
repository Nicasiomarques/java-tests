package learning_test.tests;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;
import learning_test.entities.Employee;

enum Performance {
  DESIRING,
  GOOD,
  GREAT
}

public class SalaryAdjustmentTest {
  @Test
  public void adjustmentShouldBe3PercentWhenPerformanceIsDesiring() {
    SalaryAdjustment sut = new SalaryAdjustment();
    Employee employee = new Employee("john doe", LocalDate.now(), new BigDecimal("1000"));
    
    sut.adjust(employee, Performance.DESIRING);
    
    Assert.assertEquals(employee.getSalary(), new BigDecimal("1030.00"));
  }
}
