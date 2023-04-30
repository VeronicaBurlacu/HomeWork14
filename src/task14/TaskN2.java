package task14;

public class TaskN2 {
   // Create a method createEmail().
    // Based on values of users firstName, lastName and email type,
    // your method should return complete email Address.
    // Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com

    void createEmail(){
        char b;
        char a;
        String firstName;
        String lastName;
        String email;
        String em;

    }

    public static void main(String[] args) {
        TaskN2 name=new TaskN2();

        String firstName="Jhon";
        String lastName="snow";
        char b='@';
        String email="com";
        char a='.';
        String em="gmail";
        System.out.println(firstName+lastName+b+em+a+email);
    }
}
