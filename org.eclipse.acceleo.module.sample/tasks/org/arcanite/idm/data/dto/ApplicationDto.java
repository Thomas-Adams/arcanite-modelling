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
public class ApplicationDto extends BasicDto<Long> {
		
	@Column
	private String name;

	
	private String description;
	@OneToMany(mappedBy="application")
	private List<TenantApplicationDto> tenantApplications;

	@OneToMany(mappedBy="application")
	private List<ApplicationGroupDto> applicationGroups;
}
