import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream.iterate(2L, PrimeNumber::next);


    }

}
