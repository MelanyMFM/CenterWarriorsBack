package com.centerWarriors;

import com.centerWarriors.CenterWarriorsApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest(classes = CenterWarriorsApplication.class)
@ContextConfiguration(classes = CenterWarriorsApplication.class)

public class CenterWarriorsApplicationTests {
	@Test
	void contextLoads() {
	}
}
