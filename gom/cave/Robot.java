package gom.cave;

public class Robot extends Member implements Behavior {
    private String name;
    private int age;

    Robot(String name) {
        this.name = name;
        age = 0;
    }

    public void eat() {
        System.out.println("Robot Energy charging");
    }

    @Override
    public void growOld() {
        this.age += 1;
    }

    @Override
    public void memberInfo() {
        System.out.println("Robot's name is " + name + " Age is " + age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getType() {
        return "Robot";
    }

    @Override
    public boolean checkAge() {
        return false;
    }
}
