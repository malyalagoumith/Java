package day4;

public class encap {
	private String firstname;
	private String lastname;
	private String email;
	private long phone;
	
	public void setFirstname(String fn) {
		firstname=fn;
	}
	public void setLastname(String ln) {
		lastname=ln;
	}
	public void setEmail(String ei) {
		email=ei;
	}
	public void setPhone(long ph) {
		phone=ph;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getEmail() {
		return email;
	}
	public long  getPhone() {
		return phone;
	}
public static void main(String[] args) {
	encap e=new encap();
	e.setFirstname("vamshi");
	e.setLastname("amulya");
	e.setEmail("vamshi123@gmail.com");
	e.setPhone(9121041701L);
	System.out.println(e.getFirstname());
	System.out.println(e.getLastname());
	System.out.println(e.getEmail());
	System.out.println(e.getPhone());
}
}

