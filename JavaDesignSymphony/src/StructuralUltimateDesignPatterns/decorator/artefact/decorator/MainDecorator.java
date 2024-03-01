package StructuralUltimateDesignPatterns.decorator.artefact.decorator;

import StructuralUltimateDesignPatterns.decorator.artefact.AbstractArtefact;

public class MainDecorator implements AbstractArtefact {
    private AbstractArtefact abstractArtefact;

    public MainDecorator(AbstractArtefact abstractArtefact) {
        this.abstractArtefact = abstractArtefact;
    }

    @Override
    public String render() {
        var mainIcon = abstractArtefact.render();
        return mainIcon + "[Error]";
    }
}
