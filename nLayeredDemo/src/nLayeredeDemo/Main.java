package nLayeredeDemo;

import nLayeredeDemo.Busines.abstracts.ProductServise;
import nLayeredeDemo.Busines.concretes.ProductManager;
import nLayeredeDemo.Core.jLoggerManagerAdapter;
import nLayeredeDemo.DataAccess.abstracts.ProductDao;
import nLayeredeDemo.DataAccess.concretes.AbcProductDao;
import nLayeredeDemo.DataAccess.concretes.HibernateProductDao;
import nLayeredeDemo.Entites.concretes.Product;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // bir projede entitler haricinde newlwmw işlemi yapıyorsan ileride proje yasıyacaksın
        // To Do spring  IOC ile cözülecek!!!!!!!!!!!!!!!!!!
        ProductServise productServise = new ProductManager(new HibernateProductDao(),new jLoggerManagerAdapter()); // kötü kodd

        // interfaceler somut sınıfların referansını tutabilir sag taraf interface değil
        Product product = new Product(1,2,"elma",12,50);
        productServise.add(product);


    }
}
