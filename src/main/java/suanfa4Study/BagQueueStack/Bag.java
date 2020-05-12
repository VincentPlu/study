package suanfa4Study.BagQueueStack;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<Item> implements Iterable<Item> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private Item[] theItems;

    public Bag() {
        clear();
    }

    private void clear() {
        size = 0;
        ensureCapacity(DEFAULT_CAPACITY);
    }

    private void ensureCapacity(int newCapacity) {
        if (newCapacity < size) {
            return;
        } else {
            Item[] oldIs = theItems;
            theItems = (Item[]) new Object[newCapacity];
            for (int i = 0; i < size(); i++) {
                theItems[i] = oldIs[i];
            }
        }
    }

    public void add(Item item) {
        if (theItems.length == size()) {
            ensureCapacity(2 * size() + 1);
        }
        theItems[size()] = item;
        size++;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<Item> iterator() {
        return new BagIterator();
    }

    private class BagIterator implements Iterator<Item> {
        private int current = 0;

        @Override
        public boolean hasNext() {
            return current < size();
        }

        @Override
        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return theItems[current++];
        }

    }

}
