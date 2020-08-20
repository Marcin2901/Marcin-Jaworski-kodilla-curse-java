package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SettingsFileEngineTestSuite {

    @BeforeClass
    public static void openSettingFile(){
        SettingsFileEngine.getInstance().open("myapp.setting");
    }
    @AfterClass
    public static void closeSettingFile(){
       SettingsFileEngine.getInstance().close();
    }

    @Test
    public void testGetFileName(){
        String fileName = SettingsFileEngine.getInstance().getFileName();
        System.out.println("Open: " + fileName);

        Assert.assertEquals("myapp.setting", fileName);
    }
    @Test
    public void testLoadSettings(){

        boolean result = SettingsFileEngine.getInstance().loadSettings();

        Assert.assertTrue(result);
    }

    @Test
    public void testSaveSettings() {
        //Given
        //When
        boolean result = SettingsFileEngine.getInstance().saveSettings();
        //Then
        Assert.assertTrue(result);
    }

}
