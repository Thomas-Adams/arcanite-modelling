package org.enargit.attributes.data.repository;

import org.arcanite.idm.data.entity.Privilege;
import org.arcanite.idm.data.entity.QPrivilege;
import org.springframework.stereotype.Repository;

@Repository
public interface PrivilegeRepository extends BaseRepository<Long, Privilege, QPrivilege> {

}
