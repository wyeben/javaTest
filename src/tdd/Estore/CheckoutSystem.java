package tdd.Estore;

import java.util.HashMap;
import java.util.Map;

public class CheckoutSystem {
    static final double VAT_RATE = 0.075;
        private Map<Product, Integer> cart;

        public CheckoutSystem() {
            cart = new HashMap<>();
        }

        public void addToCart(Product product, int quantity) {
            cart.put(product, cart.getOrDefault(product, 0) + quantity);
        }

        public void displayInvoice() {
            double total = 0.0;

            System.out.println("Semicolon Store Invoice");
            System.out.println("-----------------------");

            for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
                Product product = entry.getKey();
                int quantity = entry.getValue();
                double subtotal = product.getPrice() * quantity;

                System.out.println(product.getProductName() + " x " + quantity + " = $" + subtotal);
                total += subtotal;
            }

            double vat = total * 0.075;
            double discount = 0.0;

            System.out.println("-----------------------");
            System.out.println("Subtotal: $" + total);
            System.out.println("Discount: $" + discount);
            System.out.println("VAT (7.5%): $" + vat);
            System.out.println("Total: $" + (total + vat - discount));
        }
}
