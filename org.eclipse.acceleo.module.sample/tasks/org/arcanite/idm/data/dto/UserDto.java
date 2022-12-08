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
public class UserDto extends BasicDto<Long> {
		
	
	private String username;

	
	private String email;

	
	private String password;

	
	private Boolean enabled;

	
	private Boolean expired;

	
	private Boolean locked;
	@OneToMany(mappedBy="user")
	private List<UserRoleDto> userRoles;

	@OneToMany(mappedBy="user")
	private List<UserGroupDto> userGroups;
}
