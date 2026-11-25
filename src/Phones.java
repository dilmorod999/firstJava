public class Phones {
    Integer id;
    String model;
    int price;
    String color;
    int year;
    boolean bu;

    Phones(Integer id, String model, int price, String color, int year, boolean bu) {
        this.id = id;
        this.model = model;
        this.price = price;
        this.color = color;
        this.year = year;
        this.bu = bu;
    }

    public Integer getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public boolean getBu() {
        return bu;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Phones{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", bu=" + bu +
                '}';
    }
}
