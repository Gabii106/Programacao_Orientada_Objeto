public class Produto {

    private String name;
    private String description;
    private double value;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        if(value >= 0) {
            this.value = value;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity >= 0) {
            this.quantity = quantity;
        }
    }

    public double getTotalValue() {
        return quantity * value;
    }

}
