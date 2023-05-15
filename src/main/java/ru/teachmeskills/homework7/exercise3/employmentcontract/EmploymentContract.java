package ru.teachmeskills.homework7.exercise3.employmentcontract;

import ru.teachmeskills.homework7.exercise3.Registr;

import java.util.Date;

public class EmploymentContract extends Registr {
    private int numOfDocument;
    private Date dateOfDocument;
    private Date dateOfEndDocument;
    private String nameOfEmployee;

    public EmploymentContract() {
    }

    public EmploymentContract(int numOfDocument, Date dateOfDocument, Date dateOfEndDocument, String nameOfEmployee) {
        this.numOfDocument = numOfDocument;
        this.dateOfDocument = dateOfDocument;
        this.dateOfEndDocument = dateOfEndDocument;
        this.nameOfEmployee = nameOfEmployee;
    }

    @Override
    public void saveDocument(Registr registr) {
        if (amount < registrs.length) {
            System.out.println("Документ сохранен, осталось мест: " + (registrs.length - amount));
            registrs[amount] = registr;
            amount++;
        } else System.out.println("Реестр заполнен");
    }

    public void getInformationOfDocument() {
        System.out.println("Контракт с сотрудником: \n" + "Номер документа - " + numOfDocument
                + "\n" + " Дата документа - " + dateOfDocument
                + "\n" + " Дата окончания контракта - " + dateOfEndDocument
                + "\n" + " Имя сотрудника - " + nameOfEmployee);
    }

}
