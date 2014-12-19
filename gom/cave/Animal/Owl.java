package gom.cave.Animal;

import gom.cave.Member;
import gom.cave.Behavior;

public class Owl extends Member implements Behavior {

    public Owl(String name) {

        this.name = name;
        this.age = 0;
    }

    public void eat() {
        System.out.println("Owl eat apple");
    }

    public void memberInfo() {
        System.out.println( "Owl's name is " + name + " Age is " + age);
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
        return "Owl";
    }
}
