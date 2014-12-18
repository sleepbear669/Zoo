package gom.cave.Animal;
public class Owl extends Animal {
    Owl() {

    }

    public Owl(String name) {
        super(name);
    }

    public void eat() {
        System.out.println("Owl eat apple");
    }

    public String toString() {
        return "Owl's name is " + name + " Age is " + age;
    }
}
