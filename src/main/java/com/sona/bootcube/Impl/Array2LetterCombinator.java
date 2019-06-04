package com.sona.bootcube.Impl;

import com.sona.bootcube.Entity.Cube;
import com.sona.bootcube.Interface.Strategy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Array2LetterCombinator implements Strategy {

    private Cube cube;
    private List<String> output = new ArrayList<>();

    public Array2LetterCombinator(Cube cube){
        this.cube = cube;
    }

    @Override
    public List<String> execute(String input) {
        output.clear();
        String[] strArray = input.split(",");
        arrayCombineLetter(strArray, strArray.length);
        return output;
    }

    /**
     * Array to combined letter
     *
     * @param strArray array to be combined
     * @param length length of array
     */
    private void arrayCombineLetter(String[] strArray, int length) {
        Queue<String> q = new LinkedList<>();
        q.add("");

        while(!q.isEmpty())
        {
            String s = q.remove();
            if (s.length() == length)
                output.add(s);
            else
            {
                String val = cube.getCubeMap().get(strArray[s.length()]);
                for (int i = 0; i < val.length(); i++)
                {
                    q.add(s + val.charAt(i));
                }
            }
        }
    }
}
