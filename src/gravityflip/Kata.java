package gravityflip;

import java.util.Arrays;
import java.util.Collections;

public class Kata {

    //bubble sort algorithm
    public static int[] flipWithBubbleSort(char dir, int[] arr) {
        //arr = 3,2,1,2
        int len = arr.length;
        for(int i=0; i<len-1; i++) {
            for(int j=0; j<len-i-1; j++) {
                if(dir=='L') {
                    if(arr[j] < arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
                else {
                    if(arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }

            }
        }

        return arr;
    }

    public static int[] flipWithStream(char dir, int[] arr) {
        if(dir=='L') {
            return Arrays.stream(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                //.sorted(dir=='L'?(a,b)->a-b: (a,b)->b-a)
                .mapToInt(Integer::intValue)
                .toArray();
        }
        else {
            Arrays.sort(arr);
        }
        return arr;
    }

}
