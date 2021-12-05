package tr.gov.hmb.LinkConverter.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tr.gov.hmb.LinkConverter.model.LinkConversion;

@Repository
public interface ILogRepository extends CrudRepository<LinkConversion, Long> {
}
