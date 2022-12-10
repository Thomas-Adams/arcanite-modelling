package org.enargit.attributes.data.repository;

import org.arcanite.idm.data.entity.UserGroup;
import org.arcanite.idm.data.entity.QUserGroup;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGroupRepository extends BaseRepository<Long, UserGroup, QUserGroup> {

}
