package com.zhss.oa.flow.service.impl;

import com.zhss.oa.flow.mapper.ApplicationMapper;
import com.zhss.oa.flow.model.Application;
import com.zhss.oa.flow.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 授权实体类
 * @Classname Authorization
 * @Author yahui.li
 * @Date 2020-08-20 22:41
 * @Version V1.0
 */
@Service("applicationServiceImpl")
public class ApplicationServiceImpl implements ApplicationService {
	@Autowired
	private ApplicationMapper applicationMapper;

	@Override
	public void create(Application auth) {
		applicationMapper.create(auth);
	}
	@Override
	public void delete(Long id) {
		applicationMapper.delete(id);
	}
	@Override
	public Application findById(Long id) {
		return applicationMapper.findById(id);
	}
}
