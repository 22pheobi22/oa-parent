package com.zhss.oa.auth.mapper;

import com.zhss.oa.auth.model.Authorization;

/**
 * @Description 授权实体类
 * @Classname Authorization
 * @Author yahui.li
 * @Date 2020-08-20 22:41
 * @Version V1.0
 */
public interface AuthorizationMapper {
	
	public void authorize(Authorization auth);

	public void unauthorize(Long id);

	public Authorization findById(Long id);


}
