package gom.cave.Animal;

import gom.cave.Life;

public class Cat extends Animal implements Life {

    public Cat(String name) {
        this.name = name;
        this.age = 0;
    }

    public void eat() {
        System.out.println("Cat eat milk");
    }

    public String toString() {
        return "Cat's name is " + name + " Age is " + age;
    }

    @Override
    public void growOld() {
        this.age++;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getType() {
        return "Cat";
    }
}
