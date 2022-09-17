package kodlamaio.northwind.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entites.concretes.Product;

@Service // bu class projede service görevi görecektir springe bilgi veriyor
public class ProductManager implements ProductService{
	private ProductDao productDao;
	
	@Autowired     //spring gidip arka planda buna karşılık gelebilecek projede productdao nun instance olabilecek bir tane sınıfı uretiyor ve onu veriyor 
	public ProductManager(ProductDao productDao) {// fakat bu bir bağımlılık oluşturur ve o projede tek bir instanceden gidebilirsiniz 
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		
		return new SuccessDataResult<List<Product>>(this.productDao.findAll()," Data Listelendi ");
						
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult(" urun eklendi ");
	}

}
