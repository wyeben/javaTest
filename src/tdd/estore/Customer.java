package tdd.estore;

import java.util.List;

public class Customer extends User{
    private List<BillingInformation> billingInfoList;
    private ShoppingCart shoppingCart;

    public List<BillingInformation> getBillingInfoList() {
        return billingInfoList;
    }

    public void setBillingInfoList(List<BillingInformation> billingInfoList) {
        this.billingInfoList = billingInfoList;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
