
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



@Data
@SuperBuilder
@NoArgsConstructor
@Entity
public class UserType extends BasicDto<Long> {
	
	@Column
	private String name;

	
	private String description;

}
