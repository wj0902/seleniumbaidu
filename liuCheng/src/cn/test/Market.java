package cn.test;

public class Market {
	private String marketName;  //超市名字
	private Product[] productArr;  //定义商品数组，也就是仓库
	          //类名  数组
	public String getMarketName() {  //定义方法，方法名getMarketName
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}
	public Product[] getProductArr() {
		return productArr;
	}
	public void setProductArr(Product[] productArr) {
		this.productArr = productArr;
	}
	//指定商品名字
	Product sell(String name) {  
		for(int i=0;i<productArr.length;i++) {
			if(productArr[i].getProName()==name) {
				return productArr[i];  //返回该商品
			}
		}
		return null;
	}
	
}



