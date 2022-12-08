package org.arcanite.idm;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Version;
import java.time.OffsetDateTime;
import javax.persistence.ManyToOne;




@Data
@SuperBuilder
@NoArgsConstructor
@Entity
public class UserGroup extends BasicEntity {

	@Id
	private Serializable id;

	@Version
	private  version;

	private OffsetDateTime created;

	private OffsetDateTime modified;

	private  createdBy;

	private  modifiedBy;

	@ManyToOne
	private User user;


	@ManyToOne
	private Group group;


}
