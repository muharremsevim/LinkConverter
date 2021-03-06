package tr.gov.hmb.LinkConverter.service.deepLink;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static tr.gov.hmb.LinkConverter.constants.TestConstants.TEST_DL_1;
import static tr.gov.hmb.LinkConverter.constants.TestConstants.TEST_URL_1;

@RunWith(MockitoJUnitRunner.class)
public class ProductDetailPageDeepLinkConverterTest {

    @InjectMocks
    private ProductDetailPageDeepLinkConverter productDetailPageDeepLinkConverter;

    @Test
    public void checkProductDetailPageTrue() throws Exception {
        var isChecked = productDetailPageDeepLinkConverter.check(TEST_DL_1);
        assertThat(isChecked).isEqualTo(true);
    }

    @Test
    public void checkProductDetailPageLinkTrue() throws Exception {
        var url = productDetailPageDeepLinkConverter.createLink(TEST_DL_1);
        assertThat(url).isEqualTo(TEST_URL_1);
    }
}