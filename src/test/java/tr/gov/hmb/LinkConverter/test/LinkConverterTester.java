package tr.gov.hmb.LinkConverter.test;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import tr.gov.hmb.LinkConverter.repository.ILogRepository;
import tr.gov.hmb.LinkConverter.service.impl.DeepLinkConverterService;
import tr.gov.hmb.LinkConverter.service.impl.WebUrlConverterService;

import static org.assertj.core.api.Assertions.assertThat;
import static tr.gov.hmb.LinkConverter.constants.TestConstants.*;

@SpringBootTest
public class LinkConverterTester {

    @MockBean
    private WebUrlConverterService webUrlConverterService;

    @MockBean
    private DeepLinkConverterService deepLinkConverterService;

    @Mock
    private ILogRepository logRepository;

    @Test
    void contextLoads() throws Exception {
        assertThat(webUrlConverterService).isNotNull();
        assertThat(deepLinkConverterService).isNotNull();

        assertThat(webUrlConverterService.convertUrlAction(TEST_URL_1)).isEqualTo(TEST_DL_1);
        // test if any logRepository.save() is called
        Mockito.verify(logRepository, Mockito.times(1)).save(Mockito.any());
        assertThat(webUrlConverterService.convertUrlAction(TEST_URL_2)).isEqualTo(TEST_DL_2);
        assertThat(webUrlConverterService.convertUrlAction(TEST_URL_3)).isEqualTo(TEST_DL_3);
        assertThat(webUrlConverterService.convertUrlAction(TEST_URL_4)).isEqualTo(TEST_DL_4);
        assertThat(webUrlConverterService.convertUrlAction(TEST_URL_5)).isEqualTo(TEST_DL_5);
        assertThat(webUrlConverterService.convertUrlAction(TEST_URL_6)).isEqualTo(TEST_DL_6);
        assertThat(webUrlConverterService.convertUrlAction(TEST_URL_7)).isEqualTo(TEST_DL_7);
        assertThat(webUrlConverterService.convertUrlAction(TEST_URL_8)).isEqualTo(TEST_DL_8);
    }

}
