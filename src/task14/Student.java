package task14;

public class Student {
    /* Create  class Student that will have a method getGrade.
     Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F
     */
  void geGrade(int score) {
  int result;
    if (score >=90) {
        System.out.println("A");
    } else if (score >= 80) {
        System.out.println("B");
    } else if (score >= 70) {
        System.out.println("C");
    } else if (score >= 50) {
        System.out.println("D");
    } else {
        System.out.println("F");
    }
}

    public static void main(String[] args) {
      Student obj=new Student();
   obj.geGrade(70);

    }
}
