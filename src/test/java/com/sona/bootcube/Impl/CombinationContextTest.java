package com.sona.bootcube.Impl;

import com.sona.bootcube.Entity.Cube;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CombinationContextTest {

    @Test
    public void executeStrategy() {

        CombinationContext context1 = new CombinationContext(new Array2LetterCombinator(Cube.getInstance()));
        List<String> output1;
        for(int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                output1 = context1.executeStrategy(String.valueOf(i) + "," + String.valueOf(j));
                System.out.println(output1);
            }
        }

        List<String> output2;
        CombinationContext context2 = new CombinationContext(new Digits2LetterCombinator(Cube.getInstance()));
        for (int m = 0; m <= 99; m++){
            output2 = context2.executeStrategy(String.valueOf(m));
            System.out.println(output2);
        }
    }
}