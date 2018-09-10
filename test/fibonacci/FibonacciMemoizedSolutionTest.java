package fibonacci;

public class FibonacciMemoizedSolutionTest implements FibonacciTest {
  @Override
  public Fibonacci createInstance() {
    return new FibonacciMemoizedSolution();
  }
}