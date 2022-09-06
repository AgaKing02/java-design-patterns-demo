package org.example.behavioral.iterator;

import java.util.List;

public class EmployeeContainer implements Container{
    private final List<String> names;

    public EmployeeContainer(List<String> names) {
        this.names = names;
    }


    @Override
    public Iterator getIterator() {
        return new NameIterator(this);
    }

    public List<String> getNames() {
        return names;
    }
}
