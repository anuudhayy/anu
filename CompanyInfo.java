package NewPro.Java;

public class CompanyInfo {
	
	private void companyName() {
		System.out.println("Infosys");
	}
private void companyId() {
	System.out.println("456789");
}
private void companyAddress() {
	System.out.println("34,adayar 1st street,chennai");
}
public static void main(String[] args) {
	CompanyInfo a= new CompanyInfo();
	a.companyName();
	a.companyId();
	a.companyAddress();
}
}