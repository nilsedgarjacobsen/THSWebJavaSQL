import Customer.*;
import Product.ProductController;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        CustomerRepository customerRepository = new CustomerRepository();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange email:");
        String email = scanner.nextLine();
        System.out.println("Ange lösenord:");
        String password = scanner.nextLine();

        Customer loggedInCustomer = customerRepository.login(email, password);

        /*loggedInCustomer.cart.add(productRepository.getProductById());

        for(Product p : cart){
            orderRepository.addProductToOrder(p);
        }


         */
        CustomerController customerController = new CustomerController(loggedInCustomer);
        customerController.runMenu();

        ProductController productController = new ProductController();
        productController.runMenu();
    }
}