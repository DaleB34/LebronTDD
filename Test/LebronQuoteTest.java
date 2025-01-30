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



}