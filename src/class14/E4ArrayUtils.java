package class14;

public class E4ArrayUtils {
    /*
    create a method to add two int numbers, and it should return the results back when called name of the method should be add
    */

    int add(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        E4ArrayUtils obj=new E4ArrayUtils();
        int sum=obj.add(10,20);
        System.out.println(sum);
        //System.out.println(obj.add(10,20); this way also is good
    }
}
