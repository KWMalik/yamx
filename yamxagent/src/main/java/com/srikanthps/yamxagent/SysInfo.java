package com.srikanthps.yamxagent;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class SysInfo {
	
	String hostName = "";
	
	public String getHostName() {
		try {
			return InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			return "NA";
		}
	}
	
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	
	

}
