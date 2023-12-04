package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class CartPage  extends Utility {

    By textShoppingCart = By.cssSelector("main div h1 span");
    By textCronusYogaPant = By.cssSelector("[data-th=\"Item\"] div strong a");
    By textSize32 = By.cssSelector(".item-options>dd:first-of-type");
    By textBlack = By.cssSelector(".item-options>dd:last-of-type");
    By getProductNameText = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By quantityText = By.xpath("//input[@title='Qty']");
    By productPriceText = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']");
    By updateQty = By.xpath("//input[@title='Qty']");
    By clickUpdateQty = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By productPriceText1 = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']");


    public String getTextShoppingCart() {
        return getTextFromElement(textShoppingCart);
    }

    public String getTextCronusYogaPant() {
        return getTextFromElement(textCronusYogaPant);
    }

    public String getTextSize32() {
        return getTextFromElement(textSize32);
    }

    public String getTextBlack() {
        return getTextFromElement(textBlack);
    }

    public String verifyTheProductName() {return getTextFromElement(getProductNameText);}

    public String verifyTheQuantityNumber() throws InterruptedException {
        Thread.sleep(2000);
        return getAttributeValueFromElement(quantityText);}

    public String verifyTheProductPrice() {return getTextFromElement(productPriceText);}

    public void updateTheQuantity() throws InterruptedException {
        driver.findElement(By.xpath("//input[@title='Qty']")).clear();
        Thread.sleep(2000);
        sendTextToElement(updateQty, "5");}

    public void clickOnUpdateShoppingCart() {clickOnElement(clickUpdateQty);}

    public String verifyTheProductPrice1() {return getTextFromElement(productPriceText1);}
}



