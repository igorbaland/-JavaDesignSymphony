package StructuralUltimateDesignPatterns.proxy.problem;

public class Ebook {
    private String fileName;

    public Ebook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        System.out.println("Loading the ebooks " + fileName);
    }

    public void show() {
        System.out.println("Showing the ebook " + fileName);
    }

    public String getFilename() {
        return fileName;
    }
}
