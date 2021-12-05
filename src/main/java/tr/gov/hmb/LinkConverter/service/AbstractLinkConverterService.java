package tr.gov.hmb.LinkConverter.service;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractLinkConverterService {

    @Autowired
    private ILoggerService loggerService;

    public abstract String convertUrl(String url);

    public String convertUrlAction(String url) {
        // convert url
        var response = convertUrl(url);
        // log url
        loggerService.createLog(url, response);
        return response;
    }

}
