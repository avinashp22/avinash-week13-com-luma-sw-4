package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By womenMenu = By.xpath("//span[normalize-space()='Women']");
    By tops = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By jackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    By menMenu = By.cssSelector("li.level0.nav-3>a.level-top.ui-corner-all>span:nth-of-type(1)");
    By menBottoms = By.cssSelector("#ui-id-18 span");
    By menPants = By.cssSelector("#ui-id-23 span");
    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By bags = By.xpath("//span[normalize-space()='Bags']");

    public void mouseHoverToMenMenu() {mouseHoverToElement(menMenu);}

    public void mouseHoverToMenTops() {mouseHoverToElement(menBottoms);}

    public void clickOnPants() {mouseHoverToElementAndClick(menPants);}

    public void mouseHoverOnWomenMenu() {mouseHoverToElement(womenMenu);}

    public void mouseHoverOnTops() {mouseHoverToElement(tops);}

    public void clickOnJackets() {mouseHoverToElementAndClick(jackets);}

    public void mouseHOverOnGearManu() {mouseHoverToElement(gearMenu);}

    public void clickOnBags() {mouseHoverToElementAndClick(bags);}

}
