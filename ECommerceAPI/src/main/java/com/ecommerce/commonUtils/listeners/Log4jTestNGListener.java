package com.ecommerce.commonUtils.listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Log4jTestNGListener implements ITestListener {

    private static final Logger logger = LogManager.getLogger(Log4jTestNGListener.class);

    @Override
    public void onStart(ITestContext context) {
        logger.info("Test suite started: " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        logger.info("Test suite finished: " + context.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        logger.info("Test started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info("Test passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        logger.error("Test failed: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        logger.warn("Test skipped: " + result.getName());
    }

    // Other methods...

}

