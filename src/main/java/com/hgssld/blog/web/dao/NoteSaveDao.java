package com.hgssld.blog.web.dao;

import com.hgssld.blog.web.entity.NoteSaveEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author monkeyking
 * @create 2018-01-20 12:44
 */
public interface NoteSaveDao extends JpaRepository<NoteSaveEntity, Long> {
}
