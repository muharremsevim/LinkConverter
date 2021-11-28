package com.hmb.LinkConverter;

import static org.assertj.core.api.Assertions.assertThat;
import com.hmb.LinkConverter.controller.LinkConverterController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LinkConverterApplicationTests {

	@Autowired
	private LinkConverterController controller;

	@Test
	void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

}
