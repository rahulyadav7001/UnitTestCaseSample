package com.ryandro.unittestcasesample;

import android.content.Context;
import android.support.test.InstrumentationRegistry;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MainActivityTest {
    private MainActivity mainActivity;
    Context context = null;


    @Before
    public void setUp() throws Exception {
//        mainActivity = (MainActivity) InstrumentationRegistry.getContext();
        context = InstrumentationRegistry.getContext();
        mainActivity = (MainActivity) context;
    }

    @Test
    public void testCode() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);

        assertEquals(7, mainActivity.sumValue(2, 5));
    }

    @After
    public void tearDown() throws Exception {
    }
}