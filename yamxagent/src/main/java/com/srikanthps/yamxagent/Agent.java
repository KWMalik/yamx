package com.srikanthps.yamxagent;

import java.io.IOException;
import java.net.InetAddress;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

import com.srikanthps.yamx.proto.Yamx;

public class Agent extends AbstractHandler {
	public void handle(String target, Request baseRequest,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/html;charset=utf-8");
		response.setStatus(HttpServletResponse.SC_OK);
		baseRequest.setHandled(true);

		ObjectMapper m = new ObjectMapper();

		Yamx.SysInfo info = Yamx.SysInfo.newBuilder().setAppName("TestApp")
				.setSystemType(getAppInfo()).setOsinfo(getOsInfo())
				.setIpAddr(InetAddress.getLocalHost().getHostAddress())
				.setHostname(InetAddress.getLocalHost().getHostName()).build();

		String s = "";// m.writeValueAsString(sy);

		response.getWriter().println("<pre>" + info.toString() + "</pre>");

		response.getWriter().println();
	}

	private String getOsInfo() {
		return System.getProperty("os.name") + ", "
				+ System.getProperty("os.arch")+ ", " + System.getProperty("os.version");
	}

	private String getAppInfo() {
		return System.getProperty("java.vm.name") + ", "
				+ System.getProperty("java.vm.version") + ", "
				+ System.getProperty("java.vm.vendor");
	}

	public static void main(String[] args) throws Exception {
		Server server = new Server(8080);
		server.setHandler(new Agent());

		server.start();
		server.join();
	}

}
