package org.enargit.attributes.data.repository;

import org.arcanite.idm.data.entity.UserType;
import org.arcanite.idm.data.entity.QUserType;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTypeRepository extends BaseRepository<Long, UserType, QUserType> {

}
