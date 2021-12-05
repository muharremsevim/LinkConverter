package tr.gov.hmb.LinkConverter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import tr.gov.hmb.LinkConverter.model.LinkConversion;
import tr.gov.hmb.LinkConverter.repository.ILogRepository;
import tr.gov.hmb.LinkConverter.service.ILoggerService;

import java.util.Date;

@Primary
@Component
public class LoggerServiceImpl implements ILoggerService {

    @Autowired
    private ILogRepository logRepository;

    @Async
    @Override
    public void createLog(String request, String response) {
        LinkConversion linkConversion = LinkConversion.builder()
                .request(request)
                .response(response).build();
        // TODO : BaseAuditableEntity
        linkConversion.setCreationTime(new Date());

        logRepository.save(linkConversion);
    }

}
