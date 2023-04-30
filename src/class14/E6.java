package class14;

public class E6 {
   boolean isNumEven(int num){
        boolean isNumEven=false;

            if(num%2==0){
                isNumEven=true;
            }
    return isNumEven;
        }
    boolean isEven(int num){
        return num%2==0;
    }

    public static void main(String[] args) {
        E6 obj=new E6();
        System.out.println(obj.isEven(15));
    }
}
