package com.aghairsalon.resourceserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootTest
@ActiveProfiles("test")
@ImportAutoConfiguration(exclude = SecurityAutoConfiguration.class)
@EnableAutoConfiguration(exclude = SecurityAutoConfiguration.class)
class ResourceserverApplicationTests {
	@MockBean
    	private JwtDecoder jwtDecoder;

	@Test
	void contextLoads() {
	}

}
