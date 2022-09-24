package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entites.concretes.Product;
import kodlamaio.northwind.entites.dtos.ProductWithCategoryDto;

public interface ProductDao extends JpaRepository<Product,Integer>{
	Product getByProductName(String productName);//herhangi bir implementasyon yapmana gerek yok 
	// getBy gördüğü anda kendisi tablolara bakıyor tablodaki ilkili sütüna göre bir ver koşulu yapıştırıyor  
	Product getByProductNameAndCategory_CategoryId(String productName,int categoryId);
	//getBy dedikten sonra ProductName birinci kolon ile ikinci kolonu and operetörü bağlayan ver koşulu yazıyor 
	List<Product> getByProductNameOrCategory_CategoryId(String productName,int categoryId);
	// Jpaprepositoryde var hazır biçimdeyazımına dikkat et 
	
	List<Product> getByCategoryIn(List<Integer> categories);
	// select * from products where category_id in ( 1,2,3,4) karşılığı yukarda 
	
	List<Product> getByProductNameContains(String productName);// isme göre arama 	
	
	List<Product> getByProductNameStartsWith(String productName);// bu isimle başlayanları getir 
	@Query("From Product where productName=:productName and category.categoryId=:categoryId")
	List<Product> getByNameAndCategory(String productName,int categoryId);

	@Query("Select new kodlamaio.northwind.entites.dtos.ProductWithCategoryDto(p.id, p.productName, c.categoryName) From Category c Inner Join c.products p")
	List<ProductWithCategoryDto> getProductWithCategoryDetails();
	// select p.productId,p.productName,c.categoryName from category c inner join product 	p
	//on c.categoryId = p.categoryId
}
