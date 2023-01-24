public class Member {
	private String name;
	  private int birthYear;
	  private String email;

	  public Member (String name, int birthYear) {
	    this.name = name;
	    if(2021 - birthYear < 18) {
	      throw new IllegalArgumentException("You must be 18");
	    }
	    this.birthYear = birthYear;
	  }

	  public Member(String name, int birthYear, String email) {
	    this(name,birthYear);
	   // this.email=email;
	    if(email != null && email.contains("@")) {
	      this.email = email;
	    }else {
	      throw new IllegalArgumentException("Missing @");
	    }
	  }

	  public String toString() {
	    return "name "+ name + " birthYear " + birthYear + " email " + email; 
	  }

	  public String name() {
	    return name;
	  }
	  public String email() {
	    return email;
	  }

	  public int birthYear() {
	    return birthYear;
	  }
	}
