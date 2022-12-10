package org.enargit.attributes.data.repository;

import org.arcanite.idm.data.entity.TenantApplication;
import org.arcanite.idm.data.entity.QTenantApplication;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantApplicationRepository extends BaseRepository<Long, TenantApplication, QTenantApplication> {

}
