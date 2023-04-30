package class14;

public class E2rayManipulator {
    /*
    * create a method that will take an int array cal it sumArr and return the sum of all the elements
    * from that array and then create the object of the class and call the method*/
    //return type int
    //name of the method=>sumArr
    //parameters => (int []arr)
    //body=>{ go through all the elements of the array add them and written the results}
   int sumArr(int[]arr){
       int sum=0;
       for (int i = 0; i < arr.length; i++) {
           sum=sum+arr[i];
       }
       return sum;
   }

    public static void main(String[] args) {
        E2rayManipulator obj=new E2rayManipulator();
        int[] array={10,20,30};
        int result=obj.sumArr(array);
        System.out.println(result);
    }
    }

