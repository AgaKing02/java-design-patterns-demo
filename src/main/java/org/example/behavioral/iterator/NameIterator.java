package org.example.behavioral.iterator;

public class NameIterator implements Iterator {
    int index;
    private final EmployeeContainer container;

    public NameIterator(EmployeeContainer container) {
        this.container = container;
    }

    @Override
    public boolean hasNext() {
        return index < container.getNames().size();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return container.getNames().get(index++);
        }
        return null;
    }
}
