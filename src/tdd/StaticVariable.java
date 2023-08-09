package tdd;

public class StaticVariable {
  static int count = 0;

    public StaticVariable() {
        count++;
    }

    public static void main(String[] args) {
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();
        StaticVariable obj3 = new StaticVariable();
        StaticVariable obj4 = new StaticVariable();


        System.out.println("Number of instances created: " + count);
    }
}
