package oopWithNLayeredApp2.core.logging;

import oopWithNLayeredApp2.core.logging.Logger;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Dosyaya loglandı : " + data);
		
	}



}
