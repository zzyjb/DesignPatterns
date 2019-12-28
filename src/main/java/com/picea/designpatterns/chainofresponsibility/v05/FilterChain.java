package com.picea.designpatterns.chainofresponsibility.v05;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<>();

    public void addFilter(Filter filter) {
        this.filters.add(filter);
    }

    public boolean doFilter(Msg msg) {
        for (Filter f: this.filters) {
            if (!f.doFilter(msg))
                return false;
        }
        return true;
    }
}
