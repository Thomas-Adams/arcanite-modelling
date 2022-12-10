package org.enargit.attributes.data.repository;

import org.arcanite.idm.data.entity.Tenant;
import org.arcanite.idm.data.entity.QTenant;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantRepository extends BaseRepository<Long, Tenant, QTenant> {

}
