package driver;

import ws.remote.RaiseYourHandServer;
import exception.RaiseYourHandException;


public class RunServer {
	public static void main(String[] args){
		int port = 16976;
	
		// Start the server.
		try {
			new RaiseYourHandServer(port).start();
		} catch (RaiseYourHandException e) {
			e.printStackTrace();
		}
	}
}
