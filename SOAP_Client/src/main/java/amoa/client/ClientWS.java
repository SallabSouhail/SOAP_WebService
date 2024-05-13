package amoa.client;

import jakarta.xml.ws.Holder;
import stub.*;

import java.util.ArrayList;
import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        ProductsManager stub = new ProductsManagerImplService().getProductsManagerImplPort();

        // Creating and Adding Products
        System.out.println("Creating and Adding Products :");
        Product product1 = new Product();
        product1.setId(1);
        product1.setLabel("PC Gamer");
        product1.setPrice(8000);
        System.out.println("Adding Product 1 return: " + stub.addProduct(product1));

        Product product2 = new Product();
        product2.setId(2);
        product2.setLabel("mouse");
        product2.setPrice(200);
        System.out.println("Adding Product 2 return: " + stub.addProduct(product2));

        Product product3 = new Product();
        product3.setId(3);
        product3.setLabel("Keyboard");
        product3.setPrice(350);
        System.out.println("Adding Product 3 return: " + stub.addProduct(product3));

        //Getting Product that has a specific Id
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("Get a product by Id : ");

        System.out.println("Product 2 Information");
        try {
            Product product = stub.getProduct(2);
            System.out.println("Product 2 id : " + product.getId());
            System.out.println("Product 2 label : " + product.getLabel());
            System.out.println("Product 2 price : " + product.getPrice());
        } catch (NoSuchProductException_Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Product 3 Information");
        try {
            Product product = stub.getProduct(3);
            System.out.println("Product 3 id : " + product.getId());
            System.out.println("Product 3 label : " + product.getLabel());
            System.out.println("Product 3 price : " + product.getPrice());
        } catch (NoSuchProductException_Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Searching for a non-existent product");
        try {
            Product product = stub.getProduct(5);
            System.out.println("Product id : " + product.getId());
            System.out.println("Product label : " + product.getLabel());
            System.out.println("Product price : " + product.getPrice());
        } catch (NoSuchProductException_Exception e) {
            System.out.println(e.getMessage());
        }

        // Getting Product Price
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("Get a product price: ");
        try {
            System.out.println("Product 1 price: " + stub.getProductPrice(1));
        } catch (NoSuchProductException_Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Getting Price for a non-existent product");
        try {
            System.out.println(stub.getProductPrice(5));
        } catch (NoSuchProductException_Exception e) {
            System.out.println(e.getMessage());
        }

        // Update a product
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("Update a product:");
        Product product = new Product();
        product.setId(1);
        product.setLabel("Printer");
        product.setPrice(500);
        System.out.println("Product 1 Before update: ");
        try {
            Product existingProduct = stub.getProduct(1);
            System.out.println("Product 1 id : " + existingProduct.getId());
            System.out.println("Product 1 label : " + existingProduct.getLabel());
            System.out.println("Product 1 price : " + existingProduct.getPrice());
        } catch (NoSuchProductException_Exception e) {
            System.out.println(e.getMessage());
        }

        Holder<Product> productHolder = new Holder<>(product);
        stub.updateProduct(productHolder);
        System.out.println("Product 1 After update: ");
        try {
            Product updatedProduct = stub.getProduct(1);
            System.out.println("Product 1 id : " + updatedProduct.getId());
            System.out.println("Product 1 label : " + updatedProduct.getLabel());
            System.out.println("Product 1 price : " + updatedProduct.getPrice());
        } catch (NoSuchProductException_Exception e) {
            System.out.println(e.getMessage());
        }

        // Get All Products
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("Getting all Products");
        List<Product> products = stub.getProducts().getProducts();
        int i = 1;
        for(Product product4: products){
            System.out.println("Product " + i + " id: " + product4.getId());
            System.out.println("Product " + i + " name: " + product4.getLabel());
            System.out.println("Product " + i + " price: " + product4.getPrice());
            i++;
        }

        // Delete a Product
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("Deleting a product");
        System.out.println(stub.deleteProduct(2));
        List<Product> products1 = stub.getProducts().getProducts();
        int j = 1;
        for(Product product4: products1){
            System.out.println("Product " + j + " id: " + product4.getId());
            System.out.println("Product " + j + " name: " + product4.getLabel());
            System.out.println("Product " + j + " price: " + product4.getPrice());
            j++;
        }

        // Delete all Products
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("Deleting all products");
        System.out.println(stub.deleteAllProducts());
        List<Product> products2 = stub.getProducts().getProducts();
        int c = 1;
        for(Product product4: products2){
            System.out.println("Product " + c + " id: " + product4.getId());
            System.out.println("Product " + c + " name: " + product4.getLabel());
            System.out.println("Product " + c + " price: " + product4.getPrice());
            c++;
        }
    }
}
