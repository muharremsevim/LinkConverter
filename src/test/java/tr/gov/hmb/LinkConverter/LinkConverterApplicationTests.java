package tr.gov.hmb.LinkConverter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tr.gov.hmb.LinkConverter.controller.LinkConverterController;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class LinkConverterApplicationTests {

    @Autowired
    private LinkConverterController controller;

    @Test
    void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }

}
