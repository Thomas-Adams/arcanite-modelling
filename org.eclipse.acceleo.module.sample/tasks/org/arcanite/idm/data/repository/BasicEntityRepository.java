package org.enargit.attributes.data.repository;

import org.arcanite.idm.data.entity.BasicEntity;
import org.arcanite.idm.data.entity.QBasicEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicEntityRepository extends BaseRepository<Long, BasicEntity, QBasicEntity> {

}
