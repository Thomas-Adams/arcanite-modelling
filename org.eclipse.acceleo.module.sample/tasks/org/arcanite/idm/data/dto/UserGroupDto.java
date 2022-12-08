package org.arcanite.idm.data.dto;


import lombok.Data;
import lombok.experimental.SuperBuilder;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.time.OffsetDateTime;
@Data
@SuperBuilder
@NoArgsConstructor
public class UserGroupDto extends BasicDto<Long> {
		
	@ManyToOne
	private UserDto user;

	@ManyToOne
	private GroupDto group;
}
