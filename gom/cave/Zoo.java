package gom.cave;

import gom.cave.Animal.*;

import java.util.ArrayList;

public class Zoo implements Manage {
    private final ArrayList<Behavior> zooMember;

    Zoo() {
        zooMember = new ArrayList<Behavior>();
    }

    public void receive(String type, String name) {
        if (type.equals("bear")) {
            Behavior bear = new Bear(name);
            zooMember.add(bear);
        } else if (type.equals("cat")) {
            Behavior cat = new Cat(name);
            zooMember.add(cat);
        } else if (type.equals("dog")) {
            Behavior dog = new Dog(name);
            zooMember.add(dog);
        } else if (type.equals("lion")) {
            Behavior lion = new Lion(name);
            zooMember.add(lion);
        } else if (type.equals("owl")) {
            Behavior owl = new Owl(name);
            zooMember.add(owl);
        } else if (type.equals("robot")) {
            Behavior robot = new Robot(name);
            zooMember.add(robot);
        } else {
            System.out.println("잘못적음");
            return;
        }
    }

    public void memberInformation() {
        System.out.println("gom.cave.Zoo member information");
        for (int i = 0; i < zooMember.size(); i++) {
            zooMember.get(i).memberInfo();
        }
    }

    public void nextYear() {
        System.out.println("One Year Later");
        for (int i = 0; i < zooMember.size(); i++) {
            zooMember.get(i).growOld();
        }
    }

    public boolean checkAge(int index) {
        if (!(zooMember.get(index) instanceof Robot)
                && ((Member) zooMember.get(index)).getAge() > 5) {
            return true;
        }
        return false;
    }

    public ArrayList<Behavior> fiveAgeAnimal() {
        ArrayList<Behavior> fiveAge = new ArrayList();
        Behavior temp;
        for (int i = 0; i < zooMember.size(); i++) {
            if (!(zooMember.get(i) instanceof Robot) && checkAge(i)) {
                temp = ((Behavior) zooMember.get(i));
                fiveAge.add(temp);
            }
        }
        return fiveAge;
    }

    @Override
    public void feeding() {
        System.out.println("Zoo Meal Time");
        for (int i = 0; i < zooMember.size(); i++) {
            zooMember.get(i).eat();
        }
    }
}
