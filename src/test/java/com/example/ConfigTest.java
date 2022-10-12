package com.example;

import org.junit.Assert;
import org.junit.Test;

public class ConfigTest {
    @Test
    public void testNewConfig() throws Exception {
        Assert.assertEquals("0.0.1", Loader.version());
    }
}
