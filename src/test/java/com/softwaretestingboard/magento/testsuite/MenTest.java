package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.CartPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.PantsPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest  extends BaseTest {

    HomePage home = new HomePage();
    PantsPage pants = new PantsPage();
    CartPage shoppingCart = new CartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        // Mouse Hover on Men Menu
        Thread.sleep(2000);
        home.mouseHoverToMenMenu();

        // Mouse Hover on Bottoms
        Thread.sleep(2000);
        home.mouseHoverToMenTops();

        // Click on Pants
        Thread.sleep(2000);
        home.clickOnPants();

        // Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        pants.hoverAndClickProduct();

        // Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        pants.hoverAndClickProductColour();

        // Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
        pants.hoverAndClickOnAddToCartButton();

        // Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        Assert.assertEquals(pants.getTextAddedPantToShoppingCart(), "You added Cronus Yoga Pant to your shopping cart.", "Incorrect Text");

        // Click on ‘shopping cart’ Link into message
        pants.clickOnShoppingCart();

        // Verify the text ‘Shopping Cart.’
        Assert.assertEquals(shoppingCart.getTextShoppingCart(), "Shopping Cart", "Incorrect Text");

        // Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(shoppingCart.getTextCronusYogaPant(), "Cronus Yoga Pant", "Incorrect Item");

        // Verify the product size ‘32’
        Assert.assertEquals(shoppingCart.getTextSize32(), "32", "Incorrect Size");

        // Verify the product colour ‘Black’
        Assert.assertEquals(shoppingCart.getTextBlack(), "Black", "Incorrect Colour");
    }


}
