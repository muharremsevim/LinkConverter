package tr.gov.hmb.LinkConverter.service.deepLink;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import tr.gov.hmb.LinkConverter.constants.Constants;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DeepLinkConverterFactory {

    private final List<IDeepLinkConverter> linkConverters;

    public String convertLink(String deepLink) {

        final var selected =
                linkConverters.stream().filter(iLinkConverter -> iLinkConverter.check(deepLink)).findFirst();
        if (selected.isPresent()) {
            return selected.get().createLink(deepLink);
        }

        // no corresponding dl->url found
        return Constants.DEFAULT_URL;
    }
}
