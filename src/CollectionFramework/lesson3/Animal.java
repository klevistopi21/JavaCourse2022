package CollectionFramework.lesson3;

import java.util.Objects;

public class Animal {
    String name;
    int age;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
