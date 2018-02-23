package com.hgssld.blog.web.dao;

import com.hgssld.blog.web.entity.BlogListEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author monkeyking
 * @create 2018-01-20 12:44
 */
public interface BlogListDao extends JpaRepository<BlogListEntity, Long> {
}
