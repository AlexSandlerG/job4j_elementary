package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float inEuro = 140;
        float inDollar = 120;
        float expEuro = 2;
        float expDollar = 2;
        float outEuro = Converter.rubleToEuro(inEuro);
        float outDollars = Converter.rubleToDollar(inDollar);
        boolean passedEuro = outEuro == expEuro;
        boolean passedDollar = outDollars == expDollar;
        System.out.println("140 rubles are " + outEuro + " euro. Test result: " + passedEuro);
        System.out.println("120 rubles are " + outDollars + " dollars. Test result: " + passedDollar);
    }
}
