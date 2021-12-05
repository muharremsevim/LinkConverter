package tr.gov.hmb.LinkConverter.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table
public class LinkConversion extends BaseAuditableEntity {

    private String request;

    private String response;
}

