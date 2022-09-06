package org.example.structural.filter;

import org.example.structural.bridge.Purse;

import java.util.List;

public class OrFilter implements Filter {
    private Filter filter;
    private Filter anotherFilter;

    public OrFilter(Filter filter, Filter anotherFilter) {
        this.filter = filter;
        this.anotherFilter = anotherFilter;
    }

    @Override
    public List<Purse> meetFilter(List<Purse> purses) {
        List<Purse> firstList = filter.meetFilter(purses);
        List<Purse> secondList=anotherFilter.meetFilter(purses);

        for(Purse fromSecond:secondList){
            if(!firstList.contains(fromSecond)){
                firstList.add(fromSecond);
            }
        }

        return firstList;
    }
}
