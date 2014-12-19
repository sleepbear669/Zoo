package gom.cave;

import java.util.ArrayList;

public class Hospital implements Manage{
    private ArrayList<Behavior> hospitalMember;
    private int count;
    Hospital(){
        hospitalMember = new ArrayList<Behavior>();
        count = 0;
    }
    @Override
    public void feeding() {
        System.out.println("hospital Meal Time");
        for (Behavior behavior : hospitalMember) {
            behavior.eat();
        }
    }
    @Override
    public void nextYear() {
        System.out.println("One Year Later");
        for (Behavior behavior : hospitalMember) {
            behavior.growOld();
        }
    }
    public void hospitalization(ArrayList<Behavior> older) {
        if(!older.isEmpty()){
            System.out.println(older.size() + "gom.cave.Animal Come here");
            for (Behavior behavior : older) {
                hospitalMember.add(behavior);
            }
        }
    }
    public void memberInformation() {
        System.out.println("gom.cave.Hospital member information");
        for (Behavior behavior : hospitalMember) {
            behavior.memberInfo();
        }
    }
}
