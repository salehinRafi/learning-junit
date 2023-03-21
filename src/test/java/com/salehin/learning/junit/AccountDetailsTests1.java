package com.salehin.learning.junit;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

/* *
* @BeforeEach ---
* 		annotation is used to signal that the annotated method should be executed
* 		before each invocation of @Test, @RepeatedTest, @ParameterizedTest, or
* 		@TestFactory method in the current class.
*
* @AfterEach ---
* 		vice versa of @BeforeEach
* */
@SpringBootTest
class AccountDetailsTests1 {
	AccountDetails accountDetails;

	@BeforeAll
	void initAll(){
		System.out.println("@BeforeAll block has been executed");
		System.out.println("Initialized all");
	}


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

	@AfterEach
	void balance(){
		System.out.println("@AfterEach block has been executed");
		System.out.println("Account balance: "+accountDetails.getBalance());
	}

	@AfterAll
	void teardownAll(){
		System.out.println("@AfterAll block has been executed");
		System.out.println("Clean all");
	}

}
