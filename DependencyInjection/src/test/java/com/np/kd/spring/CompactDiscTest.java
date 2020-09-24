package com.np.kd.spring;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.np.kd.spring.CompactDiscConfiguration;
import com.np.kd.spring.album.CompactDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CompactDiscConfiguration.class)
public class CompactDiscTest {
 
	@Autowired
	CompactDisc cd;
     	
	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}
}
