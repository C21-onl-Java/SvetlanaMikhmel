package ru.teachmeskills.homework8.exercise2;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Nick");
        HealPlan healPlan1 = new HealPlan();
        healPlan1.chooseDoctor(1, patient1);
        Patient patient2 = new Patient("Pobert");
        HealPlan healPlan2 = new HealPlan();
        healPlan2.chooseDoctor(2, patient2);

    }
}
