package ru.teachmeskills.homework7.exercise3;

import ru.teachmeskills.homework7.exercise3.employmentcontract.EmploymentContract;
import ru.teachmeskills.homework7.exercise3.financialinvoice.FinancialInvoice;
import ru.teachmeskills.homework7.exercise3.supplycontract.SupplyContract;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Registr registr1 = new EmploymentContract();
        registr1.getInformationOfDocument();
        registr1.saveDocument(registr1);
        Registr registr2 = new FinancialInvoice();
        registr2.saveDocument(registr2);
        registr2.saveDocument(registr2);
        SupplyContract num4 = new SupplyContract(2, "fff", 4, new Date());
        num4.saveDocument(num4);


    }
}
