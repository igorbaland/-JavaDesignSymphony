package UltimateDesignPatterns.visitor.wavfile.segments;

import UltimateDesignPatterns.visitor.wavfile.filters.AudioFilter;

public class FactSegment extends Segment {
    @Override
    public void applyFilter(AudioFilter filter) {
        filter.apply(this);
    }
}
