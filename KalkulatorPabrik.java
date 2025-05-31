package uap.mains;

import java.util.Scanner;
import uap.models.Torus;
import uap.models.Sphere;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("NAMA LENGKAP");
        System.out.println("NIM");
        System.out.println("=============================================");
        
        // Donat dengan lubang (Torus)
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        
        System.out.print("Isikan Radius : ");
        double radiusBesar = scanner.nextDouble();
        
        System.out.print("Isikan radius : ");
        double radiusKecil = scanner.nextDouble();
        
        System.out.println("=============================================");
        
        Torus donatDenganLubang = new Torus(radiusBesar, radiusKecil);
        donatDenganLubang.printInfo();
        
        System.out.println("=============================================");
        
        // Donat tanpa lubang (Sphere)
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        
        System.out.print("Isikan radius : ");
        double radiusBola = scanner.nextDouble();
        
        System.out.println("=============================================");
        
        Sphere donatTanpaLubang = new Sphere(radiusBola);
        donatTanpaLubang.printInfo();
        
        System.out.println("=============================================");
        
        scanner.close();
    }
}
