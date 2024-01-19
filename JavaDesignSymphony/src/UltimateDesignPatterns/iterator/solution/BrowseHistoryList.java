package UltimateDesignPatterns.iterator.solution;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistoryList {
    private List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        var lastIndex = urls.size() -1;
        var lastUrl = urls.remove(lastIndex);

        return lastUrl;
    }

    public Iterator<String> createIterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<String> {
        private BrowseHistoryList history;
        private int index;

        public ListIterator(BrowseHistoryList history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
