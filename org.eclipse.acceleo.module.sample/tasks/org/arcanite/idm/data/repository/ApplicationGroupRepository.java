package org.enargit.attributes.data.repository;

import org.arcanite.idm.data.entity.ApplicationGroup;
import org.arcanite.idm.data.entity.QApplicationGroup;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationGroupRepository extends BaseRepository<Long, ApplicationGroup, QApplicationGroup> {

}
