package gom.cave.Animal;
public class Dog extends Animal {
    Dog() {

    }
    public Dog(String name){
        super(name);
    }
    public void eat() {
        System.out.println("Dog eat bone");
    }

    public String toString() {
        return "Dog's name is " + name + " Age is " + age;
    }
}
