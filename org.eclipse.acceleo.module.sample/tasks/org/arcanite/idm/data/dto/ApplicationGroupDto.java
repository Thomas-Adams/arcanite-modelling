package org.arcanite.idm.data.dto;


import lombok.Data;
import lombok.experimental.SuperBuilder;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.time.OffsetDateTime;
@Data
@SuperBuilder
@NoArgsConstructor
public class ApplicationGroupDto extends BasicDto<Long> {
		
	@ManyToOne
	private ApplicationDto application;

	@ManyToOne
	private GroupDto group;
}
