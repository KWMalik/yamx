package com.srikanthps.yamxagent;


/**
 * Sample App that demonstrates use of Yamx agent
 */
public class TestApp { 
   
	public static void main(String[] args) throws InterruptedException {
		
		Agent a = new Agent();
		
		a.setActors(new ConsolePublisher().setBuilder(new InfoBuilder()), 
				new RestApiPublisher("http://localhost:9292").setBuilder(new InfoBuilder()));
		
		a.init();
		
		Thread.sleep(100000);
		
		a.destroy();
		
		
	}
	
}
