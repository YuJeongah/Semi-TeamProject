package com.multi.addr_list;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.Addr_listBiz;

@SpringBootTest
class Addr_listSelectTest {

	@Autowired
	Addr_listBiz biz;
	
	@Test
	void contextLoads() {
		try {
			System.out.println(biz.get(1001));
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}

}
