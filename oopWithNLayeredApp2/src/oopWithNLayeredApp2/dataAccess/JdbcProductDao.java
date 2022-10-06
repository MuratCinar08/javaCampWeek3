package oopWithNLayeredApp2.dataAccess;

import oopWithNLayeredApp2.entities.Product;

public class JdbcProductDao implements ProductDao {
    public void add(Product product) {
    	//sadece db erişim kodları yazılır
    	System.out.println("JDBC ile veritabanına eklendi");
    }


}
