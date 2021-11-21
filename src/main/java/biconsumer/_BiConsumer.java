package biconsumer;

import java.util.Objects;
import java.util.function.BiConsumer;

public class _BiConsumer {

    public static void main(String[] args) {



         BiConsumer<Customer,Boolean> biConsumer = (customer, status) -> {

            if(status == true){
                System.out.println(customer);
            }else{
                System.out.println("*****************");
            }
        };

        biConsumer.accept(new Customer("Husnain Bhatti", "phone number"), Boolean.valueOf("true"));

        biConsumer.accept(new Customer("Husnain Bhatti", "phone number"), Boolean.valueOf("false"));
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

        @Override
        public String toString() {
            return "Customer{" +
                    "customerName='" + customerName + '\'' +
                    ", customerPhoneNumber='" + customerPhoneNumber + '\'' +
                    '}';
        }
    }
}
