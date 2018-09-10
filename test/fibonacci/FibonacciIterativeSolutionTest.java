package fibonacci;

import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciIterativeSolutionTest implements FibonacciTest {
  @Override
  public Fibonacci createInstance() {
    return new FibonacciIterativeSolution();
  }

  @Test
  void simpleIterationForPosition50() {
    Fibonacci fibonacci = createInstance();

    assertEquals(BigInteger.valueOf(225851433717L), fibonacci.compute(55));
  }
  
  @Test
  void simpleIterationForPosition300() {
    Fibonacci fibonacci = createInstance();

    assertEquals("359579325206583560961765665172189099052367214309267232255589801", String.valueOf(fibonacci.compute(300)));
  }
}