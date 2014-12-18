package gom.cave.Animal;
public class Lion extends Animal {
    Lion(){

    }
    public Lion(String name){
        super(name);
    }
    public void eat() {
        System.out.println("Lion eat meat");
    }

    public String toString() {
        return "Lion's name is " + name + " Age is " + age;
    }
}
