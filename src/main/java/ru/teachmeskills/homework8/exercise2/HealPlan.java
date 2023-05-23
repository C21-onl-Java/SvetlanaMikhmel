package ru.teachmeskills.homework8.exercise2;

public class HealPlan {
    public void chooseDoctor(int code, Patient patient) {
        if (code == 1) {
            patient.setDoctor(new Surgeon());
            patient.getDoctor().cure();
        } else if (code == 2) {
            patient.setDoctor(new Dentist());
            patient.getDoctor().cure();
        } else {
            patient.setDoctor(new Therapist());
            patient.getDoctor().cure();
        }
    }
}