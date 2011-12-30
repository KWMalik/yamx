package com.srikanthps.yamxagent;

import java.net.InetAddress;
import java.net.UnknownHostException;

import com.srikanthps.yamx.proto.Yamx;

public class InfoBuilder {
	
	Yamx.SysInfo getSysInfo() {
		Yamx.SysInfo.Builder infoBuilder = Yamx.SysInfo.newBuilder()
				.setAppName("TestApp").setSystemType(getAppInfo())
				.setOsinfo(getOsInfo());
		try {
			infoBuilder.setIpAddr(InetAddress.getLocalHost().getHostAddress());
		} catch (UnknownHostException e) {
			infoBuilder.setIpAddr("Error : " + e.getMessage());
		}

		try {
			infoBuilder.setHostname(InetAddress.getLocalHost().getHostName());
		} catch (UnknownHostException e) {
			infoBuilder.setHostname("Error : " + e.getMessage());
		}

		return infoBuilder.build();
	}
	
	private String getOsInfo() {
		return System.getProperty("os.name") + ", "
				+ System.getProperty("os.arch") + ", "
				+ System.getProperty("os.version");
	}

	private String getAppInfo() {
		return System.getProperty("java.vm.name") + ", "
				+ System.getProperty("java.vm.version") + ", "
				+ System.getProperty("java.vm.vendor");
	}
}
