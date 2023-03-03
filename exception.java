import java.io.*;

class Exception {
    public static void main(String[] args) throws IOException {
        int num1, num2, div = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter 1st number");
            num1 = Integer.parseInt(br.readLine());
            System.out.println("Enter 2nd number");
            num2 = Integer.parseInt(br.readLine());
            div = num1 / num2;
        } catch (ArithmeticException ae) {
            System.out.println("Number cannot be divide by Zero");
        } catch (NumberFormatException ae) {
            System.out.println("Please enter number");
        } finally {
            System.out.println("The quotient is" + div);
        }
    }
}
