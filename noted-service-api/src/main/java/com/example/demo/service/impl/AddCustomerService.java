/**
 * 
 */
package com.example.demo.service.impl;

import com.example.demo.dto.Customer;
import com.example.demo.service.GetCustomerService.GetCustomerServiceLauncher;

/**
 * @author Thinkbook 14 Gen2
 *
 */
public class AddCustomerService extends GetCustomerServiceLauncher {

	@Override
	protected Customer addCustomer(Builder builder) {
		return Customer.builder().build();
	}
}
