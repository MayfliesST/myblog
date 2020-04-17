package com.shell845.myblog.dao;

import com.shell845.myblog.po.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ych
 * @date 16/4/2020 9:06 PM
 */
public interface TagRepository extends JpaRepository<Tag, Long> {
    Tag findByTagName(String name);
}