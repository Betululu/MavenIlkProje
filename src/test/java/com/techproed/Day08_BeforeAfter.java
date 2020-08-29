package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_BeforeAfter {

    @BeforeClass // bu annotationa sahip method her class çalışmadan önce çalışır.
    public static void setUp(){
        System.out.println("setUp çalıştı.");
    }
    @Test
    public void test1(){
        System.out.println("Test 1 çalıştı.");
    }
    @Test
    public void test2(){
        System.out.println("Test 2 çalıştı.");
    }

    @AfterClass // bu annotationa sahip method her classtaki tester çalıştırıldıktan sonra çalışır.
    public static void tearDown(){
        System.out.println("tearDown çalıştı.");
    }

}
