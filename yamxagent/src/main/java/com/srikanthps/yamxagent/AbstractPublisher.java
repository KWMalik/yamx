package com.srikanthps.yamxagent;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

public abstract class AbstractPublisher implements LifeCycle {

	private ScheduledExecutorService _scheduler;
	private ScheduledFuture<?> publisherHandler;
	private InfoBuilder builder;
	
	@Override
	public void init() {
		final Runnable publisher = new Runnable() {
			public void run() {
				publish(builder);
			}
		};

		_scheduler = Executors.newScheduledThreadPool(1);
		publisherHandler = _scheduler.scheduleAtFixedRate(publisher, 1, 1, SECONDS);

	}

	abstract void publish(InfoBuilder builder);

	@Override
	public void destroy() {
		publisherHandler.cancel(true);
		_scheduler.shutdown();
	}
	
	public AbstractPublisher setBuilder(InfoBuilder builder) {
		this.builder = builder;
		return this;
	}
}
