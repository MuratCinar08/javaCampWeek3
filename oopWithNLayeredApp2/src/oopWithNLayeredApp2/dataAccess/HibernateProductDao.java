package oopWithNLayeredApp2.dataAccess;

import oopWithNLayeredApp2.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
    	//sadece db erişim kodları yazılır
    	System.out.println("Hibernate ile veritabanına eklendi");
    }


}