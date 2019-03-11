package cn.test;

public class Person {
	private String Rname;

	public String getRname() {
		return Rname;
	}

	public void setRname(String rname) {
		Rname = rname;
	}
	Product shopping(Market m,String name) {
		return m.sell(name);
	}
}
