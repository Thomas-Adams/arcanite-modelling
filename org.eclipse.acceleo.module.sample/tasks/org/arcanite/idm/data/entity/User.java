
package org.arcanite.idm.data.entity;


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
public class User extends BasicDto<Long> {
	
	
	private String username;

	
	private String email;

	
	private String password;

	
	private Boolean enabled;

	
	private Boolean expired;

	
	private Boolean locked;
	@OneToMany(mappedBy="user")
	private List<UserRole> userRoles;

	@OneToMany(mappedBy="user")
	private List<UserGroup> userGroups;

}
