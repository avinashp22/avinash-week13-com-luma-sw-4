package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ProductPage extends Utility {

    By productText = By.xpath("//span[@class='base']");
    By changeQty = By.xpath("//input[@id='qty']");
    By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");
    By addedProductText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By linkShoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

    public String verifyOvernightDuffleText() {return getTextFromElement(productText);}

    public void changeQuantity() {
        driver.findElement(By.xpath("//input[@id='qty']")).clear();
        sendTextToElement(changeQty, "3");
    }

    public void addToCart() {clickOnElement(addToCartButton);}

    public String verifyProductAddText() {return getTextFromElement(addedProductText);}

    public void clickOnShoppingCart() {clickOnElement(linkShoppingCart);}

}
