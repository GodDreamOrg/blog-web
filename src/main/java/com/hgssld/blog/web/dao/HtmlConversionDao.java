package com.hgssld.blog.web.dao;

import com.hgssld.blog.web.entity.HtmlConversionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author monkeyking
 * @create 2018-01-20 12:44
 */
public interface HtmlConversionDao extends JpaRepository<HtmlConversionEntity, Long> {
}
