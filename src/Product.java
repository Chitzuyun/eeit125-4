import com.sun.org.apache.xml.internal.security.keys.keyresolver.implementations.PrivateKeyResolver;

public class Product {
	
	private String brand_no;
	private String brand_name;
	private int product_Id;
	private String product_name;
	private String product_Type;
	private String product_category;
	private String product_series;
	private String product_skin;
	private int product_price;
	private float product_rating;
	//private String product_Comment;
	
	public int getProduct_Price() {
		return product_Price;
	}

	public void setProduct_Price(int product_Price) {
		this.product_Price = product_Price;
	}

	public Product() {
		
	}
	
	
	public int getProduct_Id() {
		return product_Id;
	}
	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}
	public String getProduct_Name() {
		return product_Name;
	}
	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}
	
	public String getProduct_Type() {
		return product_Type;
	}
	public void setProduct_Type(String product_Type) {
		this.product_Type = product_Type;
	}
	public String getProduct_Category() {
		return product_Category;
	}
	public void setProduct_Category(String product_Category) {
		this.product_Category = product_Category;
	}
	public String getProduct_Skin() {
		return product_Skin;
	}
	public void setProduct_Skin(String product_Skin) {
		this.product_Skin = product_Skin;
	}

	}
	
	
	
	


