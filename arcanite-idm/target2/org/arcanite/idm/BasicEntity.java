package org.arcanite.idm;

import lombok.experimental.SuperBuilder;
import javax.persistence.MappedSuperClass;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Version;
import java.time.OffsetDateTime;




@SuperBuilder
@MappedSuperClass
@SuperBuilder
@NoArgsConstructor
public class BasicEntity {

	@Id
	private Serializable id;

	@Version
	private  version;

	private OffsetDateTime created;

	private OffsetDateTime modified;

	private  createdBy;

	private  modifiedBy;

}
