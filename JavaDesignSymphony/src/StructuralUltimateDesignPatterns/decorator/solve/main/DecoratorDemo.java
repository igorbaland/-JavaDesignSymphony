package StructuralUltimateDesignPatterns.decorator.solve.main;

import StructuralUltimateDesignPatterns.decorator.solve.CloudStream;
import StructuralUltimateDesignPatterns.decorator.solve.Stream;
import StructuralUltimateDesignPatterns.decorator.solve.decorators.CompressedCloudStream;
import StructuralUltimateDesignPatterns.decorator.solve.decorators.EncryptedCloudStream;

public class DecoratorDemo {
    public static void show() {
        //store as plain text
//        storeCreditCard(new CloudStream());
        //encrypt
//        storeCreditCard(new EncryptedCloudStream(new CloudStream()));
        //compressed + encrypted
        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));
    }

    private static void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234-1234");
    }
}
