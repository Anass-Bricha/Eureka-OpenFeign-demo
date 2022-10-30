package org.customerservice.customerservice.mappers;

import org.customerservice.customerservice.dtos.CustomerRequestDTO;
import org.customerservice.customerservice.dtos.CustomerResponseDTO;
import org.customerservice.customerservice.entities.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerResponseDTO customerToCustomerResponseDTO(Customer customer);
    Customer customerRequestDTOCustomer(CustomerRequestDTO customerRequestDTO);
}
