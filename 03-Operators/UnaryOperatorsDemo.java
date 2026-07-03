public class UnaryOperatorsDemo {
    public static void main(String[] args) {
        int a = 10;

        System.out.println("Unary Operators");
        System.out.println("a = " + a);
        System.out.println("+a = " + (+a));
        System.out.println("-a = " + (-a));

        System.out.println("a++ = " + (a++));
        System.out.println("After a++ , a = " + a);

        System.out.println("--a = " + (--a));
        System.out.println("After --a , a = " + a);
    }
}
