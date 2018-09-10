package fibonacci;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FibonacciMemoizedSolution extends FibonacciRecursiveSolution {
  private Map<Long, BigInteger> memoizedSeries = new HashMap<>(); 

  @Override
  public BigInteger compute(long position) {
    if (!memoizedSeries.containsKey(position)) {
      memoizedSeries.put(position, super.compute(position));
    }

    return memoizedSeries.get(position);
  }
}