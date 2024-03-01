package StructuralUltimateDesignPatterns.decorator.artefact;

import StructuralUltimateDesignPatterns.decorator.artefact.decorator.ErrorDecorator;
import StructuralUltimateDesignPatterns.decorator.artefact.decorator.MainDecorator;

public class Editor {
    public void openProject(String path) {
        AbstractArtefact[] artefacts = {
                new Artefact("Main"),
                new Artefact("Demo"),
                new Artefact("EmailClient"),
                new Artefact("EmailProvider")
        };

        //we can apply multiple decorators
        artefacts[0] = new ErrorDecorator(new MainDecorator(artefacts[0]));
        artefacts[2] = new ErrorDecorator(artefacts[2]);

        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
