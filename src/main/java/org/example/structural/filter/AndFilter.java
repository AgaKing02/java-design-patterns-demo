package org.example.structural.filter;

import org.example.structural.bridge.Purse;

import java.util.List;

public class AndFilter implements Filter {
    private Filter filter;
    private Filter anotherFilter;

    public AndFilter(Filter filter, Filter anotherFilter) {
        this.filter = filter;
        this.anotherFilter = anotherFilter;
    }

    @Override
    public List<Purse> meetFilter(List<Purse> purses) {
        List<Purse> list = filter.meetFilter(purses);
        return anotherFilter.meetFilter(list);
    }
}
