package org.enargit.attributes.data.repository;

import org.arcanite.idm.data.entity.User;
import org.arcanite.idm.data.entity.QUser;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<Long, User, QUser> {

}
