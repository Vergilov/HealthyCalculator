package com.vergilov;


public class HealthyCalculator {
    private String activity;
    private Person person;


    @FunctionalInterface
    public interface Multiply {
        double multiply(Double one, Double two);
    }

    public HealthyCalculator(String activity,Person person) {
        this.activity = activity;
        this.person=person;
    }


    public double heightToMeterPowerTwo(double height) {
        Multiply multiple = (one, two) -> (one / 100) * (two / 100);
        return multiple.multiply(height, height);
    }


    public double resultTwoDecimalPlaces(double input) {
        return (double) Math.round(input * 100) / 100;
    }

    public boolean isWomen() {
        boolean isWomen = false;
        if (this.person.getGender().equalsIgnoreCase("Women")) {
            isWomen = true;
        }
        return isWomen;
    }

    public boolean isMen() {
        boolean isMen = false;
        if (this.person.getGender().equalsIgnoreCase("Men")) {
            isMen = true;
        }
        return isMen;
    }

    public String getActivity() {
        return activity;
    }

    public Person getPerson() {
        return person;
    }
    //
//    public void caloriesNeededDaily() {
//        System.out.println("You need: " + calculateBMR() + " Calories:");
//        System.out.println("Fat: " + calculateFatDaily());
//        System.out.println("Carbo: " + calculatecarbohydratesDaily());
//        System.out.println("Protein: " + calculateProteinDaily());
//    }
//
//    private double calculateProteinDaily() {
//        return resultTwoDecimalPlaces(calculateBMR() * 0.2);  //20% protein daily
//    }
//
//    private double calculatecarbohydratesDaily() {
//        return resultTwoDecimalPlaces(calculateBMR() * 0.5);  //50% carbo daily
//    }
//
//    private double calculateFatDaily() {
//        return resultTwoDecimalPlaces(calculateBMR() * 0.3);  //30% protein daily
//    }
}
