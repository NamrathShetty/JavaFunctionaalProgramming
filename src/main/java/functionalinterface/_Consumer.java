package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "9999999999");
        greetCustomer(maria);

        // Consumer Functional Interface
        greetCustomerConsumer.accept(maria);

        // BiConsumer Functional Interface
        greetCustomerConsumerV2.accept(maria, false);
        greetCustomerConsumerV2.accept(maria, true);

    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) -> System.out.println("Hello " + customer.customerName + " thanks for registering phone number " + (showPhoneNumber ? customer.customerPhoneNumber : "********"));

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.customerName + " thanks for registering phone number " + customer.customerPhoneNumber);

    static void greetCustomer (Customer customer) {
        System.out.println("Hello " + customer.customerName + " thanks for registering phone number " + customer.customerPhoneNumber);
    }

    static class Customer {
    private final String customerName;
    private final String customerPhoneNumber;

    public Customer(String customerName, String customerPhoneNumber) {
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    }
}
