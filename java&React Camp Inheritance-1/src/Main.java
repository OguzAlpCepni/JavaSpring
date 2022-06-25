public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        IndividualCustomer oguz = new IndividualCustomer();
        oguz.customerNumber = "23232";
        CorporateCustomer hepsiburada = new CorporateCustomer();
        hepsiburada.customerNumber = "1213123";
        SendikaCustomer sendikaCustomer = new SendikaCustomer();
        sendikaCustomer.customerNumber = "5646456";
        CustomerManager customerManager = new CustomerManager();
        Customer[] customers = new Customer[]{oguz, hepsiburada, sendikaCustomer};
        customerManager.addMultiple(customers);
    }
}
