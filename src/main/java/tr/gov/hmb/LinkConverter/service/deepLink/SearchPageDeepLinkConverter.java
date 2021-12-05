package tr.gov.hmb.LinkConverter.service.deepLink;

import org.springframework.stereotype.Component;
import tr.gov.hmb.LinkConverter.constants.Constants;
import tr.gov.hmb.LinkConverter.service.AbstractConverter;

import java.util.HashMap;
import java.util.Map;

@Component
public class SearchPageDeepLinkConverter extends AbstractConverter implements IDeepLinkConverter {

    @Override
    public Boolean check(String deepLink) {
        if (urlMatchesRegex(deepLink, Constants.SEARCH_DL_REGEX)) {
            return true;
        }
        return false;
    }

    @Override
    public String createLink(String deepLink) {
        var url = Constants.SEARCH_URL_TEMPLATE;
        deepLink = deepLink.replace("ty://?", "");
        Map<String, String> map = new HashMap<>();
        var queryParams = deepLink.split("&");
        for (var param : queryParams) {
            var paramArr = param.split("=");
            map.put(paramArr[0], paramArr[1]);
        }
        var query = map.get(Constants.QUERY);
        return String.format(url, query);
    }

}
