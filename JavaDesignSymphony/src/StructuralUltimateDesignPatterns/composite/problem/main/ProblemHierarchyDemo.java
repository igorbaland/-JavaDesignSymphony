package StructuralUltimateDesignPatterns.composite.problem.main;

import StructuralUltimateDesignPatterns.composite.problem.Group;
import StructuralUltimateDesignPatterns.composite.problem.Shape;

public class ProblemHierarchyDemo {
    public static void show() {
        var group1 = new Group();
        group1.add(new Shape());    //square
        group1.add(new Shape());

        var group2 = new Group();
        group2.add(new Shape());    //circle
        group2.add(new Shape());

        var group = new Group();
        //we get a compilation error, because add method expects the shape object
        /*
        to solve this problem
            Group
                add
                    change shape to an object
         */
        group.add(group1);
        group.add(group2);
        group.render();



    }
}
