package tr.gov.hmb.LinkConverter.service;

import org.springframework.stereotype.Service;

@Service
public interface IConverterService {

    public String convertFromUrl(String url);

    public String convertFromDeepLink(String deepLink);

}
