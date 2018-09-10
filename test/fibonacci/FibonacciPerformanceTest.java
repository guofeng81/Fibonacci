package fibonacci;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FibonacciPerformanceTest {

  public long computeTime(Fibonacci fibonacci) {
    long startTime = System.nanoTime(); 
    
    fibonacci.compute(25);

    return System.nanoTime() - startTime;
  }

  @Test
  void comparePerformanceBetweenMemoizeAndRecursionAtPosition25() {
    long recursiveTime = computeTime(new FibonacciRecursiveSolution());
    long memoizedTime = computeTime(new FibonacciMemoizedSolution());

    assertTrue(memoizedTime < recursiveTime / 10);
  }
}