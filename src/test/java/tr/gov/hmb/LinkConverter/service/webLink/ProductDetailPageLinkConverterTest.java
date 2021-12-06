package tr.gov.hmb.LinkConverter.service.webLink;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static tr.gov.hmb.LinkConverter.constants.TestConstants.TEST_DL_1;
import static tr.gov.hmb.LinkConverter.constants.TestConstants.TEST_URL_1;

@RunWith(MockitoJUnitRunner.class)
public class ProductDetailPageLinkConverterTest {
    @InjectMocks
    private ProductDetailPageLinkConverter productDetailPageLinkConverter;

    @Test
    public void checkProductDetailPageTrue() throws Exception {
        var isChecked = productDetailPageLinkConverter.check(TEST_URL_1);
        assertThat(isChecked).isEqualTo(true);
    }

    @Test
    public void checkProductDetailPageUrlTrue() throws Exception {
        var url = productDetailPageLinkConverter.createLink(TEST_URL_1);
        assertThat(url).isEqualTo(TEST_DL_1);
    }
}