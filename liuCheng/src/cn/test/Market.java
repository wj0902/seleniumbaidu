package cn.test;

public class Market {
	private String marketName;  //��������
	private Product[] productArr;  //������Ʒ���飬Ҳ���ǲֿ�
	          //����  ����
	public String getMarketName() {  //���巽����������getMarketName
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
	//ָ����Ʒ����
	Product sell(String name) {  
		for(int i=0;i<productArr.length;i++) {
			if(productArr[i].getProName()==name) {
				return productArr[i];  //���ظ���Ʒ
			}
		}
		return null;
	}
	
}



