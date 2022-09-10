package nLayeredeDemo.DataAccess.abstracts;

import nLayeredeDemo.Entites.concretes.Product;

import java.util.List;

public interface ProductDao  {
    void add(Product product);
    void update(Product product);
    void delete(Product product);
    Product get(int id); // bana bir tane id gir ve ürünü bul getir
    List<Product> getall(); // ürünleri listeleme işlemi

}
