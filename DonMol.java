package uap.bases;

import uap.interfaces.Calculator;

public abstract class DonMol implements Calculator {
    protected final double DENSITY = 7.9; 
    protected final double THICKNESS = 0.5; 
    protected final double PI = 22.0 / 7.0;

    public abstract void printInfo();
}
