package Day1;

public class Exceptionexample {
    public static void main(String[] args) {
        try {
            int j = 10;
            int i = 0;
            int div = j / i;
            System.out.println(div);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (ArithmeticException m) {
          System.out.println(m.getMessage());
        }
    }

}
