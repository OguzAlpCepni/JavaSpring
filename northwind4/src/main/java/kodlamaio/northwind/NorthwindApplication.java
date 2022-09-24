package kodlamaio.northwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2   // swaggeri başlatan anatasyon docket üzerinden yani api isimli fonksiyon üzerinden bizim butun controllerlarımızı tarayıp apilerimizi buluyor ve yayınlanabilir dökğmente edilebilir bir noktaya taşır :)
public class NorthwindApplication {

	public static void main(String[] args) {
		SpringApplication.run(NorthwindApplication.class, args);
	}
	// bir classtan farkı yok fakar biz bunu konfigürasyon amaçlı kullanırız Uygulamnız başladıı anda spring bootumuz görünce bunu belleğe yerleştiriyor bundan sonra bir docet isimli bir nense ile bizim contollerimizi request handler ' ları buluyor ve bizim için bir dokumantasyon haline getiriyor 
	
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("kodlamaio.northwind"))                                     
          .build();                                           
    }

}
