package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	allInfo();
    allInfo();
    allInfo();
    allInfo();
    allInfo();
    int age = generateRandomAge();

    }
    public static void allInfo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int age = scan.nextInt();

        System.out.println("Введите температуру");
        int temperature = scan.nextInt();

        if (age >= 20 && age <= 40 && temperature >= 20 && temperature <=40) System.out.println("Можно идти гулять");
        else if (age <=20 && age >=0 && temperature >=0 && temperature <=28) System.out.println("Можно идти гулять");
        else if (age >=45 && temperature >=10 && temperature <25) System.out.println("Можно идти гулять");
        else System.out.println("Оставайтесь дома");
        System.out.println(age);
        System.out.println();
    }
    private static int generateRandomAge(){
        Random headPhones = new Random();
        return headPhones.nextInt(77);
    }
}