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
public class TenantDto extends BasicDto<Long> {
		
	@Column
	private String name;

	
	private String description;
	@OneToMany(mappedBy="tenant")
	private List<TenantApplicationDto> tenantApplications;
}
