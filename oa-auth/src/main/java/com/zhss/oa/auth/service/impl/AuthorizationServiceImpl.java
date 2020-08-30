package com.zhss.oa.auth.service.impl;

import com.zhss.oa.auth.mapper.AuthorizationMapper;
import com.zhss.oa.auth.model.Authorization;
import com.zhss.oa.auth.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 授权实体类
 * @Classname Authorization
 * @Author yahui.li
 * @Date 2020-08-20 22:41
 * @Version V1.0
 */
@Service("authorizationServiceImpl")
public class AuthorizationServiceImpl implements AuthorizationService {
	@Autowired
	private AuthorizationMapper authorizationMapper;

	@Override
	public void authorize(Authorization auth) {
		authorizationMapper.authorize(auth);
	}
	@Override
	public void unauthorize(Long id) {
		authorizationMapper.unauthorize(id);
	}
	@Override
	public Authorization findById(Long id) {
		System.out.println("test stash ,master上bugfix");
		System.out.println("test git stash");
		return authorizationMapper.findById(id);
	}
}
