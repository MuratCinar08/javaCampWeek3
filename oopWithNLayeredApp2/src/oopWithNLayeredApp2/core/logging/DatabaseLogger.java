package oopWithNLayeredApp2.core.logging;

import oopWithNLayeredApp2.core.logging.Logger;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Veritabanına loglandı :" + data);
		
	}



}