package gom.cave;

import gom.cave.Animal.*;

import java.util.ArrayList;
import java.util.Iterator;

public class Zoo implements Manage {
    private final ArrayList<Behavior> zooMember;

    Zoo() {
        zooMember = new ArrayList<Behavior>();
    }

    public void receive(String type, String name) {
        Behavior member;
        if (type.equals("bear")) {
            member = new Bear(name);
        } else if (type.equals("cat")) {
            member = new Cat(name);
        } else if (type.equals("dog")) {
            member = new Dog(name);
        } else if (type.equals("lion")) {
            member = new Lion(name);
        } else if (type.equals("owl")) {
            member = new Owl(name);
        } else if (type.equals("robot")) {
            member = new Robot(name);
        } else {
            System.out.println("잘못적음");
            return;
        }
        zooMember.add(member);
    }

    public void memberInformation() {
        System.out.println("gom.cave.Zoo member information");
        for (Behavior behavior : zooMember) {
            behavior.memberInfo();
        }
    }

    public void nextYear() {
        for (Behavior behavior : zooMember) {
            behavior.growOld();
        }
    }

    public ArrayList<Behavior> fiveAgeAnimal() {
        ArrayList<Behavior> fiveAge = new ArrayList();
        Behavior temp;
        for (Behavior behavior : zooMember) {
            if (behavior.checkAge()) {
                temp = behavior;
                fiveAge.add(temp);
            }
        }
        zooMember.removeAll(fiveAge);
        return fiveAge;
    }

    @Override
    public void feeding() {
        for (Behavior behavior : zooMember) {
            behavior.eat();
        }
    }
}
