package tr.gov.hmb.LinkConverter.service.deepLink;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static tr.gov.hmb.LinkConverter.constants.TestConstants.TEST_DL_1;

@RunWith(MockitoJUnitRunner.class)
public class ProductDetailPageDeepLinkConverterTest {

    @InjectMocks
    private ProductDetailPageDeepLinkConverter productDetailPageDeepLinkConverter;

    @Test
    public void checkLinkProductDetailPageTrue() throws Exception {
        var isChecked = productDetailPageDeepLinkConverter.check(TEST_DL_1);
        assertThat(isChecked).isEqualTo(true);
    }
}