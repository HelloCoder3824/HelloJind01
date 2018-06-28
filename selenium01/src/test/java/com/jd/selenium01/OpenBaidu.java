package com.jd.selenium01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @ClassName:OpenBaidu
 * @Description: TODO
 * @Auther: Administrator
 * @Date: 2018/6/23 14:27
 **/
public class OpenBaidu {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.firefox.bin", "D:\\Mozilla Firefox\\firefox.exe");
        //设置系统属性：firefox的启动路径
        WebDriver driver = new FirefoxDriver();
        //向上转型，实例化FirefoxDriver对象
        driver.manage().window().maximize();
        // 浏览器最大化
        driver.get("http://www.baidu.com/");
        //打开百度
        Thread.sleep(5000);
        // 线程休眠5s
        driver.close();
        //关闭浏览器

    }

}
