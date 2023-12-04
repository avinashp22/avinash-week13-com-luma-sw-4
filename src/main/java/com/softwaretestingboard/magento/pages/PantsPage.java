package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class PantsPage extends Utility {

    By productName = By.cssSelector(".product-item-link");
    By size32 = By.cssSelector("[data-role=\"swatch-option-880\"][data-rendered=\"true\"] .swatch-option.text");
    By colourBlack = By.cssSelector("#option-label-color-93-item-49");
    By addToCartButton = By.cssSelector(".action.tocart.primary");
    By addedPant = By.cssSelector("[data-bind=\"html: $parent.prepareMessageForHtml(message.text)\"]");
    By linkShoppingCart = By.cssSelector(".message-success.success.message div a");

    public void hoverAndClickProduct() {
        mouseHoverToElement(productName);
        mouseHoverToElementAndClick(size32);
    }

    public void hoverAndClickProductColour() {
        mouseHoverToElement(productName);
        mouseHoverToElementAndClick(colourBlack);
    }

    public void hoverAndClickOnAddToCartButton() {
        mouseHoverToElement(productName);
        mouseHoverToElementAndClick(addToCartButton);
    }

    public String getTextAddedPantToShoppingCart() {return getTextFromElement(addedPant);}

    public void clickOnShoppingCart() {clickOnElement(linkShoppingCart);}

}
