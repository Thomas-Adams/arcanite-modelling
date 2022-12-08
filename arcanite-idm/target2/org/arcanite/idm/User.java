package org.arcanite.idm;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Version;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.OneToMany;




@Data
@SuperBuilder
@NoArgsConstructor
@Entity
public class User extends BasicEntity {

	@Id
	private Serializable id;

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


}
