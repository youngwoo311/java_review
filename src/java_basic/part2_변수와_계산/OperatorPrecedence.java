package java_basic.part2_변수와_계산;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        System.out.println(a-b * c);
        System.out.println((a-b) * c);
        System.out.println(a > 5 && b > 5);
        System.out.println(a > 5 || b > 5);
        System.out.println(++a - 5);
        System.out.println(a);
        System.out.println(b++ - 5);
        System.out.println(b);
    }
}
