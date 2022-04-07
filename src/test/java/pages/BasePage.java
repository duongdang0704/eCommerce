package pages;

import configuration.WebConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class BasePage {

    WebDriver webDriver;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public boolean doesElementExist(By element){
        webDriver.manage().timeouts().implicitlyWait(Duration.ZERO);
        boolean exists = webDriver.findElements( element ).size() != 0;
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WebConfig.IMPLICIT_WAIT));
        return exists;
    }

    public boolean doesElementExist(WebElement parent, By element){
        boolean exist = false;
        try{
            parent.findElement(element);
            exist = true;
        }catch (NoSuchElementException ne){
            ne.printStackTrace();
        }
        return exist;

    }

    public WebElement getChildElement(WebElement parent, By element){
        WebElement child = null;
        try{
            child = parent.findElement(element);
        }catch (NoSuchElementException ne){
            ne.printStackTrace();
        }
        return child;
    }

}
