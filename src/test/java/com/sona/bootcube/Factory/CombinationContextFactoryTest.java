package com.sona.bootcube.Factory;

import com.sona.bootcube.Entity.Cube;
import com.sona.bootcube.Impl.Array2LetterCombinator;
import com.sona.bootcube.Impl.CombinationContext;
import com.sona.bootcube.Impl.Digits2LetterCombinator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
public class CombinationContextFactoryTest {

    @Test
    public void getContext() {

        String inputString = "5,5";
        Assert.assertNotNull(CombinationContextFactory.getContext(inputString));

        inputString = "{4,2}";
        Assert.assertNull(CombinationContextFactory.getContext(inputString));

        inputString = "88";
        Assert.assertNotNull(CombinationContextFactory.getContext(inputString));

        inputString = "Test";
        Assert.assertNull(CombinationContextFactory.getContext(inputString));
    }

}