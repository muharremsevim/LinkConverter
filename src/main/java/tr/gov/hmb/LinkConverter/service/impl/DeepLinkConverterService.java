package tr.gov.hmb.LinkConverter.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.gov.hmb.LinkConverter.service.AbstractLinkConverterService;
import tr.gov.hmb.LinkConverter.service.deepLink.DeepLinkConverterFactory;

@Service
@RequiredArgsConstructor
public class DeepLinkConverterService extends AbstractLinkConverterService {

    private final DeepLinkConverterFactory factory;

    @Override
    public String convertUrl(String url) {
        return factory.convertLink(url);
    }

}
