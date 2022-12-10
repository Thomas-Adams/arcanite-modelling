package org.enargit.attributes.data.repository;

import org.arcanite.idm.data.entity.Role;
import org.arcanite.idm.data.entity.QRole;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends BaseRepository<Long, Role, QRole> {

}
