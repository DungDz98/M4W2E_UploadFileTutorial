package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> products = new ArrayList<>();

    public List<Product> findAll() {
        return products;
    }

    public void save(Product product) {
        products.add(product);
    }

    public Product findById(int id) {
        return products.get(id);
    }

    public void update(int id, Product product) {
        for (Product p : products) {
            if (p.getId() == id) {
                p = product;
                break;
            }
        }
    }

    public void remove(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                break;
            }
        }
    }
}
