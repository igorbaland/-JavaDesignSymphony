package StructuralUltimateDesignPatterns.decorator.artefact.main;

import StructuralUltimateDesignPatterns.decorator.artefact.Editor;

public class ArtefactDecoratorDemo {
    public static void show() {
        var editor = new Editor();
        editor.openProject("...");
    }
}
