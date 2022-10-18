package dependencyinversionprinciple;


public class CustomerService {

    private final CustomerRepository customerDao;

    public CustomerService(CustomerRepository customerDao) {
        this.customerDao = customerDao;
    }

}
