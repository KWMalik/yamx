package com.srikanthps.yamxagent;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public class RestApiPublisher extends AbstractPublisher {

	private String url;
	
	public RestApiPublisher(String url) {
		this.url = url;
	}
	
	@Override
	void publish(InfoBuilder builder) {
		
		HttpPost p = new HttpPost(url);
		p.setEntity(new ByteArrayEntity(builder.getSysInfo().toByteArray()));
		
		HttpClient h = new DefaultHttpClient();
		try {
			HttpResponse res = h.execute(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
