package com.academy.lessons11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

    public class LoggerDemo {
        private static Logger LOG = LogManager.getLogger(LoggerDemo.class.getName());
        public static void main(String[] args) {
            LOG.info("Log message");
            LOG.error("Log message");
        }
    }

