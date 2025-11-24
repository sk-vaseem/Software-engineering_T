package collections;

public class EmployeeDTO implements Comparable<EmployeeDTO> {
	private int empid;
	private String empname;
	public EmployeeDTO(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	public EmployeeDTO() {
		
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [empid=" + empid + ", empname=" + empname + "]";
	}
	@Override
	public int compareTo(EmployeeDTO o) {
		// TODO Auto-generated method stub
		return this.getEmpname().compareTo(o.getEmpname());
	}
	
	

}
