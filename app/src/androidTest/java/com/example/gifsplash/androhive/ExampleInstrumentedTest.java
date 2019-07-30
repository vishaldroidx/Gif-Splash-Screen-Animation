/*
 * Copyright (c) 2019.
 * Created By Vishal Swami(vishaldroidx)
 * vishalswamiv@gmail.com
 * www.androhive.tech
 */

package com.example.gifsplash.androhive;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.parsaniahardik.splashgifanimated", appContext.getPackageName());
    }
}
