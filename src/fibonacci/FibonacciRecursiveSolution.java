package fibonacci;

import java.math.BigInteger;

public class FibonacciRecursiveSolution implements Fibonacci {
  @Override
  public BigInteger compute(long position) {
    if (position < 2) {
      return BigInteger.valueOf(1);
    }

    return compute(position - 2).add(compute(position - 1));
  }
}