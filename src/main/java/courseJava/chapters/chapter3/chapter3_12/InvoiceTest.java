package courseJava.chapters.chapter3.chapter3_12;

public class InvoiceTest {

    public static void main(String[] args) {
        Invoice invoice = new Invoice("123456", "Processor", 5, 14.2);

        System.out.printf("product: %s, number of product: %s, invoice amount: %5.2f",
                invoice.getDescription(), invoice.getNumber(), invoice.getInvoiceAmount(invoice.getQuantity(),invoice.getPrice()));

    }
}
