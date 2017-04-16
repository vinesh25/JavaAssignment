package com.shop.daoRepository;

import org.springframework.stereotype.Repository;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import com.shop.model.Merchant;

@Repository
public class ShopDaoImpl implements ShopDao{

	@Override
	public Merchant executeDao(long id) {
		Merchant merchant = new Merchant();
		merchant.setName("abc");
		merchant.setPostCode(123);
		merchant.setShopAdress("abc");
		
		try {

			URL url = new URL("https://maps.googleapis.com/maps/api/geocode/json?address=Whistling+palms,+wakad,+Pune&key=AIzaSyAM-MF36kIo4W07UOjKj5A7EnLcKAZz9Vs");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			conn.disconnect();

		  } catch (MalformedURLException e) {

			e.printStackTrace();

		  } catch (IOException e) {

			e.printStackTrace();

		  }

		
		return merchant;
	}
	
	

}
