package org.enargit.code.entity;

import java.io.Serializable;
import java.time.OffsetDateTime;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@NoArgsConstructor
@MappedSuperclass
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
