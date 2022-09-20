package kodlamaio.northwind.core.utilities.results;

public class DataResult<T> extends Result{
	private T data;
	public DataResult(T data,boolean success, String message) {
		super(success, message); // base sınıdın contructırlarını çalıştırmaya yaryor
		this.data=data;						// this o sınıfın super ise base sınfın constructoru
		
	}
	public DataResult(T data,boolean success) {
		super(success); 
		this.data=data;						
		
	}
	public T getData() {
		return this.data;
	}
}
