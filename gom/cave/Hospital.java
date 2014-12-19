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
        for (int i = 0; i < count; i++) {
            hospitalMember.get(i).eat();
        }
    }
    @Override
    public void nextYear() {
        System.out.println("One Year Later");
        for (int i = 0; i < count; i++) {
            hospitalMember.get(i).growOld();
        }
    }
    public void hospitalization(ArrayList<Behavior> older) {
        if(!older.isEmpty()){
            System.out.println(older.size() + "gom.cave.Animal Come here");
            for (int i = 0; i < older.size(); i++) {
                hospitalMember.add(older.get(i));
            }
        }
    }
    public void memberInformation() {
        System.out.println("gom.cave.Hospital member information");
        for (int i = 0; i < count; i++) {
            hospitalMember.get(i).memberInfo();
        }
    }
}
