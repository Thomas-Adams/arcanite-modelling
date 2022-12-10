package org.enargit.attributes.data.repository;

import org.arcanite.idm.data.entity.UserRole;
import org.arcanite.idm.data.entity.QUserRole;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends BaseRepository<Long, UserRole, QUserRole> {

}
