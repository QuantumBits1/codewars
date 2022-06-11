/*
public class PrimeNumber {
    private long lastPrimeNumber = 0L;

    public String next() {
        setLastPrimeNumber(next(getLastPrimeNumber()));
        return String.valueOf(getLastPrimeNumber());
    }

    public static String next(long after) {
        long counter = after;

        while(!isPrime(++counter))
            ;

        return longToString(counter);

    }

    public static boolean isPrime(long number) {
        if(number <= 1)
            return false;

        if(number == 2)
            return true;

        if(number % 2 == 0)
            return false;

        long maxDivisor = (long) Math.sqrt(number);
        for (int counter = 3; counter <= maxDivisor; counter += 2) {
            if (number % counter == 0) {
                return false;
            }
        }
        return true;
    }

    public static String longToString(long number) {
        return String.valueOf(number);
    }

    public long getLastPrimeNumber() {
        return lastPrimeNumber;
    }

    public void setLastPrimeNumber(long lastPrimeNumber) {
        this.lastPrimeNumber = lastPrimeNumber;
    }
}
*/