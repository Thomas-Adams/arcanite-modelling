package org.arcanite.idm.data.dto;


import lombok.Data;
import lombok.experimental.SuperBuilder;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
@Data
@SuperBuilder
@NoArgsConstructor
public class RoleDto extends BasicDto<Long> {
		
	@Column
	private String name;

	
	private String description;
	@OneToMany(mappedBy="role")
	private List<RolePrivilegeDto> rolePrivileges;

	@OneToMany(mappedBy="role")
	private List<UserRoleDto> userRoles;
}
