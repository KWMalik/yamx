package com.srikanthps.yamxagent;

public class ConsolePublisher extends AbstractPublisher {

	@Override
	void publish(InfoBuilder builder) {
		System.out.println(builder.getSysInfo().toString());
	}

}
