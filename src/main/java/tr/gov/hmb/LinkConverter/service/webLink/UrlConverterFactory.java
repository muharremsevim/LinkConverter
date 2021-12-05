package tr.gov.hmb.LinkConverter.service.webLink;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tr.gov.hmb.LinkConverter.constants.Constants;

import java.util.List;

@Component
public class UrlConverterFactory {

    @Autowired
    private List<ILinkConverter> linkConverters;

    public String convertLink(String url) {

        final var selected =
                linkConverters.stream().filter(iLinkConverter -> iLinkConverter.check(url)).findFirst();
        if (selected.isPresent()) {
            return selected.get().createLink(url);
        }

        // no corresponding url->dl found
        return Constants.DEFAULT_DL;
    }
}
