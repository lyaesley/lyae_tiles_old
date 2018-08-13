package com.lyae;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lyae.menu.MenuService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MenuControllerTests {
	
	@Autowired MenuService menuService;
//	static List<String> PATH;
	
//	@Value("#{'${path.controller}'.split(',')}")
//	public void setPath(List<String> val) {
//		MenuControllerTests.PATH = val;
//	}
	
	@Test
	public void test() {
//		ReflectionTestUtils.setField(menuUtil, "PATH", PATH);
		
		System.out.println(menuService.getMenuGroups());
	}
	
}
