package StructuralUltimateDesignPatterns.proxy.solution.proxy.subjectproxy;

import StructuralUltimateDesignPatterns.proxy.solution.proxy.Ebook;
import StructuralUltimateDesignPatterns.proxy.solution.proxy.RealEbook;

public class LoggingEbookProxy implements Ebook {
    private String fileName;
    private RealEbook ebook;

    public LoggingEbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if (ebook == null)
            ebook = new RealEbook(fileName);

        System.out.println("Logging");
        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
