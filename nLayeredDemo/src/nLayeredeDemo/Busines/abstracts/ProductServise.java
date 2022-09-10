package nLayeredeDemo.Busines.abstracts;

import nLayeredeDemo.Entites.concretes.Product;

import java.util.List;

public interface ProductServise {
    void add(Product product);
    List<Product> getAll();

}
