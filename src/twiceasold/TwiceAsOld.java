package twiceasold;

public class TwiceAsOld {

    public static int twiceAsOld(int dadYears, int sonYears) {
        int age = dadYears - (sonYears * 2);
        return (age < 0) ? age * -1 : age;
    }

    public static void main(String[] args) {
        int year = TwiceAsOld.twiceAsOld(45,30);
        System.out.println(year);
    }
}
