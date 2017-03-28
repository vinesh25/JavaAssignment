package com.shop.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Merchant {

	private String name;
	private String shopAdress;
	private int postCode;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the shopAdress
	 */
	public String getShopAdress() {
		return shopAdress;
	}
	/**
	 * @param shopAdress the shopAdress to set
	 */
	public void setShopAdress(String shopAdress) {
		this.shopAdress = shopAdress;
	}
	/**
	 * @return the postCode
	 */
	public int getPostCode() {
		return postCode;
	}
	/**
	 * @param postCode the postCode to set
	 */
	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}
	
}
