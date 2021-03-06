package gom.cave;

import java.util.Scanner;

public class Main {

    static Zoo zoo = new Zoo();
    static Hospital hospital = new Hospital();
    static int action = 0;

    public static void main(String[] args) {
        String commend = new String();
        Scanner scanner = new Scanner(System.in);
        while (true) {
        printMenu();
        commend = scanner.next();
        int key = Integer.parseInt(commend);
        behavior(key);
    }

    }

    private static void printMenu() {
        System.out.println("1 : adopt 2 : feeding 3 : zoo information 4 : hospital information  ");
    }

    public static void printType() {
        System.out.println("bear , cat , lion, dog, owl, robot ");
    }

    public static void behavior(int key) {

        Scanner scanner = new Scanner(System.in);
        switch (key) {
            case 1:
                printType();
                System.out.print("type : ");
                String type = scanner.next();
                System.out.print("name : ");
                String name = scanner.next();
                zoo.receive(type, name);
                break;
            case 2:
                feedingTime();
                break;
            case 3:
                zoo.memberInformation();
                break;
            case 4:
                hospital.memberInformation();
                break;
            case 5:
                nextYear();
                break;
            default:
                return;
        }
        action++;
        if (action % 5 == 0) {
            nextYear();
        }
        hospital.hospitalization(zoo.fiveAgeAnimal());
    }

    private static void nextYear() {
        System.out.println("One Year Later");
        zoo.nextYear();
        hospital.nextYear();
    }

    private static void feedingTime() {
        System.out.println("Zoo Meal Time");
        zoo.feeding();
        hospital.feeding();
    }
}
