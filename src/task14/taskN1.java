package task14;

public class taskN1 {
    //Create a method that will say Hello in different language based on the country
    // hat will be passed when method is executed.

void hello(){
    System.out.println ("American: hello");
}
void salve(){
    System.out.println("Italian :salve");
    }
    void Bonjour(){
    System.out.println("France:Bonjour");
    }
    void Salut()
    {
        System.out.println("Romanian:Salut");
    }

    public static void main(String[] args) {
        taskN1 obj=new taskN1();
        obj.hello();
        obj.salve();
        obj.Bonjour();
        obj.Salut();
    }
}


