package UltimateDesignPatterns.visitor.wavfile.filters;

import UltimateDesignPatterns.visitor.wavfile.segments.FactSegment;
import UltimateDesignPatterns.visitor.wavfile.segments.FormatSegment;

public class NoiseReductionFilter implements AudioFilter{
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Noise reduction on fact segment");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Noise reduction on format segment");
    }
}
