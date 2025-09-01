package Creational.Factory;

public class PDFDocument implements Document {
    @Override
    public void displayType() {
        System.out.println("Creating PDF Document");
    }
}
