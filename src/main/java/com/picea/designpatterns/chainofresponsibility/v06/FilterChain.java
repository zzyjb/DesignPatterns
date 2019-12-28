package com.picea.designpatterns.chainofresponsibility.v06;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    List<Filter> filters = new ArrayList<>();
    int index = 0;

    public FilterChain addFilter(Filter filter) {
        this.filters.add(filter);
        return this;
    }

    public boolean doFilter(Request request,Response response) {
        if (index == filters.size()) return false;
        Filter filter = filters.get(index);
        index++;
        return filter.doFilter(request, response, this);
    }
}
