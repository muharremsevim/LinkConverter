package tr.gov.hmb.LinkConverter.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@SuperBuilder
@MappedSuperclass
//@EntityListeners(AuditingEntityListener.class)
public abstract class BaseAuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @CreatedDate
    private Date creationTime;
}
