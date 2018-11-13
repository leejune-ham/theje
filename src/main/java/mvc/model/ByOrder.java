package mvc.model;

import java.util.List;

public class ByOrder {

	List<Product> proList;
	Address addr;
	Integer sum;

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public List<Product> getProList() {
		return proList;
	}

	public void setProList(List<Product> proList) {
		this.proList = proList;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	public void execute() {
		
		sum = 0;
		
		for(int i = proList.size() - 1; i >= 0; i--) {
			
			Product pro = proList.get(i);
			
			if(pro.id.equals("") || pro.id.equals("null") || pro.id == null) {
				proList.remove(pro);
			} else {
				sum += pro.getTotal();
			}
		}
	}
	
}
