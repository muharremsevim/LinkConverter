package tr.gov.hmb.LinkConverter.service;

import org.springframework.stereotype.Service;

@Service
public interface ILoggerService {

    void createLog(String request, String response);
}
