package com.zhss.oa.auth.service;

import com.zhss.oa.auth.model.Authorization;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@ContextConfiguration(locations = {"classpath:application-auth.xml"})
@RunWith(SpringJUnit4ClassRunner.class)  
public class AuthorizationServiceTest {
	
	@Autowired  
	private AuthorizationService authorizationService;

	private Long _id;


	@Test
	public void testAuthorize() {
		Authorization auth = new Authorization();
		auth.setId(1L);
		auth.setEmployeeId(1L);
		authorizationService.authorize(auth);

		this._id = auth.getId();
		assertEquals(true,this._id>0);
	}

	@Test
	public void testFindById() {
		Authorization auth = new Authorization();
		auth.setId(1L);
		auth.setEmployeeId(1L);
		authorizationService.authorize(auth);

		Authorization _auth = authorizationService.findById(auth.getId());
		assertEquals(true,_auth!=null);
	}

	@Test
	public void testUnauthorize() {
		Authorization auth = new Authorization();
		auth.setId(1L);
		auth.setEmployeeId(1L);
		authorizationService.authorize(auth);

		authorizationService.unauthorize(auth.getId());
		Authorization _auth = authorizationService.findById(_id);
		assertEquals(true,_auth==null);
	}
	
}
