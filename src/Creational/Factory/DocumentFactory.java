package Creational.Factory;

public class DocumentFactory {

    public static Document createDocument(String docType) {

        switch (docType) {
            case "PDF":
                return new PDFDocument();
            case "WORD":
                return new WordDocument();
            case "HTML":
                return new HTMLDocument();
            default:
                throw new IllegalArgumentException("Unknown document type: " + docType);
        }
    }
}
