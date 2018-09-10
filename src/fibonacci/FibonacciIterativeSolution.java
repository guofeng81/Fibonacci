package fibonacci;

import java.math.BigInteger;

public class FibonacciIterativeSolution implements Fibonacci {
  @Override
  public BigInteger compute(long position) {
    if (position < 2) {
      return BigInteger.valueOf(1);
    }

    BigInteger current = BigInteger.valueOf(1);
    BigInteger previous = BigInteger.valueOf(1);

    for (long i = 2; i <= position; i++) {
      BigInteger temp = current.add(previous);
      previous = current;
      current = temp;
    }

    return current;
  }
}