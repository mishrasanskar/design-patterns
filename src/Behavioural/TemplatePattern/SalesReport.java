package Behavioural.TemplatePattern;

public class SalesReport extends ReportTemplate {


    @Override
    protected void gatherData() {
        System.out.println("Gathering data for Sales Report");
    }

    @Override
    protected void processData() {
        System.out.println("Processing data for Sales Report");
    }
}
