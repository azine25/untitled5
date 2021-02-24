package com;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Начало программы");
        multiplay(generateRandomAge(), 15);
        multiplay(45, 63);
        multiplay(12, 0);
        multiplay(55, 25);
        multiplay(18, 36);

    }

    public static String multiplay(int age, int temperature) {
        String result = "Возраст " + age + " Температура " + temperature;
        System.out.println(result);
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            System.out.println("Можно идти гулять");
        } else if (age > 20 && temperature > 0 && temperature < 28) {
            System.out.println("Можно идти гулять");
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома ");
        }
        return result;



    }

    public static int generateRandomAge() {
        int max = 100;
        Random a = new Random();
        return a.nextInt(max);


    }
}






