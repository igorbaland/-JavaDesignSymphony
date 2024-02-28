package UltimateDesignPatterns.visitor.wavfile.filters;

import UltimateDesignPatterns.visitor.wavfile.segments.FactSegment;
import UltimateDesignPatterns.visitor.wavfile.segments.FormatSegment;

public class NormalizeFilter implements AudioFilter{
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Normalize on fact segment");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Normalize on format segment");
    }
}
