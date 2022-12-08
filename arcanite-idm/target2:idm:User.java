package org.arcanite.idm;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;
import java.time.OffsetDateTime;
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
private  username;
private  email;
private  password;
private  enabled;
private  expired;
private  locked;
@OneToMany(mappedBy="user")
private List<UserRole> userRoles;
@OneToMany(mappedBy="user")
private List<UserGroup> userGroups;
