package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class BagsPage extends Utility {

    By productName = By.xpath("//a[normalize-space()='Overnight Duffle']");

    public void clickOnProduct() {clickOnElement(productName);}

}
