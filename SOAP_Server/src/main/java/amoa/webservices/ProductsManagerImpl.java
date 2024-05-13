package amoa.webservices;

import amoa.domain.Product;
import amoa.domain.Products;
import amoa.exceptions.NoSuchProductException;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "amoa.webservices.ProductsManager")
public class ProductsManagerImpl implements ProductsManager{
    private static Products products = new Products(new ArrayList<>());


    @Override
    public int addProduct(Product product) {
        return products.add(product);
    }

    @Override
    public Product getProduct(int id) throws NoSuchProductException {
        Product product =  products.get(id);
        if (product != null){
            return product;
        } else {
            throw new NoSuchProductException("No such product");
        }
    }

    @Override
    public double getProductPrice(int id) throws NoSuchProductException {
        Product product = products.get(id);
        if (product != null){
            return product.getPrice();
        } else {
            throw new NoSuchProductException("No such product");
        }
    }

    @Override
    public Products getProducts() {
        return products;
    }

    @Override
    public Product updateProduct(Product product) {
        int id = product.getId();
        Product existingProduct = products.get(id);
        if (existingProduct != null){
            existingProduct.setLabel(product.getLabel());
            existingProduct.setPrice(product.getPrice());
            return existingProduct;
        } else {
            return null;
        }
    }

    @Override
    public boolean deleteProduct(int id) {
        return products.remove(id);
    }

    @Override
    public boolean deleteAllProducts() {
        return products.removeAll();
    }
}
