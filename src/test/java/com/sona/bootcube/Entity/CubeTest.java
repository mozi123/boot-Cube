package com.sona.bootcube.Entity;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CubeTest {

    @Test
    public void getInstance() {

        Assert.assertNotNull(Cube.getInstance());
    }

    @Test
    public void getCubeMap() {

        Assert.assertNotNull(Cube.getInstance().getCubeMap());
    }
}