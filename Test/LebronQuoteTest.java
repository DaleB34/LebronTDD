import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeBronQuoteTest
{
    //start of quote tests
    @Test
    void logicalQuote()
    {
        LeBronQuote q = new LeBronQuote();
        q.setQuote("I'm a fan of LeBron James. I'm not really a team fan; I'm just a fan of one player.");
        assertFalse(q.getQuote().matches(".*(don't like|hate).* LeBron James.*"));
        // "don't like" or "hate" and LeBron in the same sentence💔
    }

    @Test
    void notLogicalQuote()
    {
        LeBronQuote q = new LeBronQuote();
        q.setQuote("I don't like one-foot jumpers like LeBron James. It looks better jumping off two feet. Every time Michael Jordan jumped off two feet, it looked so much better.");
        assertTrue(q.getQuote().matches(".*(don't like|hate).* LeBron James.*"));
        // "don't like" or "hate" and LeBron in the same sentence💔
    }

    @Test
    void aboutBasketball()
    {
        LeBronQuote q = new LeBronQuote();
        q.setQuote("You know, I'm just 6'9\" and 260. And just so happen to be very good at playing the game of basketball.");
        assertTrue(q.getQuote().matches(".*(basketball|NBA).*"));
    }

    @Test
    void notAboutBasketball()
    {
        LeBronQuote q = new LeBronQuote();
        q.setQuote("I'm just a little kid from Akron");
        assertFalse(q.getQuote().matches(".*(basketball|NBA).*"));
    }

    @Test
    void isLore()
    {
        LeBronQuote q = new LeBronQuote();
        q.setQuote("The first time I stepped on an NBA court I became a businessman.");
        assertTrue(q.getQuote().matches(".*(first time).*"));
    }

    @Test
    void isNotLore()
    {
        LeBronQuote q = new LeBronQuote();
        q.setQuote("I do have motivation. A lot of motivation.");
        assertFalse(q.getQuote().matches(".*(first time).*"));
    }

    @Test
    void GOATDebate()
    {
        LeBronQuote q = new LeBronQuote();
        q.setQuote("Most people, they're dug in. 'Michael Jordan is the best player, and there's nothing LeBron can do.' A lot of people dug in that LeBron is whiny and he complains, he jumped teams, he wants all the best players. And once you have your mind made up on a particular topic, there's no moving you off of that." );
        assertTrue(q.getQuote().matches(".*(Michael Jordan|GOAT).*"));
    }

    @Test
    void notGOATDebate()
    {
        LeBronQuote q = new LeBronQuote();
        q.setQuote("I do have motivation. A lot of motivation." );
        assertFalse(q.getQuote().matches(".*(Michael Jordan|GOAT).*"));
    }

    @Test
    void aboutLeBron()
    {
        LeBronQuote q = new LeBronQuote();
        q.setQuote("LeBron James is one of the best players in the league - and one of the best players to ever play the game.");
        assertTrue(q.getQuote().matches(".*(LeBron James|LeBron).*"));
    }

    @Test
    void notAboutLeBron()
    {
        LeBronQuote q = new LeBronQuote();
        q.setQuote("You have to be able to accept failure to get better.");
        assertFalse(q.getQuote().matches(".*(LeBron James|LeBron).*"));
    }

    //end of quote tests


    //start of characterCount tests

    @Test
    void hasWords()
    {
        LeBronQuote q = new LeBronQuote();
        q.setCharacterCount("31");
        assertTrue(q.getCharacterCount().matches("[1-9]+"));
    }

    @Test
    void hasNoWords()
    {
        LeBronQuote q = new LeBronQuote();
        q.setCharacterCount("0");
        assertFalse(q.getCharacterCount().matches("[1-9]+"));
    }

    @Test
    void longQuote()
    {
        LeBronQuote q = new LeBronQuote();
        q.setCharacterCount("60");
        assertTrue(q.getCharacterCount().matches("[0-9]{2,}"));
    }

    //end of characterCount tests
}