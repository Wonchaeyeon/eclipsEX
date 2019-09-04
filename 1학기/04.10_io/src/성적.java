
public class 성적 {
	//이름
	String name;
	//주소
	String address;
	//수학
	double math;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "성적 [name=" + name + ", address=" + address + ", math=" + math + ", english=" 
	+ english +", total="+getTotal()
	+", average="+getAverage()+ "]";
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getEnglish() {
		return english;
	}
	public void setEnglish(double english) {
		this.english = english;
	}
	//영어
	double english;
	//getTotal()
	public double getTotal() {
		return math+english;
	}
	//getAverage()
	public double getAverage() {
		return math+english/2.0;
	}
}
