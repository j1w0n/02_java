package product.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import product.mybatis.MybatisClient;
import product.vo.Product;

public class ProductDao {
	
	// (1) 멤버변수 SqlSessionFactory factory 선언
	private SqlSessionFactory factory;
	    
	// (2) 생성자 
	//     factory 변수를 MybatisClient 를 사용하여 초기화 진행
	public ProductDao() {
		factory = MybatisClient.getFactory(); 
	 }
	
	// (3) 메소드
	//    1)  selectProducts() : List<Product>
	//      조회 쿼리아이디 : selectAllProducts
	public List<Product> selectProducts(){
		List<Product> list = null;
		SqlSession session = factory.openSession();
		try {
			session.selectList("product.mapper.ProductMapper.selectAllProducts");
		} finally {
			session.close();
		}
		return list;
	}
	
	
	       
	//    2)  selectProduct(PrimaryKey pk) : Product
	//    	조회 쿼리 아이디 : selectProduct
    public Product selectProduct(PrimaryKey pk) {
    	
    }
	
	//    3)  insertProduct(Product product) : int
	//    	조회 쿼리 아이디 : insertProduct
	public int insertProduct(Product product) {
		
	}
	//    4)  updateProduct(PrimaryKey pk, Product product) : int
	//    	조회 쿼리 아이디 : updateProduct
	public int updateProduct(PrimaryKey pk, Product product) {    	
	//    5)  deleteProduct(PrimaryKey pk) : int
	//    	조회 쿼리 아이디 : deleteProduct
	public int deleteProduct(PrimaryKey pk) {
		
	}
	//    6)  selectProducts(String name) : List<Product>
	//    	조회 쿼리 아이디 : selectByName
	public List<Product> selectProducts(String name) {
		
	}
	//    7)  selectProducts(Price price) : List<Product>
	//    	조회 쿼리 아이디 : selectByPrice
	public List<Product> selectProducts(Price price) {
		
	}
	//    8)  selectProductsByMinPrice(int min) : List<Product>
	//    	조회 쿼리 아이디 : selectExpensiveThan
	public List<Product> selectProductsByMinPrice(int min){
		
	}
	//    9)  selectProductsByMaxPrice(int max) : List<Product>
	//    	조회 쿼리 아이디 : selectCheapThan
	public List<Product> selectProductsByMaxPrice(int max) {
		
	}
	//    10) selectMostExpensive() : List<Product>
	//    	조회 쿼리 아이디 : selectMostExpensive
	public List<Product> selectMostExpensive() {
		
	}
	//    11) selectMostAmount() : List<Product>
	//    	조회 쿼리 아이디 : selectMostQuantity
	public List<Product> selectMostAmount() {
		
	}
}
