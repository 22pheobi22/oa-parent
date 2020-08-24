package com.zhss.oa.flow.service;

import com.zhss.oa.flow.model.Application;

/**
 * @Description 授权实体类
 * @Classname Authorization
 * @Author yahui.li
 * @Date 2020-08-20 22:41
 * @Version V1.0
 */
public interface ApplicationService {

	public void create(Application auth);

	public void delete(Long id);

	public Application findById(Long id);

}
