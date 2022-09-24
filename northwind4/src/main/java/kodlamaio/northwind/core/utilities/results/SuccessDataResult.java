package kodlamaio.northwind.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T>{

	public SuccessDataResult(T data, String message) { // bana başarılı bir data ver ve sonucuda yazdır
		super(data,true, message);
		
	}
	public SuccessDataResult(T data) {					//bana sadece data ver doğrula 
		super(data,true);
	}
	public SuccessDataResult( String message) {			// bana sadece mesaj ver 
		super(null,true, message);
		
	}
	

}
