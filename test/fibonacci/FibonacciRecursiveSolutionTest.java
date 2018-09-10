package fibonacci;

public class FibonacciRecursiveSolutionTest implements FibonacciTest {
  @Override
  public Fibonacci createInstance() {
    return new FibonacciRecursiveSolution();
  }
}