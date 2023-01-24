import java.util.ArrayList;
import java.util.List;

public class Club {
	 private String name;
	  private List<Member> members = new ArrayList<Member>();

	  public Club (String name) {
	    if(name == null) {
	      throw new IllegalArgumentException("Name cannot be null");
	    }
	    this.name = name;
	  }

	  public Club(String name, List<Member>members) {
	    this(name);
	    if(members ==null) {
	      throw new IllegalArgumentException("members cannot be null");
	    }
	    this.members = new ArrayList<>(members);
	  }

	  public String name() {
	    return name;
	  }

	  public void addMember(Member member) {
	    if(member == null) {
	      throw new IllegalArgumentException("Cannot add a null member");
	    }
	    members.add(member);
	  }

	  public int numberOfMembers(){
	    return members.size();
	  }

	  public List<Member> members(){
	    return new ArrayList<Member>(members);
	  }

	  public String toString() {
	    return name + ": " + members;
	  }

}
