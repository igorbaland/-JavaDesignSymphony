package UltimateDesignPatterns.visitor.wavfile.filters;

import UltimateDesignPatterns.visitor.wavfile.segments.FactSegment;
import UltimateDesignPatterns.visitor.wavfile.segments.FormatSegment;

public interface AudioFilter {
    void apply(FactSegment factSegment);
    void apply(FormatSegment formatSegment);
}
