package gom.cave.Animal;
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    public void eat() {
        System.out.println("Cat eat milk");
    }

    public String toString() {
        return "Cat's name is " + name + " Age is " + age;
    }
}
