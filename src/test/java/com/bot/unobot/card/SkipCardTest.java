package com.bot.unobot.card;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class SkipCardTest {

    @Test
    public void skipCardsTest(){
        SkipCard testCard = new SkipCard(Color.GREEN);
        Assert.assertThat(testCard.getEffect(), CoreMatchers.is(Effect.STOP));
        Assert.assertEquals(Effect.STOP, testCard.getEffect());
        testCard.setColor(Color.BLUE);
        Assert.assertEquals("skip", testCard.getSymbol().toLowerCase());
        Assert.assertThat(testCard.getColor(), CoreMatchers.is(Color.BLUE));
    }
}
