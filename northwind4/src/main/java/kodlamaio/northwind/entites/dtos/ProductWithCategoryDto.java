package kodlamaio.northwind.entites.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductWithCategoryDto {
// Data Transformation object  // transfe edilen obje veri 
	private int id;
	private String productName;
	private String categoryName;
}
