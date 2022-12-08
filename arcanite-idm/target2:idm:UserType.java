package org.arcanite.idm;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;
import java.time.OffsetDateTime;
import javax.persistence.Column;
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
@Column(unique=true)
private  name;
private  description;
