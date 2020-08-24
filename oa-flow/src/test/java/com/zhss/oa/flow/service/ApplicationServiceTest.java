package com.zhss.oa.flow.service;

import com.zhss.oa.flow.model.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@ContextConfiguration(locations = {"classpath:application-flow.xml"})
@RunWith(SpringJUnit4ClassRunner.class)  
public class ApplicationServiceTest {
	
	@Autowired  
	private ApplicationService applicationService;

	private Long _id;

	@Test
	public void testCreate() {
		Application app = new Application();
		app.setDays(5);
		app.setEmployeeId(1L);
		applicationService.create(app);

		this._id = app.getId();
		assertEquals(true,this._id>0);
	}

	@Test
	public void testFindById() {
		Application app = new Application();
		app.setDays(5);
		app.setEmployeeId(1L);
		applicationService.create(app);

		Application _app = applicationService.findById(app.getId());
		assertEquals(true,_app!=null);
	}

	@Test
	public void testDelete() {
		Application app = new Application();
		app.setDays(5);
		app.setEmployeeId(1L);
		applicationService.create(app);

		applicationService.delete(app.getId());
		Application _app = applicationService.findById(_id);
		assertEquals(true,_app==null);
	}
	
}
