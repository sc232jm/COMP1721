import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weight = -1;
        while(weight  <= 0) {
            try {
                System.out.print("Enter weight in kilograms: ");
                weight = scan.nextDouble();

            } catch(java.util.InputMismatchException e){
                System.out.println("Invalid weight");
                scan.nextLine();
            }
        }
        double lbs = weight*2.205*16;
        System.out.printf("Equivalent imperial weight: %d lbs %.1f oz\n", (int) lbs/16, lbs%16);
        scan.close();
    }
}