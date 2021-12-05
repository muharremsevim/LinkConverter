package tr.gov.hmb.LinkConverter.service.deepLink;

import org.springframework.stereotype.Component;
import tr.gov.hmb.LinkConverter.service.AbstractConverter;

@Component
public class SearchPageDeepLinkConverter extends AbstractConverter implements IDeepLinkConverter {

    @Override
    public Boolean check(String deepLink) {
        // if regex
        return null;
    }

    @Override
    public String createLink(String deepLink) {
        return "Search page url";
    }

}
