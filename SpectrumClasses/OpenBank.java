package SpectrumClasses;

import SpectrumClasses.banking.HomeLoan;

public class OpenBank {
    public static void main(String[] args) {
        HomeLoan hl = new HomeLoan(2, 3.4f, 5.4);
        System.out.println((float) hl.calculateEMI());
    }
}
