import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeBronQuoteTest
{
    @Test
    void quotedByBron()
    {
        LeBronQuote q = new LeBronQuote();
        q.setSource("LeBron James");
        assertTrue(q.getSource().matches("(^LeBron) (James$)"));
    }

    @Test
    void notQuotedByBron()
    {
        LeBronQuote q = new LeBronQuote();
        q.setSource("Chance The Rapper");
        assertFalse(q.getSource().matches("(^Lebron) (James$)"));
    }

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



}