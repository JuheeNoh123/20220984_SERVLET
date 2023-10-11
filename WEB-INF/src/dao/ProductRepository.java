package dao;    //패키지 분리
import java.util.ArrayList;
import dto.Product;    // 가져와야 하니가 임포트 해주기

public class ProductRepository {

	private ArrayList<Product> listOfProducts = new ArrayList<Product>(); // ArrayList를 Product로 캐스팅
    private static ProductRepository instance = new ProductRepository();

    public static ProductRepository getInstance(){
        return instance;
    }
	public ProductRepository() {    //데이터베이스가 없어서 직접 데이터 삽입
		Product phone = new Product("P1234", "iPhone 6s", 800000);
		phone.setFilename("P1234.png");
        phone.setDescription("4.7-inch, 1334X750 Renina HD display, 8-megapixel iSight Camera");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
        
        Product notebook = new Product("P1235", "LG PC 그램", 1500000);
        notebook.setFilename("P1235.png");
		notebook.setDescription("13.3-inch, IPS LED display, 5rd Generation Intel Core processors");
		notebook.setCategory("Notebook");
		notebook.setManufacturer("LG");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("Refurbished");

		Product tablet = new Product("P1236", "Galaxy Tab S", 900000);
        tablet.setFilename("P1236.png");
		tablet.setDescription("212.8*125.6*6.6mm,  Super AMOLED display, Octa-Core processor");
		tablet.setCategory("Tablet");
		tablet.setManufacturer("Samsung");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("Old");
		
		// 위와 같이 상품 초기화 하고 아래에 상품을 추가

		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);
		// listOfProducts.add(상품명);
	}

	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}
    
    public Product getProductById(String productId){
        Product productById = null;
        for (int i = 0; i<listOfProducts.size();i++){
            Product product = listOfProducts.get(i);
            if(product != null && product.getProductId() !=null && product.getProductId().equals(productId)){    //아이디값 있는지 확인하고
                productById = product;    //해당 아이디값 초기화 한후
                break;
            }
        }
        return productById;//해당 단일 아이디 리턴
    }
    
    public void addProduct(Product product) {
	    listOfProducts.add(product);
    }
}