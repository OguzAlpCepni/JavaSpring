package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entites.concretes.Product;
@Service // bu class projede service görevi görecektir springe bilgi veriyor
public class ProductManager implements ProductService{
	private ProductDao productDao;
	
	@Autowired     //spring gidip arka planda buna karşılık gelebilecek projede productdao nuninstance olabilecek bir tane sınıfı uretiyor ve onu veriyor 
	public ProductManager(ProductDao productDao) {// fakat bu bir bağımlılık oluşturur ve o projede tek bir instanceden gidebilirsiniz 
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		
		return this.productDao.findAll();
	}

}
