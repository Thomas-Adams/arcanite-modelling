package org.arcanite.idm;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;
import java.time.OffsetDateTime;
import javax.persistence.Column;
import ;
import java.util.ArrayList;
import java.util.List;
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
@OneToMany(mappedBy="tenant")
private List<TenantApplication> tenantApplications;
