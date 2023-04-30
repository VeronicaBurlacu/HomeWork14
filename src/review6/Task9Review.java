package review6;

import java.util.Arrays;

public class Task9Review {
    public static void main(String[] args) {
        int[] num={3,2,3,43,454,3433};
        Arrays.sort(num);
        System.out.println("second largest number in the array is "+num[num.length-2]);
    }
}
