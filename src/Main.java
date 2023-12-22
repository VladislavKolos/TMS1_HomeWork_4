import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        double n = scanner.nextDouble();
        double ost = n % 1;
        if (ost == 0) {
            System.out.println("Enter real number");
        } else {
            int result = (int) Math.round(n);
            System.out.println("Result = " + result);
        }
    }
}