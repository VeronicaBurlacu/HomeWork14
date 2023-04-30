package class8;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        //print all the numbers from a starting point to an ending
        //ask the user for starting and ending
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an starting number and a ending number");
        int start=scanner.nextInt();//we asked for the first number
        int ending=scanner.nextInt();//we asked for the second number
       int number=start;
       while(number<ending){//if number is greater than the ending number
           System.out.println(number+" ");
           number++;
       }


    }
}
