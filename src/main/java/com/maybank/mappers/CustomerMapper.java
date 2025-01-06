package com.maybank.mappers;

import com.maybank.dto.CustomerDTO;
import com.maybank.entities.Customer;

public interface CustomerMapper {

    Customer from(CustomerDTO customerDTO);

    CustomerDTO from(Customer customer);
}
