package ufv.dis.final2021.MRA;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
class MraApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void testGetIP() {

		MainView obj = null;
		Long p = obj.Dot2LongIP("1.2.32");
		assertNull(p);

	}
	@Test
	void testlongIP() {
		Long a=Long.valueOf(342423443);
		MainView obj = null;
		String p = obj.longToIp(a);
		assertNull(p);

	}
}
