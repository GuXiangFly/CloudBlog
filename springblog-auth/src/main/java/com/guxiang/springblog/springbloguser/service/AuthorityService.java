package com.guxiang.springblog.springbloguser.service;


import com.guxiang.springblog.springbloguser.domain.Authority;

/**
 * Authority 服务接口.
 * 
 * @since 1.0.0 2017年3月18日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public interface AuthorityService {
	 
	
	/**
	 * 根据id获取 Authority
	 * @param id
	 * @return
	 */
	Authority getAuthorityById(Long id);
}
