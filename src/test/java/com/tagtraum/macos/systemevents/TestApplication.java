/*
 * =================================================
 * Copyright 2021 tagtraum industries incorporated
 * All rights reserved.
 * =================================================
 */
package com.tagtraum.macos.systemevents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * TestApplication.
 *
 * @author <a href="mailto:hs@tagtraum.com">Hendrik Schreiber</a>
 */
public class TestApplication {

    @Test
    public void testCountDisks() {
        final Application application = Application.getInstance();
        assertTrue(application.countDisks() > 0);
    }

    @Test
    public void testHomeFolderPOSIXPath() {
        final Application application = Application.getInstance();
        final String posixPath = application.getHomeFolder().getPosixPath();
        assertEquals(System.getProperty("user.home"), posixPath);
    }

}
