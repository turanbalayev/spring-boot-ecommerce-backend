package com.turanbalayev.ecommerce.service;

import com.turanbalayev.ecommerce.dto.Purchase;
import com.turanbalayev.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
