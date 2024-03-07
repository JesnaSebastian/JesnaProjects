package Day1;

public class OtpSumCalculator {
    public static void main(String[] args) {
        String msg = "Hi Sudha otp 11111 is for txn3456";

        // Call the calculateOtpSum method to extract and calculate the sum of OTP numbers
        int otpSum = calculateOtpSum(msg);

        // Print the result
        System.out.println("Sum of OTP numbers: " + otpSum);
    }

    // Method to extract OTP numbers from a string and calculate their sum
    public static int calculateOtpSum(String msg) {
        // Split the string using non-digit characters as the delimiter
        String[] words = msg.split("\\D+");

        int otpSum = 0;

        // Loop through the words to find OTP numbers and add them to the sum
        for (String word : words) {
            // Check if the word is not empty and represents an OTP (numeric)
            if (!word.isEmpty() && word.matches("\\d+")) {
                otpSum += Integer.parseInt(word);
            }
        }

        return otpSum;
    }
}