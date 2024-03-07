package Day1;

import java.util.Scanner;
public class Excemptionexample2 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an amount: ");
        int amount=sc.nextInt();

        if (amount >= 100) {
            System.out.println("Proceed");
        } else if (amount < 100) {
            throw new Exception("Not sufficient amount");
        }
    }
}

