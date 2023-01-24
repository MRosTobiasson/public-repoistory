import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ClubTest {

	@Test
	public void createValidClubTest() {
		Club clubTest = new Club("myClub");
		assertEquals("myClub", clubTest.name());
	}

	@Test
	public void createNullClubTest() {
		Club testClub;
		assertThrows(IllegalArgumentException.class, () -> new Club(null));
	}

	@Test
	public void createValidClubWithMembersTest() {
		List<Member> testMembers = new ArrayList<>();
		testMembers.add(new Member("Eva",1987));
		Club clubTest = new Club("myClub", testMembers);
		assertEquals(1, clubTest.numberOfMembers());
	}

	@Test
	public void createClubWithEmptyListTest() {
		Club testClub;
		assertThrows(IllegalArgumentException.class, () -> new Club("myClub", null));
	}

	@Test
	public void addValidMemberTest() {
		Club myClub = new Club("myClub");
		Member eva= new Member("Eva",1987);
		myClub.addMember(eva);
		assertEquals(1, myClub.numberOfMembers());
	}

	@Test
	public void addNullMemberTest() {
		Club testClub = new Club("testClub");
		assertThrows(IllegalArgumentException.class, () -> testClub.addMember(null));
	}
}
