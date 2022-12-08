package org.arcanite.idm.dto;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Version;
import java.time.OffsetDateTime;
import javax.persistence.Column;
import nullDto;
import java.util.ArrayList;
import java.util.List;




@Data
@SuperBuilder
@NoArgsConstructor
public class Group extends BasicEntity {

	@Id
	private Serializable id;

	@Version
	private  version;

	private OffsetDateTime created;

	private OffsetDateTime modified;

	private  createdBy;

	private  modifiedBy;

	@Column(unique=true)
	private  name;

	private  description;

	private List<UserGroup> userGroups;


	private List<ApplicationGroup> applicationGroups;


}
