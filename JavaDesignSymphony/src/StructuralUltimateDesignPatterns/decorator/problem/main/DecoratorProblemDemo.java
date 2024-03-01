package StructuralUltimateDesignPatterns.decorator.problem.main;

import StructuralUltimateDesignPatterns.decorator.problem.CloudStream;
import StructuralUltimateDesignPatterns.decorator.problem.EncryptedCloudStream;

public class DecoratorProblemDemo {
    public static void show() {
//        var cloudStream = new CloudStream();
        var encryptedCloudStream = new EncryptedCloudStream();
        encryptedCloudStream.write("Here is some data");
    }
}
