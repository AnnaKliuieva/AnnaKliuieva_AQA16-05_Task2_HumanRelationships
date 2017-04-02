package com.company;

/**
 * Created by Anna on 23.02.2017.
 */
public class Man extends Human {
    private final static boolean gender = true;

    public Man(String name, String surname, float height, float weight) {
        super(gender, name, surname, height, weight);
    }

    public Man() {
        super();
    }

    /*  @Override
      Human haveRelationship(Human couple) {
          if (talk(couple) && tolerateSociety(couple) && spendTimeTogether(couple))
              if (isGender() == couple.isGender())
                  System.out.println("Извини, ничего не вышло");
          return null;
      }
  */
    @Override
    public Human haveRelationship(Human couple) {
        if (talk(couple) && tolerateSociety(couple) && spendTimeTogether(couple))
            if (!couple.isGender()) {
                System.out.println("Давай поженимся");
                return  ((Woman) couple).giveBirthToBaby(this);
            }
        System.out.println("Ничего не вышло ... разбежались");
        System.out.println();
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    /* @Override
    public String toString() {
        return name + " " + surname + ", рост " + height + " м, вес " + weight + " кг.";
    }
    */
}
