package mvc.model;

import java.util.Arrays;

public class Exam {

	String name;
	int [] jum;
	
	String[] index = {"국어", "영어", "수학"};
	
	
	public String title(int i) {
		return index[i]+":"+jum[i];
	}

	public Exam() {
	
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int[] getJum() {
		return jum;
	}
	
	public void setJum(int[] jum) {
		this.jum = jum;
	}
	
	public Exam(String name, int ... jum) {
		super();
		this.name = name;
		this.jum = jum;
	}

	@Override
	public String toString() {
		return "Exam [name=" + name + ", jum=" + Arrays.toString(jum) + "]";
	}
	
}
