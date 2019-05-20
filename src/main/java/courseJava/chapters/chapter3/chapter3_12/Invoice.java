package courseJava.chapters.chapter3.chapter3_12;

public class Invoice {
    private String number;
    private String description;
    private Integer quantity;
    private Double price;

    public Invoice(String number, String description, Integer quantity, Double price) {
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public Double getInvoiceAmount(Integer quantity, Double price){

        quantity = quantity < 0 ? 0 : quantity;
        price = price < 0 ? 0.0 : price;

        return quantity*price;

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
