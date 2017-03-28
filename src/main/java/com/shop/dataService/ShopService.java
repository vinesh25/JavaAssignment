package com.shop.dataService;

import org.springframework.stereotype.Service;

import com.shop.model.Merchant;


public interface ShopService {

	Merchant execute(long id);
}
