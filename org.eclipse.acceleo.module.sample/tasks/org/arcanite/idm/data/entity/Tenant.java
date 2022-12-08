
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
import java.util.ArrayList;
import java.util.List;
import javax.persistence.OneToMany;



@Data
@SuperBuilder
@NoArgsConstructor
@Entity
public class Tenant extends BasicDto<Long> {
	
	@Column
	private String name;

	
	private String description;
	@OneToMany(mappedBy="tenant")
	private List<TenantApplication> tenantApplications;

}
