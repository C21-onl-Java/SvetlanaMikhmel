package ru.teachmeskills.homework7.exercise3;

public abstract class Registr implements RegistrInterface {
    public Registr[] registrs = new Registr[10];
    public static int amount = 0;

    public abstract void saveDocument(Registr registr);

    public abstract void getInformationOfDocument();
}
