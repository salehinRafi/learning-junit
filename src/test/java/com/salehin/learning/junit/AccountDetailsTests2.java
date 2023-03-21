package com.salehin.learning.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

/* *
 * @BeforeAll ---
 * 		annotation is used to signal that the annotated method should be executed
 * 		before all invocation of @Test, @RepeatedTest, @ParameterizedTest, or
 * 		@TestFactory method in the current class.
 *
 * @AfterAll ---
 * 		- vice versa of @BeforeAll
 * 		- methods must have a void return type and must not be private.
 * 		- methods may optionally declare parameters to be resolved by ParameterResolvers.
 * 		- methods are inherited from superclasses as long as they are not hidden or overridden.
 * 		  Furthermore, @AfterAll methods from superclasses will be executed before
 *        @AfterAll methods in subclasses.
 * 		- annotated method MUST be a static method otherwise it will throw runtime error.
 * */
@SpringBootTest
class AccountDetailsTests2 {
	AccountDetails accountDetails;

	@BeforeEach
	void init(){
		accountDetails = new AccountDetails(
				"Salehin",
				01123456,
				112233,
				10000,
				"Savings"
		);

		System.out.println("@BeforeEach block has been executed");
		System.out.println("Account balance: "+accountDetails.getBalance());
	}

	@Test
	void depositTest(){
		accountDetails.deposit(4000);
		System.out.println("@Test block for deposit has been executed");
	}

	@Test
	void withdrawTest(){
		accountDetails.withdraw(1000);
		System.out.println("@Test block for withdraw has been executed");
	}
	@Test
	void validateName() {
		assertTrue(accountDetails.getName().matches("^[a-zA-Z]*$"));
	}

	@Test
	void validateBalance() {
		assertTrue(accountDetails.getBalance() >=0);
	}

	@AfterEach
	void balance(){
		System.out.println("@AfterEach block has been executed");
		System.out.println("Account balance: "+accountDetails.getBalance());
	}

}
