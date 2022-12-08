package org.arcanite.idm.dto;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Version;
import java.time.OffsetDateTime;
import nullDto;




@Data
@SuperBuilder
@NoArgsConstructor
public class ApplicationGroup extends BasicEntity {

	@Id
	private Serializable id;

	@Version
	private  version;

	private OffsetDateTime created;

	private OffsetDateTime modified;

	private  createdBy;

	private  modifiedBy;

	private Application application;


	private Group group;


}
