package com.sona.bootcube.Entity;

import java.util.HashMap;
import java.util.Map;

public class Cube {

    private static Map<String, String> cubeMap;

    private static Cube instance;

    private Cube(){
        initCubeMap();
    }

    private void initCubeMap() {
        cubeMap = new HashMap<String, String>() {{
            put("0", " ");
            put("1", " ");
            put("2", "abc");
            put("3", "def");
            put("4", "ghi");
            put("5", "jkl");
            put("6", "mno");
            put("7", "pqrs");
            put("8", "tuv");
            put("9", "wxyz");
        }};
    }

    public static Cube getInstance(){
        if(null == instance){
            synchronized (Cube.class){
                if (null == instance) {
                    instance = new Cube();
                }
            }
        }
        return instance;
    }

    public Map<String, String> getCubeMap() {
        return cubeMap;
    }
}
