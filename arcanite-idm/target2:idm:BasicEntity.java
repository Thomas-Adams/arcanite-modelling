package org.arcanite.idm;

import lombok.experimantal.SuperBuilder;
import javax.persistence.MappedSuperClass;
import javax.persistence.Id;
import javax.persistence.Version;
import java.time.OffsetDateTime;
@SuperBuilder
@MappedSuperClass

@Id
private  id;
@Version
private  version;
private OffsetDateTime created;
private OffsetDateTime modified;
private  createdBy;
private  modifiedBy;
