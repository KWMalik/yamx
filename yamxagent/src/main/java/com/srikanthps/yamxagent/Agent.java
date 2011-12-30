package com.srikanthps.yamxagent;

import java.util.ArrayList;
import java.util.List;


public class Agent implements LifeCycle {
	
	private List<LifeCycle> actors;
	
	@Override
	public void init() {
		for (LifeCycle a : actors) {
			a.init();
		}
	}
	
	@Override
	public void destroy() {
		for (LifeCycle a : actors) {
			a.destroy();
		}
	}
	
	public void setActors(List<LifeCycle> actors) {
		this.actors = actors;
	}
	
	public void setActors(LifeCycle... actors) {
		this.actors = new ArrayList<LifeCycle>();
		for (LifeCycle a : actors) {
			this.actors.add(a);
		}
	}
}
