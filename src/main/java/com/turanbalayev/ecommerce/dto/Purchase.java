package com.turanbalayev.ecommerce.dto;

import com.turanbalayev.ecommerce.entity.Address;
import com.turanbalayev.ecommerce.entity.Customer;
import com.turanbalayev.ecommerce.entity.Order;
import com.turanbalayev.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
