package lak.aleksandra;

public class Main {
    public static void main(String[] args) {
        byte anyByte = 120;
        short anyShort = -32760;
        int anyInt = 120000;
        long anyLong = -95995995999596908L;
        float anyFloat = 56.57f;
        double anyDouble = 1500.57;
        boolean trueBool = true;
        boolean falseBool = false;
        char anyChar = 'Y';
        String anyString = "Any test string";

        System.out.println("Short + Byte = " + (anyShort + anyByte));
        System.out.println("Short - Byte = " + (anyShort - anyByte));
        System.out.println("Long / Int = " + (anyLong / anyInt));
        System.out.println("Int % Short = " + (anyInt % anyShort));
        System.out.println("Int + Double = " + (anyInt + anyDouble));
        System.out.println("Int * Double = " + (anyInt * anyDouble));
        System.out.println("true OR false = " + (trueBool || falseBool));
        System.out.println("true OR not false = " + (trueBool || !falseBool));
        System.out.println("true AND false = " + (trueBool && falseBool));

        if (anyInt < anyLong)
            System.out.println("Int < Long");
        else
            System.out.println("Int >= Long");

        System.out.println("кто меньше anyFloat или anyByte? - " + ((anyFloat < anyByte) ? "anyFloat" : "anyByte"));

        System.out.println("Overflow: " + (byte) (anyByte + 20));
        System.out.println("Overflow: " + (short) (anyShort - 1000));

        System.out.println("Char + Int = " + (char) (anyChar + 100000));
        System.out.println("Строка: " + anyString);
    }
}