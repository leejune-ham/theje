package mvc.model;

public class Product {

	String id;
	String name;
	Integer cnt;
	Integer price; // 단가
	Integer total; // 합계
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getCnt() {
		return cnt;
	}
	
	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}
	
	public Integer getPrice() {
		return price;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public Integer getTotal() {
		total = cnt*price;
		return total;
	}
	
	public void setTotal(Integer total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cnt=" + cnt + ", price=" + price + ", total=" + total + "]";
	}
	
}
