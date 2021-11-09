package consumer;

import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

//
//        getCustomer(new Customer("Rajput Bhatti", "1234567"));


        greetCustomerConsumer.accept(new Customer("Rajput Bhatti", "1234567dftgergwer"));

    }
    static Consumer<Customer> greetCustomerConsumer = customer -> {

        System.out.println("Hello " + customer .getCustomerName() + " thanks for registering with number " + customer.getCustomerPhoneNumer());
    };

    static  void getCustomer(Customer customer){

    }
    static  class Customer{

        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumer) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumer;
        }

        public String getCustomerName() {
            return customerName;
        }

        public String getCustomerPhoneNumer() {
            return customerPhoneNumber;
        }
    }

}
