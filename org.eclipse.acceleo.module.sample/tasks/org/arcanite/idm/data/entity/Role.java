
package org.arcanite.idm.data.entity;


import lombok.Data;
import lombok.experimental.SuperBuilder;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Version;
import java.time.OffsetDateTime;
import javax.persistence.Column;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.OneToMany;



@Data
@SuperBuilder
@NoArgsConstructor
@Entity
public class Role extends BasicDto<Long> {
	
	@Column
	private String name;

	
	private String description;
	@OneToMany(mappedBy="role")
	private List<RolePrivilege> rolePrivileges;

	@OneToMany(mappedBy="role")
	private List<UserRole> userRoles;

}
