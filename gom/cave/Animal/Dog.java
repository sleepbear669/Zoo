package gom.cave.Animal;

import gom.cave.Member;
import gom.cave.Behavior;

public  class Dog extends Member implements Behavior {
    public Dog(String name){
        this.name = name;
        this.age = 0;
    }
    public void eat() {
        System.out.println("Dog eat bone");
    }

    public void memberInfo() {
        System.out.println("Dog's name is " + name + " Age is " + age);
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
        return "Dog";
    }

    @Override
    public boolean checkAge() {
        return this.age > 5;
    }
}
