package com.picea.designpatterns.chainofresponsibility.v06;

public interface Filter {
    boolean doFilter(Request request, Response response, FilterChain filterChain);
}
