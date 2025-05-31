package uap.mains;

import java.util.Scanner;
import uap.models.Torus;
import uap.models.Sphere;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("Cheren Agata Devona Syallom");
        System.out.println("245150707111057");
        System.out.println("=============================================");

        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double majorRadius = scanner.nextDouble(); 
        System.out.print("Isikan radius   : ");
        double minorRadius = scanner.nextDouble(); 

        Torus torus = new Torus(majorRadius, minorRadius);
        System.out.println("=============================================");
        torus.printInfo();

        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double radius = scanner.nextDouble(); 

        Sphere sphere = new Sphere(radius);
        System.out.println("=============================================");
        sphere.printInfo();
        System.out.println("=============================================");

        scanner.close();
    }
}
