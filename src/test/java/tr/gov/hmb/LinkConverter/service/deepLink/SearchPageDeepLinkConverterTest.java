package tr.gov.hmb.LinkConverter.service.deepLink;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static tr.gov.hmb.LinkConverter.constants.TestConstants.*;

@RunWith(MockitoJUnitRunner.class)
public class SearchPageDeepLinkConverterTest {

    @InjectMocks
    private SearchPageDeepLinkConverter searchPageDeepLinkConverter;

    @Test
    public void checkSearchPageTrue() throws Exception {
        var isChecked = searchPageDeepLinkConverter.check(TEST_DL_5);
        assertThat(isChecked).isEqualTo(true);
    }

    @Test
    public void checkSearchPageLinkTrue() throws Exception {
        var url = searchPageDeepLinkConverter.createLink(TEST_DL_6);
        assertThat(url).isEqualTo(TEST_URL_6);
    }
}