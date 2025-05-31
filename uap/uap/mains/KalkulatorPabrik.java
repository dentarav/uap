package uap.mains;

import java.util.Scanner;
import uap.models.Torus;
import uap.models.Sphere;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("DENTA RAVINDRA");
        System.out.println("245150707111062");
        System.out.println("=============================================");
        
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius : ");
        double majorRadius = scanner.nextDouble();
        System.out.print("Isikan radius : ");
        double minorRadius = scanner.nextDouble();
        System.out.println("=============================================");

        Torus torus = new Torus(majorRadius, minorRadius);
        torus.printInfo();

        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius : ");
        double radius = scanner.nextDouble();
        System.out.println("=============================================");

        Sphere sphere = new Sphere(radius);
        sphere.printInfo();

        System.out.println("=============================================");
        scanner.close();
    }
}
