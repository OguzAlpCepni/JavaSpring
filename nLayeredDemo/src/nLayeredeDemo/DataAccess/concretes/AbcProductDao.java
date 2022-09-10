package nLayeredeDemo.DataAccess.concretes;

import nLayeredeDemo.DataAccess.abstracts.ProductDao;
import nLayeredeDemo.Entites.concretes.Product;

import java.util.List;

public class AbcProductDao implements ProductDao {

    @Override
    public void add(Product product) {
        System.out.println("abc ile eklendi " +product.getName());
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getall() {
        return null;
    }
}
