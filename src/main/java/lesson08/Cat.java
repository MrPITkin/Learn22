package lesson08;

import java.util.Objects;

public class Cat {
    String name;
    int age;
    String breed;
    Boss boss;

    public boolean equals(Object cat) {
        if (cat instanceof Cat newCat) {
            return Objects.equals(name, newCat.name) && age == newCat.age
                    && Objects.equals(breed, newCat.breed)
                    && Objects.equals(boss, newCat.boss);
        }
        return false;
    }
/*
    public boolean equals(Cat cat) {
        return super.equals(cat);
    }
*/
}
