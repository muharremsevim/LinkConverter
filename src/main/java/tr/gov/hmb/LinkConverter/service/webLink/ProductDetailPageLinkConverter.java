package tr.gov.hmb.LinkConverter.service.webLink;

import org.springframework.stereotype.Component;
import tr.gov.hmb.LinkConverter.constants.Constants;
import tr.gov.hmb.LinkConverter.service.AbstractConverter;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@Component
public class ProductDetailPageLinkConverter extends AbstractConverter implements ILinkConverter {

    @Override
    public Boolean check(String url) {
        if (urlMatchesRegex(url, Constants.PRODUCT_URL_REGEX)) {
            return true;
        }
        return false;
    }

    @Override
    public String createLink(String url) {
        try {
            var deepLink = Constants.PRODUCT_DL_TEMPLATE;
            var page = Constants.UNIT;

            URL obj = new URL(url);
            String path = obj.getPath();
            var pathArr = path.replace("/", "").split("-p-");
            var contentId = pathArr[1];

            Map<String, String> map = new HashMap<>();
            String query = obj.getQuery();
            var queryParams = query.split("&");
            for (var q : queryParams) {
                var queryArr = q.split("=");
                map.put(queryArr[0], queryArr[1]);
            }
            if (map.keySet().contains(Constants.BRANCH)) {
                deepLink = deepLink.concat("&CampaignId=").concat(map.get(Constants.BRANCH));
            }
            if (map.keySet().contains(Constants.TEAM_ID)) {
                deepLink = deepLink.concat("&TeamId=").concat(map.get(Constants.TEAM_ID));
            } else {
                if (map.keySet().contains(Constants.BRANCH)) {
                    page = Constants.PRODUCT;
                }
            }
            return String.format(deepLink, page, contentId);
        } catch (MalformedURLException e) {
//            logger.log(e.printStackTrace());
        }

        return Constants.DEFAULT_DL;
    }

}
