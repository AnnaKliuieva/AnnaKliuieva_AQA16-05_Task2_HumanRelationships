package com.company;

public class Main {

    public static void main(String[] args) {
        Man man = new Man("Алекс", "Иванов", 1.85f, 80f);
        Man man1 = new Man("Петя", "Пяточкин", 1.85f, 80f);
        Woman woman = new Woman("Катя", "Петрова", 1.70f, 60f);

        Human.сompatibilityTest(man1, man);
        Human.сompatibilityTest(man1, woman);
        Human.сompatibilityTest(woman, man);


    }
}
