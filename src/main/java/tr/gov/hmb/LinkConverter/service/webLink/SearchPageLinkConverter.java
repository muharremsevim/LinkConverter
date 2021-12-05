package tr.gov.hmb.LinkConverter.service.webLink;

import org.springframework.stereotype.Component;
import tr.gov.hmb.LinkConverter.constants.Constants;
import tr.gov.hmb.LinkConverter.service.AbstractConverter;

import java.net.MalformedURLException;
import java.net.URL;

@Component
public class SearchPageLinkConverter extends AbstractConverter implements ILinkConverter {

    @Override
    public Boolean check(String url) {
        if (urlMatchesRegex(url, Constants.SEARCH_URL_REGEX)) {
            return true;
        }
        return false;
    }

    @Override
    public String createLink(String url) {
        try {
            URL obj = new URL(url);
            String query = obj.getQuery();
            var queryArr = query.split("=");
            if (queryArr != null && queryArr.length > 1) {
                var q = obj.getQuery().split("=")[1];
                return String.format(Constants.SEARCH_DL_TEMPLATE, q);
            }
            return Constants.DEFAULT_DL;
        } catch (MalformedURLException e) {
//            logger.log(e.printStackTrace());
        }

        return Constants.DEFAULT_DL;
    }

}
