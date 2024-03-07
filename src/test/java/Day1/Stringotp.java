package Day1;

public class Stringotp {
    public static void main(String[] args) {
        String msg = "Hi Sudha otp 11111 is for txn3456";
        String msg1 = null;
        for (String word : msg.split(" ")) {

            if (word.matches("\\d{5}")) {
                msg1 = word;
                //int otp = Integer.parseInt(msg1);
            }
        }
        char[] arr = msg1.toCharArray();
        for (char elemet : arr) {
            System.out.println(elemet);
        }
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }

        System.out.println(sum);
    }

}