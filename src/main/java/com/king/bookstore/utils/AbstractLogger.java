package com.king.bookstore.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 抽象的日志类
 */
public abstract class AbstractLogger {
    protected Logger logger= LoggerFactory.getLogger(getClass());
}
