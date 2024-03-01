package StructuralUltimateDesignPatterns.decorator.solve.decorators;

import StructuralUltimateDesignPatterns.decorator.solve.Stream;

public class CompressedCloudStream implements Stream {
    private Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var compressed =compress(data);
        stream.write(compressed);
    }

    private String compress(String data) {
        return data.substring(0, 5);
    }
}
