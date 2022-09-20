package kodlamaio.northwind.entites.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="categories")
@Entity // bu bir veri tabanı tablosudur
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","products"}) // sonsu dögüye irmeini engeller
public class Category {
	@Id
	@Column(name="category_id")
	private int categoryId;
	@Column(name="category_name")
	private String categoryName;  
	
	@OneToMany(mappedBy = "category")	// category(one) ile list<Product>(many) arasında one to many ilişkisi vardır 
	private List<Product> products;        // kategoride bulunucak productların ilişkilendirilmesi
	
	 
	
	
	
	
	
	
	
	
	
}
