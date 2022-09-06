package org.example.structural.filter;

import org.example.structural.bridge.Blue;
import org.example.structural.bridge.Purse;

import java.util.ArrayList;
import java.util.List;

public class BlueFilter implements Filter {
    @Override
    public List<Purse> meetFilter(List<Purse> purses) {
        List<Purse> filtered = new ArrayList<>();
        for (Purse purse : purses) {
            if (purse.getColor() instanceof Blue) {
                filtered.add(purse);
            }
        }
        return filtered;
    }
}
