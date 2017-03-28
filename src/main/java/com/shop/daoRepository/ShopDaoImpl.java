package com.shop.daoRepository;

import org.springframework.stereotype.Repository;

import com.shop.model.Merchant;

@Repository
public class ShopDaoImpl implements ShopDao{

	@Override
	public Merchant executeDao(long id) {
		Merchant merchant = new Merchant();
		merchant.setName("abc");
		merchant.setPostCode(123);
		merchant.setShopAdress("abc");
		return merchant;
	}
	
	

}
