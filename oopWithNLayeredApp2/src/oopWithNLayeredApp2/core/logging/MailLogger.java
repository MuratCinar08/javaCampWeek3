package oopWithNLayeredApp2.core.logging;

import oopWithNLayeredApp2.core.logging.Logger;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Mail gönderildi : " + data);
		
	}

}
	
