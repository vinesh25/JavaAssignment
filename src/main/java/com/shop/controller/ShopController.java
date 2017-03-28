package com.shop.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shop.dataService.ShopService;
import com.shop.model.Merchant;

//import com.model.Merchant;




@RestController

public class ShopController {
	// produces = { "application/json", "application/xml" },
	  Map<Long, Merchant> employeeMap = new HashMap<>();

	  private ShopService shopService;
	@Autowired
		 public void getShopService(ShopService shopService)
		 {
			 this.shopService=shopService;
		 }
	 
	 
	  
	@RequestMapping(value = "/employee/{Id}", method = RequestMethod.GET)
    public @ResponseBody Merchant getMerchantById(@PathVariable final long Id) {
	
		return shopService.execute(Id);
				//employeeMap.get(Id);
    }

	
}
