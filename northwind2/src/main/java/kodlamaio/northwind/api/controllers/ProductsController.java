package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entites.concretes.Product;

@RestController 											// sen bir controllersin
@RequestMapping("/api/products") 
public class ProductsController {
	
	private ProductService productService; 					// ALTTAKİ ÇOK ONEMLİ önceki çalışmada mainde yapılan işlem 
	@Autowired 												// dediğimiz zaman bu arkadaş gidiyor diyorki bana aşağıdaki parantez içerisindekiler lazım  projeyi tarıyor kim ProductSerivceyi imlplements etmiş  productManageri buluyor. Spring arka planda ProductManager p = new ProductManager().burada newlenmiş p yi alıyor productService ye yazıyorrrr (IOC)
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")          						// bu demek kiiiii siz böyle bir konfigürasyon yaparsanız benim sitem diyelimki kodlama.io/api/products/getall 
	public DataResult<List<Product>>getAll(){							//diye bir istekte bulunursam eğerki o zaman bu metod çalışıcak demektir
		return this.productService.getAll();
	}	// şuan biz metod desteğini controller vasıtasıyla vermiş oluyoruz 
	
	@PostMapping("/add") // post işlemi ile bir parametre alırsanız aşağıdaki gibi @request body 
	public Result Add(@RequestBody Product product) {// bilgileri bir pakete koyup atmak instada bir gönderi atarken konum kişileri eklemek gibi  
		return this.productService.add(product);
		
	}
}
 
// önemli
// örneğin //kodlama.io/api/products eğer olurda bizim sistemimize böyle bir adres üzerinden istek gelirse  onu karşılayacak olan budur demek
