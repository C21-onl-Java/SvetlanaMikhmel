package ru.teachmeskills.homework7.exercise3.supplycontract;

import ru.teachmeskills.homework7.exercise3.Registr;

import java.util.Date;

public class SupplyContract extends Registr {
    private int numOfDocument;
    private String typeOfGoods;
    private int countOfGoods;
    private Date dateOfDocuments;

    public SupplyContract() {
    }

    public SupplyContract(int numOfDocument, String typeOfGoods, int countOfGoods, Date dateOfDocuments) {
        this.numOfDocument = numOfDocument;
        this.typeOfGoods = typeOfGoods;
        this.countOfGoods = countOfGoods;
        this.dateOfDocuments = dateOfDocuments;
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
        System.out.println("Контракт на поставку товаров: \n" + "Номер документа - " + numOfDocument
                + "\n" + " Тип товара - " + typeOfGoods
                + "\n" + " Количество товара - " + countOfGoods
                + "\n" + " Дата документа - " + dateOfDocuments);
    }
}
