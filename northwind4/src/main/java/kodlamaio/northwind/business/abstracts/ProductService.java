package kodlamaio.northwind.business.abstracts;

import java.util.List;


import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.entites.concretes.Product;
import kodlamaio.northwind.entites.dtos.ProductWithCategoryDto;

public interface ProductService {
	//List<Product> getAll();// tum urunleri donduren fonksiyon
	// doğrulamayı kullanmak istiyorum 
	DataResult<List<Product>> getAll();
	DataResult<List<Product>> getAll(int pageNo,int pageSize);
	DataResult<List<Product>> getAllSorted();
	Result add(Product product);
	
	DataResult<Product> getByProductName(String productName);
	 
	DataResult<Product> getByProductNameAndCategory_CategoryId(String productName,int categoryId);
	
	DataResult<List<Product>> getByProductNameOrCategory_CategoryId(String productName,int categoryId);
	
	DataResult<List<Product>> getByCategoryIn(List<Integer> categories);
	
	DataResult<List<Product>> getByProductNameContains(String productName);
	
	DataResult<List<Product>> getByProductNameStartsWith(String productName);
	
	DataResult<List<Product>> getByNameAndCategory(String productName,int categoryId);
	
	DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();

}
