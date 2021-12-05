package tr.gov.hmb.LinkConverter.service.deepLink;

import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import tr.gov.hmb.LinkConverter.constants.Constants;
import tr.gov.hmb.LinkConverter.service.AbstractConverter;

import java.util.HashMap;
import java.util.Map;

@Component
public class ProductDetailPageDeepLinkConverter extends AbstractConverter implements IDeepLinkConverter {

    @Override
    public Boolean check(String deepLink) {
        if (urlMatchesRegex(deepLink, Constants.PRODUCT_DL_REGEX)) {
            return true;
        }
        return false;
    }

    @Override
    public String createLink(String deepLink) {
        Map<String, String> map = new HashMap<>();
        deepLink = deepLink.replace("ty://?", "");
        var queryParams = deepLink.split("&");
        for (var param : queryParams) {
            var paramArr = param.split("=");
            map.put(paramArr[0], paramArr[1]);
        }
        var contentId = map.get(Constants.CONTENT_ID);

        var path = Constants.BTGM.concat("-p-").concat(contentId);

        String query = "";
        if (map.keySet().contains(Constants.CAMPAIGN_ID)) {
            query = query.concat("&branch=").concat(map.get(Constants.CAMPAIGN_ID));
        }
        if (map.keySet().contains(Constants.TEAM_ID)) {
            query = query.concat("&teamId=").concat(map.get(Constants.TEAM_ID));
        }
        query = query.replaceFirst("&", "");
        UriComponents newUrl = UriComponentsBuilder.fromHttpUrl(Constants.DEFAULT_URL).path(path).query(query).build();

        return newUrl.toString();
    }

}
