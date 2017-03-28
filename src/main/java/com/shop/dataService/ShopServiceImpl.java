package com.shop.dataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.daoRepository.ShopDao;
import com.shop.daoRepository.ShopDaoImpl;
import com.shop.model.Merchant;

@Service
public class ShopServiceImpl implements ShopService{

	private ShopDao shopDao;
	 @Autowired
	 public void getShopDao(ShopDao shopDao)
	 {
		 this.shopDao=shopDao;
	 }
	@Override
	public Merchant execute(long id) {

		ShopDao shopDao=new ShopDaoImpl();
		return  shopDao.executeDao(id);
	}

	
	
}
