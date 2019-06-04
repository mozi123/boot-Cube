package com.sona.bootcube.Factory;

import com.sona.bootcube.Entity.Cube;
import com.sona.bootcube.Impl.Array2LetterCombinator;
import com.sona.bootcube.Impl.CombinationContext;
import com.sona.bootcube.Impl.Digits2LetterCombinator;
import com.sona.bootcube.Util.CharactersUtil;

public class CombinationContextFactory {

    public static CombinationContext getContext(String intputString) {

        if (CharactersUtil.isNumeric(intputString)) {

            return new CombinationContext(new Digits2LetterCombinator(Cube.getInstance()));

        } else if (CharactersUtil.isNumericArray(intputString)) {

            return new CombinationContext(new Array2LetterCombinator(Cube.getInstance()));

        } else
        return null;
    }

}
