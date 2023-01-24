import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MemberTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	void CreateMemberWithValidAgeTest() {
		Member testMember = new Member("Eva", 1987);
		assertEquals("Eva", testMember.name());
	}
	
	@Test
	void CreateMemberWithInvalidAgeTest() {
		Member testMember;
		
		assertThrows(IllegalArgumentException.class, () -> new Member("Ben" ,2015));
		
	}
	
	@Test
	void CreateMemberWithValidEmailTest() {
		Member testMember = new Member("Eva", 1987, "eva@gmail.com");
		assertEquals("Eva",testMember.name());
	}
	
	@Test
	void CreateMemberWithInvalidEmailTest() {
		Member testMember;
		
		assertThrows(IllegalArgumentException.class, () -> new Member("Ben" ,1987, "benAtgamil.com"));
		
	}

}
