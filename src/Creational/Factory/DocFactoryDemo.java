package Creational.Factory;

public class DocFactoryDemo {

    public static void main(String[] args) {

        Document doc = DocumentFactory.createDocument("PDF");
        doc.displayType();

    }
}
