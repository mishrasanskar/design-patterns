package Behavioural.StrategyPattern;

public class HTMLFormatter implements TextFormatter{
    @Override
    public String format(String text) {
        return "<html>" + text + "</html>";
    }
}
