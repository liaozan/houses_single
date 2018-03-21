package com.liaozan.web.ext;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author liaozan
 * @version 1.0.0
 * @since 2018/3/18
 */
@Component
@Slf4j
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {

	@Autowired
	private ApplicationEventPublisher eventPublisher;

	@Override
	public void onApplicationEvent (ApplicationEvent event) {
		eventPublisher.publishEvent(event);
		log.debug("{}", event);
	}
}
