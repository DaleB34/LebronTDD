public class LebronQuote
{
    private String quote;
    private String source; // The person saying the quote

    public LebronQuote(String quote, String source)
    {
        this.quote = quote;
        this.source = source;
    }

    public String getQuote()
    {
        return quote;
    }

    public String getSource()
    {
        return source;
    }
}
