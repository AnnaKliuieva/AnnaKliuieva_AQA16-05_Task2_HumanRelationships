package com.company;

/**
 * Created by Anna on 23.02.2017.
 */
abstract class Human {
    protected boolean gender;// man = true, woman = false
    protected String name;
    protected String surname;
    protected float height;
    protected float weight;

    public Human() {
    }

    public Human(boolean gender, String name, String surname, float height, float weight) {
        this.gender = gender;
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean talk(Human a) {
        if (isGender() && a.isGender() && (int) (Math.random() * 101) > 50) {
            System.out.println("Извини, но нам даже не о чем говорить.");
            return false;
        } else
            System.out.println("Ты очень интересный собеседник");
        return true;
    }

    public boolean tolerateSociety(Human a) {
        if (!isGender() && !a.isGender() && (int) (Math.random() * 101) <= 5) {
            System.out.println("У нас столько общего");
            return true;
        } else if (!isGender() && a.isGender() && (int) (Math.random() * 101) <= 70) {
            System.out.println("У нас столько общего");
            return true;
        } else if (isGender() && !a.isGender() && (int) (Math.random() * 101) <= 70) {
            System.out.println("У нас столько общего");
            return true;
        } else if (isGender() && a.isGender() && (Math.random() * 101) <= 5.6) {
            System.out.println("У нас столько общего");
            return true;
        } else {
            System.out.println("К сожалению, оказалось, что у нас нет ничего общего.");
            return false;
        }
    }

    public boolean spendTimeTogether(Human a) {
        if ((a.getHeight() - getHeight() > getHeight() * 0.1 ||
                getHeight() - a.getHeight() > a.getHeight() * 0.1)
                && (int) (Math.random() * 101) <= 85) {
            System.out.println("Мы замечательная пара");
            return true;
        } else if ((a.getHeight() * 0.1 >= a.getHeight() - getHeight() ||
                getHeight() * 0.1 >= getHeight() - a.getHeight())
                && (int) (Math.random() * 101) <= 95) {
            System.out.println("Мы замечательная пара");
            return true;
        } else {
            System.out.println("Жаль, но мы не сможем быть вместе");
            return false;
        }
    }

    abstract Human haveRelationship(Human couple);

    /*public static Human сompatibilityTest(Human a, Human b) {
        if (!a.isGender())
            a.haveRelationship(b);
        else if(!b.isGender())
            b.haveRelationship(a);
        else
            a.haveRelationship(b);
        return null;
    }
*/
    public static Human сompatibilityTest(Human a, Human b) {
        System.out.printf("Привет, меня зовут %s", a.getName());
        System.out.println();
        System.out.printf("Привет, а меня -- %s", b.getName());
        System.out.println();
        return a.haveRelationship(b);
    }

    @Override
    public String toString() {
        return
                "Пол - " + (gender ? "мужской" : "женский") +
                        ", имя - " + name +
                        ", фамилия - " + surname +
                        ", рост - " + height +
                        " м, вес - " + weight + " кг";
    }
}
