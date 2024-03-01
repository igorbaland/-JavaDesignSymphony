package StructuralUltimateDesignPatterns.decorator.problem;

public class CompressedCloudStream extends CloudStream {
    @Override
    public void write(String data) {
        var compressed = compress(data);
        super.write(compressed);
    }

    private String compress(String data) {
        //return the first 5 characters
        return data.substring(0, 5);
    }
}
