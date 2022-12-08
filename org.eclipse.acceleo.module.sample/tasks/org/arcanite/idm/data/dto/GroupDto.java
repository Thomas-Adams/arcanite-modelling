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
public class GroupDto extends BasicDto<Long> {
		
	@Column
	private String name;

	
	private String description;
	@OneToMany(mappedBy="group")
	private List<UserGroupDto> userGroups;

	@OneToMany(mappedBy="group")
	private List<ApplicationGroupDto> applicationGroups;
}
