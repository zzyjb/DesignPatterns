package com.picea.designpatterns.chainofresponsibility.v04;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
    List<Filter> filters = new ArrayList<>();

    public void addFilter(Filter filter) {
        this.filters.add(filter);
    }

    public void doFilter(Msg msg) {
        for (Filter f: this.filters) {
            f.doFilter(msg);
        }
    }
}
