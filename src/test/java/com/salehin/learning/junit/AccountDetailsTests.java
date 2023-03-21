package com.salehin.learning.junit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

/* Simple usage*/
@SpringBootTest
class AccountDetailsTests {
	AccountDetails 	accountDetails = new AccountDetails(
				"Salehin",
				01123456,
				112233,
				10000,
				"Savings"
	);

	@Test
	void validateName() {
		assertTrue(accountDetails.getName().matches("^[a-zA-Z]*$"));
	}

	@Test
	void validateBalance() {
		assertTrue(accountDetails.getBalance() >=0);
	}

}
