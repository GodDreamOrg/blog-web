package com.hgssld.blog.web.dao;

import com.hgssld.blog.web.entity.ConfigEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author monkeyking
 * @create 2018-01-20 12:44
 */
public interface ConfigDao extends JpaRepository<ConfigEntity, Long> {

    ConfigEntity findByCode(String code);

    List<ConfigEntity> findAllByParentId(Long id);

    @Query(nativeQuery = true,value = "select * from t_config t where t.parent_id IN (select id from t_config h where h.code =:code)")
    List<ConfigEntity> findAllByCode(@Param("code") String code);
}
