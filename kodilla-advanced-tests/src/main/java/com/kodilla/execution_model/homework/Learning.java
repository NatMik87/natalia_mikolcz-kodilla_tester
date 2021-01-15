package com.kodilla.execution_model.homework;

public class Learning {

    private int heightCm;

    public Learning (int heightCm){
        this.heightCm = heightCm;
    }

    public double getHeightM() {
        return heightCm / 100.0;
    }

    public static double calculateToHeightM(int heightCm){
        return heightCm / 100.0;
    }

    public static double calculateBMI(double heightM, double weightKG){
        return weightKG / (heightM * heightM);
    }

    public static void main(String[] args) {
        Learning learning = new Learning(185);
        System.out.println(learning.getHeightM());
        int height = 175;
        System.out.println(Learning.calculateToHeightM(height));
        System.out.println(Learning.calculateBMI(1.7, 60));

    }
}
