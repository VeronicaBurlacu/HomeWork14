package review6;

public class task10Review {
    public static void main(String[] args) {
        //write a program to print out duplicate elements from an array of Strings
        String [] baking={"spatula", "weighing scale", "measuring cups", "mixer", "weighing scale", "muffin tins",
                "piping bags", "spatula", "mixer", "butter", "buttercream", "cake batter"};

        for (int i=0; i< baking.length; i++){
            for (int j=i+1; j< baking.length; j++){ //+1 means give me next to check
                System.out.println("i= "+j+" and j=");
                if (baking[i].equals(baking[j])) {
                    System.out.println(baking[j]);}
                }
            }
    }
}
