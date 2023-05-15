package ru.teachmeskills.homework8.exercise2;

public class Patient {
    private String name;
    public Doctor doctor;

    public Patient(String name) {
        this.name = name;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
