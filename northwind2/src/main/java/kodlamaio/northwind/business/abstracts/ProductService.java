package kodlamaio.northwind.business.abstracts;

import java.util.List;


import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.entites.concretes.Product;

public interface ProductService {
	//List<Product> getAll();// tum urunleri donduren fonksiyon
	// doğrulamayı kullanmak istiyorum 
	DataResult<List<Product>> getAll();
	
	// burada ekleme işlemini destekleyen bir tane service yazıcam
	Result add(Product product);

}
