package gom.cave;

public class Robot implements Life {
    private String name;
    private int age;

    public Robot() {
        // TODO Auto-generated constructor stub
    }

    Robot(String name) {
        this.name = name;
        age = 0;
    }

    public void eat() {
        System.out.println("gom.cave.Robot Energy charging");
    }

    public void getOlder() {
        this.age += 1;
    }

    @Override
    public String toString() {
        return "gom.cave.Robot's name is " + name + " Age is " + age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
