package com.maven.learning;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by bheemivasu on 14-05-2017.
 */
public class TestMyName {

    private static final Logger LOGGER = LogManager.getLogger(TestMyName.class);

    @Test
    public void testMyName() {
        LOGGER.info("This is my Name");
    }

    @Test
    public void testMyName1() {
        LOGGER.debug("This is my Name");
    }

    @Test
    public void testMyName2() {
        LOGGER.trace("This is my Name");
    }

    @Test
    public void testMyName3() {
        LOGGER.error("This is my Name");
    }
}
