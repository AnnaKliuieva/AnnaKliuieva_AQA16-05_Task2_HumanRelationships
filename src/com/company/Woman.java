package com.company;

import java.util.Scanner;

/**
 * Created by Anna on 23.02.2017.
 */
public class Woman extends Human {
    private final static boolean gender = false;

    public Woman(String name, String surname, float height, float weight) {
        super(gender, name, surname, height, weight);
    }

    public Woman() {
    }

    @Override
    public Human haveRelationship(Human couple) {
        if (talk(couple) && tolerateSociety(couple) && spendTimeTogether(couple))
            if (couple.isGender()) {
                System.out.println("Давай поженимся");
                return giveBirthToBaby(couple);
            }
        System.out.println("Ничего не вышло ... разбежались");
        System.out.println();
        return null;
    }

    public Human giveBirthToBaby(Human couple) {
        Human baby = null;
        int probability = (int) (Math.random() * 101);
        if (probability <= 50) {
            baby = new Man();
            baby.setGender(true);
            System.out.println(" У Вас сын.");
        } else if (probability > 50) {
            baby = new Woman();
            //baby.setGender(false);
            System.out.println("У Вас дочь.");
        }
        System.out.println("Напишите как зовут Вашего ребенка? ");
        Scanner babyNameScan = new Scanner(System.in);
        String babyName = babyNameScan.next();
        babyNameScan.close();
        baby.setName(babyName);
        baby.setSurname(couple.getSurname());
        float babyHeight;
        float babyWeight;
        if (baby.isGender()) {
            babyHeight = couple.getHeight() + 0.1f * (getHeight() - couple.getHeight());
        } else {
            babyHeight = getHeight() + 0.1f * (couple.getHeight() - getHeight());
        }

        if (baby.isGender()) {
            babyWeight = couple.getWeight() + 0.1f * (getWeight() - couple.getWeight());
        } else {
            babyWeight = getWeight() + 0.1f * (couple.getWeight() - getWeight());
        }

        baby.setHeight(babyHeight);
        baby.setWeight(babyWeight);
        System.out.println(baby);
        return baby;
    }

    @Override
    public String toString() {
        return super.toString();
    }
/*@Override
    public String toString() {
        return name + " " + surname + ", рост " + height + " м, вес " + weight + " кг.";
    }*/
}
