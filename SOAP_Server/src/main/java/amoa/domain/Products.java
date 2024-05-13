package amoa.domain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Products {
    private List<Product> products;

    public Products() {}

    public Products(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return (List<Product>) products;
    }

    public int add(Product product) {
        this.products.add(product);
        return product.getId();
    }

    public Product get(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public boolean remove(int id) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public boolean removeAll() {
        this.products.clear();
        return true;
    }
}
