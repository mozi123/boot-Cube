package com.sona.bootcube.Impl;

import com.sona.bootcube.Interface.Strategy;

import java.util.List;

public class CombinationContext {

    private Strategy strategy;

    public CombinationContext(Strategy strategy){
        this.strategy = strategy;
    }

    public List<String> executeStrategy(String input){
        return strategy.execute(input);
    }
}
