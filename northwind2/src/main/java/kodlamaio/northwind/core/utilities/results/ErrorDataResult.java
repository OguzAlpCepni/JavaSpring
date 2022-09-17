package kodlamaio.northwind.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T>{

	public ErrorDataResult(T data, String message) { // bana başarılı bir data ver ve sonucuda yazdır
		super(data,false, message);
		
	}
	public ErrorDataResult(T data) {					//bana sadece data ver doğrula 
		super(data,false);
	}
	public ErrorDataResult( String message) {			// bana sadece mesaj ver 
		super(null,false, message);
		
	}
}