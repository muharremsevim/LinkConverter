package com.hmb.LinkConverter.test;

import com.hmb.LinkConverter.service.IConverterService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class LinkConverterTester {

    private static final String TEST_URL_1 = "https://www.hmb.gov.tr/btgm-p-1001?branch=439&teamId=1050";
    private static final String TEST_DL_1 = "ty://?Page=Unit&ContentId=1001&CampaignId=439&TeamId=1050";

    private static final String TEST_URL_2 = "https://www.hmb.gov.tr/btgm-p-1001";
    private static final String TEST_DL_2 = "ty://?Page=Unit&ContentId=1001";

    private static final String TEST_URL_3 = "https://www.hmb.gov.tr/btgm-p-1001?branch=439";
    private static final String TEST_DL_3 = "ty://?Page=Unit&ContentId=1001&CampaignId=439";

    private static final String TEST_URL_4 = "https://www.hmb.gov.tr/btgm-p-1001?teamId=1050";
    private static final String TEST_DL_4 = "ty://?Page=Product&ContentId=1001&TeamId=1050";

    private static final String TEST_URL_5 = "https://hmb.gov.tr/sr?q=abc";
    private static final String TEST_DL_5 = "ty://?Page=Search&Query=abc";

    private static final String TEST_URL_6 = "https://hmb.gov.tr/**/*";
    private static final String TEST_DL_6 = "ty://?Page=Home";

    private static final String TEST_URL_7 = "Muharrem";
    private static final String TEST_DL_7 = "ty://?Page=Home";


    @MockBean
    private IConverterService converterService;

    @Test
    void contextLoads() throws Exception {
        assertThat(converterService).isNotNull();

        Mockito.when(converterService.convertFromUrl(TEST_URL_1)).thenReturn(TEST_DL_1);
        assertThat(converterService.convertFromUrl(TEST_URL_1)).isEqualTo(TEST_DL_1);
        Mockito.when(converterService.convertFromUrl(TEST_URL_2)).thenReturn(TEST_DL_2);
        assertThat(converterService.convertFromUrl(TEST_URL_2)).isEqualTo(TEST_DL_2);
        Mockito.when(converterService.convertFromUrl(TEST_URL_3)).thenReturn(TEST_DL_3);
        assertThat(converterService.convertFromUrl(TEST_URL_3)).isEqualTo(TEST_DL_3);
        Mockito.when(converterService.convertFromUrl(TEST_URL_4)).thenReturn(TEST_DL_4);
        assertThat(converterService.convertFromUrl(TEST_URL_4)).isEqualTo(TEST_DL_4);
        Mockito.when(converterService.convertFromUrl(TEST_URL_5)).thenReturn(TEST_DL_5);
        assertThat(converterService.convertFromUrl(TEST_URL_5)).isEqualTo(TEST_DL_5);
        Mockito.when(converterService.convertFromUrl(TEST_URL_6)).thenReturn(TEST_DL_6);
        assertThat(converterService.convertFromUrl(TEST_URL_6)).isEqualTo(TEST_DL_6);
        Mockito.when(converterService.convertFromUrl(TEST_URL_7)).thenReturn(TEST_DL_7);
        assertThat(converterService.convertFromUrl(TEST_URL_7)).isEqualTo(TEST_DL_7);
    }

}
