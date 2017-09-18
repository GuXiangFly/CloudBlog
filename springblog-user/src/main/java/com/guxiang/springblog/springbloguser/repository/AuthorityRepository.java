package com.guxiang.springblog.springbloguser.repository;

import com.guxiang.springblog.springbloguser.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Authority 仓库.
 *
 * @since 1.0.0 2017年3月2日
 */
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
}
