package org.enargit.attributes.data.repository;

import org.arcanite.idm.data.entity.Group;
import org.arcanite.idm.data.entity.QGroup;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends BaseRepository<Long, Group, QGroup> {

}
