package Day1;

public class Swaptwonumbers {
    public static void main(String[] args) {
        int a = 10, b = 15;
        System.out.println("Before swapping");
        System.out.println("a value is " + a +" "+"and"+" "+ "b value is  " + b);
        System.out.println("After swapping");
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a value is " + a +" "+"and"+" "+ "b value is  " + b);
    }
}
