package review6;

public class ColdStone {
    public static void main(String[] args) {
      IceCream iCream =new   IceCream();
      iCream.flavor="Vanilla";
      iCream.color="White";
      iCream.dairyFree=false;
      iCream.price=2.99;
      iCream.eat();
      iCream.buy();
     IceCream iCream2=new IceCream();
    iCream2.flavor="Pistachio";
      iCream2.color="green";
      iCream2.dairyFree=true;
    iCream2.price=5.99;
    iCream2.eat();
     iCream2.buy();


    }
}
