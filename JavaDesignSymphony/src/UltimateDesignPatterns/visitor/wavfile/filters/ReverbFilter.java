package UltimateDesignPatterns.visitor.wavfile.filters;

import UltimateDesignPatterns.visitor.wavfile.segments.FactSegment;
import UltimateDesignPatterns.visitor.wavfile.segments.FormatSegment;

public class ReverbFilter implements AudioFilter {
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Reverb filter on fact segment");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Reverb filter on format segment");
    }
}
