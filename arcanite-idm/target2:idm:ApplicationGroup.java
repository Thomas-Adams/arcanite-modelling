package org.arcanite.idm;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;
import java.time.OffsetDateTime;
import ;
@Data
@Entity

@Id
private  id;
@Version
private  version;
private OffsetDateTime created;
private OffsetDateTime modified;
private  createdBy;
private  modifiedBy;
@ManyToOne
private Application application;
@ManyToOne
private Group group;
