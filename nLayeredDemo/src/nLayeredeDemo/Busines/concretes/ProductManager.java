package nLayeredeDemo.Busines.concretes;

import nLayeredeDemo.Busines.abstracts.ProductServise;
import nLayeredeDemo.Core.LoggerService;
import nLayeredeDemo.DataAccess.abstracts.ProductDao;
import nLayeredeDemo.Entites.concretes.Product;

import java.util.List;

public class ProductManager implements ProductServise {
    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao,LoggerService loggerService) { // hibernate zamnı geçtiği zaman değişim istendiği zaman buradan sağlanacak
        super();
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {
        if(product.getCategoryId()==1){
            System.out.println("bu kategoride urun kabul edilmiyor");
            return;
        }
        this.productDao.add(product);// hicbir sekilde hibernate bagımlılıgım yoktur DIP
        this.loggerService.logToSystem("urun eklendi : "+product.getName());
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
