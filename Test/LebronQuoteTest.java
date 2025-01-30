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
        // "don't like" and LeBron in the same sentence💔
    }

}