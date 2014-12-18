package gom.cave.Animal;
public class Bear extends Animal {
    Bear() {
    }

    public Bear(String name) {
        super(name);
    }

    public void eat() {
        System.out.println("bear eat honey");
    }

    public String toString() {
        return "Bear's name is " + name + " Age is " + age;
    }
}
