package gom.cave.Animal;

import gom.cave.Life;

public class Bear extends Animal implements Life{

    public Bear(String name) {
        this.name = name;
        this.age = 0;
    }

    public void eat() {
        System.out.println("bear eat honey");
    }

    public String toString() {
        return "Bear's name is " + name + " Age is " + age;
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
        return "bear";
    }
}
