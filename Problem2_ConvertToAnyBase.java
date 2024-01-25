import java.util.Scanner;
public class Problem2_ConvertToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number:- ");
        int decimalInteger = sc.nextInt();
        System.out.print("Enter the base value:- ");
        int baseValue = sc.nextInt();

        String result = convertToAnyBase(decimalInteger, baseValue);

        System.out.println(decimalInteger + " in base " + baseValue + " is:- " + result);
        sc.close();
    }

    public static String convertToAnyBase(int n, int b) {
        if (n == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        
        while (n > 0) {
            int remainder = n % b;
            char digitChar = (remainder < 10) ? (char) ('0' + remainder) : (char) ('A' + remainder - 10);
            result.insert(0, digitChar);
            n /= b;
        }

        return result.toString();
    }
}