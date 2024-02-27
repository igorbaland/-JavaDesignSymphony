package UltimateDesignPatterns.chainofresponsibilitypattern.accountingapp;

import UltimateDesignPatterns.chainofresponsibilitypattern.accountingapp.fx.ExcelReader;
import UltimateDesignPatterns.chainofresponsibilitypattern.accountingapp.fx.NumbersReader;
import UltimateDesignPatterns.chainofresponsibilitypattern.accountingapp.fx.QuickBooksReader;

public class DataReaderFactory {
    public static DataReader getDataReaderChain() {
        var excelReader = new ExcelReader();
        var numbersReader = new NumbersReader();
        var quickBooksReader = new QuickBooksReader();

        quickBooksReader.setNext(numbersReader);
        numbersReader.setNext(excelReader);

        return quickBooksReader;
    }
}
