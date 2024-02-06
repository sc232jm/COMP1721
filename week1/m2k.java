import java.util.Scanner;

public class m2k {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter miles: ");
        double miles = scan.nextDouble();

        System.out.printf("Kilometers: %.2f\n", miles*1.609);

        scan.close();
    }
}
