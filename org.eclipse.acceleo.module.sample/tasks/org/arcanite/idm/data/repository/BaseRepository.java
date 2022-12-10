package org.arcanite.idm.data.repository;

import com.querydsl.core.types.dsl.EntityPathBase;
import org.arcanite.idm.data.entity.BasicEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;

import java.io.Serializable;

public interface BaseRepository<ID extends Serializable, E extends BaseEntity<ID>, Q extends EntityPathBase<E>> extends JpaRepository< E, ID>,
        QuerydslPredicateExecutor<E>, QuerydslBinderCustomizer<Q> {

    default void customize(QuerydslBindings bindings, Q root) {
        // nope
    }
}
