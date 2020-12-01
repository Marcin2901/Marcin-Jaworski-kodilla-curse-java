package com.kodilla.patterns2.facade.api.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

//20.3
@Aspect
@Component
public class WatcherFasada {

    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherFasada.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
            " && target(object)")
    public void logEvent(Object object) {
        LOGGER.info("Starting Order Processing (Clas: " + object.getClass().getName() + ")");
    }
}
