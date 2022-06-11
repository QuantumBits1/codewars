package gravityflip;

import java.util.Arrays;

public class GravityFlip {

    public static void main(String[] args) {
        int[] arr = {1,4,5,3,5};
        int[] newArr = Kata.flip('L', arr);

        System.out.println(Arrays.toString(newArr));
    }
}
