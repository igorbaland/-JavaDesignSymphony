package StructuralUltimateDesignPatterns.adapter.problem.filter;

import StructuralUltimateDesignPatterns.adapter.problem.Image;

public class VividFilter implements Filter{
    @Override
    public void apply(Image image) {
        System.out.println("Applying Vivid Filter");
    }
}
