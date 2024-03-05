package StructuralUltimateDesignPatterns.proxy.solution.proxy.subjectproxy;

import StructuralUltimateDesignPatterns.proxy.solution.proxy.Ebook;
import StructuralUltimateDesignPatterns.proxy.solution.proxy.RealEbook;

/*
on demand, only  when we need to show it
This proxy like an agent, it sits between the library and the Ebook.
We are not going to initialize this field, because creating a RealBook is costly. We will initialize this field only
    when we need to use it
 */
public class EbookProxy implements Ebook {
    private String fileName;
    private RealEbook ebook;

    public EbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        //lazy initialization
        if (ebook == null)
            ebook = new RealEbook(fileName);

        //we forward the task of showing an ebook to this real ebook object
        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
