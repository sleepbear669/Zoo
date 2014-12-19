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
        System.out.println("One Year Later");
        for (Behavior behavior : zooMember) {
            behavior.growOld();
        }
    }

    public boolean checkAge(Behavior member) {
        if (!(member instanceof Robot)
                && ((Member)member).getAge() > 5) {
            return true;
        }
        return false;
    }

    public ArrayList<Behavior> fiveAgeAnimal() {
        ArrayList<Behavior> fiveAge = new ArrayList();
        Behavior temp;
        for (Behavior behavior : zooMember) {
            if (!(behavior instanceof Robot) && checkAge(behavior)) {
                temp = behavior;
                fiveAge.add(temp);
            }
        }
        return fiveAge;
    }

    @Override
    public void feeding() {
        System.out.println("Zoo Meal Time");
        for (Behavior behavior : zooMember) {
            behavior.eat();
        }
    }
}
