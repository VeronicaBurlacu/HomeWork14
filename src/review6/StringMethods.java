package review6;

public class StringMethods {
    public static void main(String[] args) {
        String str=new String("Hello");
        System.out.println(str);
        String word="Hello";
        System.out.println(word);
        //methods of the string class

        System.out.println("compare 2 strings");
        if (str.equals(word)){//with the string always word equals
            System.out.println("both strings are equals");
        }else{
            System.out.println("Strings are not equal");
        }

        //another method
        System.out.println("----length()-----");
      String name="Farwa";
       int numberOfCharacters=name.length();
        System.out.println(numberOfCharacters);

        System.out.println("-----substring()------");//extract a part of a string
        String sentence="Hello batch 16";
       String part= sentence.substring(6);
        System.out.println(sentence);
        System.out.println(part);
       String part1= sentence.substring(0,5);
        System.out.println(part1);


    }
}
