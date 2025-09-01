package Behavioural.StrategyPattern;

public class DocumentFormatterDemo {


    public static void main(String[] args) {



        Document document = new Document();
        document.setContent("Format this content");
//        document.setFormatter(new PlainTextFormatter());

        document.setFormatter(new HTMLFormatter());
        document.displayFormattedContent();

    }

}
