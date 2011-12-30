package com.srikanthps.yamxagent;


/**
 * Sample App that demonstrates use of Yamx agent
 */
public class TestApp { 
   
	public static void main(String[] args) throws InterruptedException {
		
		Agent a = new Agent();
		
		a.setActors(new ConsolePublisher(), new RestApiPublisher("http://localhost:9292"));
		
		a.init();
		
		Thread.sleep(100000);
		
		a.destroy();
		
		
	}
	
}
