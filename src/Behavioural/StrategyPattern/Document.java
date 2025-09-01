package Behavioural.StrategyPattern;

public class Document {

    private String content;
    private TextFormatter formatter;

    public Document() {}

    public void setContent(String content) {
        this.content = content;
    }

    public void setFormatter(TextFormatter formatter) {
        this.formatter = formatter;
    }

    public void displayFormattedContent() {
        System.out.println(formatter.format(content));
    }
}
