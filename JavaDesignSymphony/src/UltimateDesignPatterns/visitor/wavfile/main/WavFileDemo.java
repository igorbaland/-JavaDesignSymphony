package UltimateDesignPatterns.visitor.wavfile.main;

import UltimateDesignPatterns.visitor.wavfile.WavFile;
import UltimateDesignPatterns.visitor.wavfile.filters.NoiseReductionFilter;
import UltimateDesignPatterns.visitor.wavfile.filters.NormalizeFilter;
import UltimateDesignPatterns.visitor.wavfile.filters.ReverbFilter;

public class WavFileDemo {
    public static void show() {
        var wavFile = WavFile.read("myfile.wav");
        wavFile.applyFilter(new NoiseReductionFilter());
        wavFile.applyFilter(new ReverbFilter());
        wavFile.applyFilter(new NormalizeFilter());
    }
}
