package week2;

import java.util.Scanner;

public class Spheroid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter equatorial radius in km: ");
        double equitorial = scan.nextDouble();

        System.out.print("Enter equatorial polar radius in km: ");
        double polar = scan.nextDouble();

        double eccentricity = Math.sqrt(1-(Math.pow(polar, 2)/Math.pow(equitorial, 2)));
        double volume = (4*Math.PI*Math.pow(equitorial, 2)*polar)/3;

        System.out.printf("Eccentiricity = %.3f\n", eccentricity);
        System.out.printf("Volume = %g cubic km\n", volume);

        scan.close();
    } 
}
