public class LeBronQuote
{
    private String quote;
    private String source; // The person saying the quote

    public LeBronQuote(String quote, String source)
    {
        this.quote = quote;
        this.source = source;
    }

    public LeBronQuote()
    {
        quote = "";
        source = "";
    }

    public String getQuote()
    {
        return quote;
    }

    public String getSource()
    {
        return source;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
