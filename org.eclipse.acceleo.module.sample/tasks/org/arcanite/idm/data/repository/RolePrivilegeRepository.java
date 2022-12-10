package org.enargit.attributes.data.repository;

import org.arcanite.idm.data.entity.RolePrivilege;
import org.arcanite.idm.data.entity.QRolePrivilege;
import org.springframework.stereotype.Repository;

@Repository
public interface RolePrivilegeRepository extends BaseRepository<Long, RolePrivilege, QRolePrivilege> {

}
