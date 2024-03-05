package StructuralUltimateDesignPatterns.proxy.solution.proxy;

import StructuralUltimateDesignPatterns.proxy.solution.proxy.Ebook;

public class RealEbook implements Ebook {
    private String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }


    @Override
    public void show() {
        System.out.println("Showing the Ebook: " + fileName);
    }

    @Override
    public String getFileName() {
        return fileName;
    }

    private void load() {
        System.out.println("Loading the ebook's" + fileName);
    }
}
