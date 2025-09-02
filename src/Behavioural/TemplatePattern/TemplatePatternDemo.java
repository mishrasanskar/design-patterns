package Behavioural.TemplatePattern;

public class TemplatePatternDemo {

    public static void main(String[] args) {


        ReportTemplate salesReport = new SalesReport();
        System.out.println("Generating Sales Report:");
        salesReport.generateReport();

        // Generate Employee Report
        ReportTemplate employeeReport = new EmployeeReport();
        System.out.println("Generating Employee Report:");
        employeeReport.generateReport();
    }
}
