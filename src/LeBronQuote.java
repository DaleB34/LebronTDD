public class LeBronQuote {
    private String quote;
    private String characterCount;

    public LeBronQuote(String quote, String characterCount) {
        this.quote = quote;
        this.characterCount = characterCount;
    }

    public LeBronQuote() {
        quote = "";
        characterCount = "0";
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getCharacterCount() {
        return characterCount;
    }

    public void setCharacterCount(String characterCount) {
        this.characterCount = characterCount;
    }
}