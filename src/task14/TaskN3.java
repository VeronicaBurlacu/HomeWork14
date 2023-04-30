package task14;

import java.util.Scanner;

public class TaskN3 {
    //Write a method to return whether given number is prime or not?

    static boolean isPrime(int num){
        if (num<=1){
            return false;
        }
        for (int i = 2; i <=num/2 ; i++)
          if(num%i==0)
              return false;

          return true;

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime or not?");
        int number=scanner.nextInt();
        if(isPrime(number)){
            System.out.println(number+" is prime number");
        }else{
            System.out.println(number+" is not a prime number");
        }
    }
}
