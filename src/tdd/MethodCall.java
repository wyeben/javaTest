package tdd;

public class MethodCall {

    public static int add(int n1, int n2, int n3, int n4){
        return n1 + n2 + n3 + n4;
    }
    public static void print(String name){
        System.out.println(name.toUpperCase());;
    }
    public static double calculate(double n1,double n2){
        double ty = n1 * 12;
        return (ty / n2)*100;
    }

    public static void main(String[] args) {
        int num = 40;
        int num2 = 50;
        int num3 = 100;
        int num4 = 21;
        int result = add(num,num2,num3,num4);
        System.out.println("the sum is:"+result);
        print("ben");

        int smileyCodePoint = 0x1F60A;

        String yellowColor = "\u001B[33m";
        String resetColor = "\u001B[0m";
        System.out.println(new String(Character.toChars(smileyCodePoint)) + resetColor + yellowColor);
        System.out.println("🤣");
        double yer = calculate(1_300,250_000);
        System.out.println(yer);
    }
}
