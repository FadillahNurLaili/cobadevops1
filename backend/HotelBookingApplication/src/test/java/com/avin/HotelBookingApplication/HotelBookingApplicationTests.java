package com.avin.HotelBookingApplication;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HotelBookingApplicationTests {

	@Test
	@Disabled("Disabled in CI - requires DB connection")
	void contextLoads() {
	}

}
