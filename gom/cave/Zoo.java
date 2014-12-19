package gom.cave;

import java.util.ArrayList;
import gom.cave.Animal.*;

public class Zoo implements Manage {
    private final ArrayList<Life> zooMember;

    Zoo() {
        zooMember = new ArrayList<Life>();
    }

    public void receive(String type, String name) {
        if (type.equals("bear")) {
            Life bear = new Bear(name);
            zooMember.add(bear);
        } else if (type.equals("cat")) {
            Life cat = new Cat(name);
            zooMember.add(cat);
        } else if (type.equals("dog")) {
            Life dog = new Dog(name);
            zooMember.add(dog);
        } else if (type.equals("lion")) {
            Life lion = new Lion(name);
            zooMember.add(lion);
        } else if (type.equals("owl")) {
            Life owl = new Owl(name);
            zooMember.add(owl);
        } else if (type.equals("robot")) {
            Life robot = new Robot(name);
            zooMember.add(robot);
        } else {
            System.out.println("잘못적음");
            return;
        }
    }

    public void memberInformation() {
        System.out.println("==========");
        System.out.println("gom.cave.Zoo member information");
        System.out.println("==========");
        System.out.println("<==========>");
        for (int i = 0; i < zooMember.size(); i++) {
            System.out.println(zooMember.get(i).toString());
        }
        System.out.println("<==========>");
    }

    public void nextYear() {
        System.out.println("==========");
        System.out.println("One Year Later");
        System.out.println("==========");
        for (int i = 0; i < zooMember.size(); i++) {
            zooMember.get(i).growOld();
        }
    }

    public boolean checkAge(int index) {
        if (!(zooMember.get(index) instanceof Robot)
                && ((Animal) zooMember.get(index)).getAge() > 5) {
            return true;
        }
        return false;
    }

    public ArrayList<Life> fiveAgeAnimal() {
        ArrayList<Life> fiveAge = new ArrayList();
        Life temp;
        for (int i = 0; i < zooMember.size(); i++) {
            if (!(zooMember.get(i) instanceof Robot) && checkAge(i)) {
                temp = ((Life) zooMember.get(i));
                fiveAge.add(temp);
            }
        }

        synchronized (zooMember) {
            zooMember.removeAll(fiveAge);
        }

        return fiveAge;
    }

    @Override
    public void feeding() {
        System.out.println("==========");
        System.out.println("Zoo Meal Time");
        System.out.println("==========");
        for (int i = 0; i < zooMember.size(); i++) {
            zooMember.get(i).eat();
        }
    }
}
