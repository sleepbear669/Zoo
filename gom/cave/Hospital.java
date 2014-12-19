package gom.cave;

import java.util.ArrayList;

public class Hospital implements Manage{
    private ArrayList<Behavior> hospitalMember;
    Hospital(){
        hospitalMember = new ArrayList<Behavior>();
    }
    @Override
    public void feeding() {
        for (Behavior behavior : hospitalMember) {
            behavior.eat();
        }
    }
    @Override
    public void nextYear() {
        for (Behavior behavior : hospitalMember) {
            behavior.growOld();
        }
    }
    public void hospitalization(ArrayList<Behavior> older) {
        if(!older.isEmpty()){
            System.out.println(older.size() + "Animal Come here");
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
