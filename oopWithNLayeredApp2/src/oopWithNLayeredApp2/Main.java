package oopWithNLayeredApp2;

import oopWithNLayeredApp2.business.ProductManager;
import oopWithNLayeredApp2.core.logging.DatabaseLogger;
import oopWithNLayeredApp2.core.logging.FileLogger;
import oopWithNLayeredApp2.core.logging.Logger;
import oopWithNLayeredApp2.dataAccess.HibernateProductDao;
import oopWithNLayeredApp2.dataAccess.JdbcProductDao;
import oopWithNLayeredApp2.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1,"iPhone XR",10000);
		
		Logger[] loggers = {new DatabaseLogger(),new FileLogger()};

		ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
		productManager.add(product1);
	

    }


}