package learning_test.entities;
import java.math.BigDecimal;

public enum Performance {
  DESIRING {
    @Override
    public BigDecimal percentageReadjust() {
      return new BigDecimal("0.03");
    }
  },
  GOOD{
    @Override
    public BigDecimal percentageReadjust() {
      return new BigDecimal("0.15");
    }
  },
  GREAT{
    @Override
    public BigDecimal percentageReadjust() {
      return new BigDecimal("0.20");
    }
  };

  public abstract BigDecimal percentageReadjust();
}
