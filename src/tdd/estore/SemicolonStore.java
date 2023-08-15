package tdd.estore;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static tdd.estore.CheckoutSystem.VAT_RATE;

public class SemicolonStore {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);


          String storeName = "SEMICOLON STORES";

          String branch = "MAIN BRANCH";

          String location = "312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.";

          String tel = "03293828343";



          System.out.print("What is the customer's name: ");
          String customerName = scanner.nextLine();

          List<CartItem> cartItems = new ArrayList<>();
          while (true) {
               System.out.print("What did the user buy? (or 'no' to finish): ");
               String itemName = scanner.nextLine();
               if (itemName.equalsIgnoreCase("no")) {
                    break;
               }

               System.out.print("How many pieces?: ");
               int quantity = scanner.nextInt();
               System.out.print("How much per unit?: ");
               double price = scanner.nextDouble();

               cartItems.add(new CartItem(new Product(itemName, price), quantity));
               scanner.nextLine();
          }

          System.out.print("What is your name?: ");
          String cashierName = scanner.nextLine();
          System.out.print("Enter discount percentage: ");
          double discountPercentage = scanner.nextDouble();
          scanner.nextLine();

          double subtotal = 0.0;
          for (CartItem item : cartItems) {
               subtotal += item.getProduct().getPrice() * item.getQuantity();
          }
          double discount = (discountPercentage / 100.0) * subtotal;
          double vat = VAT_RATE * subtotal;
          double total = subtotal + vat - discount;

          System.out.println();
          System.out.println(storeName);
          System.out.println(branch);
          System.out.println(location);
          System.out.println(tel);
          System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
          System.out.println("Cashier: " + cashierName);
          System.out.println("Customer name: " + customerName);
          System.out.println("=============================================================");

          System.out.printf("%-20s%-10s%-10s%-10s\n", "Item", "Qty", "Price", "Subtotal");
          System.out.println("-------------------------------------------------------------");
          for (CartItem item : cartItems) {
               Product product = item.getProduct();
               int quantity = item.getQuantity();
               double price = product.getPrice();
               double itemSubtotal = price * quantity;

               System.out.printf("%-20s%-10d₦%-9.2f₦%-9.2f\n", product.getProductName(), quantity, price, itemSubtotal);
          }
          System.out.println("-------------------------------------------------------------");

          System.out.printf("%-40s₦%-9.2f\n", "Subtotal:", subtotal);
          System.out.printf("%-40s₦%-9.2f\n", "Discount:", discount);
          System.out.printf("%-40s₦%-9.2f\n", "VAT (7.5%):", vat);
          System.out.println("=============================================================");
          System.out.printf("%-40s₦%-9.2f\n", "Total:", total);
          System.out.println("=============================================================");
          System.out.println("THIS IS NOT THE ORIGINAL RECEIPT KINDLY PAY");
          System.out.println("=============================================================");
          
          System.out.print("How much did the customer give to you? ");
          double amountReceived = scanner.nextDouble();

          System.out.println(storeName);
          System.out.println(branch);
          System.out.println(location);
          System.out.println(tel);
          System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
          System.out.println("Cashier: " + cashierName);
          System.out.println("Customer name: " + customerName);
          System.out.println("=============================================================");

          System.out.printf("%-20s%-10s%-10s%-10s\n", "Item", "Qty", "Price", "Subtotal");
          System.out.println("-------------------------------------------------------------");
          for (CartItem item : cartItems) {
               Product product = item.getProduct();
               int quantity = item.getQuantity();
               double price = product.getPrice();
               double itemSubtotal = price * quantity;

               System.out.printf("%-20s%-10d₦%-9.2f₦%-9.2f\n", product.getProductName(), quantity, price, itemSubtotal);
          }
          System.out.println("--------------------------------------------------------------");

          System.out.printf("%-40s₦%-9.2f\n", "Subtotal:", subtotal);
          System.out.printf("%-40s₦%-9.2f\n", "Discount:", discount);
          System.out.printf("%-40s₦%-9.2f\n", "VAT (7.5%):", vat);
          System.out.println("==============================================================");
          System.out.printf("%-40s₦%-9.2f\n", "Bill Total:", total);

          double balance = amountReceived - total;

          System.out.println("Amount Paid: ₦" + amountReceived);
          System.out.println("Balance: ₦" + balance);
          System.out.println("==============================================================");
          System.out.println("\nThank you for shopping at " + storeName + "!");
          System.out.println("==============================================================");
     }
}