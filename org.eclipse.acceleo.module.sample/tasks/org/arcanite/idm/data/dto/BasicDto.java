package org.arcanite.idm.data.dto;


import lombok.experimental.SuperBuilder;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.time.OffsetDateTime;
@SuperBuilder
@MappedSuperClass
@SuperBuilder
@NoArgsConstructor
public class BasicDto<ID extends Serializable> {
		
	@Id
	private ID id;

	@Version
	private Long version;

	
	private OffsetDateTime created;

	
	private OffsetDateTime modified;

	
	private String createdBy;

	
	private String modifiedBy;
}
