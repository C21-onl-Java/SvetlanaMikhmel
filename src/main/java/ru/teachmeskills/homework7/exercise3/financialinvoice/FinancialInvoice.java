package ru.teachmeskills.homework7.exercise3.financialinvoice;

import ru.teachmeskills.homework7.exercise3.Registr;

import java.util.Date;

public class FinancialInvoice extends Registr {
    private double finalSumOfMonth;
    private Date dateOfDocument;
    private int numOfDocument;
    private int departmentCode;

    public FinancialInvoice() {
    }

    public FinancialInvoice(double finalSumOfMonth, Date dateOfDocument, int numOfDocument, int departmentCode) {
        this.finalSumOfMonth = finalSumOfMonth;
        this.dateOfDocument = dateOfDocument;
        this.numOfDocument = numOfDocument;
        this.departmentCode = departmentCode;
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
        System.out.println("Финансовая накладная: \n" + "Итоговая сумма за месяц - " + finalSumOfMonth
                + "\n" + " Дата документа - " + dateOfDocument
                + "\n" + " Номер документа - " + numOfDocument
                + "\n" + " Код департамента - " + departmentCode);
    }
}
