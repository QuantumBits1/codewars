package gravityflip;

public class Kata {

    //bubble sort algorithm
    public static int[] flip(char dir, int[] arr) {
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
}
