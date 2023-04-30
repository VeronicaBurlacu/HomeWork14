package review6;

public class MoreStringMethods {
    public static void main(String[] args) {
        String day="Thursday";
       char character= day.charAt(2);//u
        System.out.println(character);// i wnt// know the char that is store in index 2
       int index =day.indexOf('s');//i want ow the index of character c
        System.out.println(index);//4

        System.out.println("-----separate------");

      int anotherIndex=day.indexOf("day");
        System.out.println(anotherIndex);

        System.out.println("--split--");

        String food="I love indian food";
        String[] words=food.split(" ");//we want to print all the words split them
        for(String word:words){
            System.out.println(word);
        }
}
}
