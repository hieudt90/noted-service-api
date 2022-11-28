/**
 * 
 */
package com.example.demo.dto;

/**
 * @author Thinkbook 14 Gen2
 *
 */
public class Customer {

	private final Integer customerId;
	private final String firstName;
	private final String lastName;
	private final String company;
	private final String address;
	private final String city;
	private final String state;
	private final String country;
	private final String postalCode;
	private final String phone;
	private final String fax;
	private final String email;

	@Deprecated
	protected Customer() {
		this.customerId = null;
		this.firstName = null;
		this.lastName = null;
		this.company = null;
		this.address = null;
		this.city = null;
		this.state = null;
		this.country = null;
		this.postalCode = null;
		this.phone = null;
		this.fax = null;
		this.email = null;
	}

	protected Customer(Builder builder) {
		this.customerId = builder.customerId;
		this.firstName = null;
		this.lastName = null;
		this.company = null;
		this.address = null;
		this.city = null;
		this.state = null;
		this.country = null;
		this.postalCode = null;
		this.phone = null;
		this.fax = null;
		this.email = null;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {
		protected Integer customerId;
		protected String firstName;
		protected String lastName;
		protected String company;
		protected String address;
		protected String city;
		protected String state;
		protected String country;
		protected String postalCode;
		protected String phone;
		protected String fax;
		protected String email;

		protected Builder() {
			super();
		}

		public Builder customerId(Integer customerId) {
			this.customerId = customerId;
			return this;
		}

		public Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder company(String company) {
			this.company = company;
			return this;
		}

		public Builder address(String address) {
			this.address = address;
			return this;
		}

		public Builder city(String city) {
			this.city = city;
			return this;
		}

		public Builder state(String state) {
			this.state = state;
			return this;
		}

		public Builder country(String country) {
			this.country = country;
			return this;
		}

		public Builder postalCode(String postalCode) {
			this.postalCode = postalCode;
			return this;
		}

		public Customer build() {
			return new Customer(this);
		}

	}

	/**
	 * @return the customerId
	 */
	public Integer getCustomerId() {
		return customerId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @return the fax
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

}
