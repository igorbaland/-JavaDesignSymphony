package UltimateDesignPatterns.visitor.wavfile.segments;

import UltimateDesignPatterns.visitor.wavfile.filters.AudioFilter;

public class FormatSegment extends Segment{
    @Override
    public void applyFilter(AudioFilter filter) {
        filter.apply(this);
    }
}
