package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.CartPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.ProductPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    HomePage home = new HomePage();
    BagsPage bags = new BagsPage();
    ProductPage product = new ProductPage();
    CartPage shoppingCart = new CartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        // Mouse Hover on Gear Menu
        Thread.sleep(2000);
        home.mouseHOverOnGearManu();

        // Click on Bags
        home.clickOnBags();

        //* Click on Product Name ‘Overnight Duffle’
        bags.clickOnProduct();

        //* Verify the text ‘Overnight Duffle’
        String actualProductText = product.verifyOvernightDuffleText();
        Assert.assertEquals(actualProductText, "Overnight Duffle", "Incorrect Item");

        //* Change Qty 3
        product.changeQuantity();

        //* Click on ‘Add to Cart’ Button.
        product.addToCart();

        //* Verify the text ‘You added Overnight Duffle to your shopping cart.’
        String actualProductAddText = product.verifyProductAddText();
        Assert.assertEquals(actualProductAddText, "You added Overnight Duffle to your shopping cart.", "Incorrect Text");

        //* Click on ‘shopping cart’ Link into message
        product.clickOnShoppingCart();

        //* Verify the product name ‘Overnight Duffle’
        String actualProductText1 = shoppingCart.verifyTheProductName();
        Assert.assertEquals(actualProductText, "Overnight Duffle", "Incorrect Item");

        //* Verify the Qty is ‘3’
        Thread.sleep(2000);
        String actualProductQty = shoppingCart.verifyTheQuantityNumber();
        Assert.assertEquals(actualProductQty, "3", "Incorrect quantity");

        //* Verify the product price ‘$135.00’
        String actualProductPrice = shoppingCart.verifyTheProductPrice();
        Assert.assertEquals(actualProductPrice, "$135.00", "Incorrect price");

        //* Change Qty to ‘5’
        Thread.sleep(2000);
        shoppingCart.updateTheQuantity();

        //* Click on ‘Update Shopping Cart’ button
        shoppingCart.clickOnUpdateShoppingCart();

        //* Verify the product price ‘$225.00’
        String actualProductPrice1 = shoppingCart.verifyTheProductPrice1();
        Assert.assertEquals(actualProductPrice1, "$225.00", "Price is not match");
    }


}
