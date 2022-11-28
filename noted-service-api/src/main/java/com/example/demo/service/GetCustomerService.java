/**
 * 
 */
package com.example.demo.service;

import com.example.demo.dto.Customer;
import com.example.demo.service.GetCustomerService.GetCustomerServiceLauncher.Builder;

/**
 * @author Thinkbook 14 Gen2
 *
 */
public interface GetCustomerService {

	Builder launcher();

	public abstract class GetCustomerServiceLauncher implements GetCustomerService {

		@Override
		public Builder launcher() {
			return new Builder(this);
		}

		public Customer execute(Builder builder) {
			return addCustomer(builder);
		}

		public static class Builder {
			private GetCustomerServiceLauncher launcher;

			protected String name;

			public Builder(GetCustomerServiceLauncher launcher) {
				this.launcher = launcher;
			}

			public Builder name(String name) {
				this.name = name;
				return this;
			}

			public Customer execute() {
				return launcher.execute(this);
			}
		}

		protected abstract Customer addCustomer(Builder builder);
	}
}
