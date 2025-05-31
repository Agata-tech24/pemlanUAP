package uap.models;

import uap.bases.DonutMold;

public class Sphere extends DonMol {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * PI * radius * radius * radius * THICKNESS;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * radius * radius;
    }

    @Override
    public double getMass() {
        return getVolume() * DENSITY;
    }

    @Override
    public double toKilogram() {
        return getMass() / 1000.0;
    }

    @Override
    public int getShippingCost() {
        return (int) Math.ceil(toKilogram()) * 10000;
    }

    @Override
    public void printInfo() {
        System.out.printf("Volume          : %.2f\n", getVolume());
        System.out.printf("Luas permukaan  : %.2f\n", getSurfaceArea());
        System.out.printf("Massa           : %.2f\n", getMass());
        System.out.printf("Massa dalam kg  : %.2f\n", toKilogram());
        System.out.printf("Biaya kirim     : Rp%d\n", getShippingCost());
    }
}
