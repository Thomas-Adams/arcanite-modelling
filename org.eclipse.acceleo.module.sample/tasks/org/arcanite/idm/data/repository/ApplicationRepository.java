package org.enargit.attributes.data.repository;

import org.arcanite.idm.data.entity.Application;
import org.arcanite.idm.data.entity.QApplication;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends BaseRepository<Long, Application, QApplication> {

}
