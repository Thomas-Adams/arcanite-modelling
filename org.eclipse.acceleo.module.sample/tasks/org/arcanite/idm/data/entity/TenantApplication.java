
package org.arcanite.idm.data.entity;


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
public class TenantApplication extends BasicDto<Long> {
	
	@ManyToOne
	private Tenant tenant;

	@ManyToOne
	private Application application;

}
