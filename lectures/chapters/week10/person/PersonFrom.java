package chapters.week10.person;

public class PersonFrom extends Person {
	
	private String city;
	
	public PersonFrom(String n, String c) {
		super(n);
		city = c;
	}

	public String getCity() {
		return city;
	}
	
	public boolean same(PersonFrom p) {
		return sameName(p) && (this.getCity()).equals(p.getCity());
	}
	
	public static void main(String[] args) {
		Person p = new Person("마음");
		Person q = new PersonFrom("소리", "서울");

		System.out.println(q.sameName(p));   // false — 이름이 다름
	}
	
}
