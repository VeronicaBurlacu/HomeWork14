package review6;

public class PrimeNumber {
    boolean givenNumb(int a){
        for(int i=2;i<a;i++){
            if (a%i==0){
                return false;
            }
        }return true;
    }

    public static void main(String[] args) {
       PrimeNumber obj=new PrimeNumber();
       boolean b=obj.givenNumb(2);
        System.out.println(b);
    }
}
