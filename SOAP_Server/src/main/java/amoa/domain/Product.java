package amoa.domain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "product")
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {
    private int id;
    private String label;
    private double price;

    public Product() {
    }

    public Product(int id, String label, double price) {
        this.id = id;
        this.label = label;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
