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

    @Override
    public void growOld() {
        this.age += 1;
    }

    @Override
    public void memberInfo() {
        System.out.println("gom.cave.Robot's name is " + name + " Age is " + age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
