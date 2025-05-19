package day4;

public class p5 {
private String first;
private String last;
public void setFirst(String fst) {
	first=fst;
}
public void setLast(String lst) {
	last=lst;
}
public String getFirst() {
	return first;
}
public String getLast() {
	return last;
}
public static void main(String[] args) {
	p5 p=new p5();
	p.setFirst("MALYALA");
	p.setLast("GOUMITH");
	System.out.println(p.getFirst());
	System.out.println(p.getLast());	q
}
}
