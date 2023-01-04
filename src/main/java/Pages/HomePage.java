package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.TestBase;

import java.awt.*;

public class HomePage extends TestBase {
    private static final By BTN_SHOP_MENU=By.xpath("//a[normalize-space()='Shop']");


    public void clickShopButton() {
driver.findElement(BTN_SHOP_MENU).click();

    }
}
