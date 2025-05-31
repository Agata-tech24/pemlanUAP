package uap.models;

import uap.bases.DonutMold;

public class Torus extends DonMol {
    private double majorRadius;
    private double minorRadius;

    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    @Override
    public double getVolume() {
        return 2 * PI * PI * majorRadius * minorRadius * minorRadius * THICKNESS;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * PI * majorRadius * minorRadius;
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
