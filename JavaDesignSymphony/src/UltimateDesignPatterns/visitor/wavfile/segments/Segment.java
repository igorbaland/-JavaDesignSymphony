package UltimateDesignPatterns.visitor.wavfile.segments;

import UltimateDesignPatterns.visitor.wavfile.filters.AudioFilter;

public abstract class Segment {
    public abstract void applyFilter(AudioFilter filter);
}
