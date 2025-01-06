package java.maybank.mappers;

import java.maybank.dto.CustomerDTO;
import java.maybank.entities.Customer;

public interface CustomerMapper {

    Customer from(CustomerDTO customerDTO);

    CustomerDTO from(Customer customer);
}
