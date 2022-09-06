package org.example.structural.filter;

import org.example.structural.bridge.Purse;

import java.util.List;

public interface Filter {
    List<Purse> meetFilter(List<Purse> purses);
}
