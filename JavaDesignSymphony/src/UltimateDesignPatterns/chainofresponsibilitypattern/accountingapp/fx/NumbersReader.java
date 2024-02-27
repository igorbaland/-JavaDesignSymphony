package UltimateDesignPatterns.chainofresponsibilitypattern.accountingapp.fx;

import UltimateDesignPatterns.chainofresponsibilitypattern.accountingapp.DataReader;

public class NumbersReader extends DataReader {

    @Override
    protected String getExtension() {
        return ".numbers";
    }

    @Override
    protected void doRead(String fileName) {
        System.out.println("Reading data from a Numbers spreadsheet: ");
    }
}
