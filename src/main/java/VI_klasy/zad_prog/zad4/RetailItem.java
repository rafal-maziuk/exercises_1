package VI_klasy.zad_prog.zad4;

public class RetailItem {

    private String description;
    private int unitsOnHand;
    private double price;

    public RetailItem(){
    }

    public RetailItem(final String description, final int unitsOnHand, final double price) {
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    public void setUnitsOnHand(final int unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "RetailItem{" +
                "description = '" + description + '\'' +
                ", unitsOnHand = " + unitsOnHand +
                ", price = " + price +
                '}';
    }
}
