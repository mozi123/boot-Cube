package com.sona.bootcube.Impl;

import com.sona.bootcube.Entity.Cube;
import com.sona.bootcube.Interface.Strategy;

import java.util.ArrayList;
import java.util.List;

public class Digits2LetterCombinator implements Strategy {

    private Cube cube;
    private List<String> output = new ArrayList<>();

    public Digits2LetterCombinator(Cube cube){
        this.cube = cube;
    }

    @Override
    public List<String> execute(String digits) {
        output.clear();
        if (digits.length() != 0)
            digitsCombineLetter("", digits);
        return output;
    }

    /***
     * Digits to combine letter
     *
     * @param combination the string value start with
     * @param next_digits
     */
    private void digitsCombineLetter(String combination, String next_digits) {
        if (next_digits.length() == 0) {
            output.add(combination);
        }
        else {
            String digit = next_digits.substring(0, 1);
            String letters = cube.getCubeMap().get(digit);
            for (int i = 0; i < letters.length(); i++) {
                String letter = cube.getCubeMap().get(digit).substring(i, i + 1);
                digitsCombineLetter(combination + letter, next_digits.substring(1));
            }
        }
    }
}
