
package org.arcanite.idm.data.entity;


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
public class BasicEntity<ID extends Serializable> {
	
	@Id
	private ID id;

	@Version
	private Long version;

	
	private OffsetDateTime created;

	
	private OffsetDateTime modified;

	
	private String createdBy;

	
	private String modifiedBy;

}
