package tr.gov.hmb.LinkConverter.service.webLink;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static tr.gov.hmb.LinkConverter.constants.TestConstants.*;

@RunWith(MockitoJUnitRunner.class)
public class SearchPageLinkConverterTest {

    @InjectMocks
    private SearchPageLinkConverter searchPageLinkConverter;

    @Test
    public void checkSearchPageTrue() throws Exception {
        var isChecked = searchPageLinkConverter.check(TEST_URL_5);
        assertThat(isChecked).isEqualTo(true);
    }

    @Test
    public void checkSearchPageUrlTrue() throws Exception {
        var url = searchPageLinkConverter.createLink(TEST_URL_6);
        assertThat(url).isEqualTo(TEST_DL_6);
    }
}