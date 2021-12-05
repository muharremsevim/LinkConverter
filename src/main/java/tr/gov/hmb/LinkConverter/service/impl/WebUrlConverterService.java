package tr.gov.hmb.LinkConverter.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.gov.hmb.LinkConverter.service.AbstractLinkConverterService;
import tr.gov.hmb.LinkConverter.service.webLink.UrlConverterFactory;

@Service
@RequiredArgsConstructor
public class WebUrlConverterService extends AbstractLinkConverterService {

    private final UrlConverterFactory factory;

    @Override
    public String convertUrl(String url) {
        return factory.convertLink(url);
    }
}
