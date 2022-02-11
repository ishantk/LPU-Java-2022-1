package com.auribises.session19;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.auribises.model.News;

@RestController
@ResponseBody
@RequestMapping(path = "/webservice")
public class NewsWebService {

	@GetMapping("/news")
	public HashMap<String, ArrayList<News>> getNews(){
		
		ArrayList<News> newsList = new ArrayList<News>();
		
		News news1 = new News("john", "Elon Musk says SpaceX will launch its Starship", "stacked atop its 23-story Super Heavy booster at the company's Boca Chica");
		News news2 = new News("john", "Actually, Nevermind, It Seems BMW Beat Tesla", "Cox, an Atlanta-based automotive research firm, said in January that Tesla outsold");
		News news3 = new News("fionna", "Soaring used vehicle prices haven't cooled demand yet", "Normally we have only about a 30-day supply of used vehicles, so we can react p");
		News news4 = new News("john", "Yelp declares the best pizza in America is in the Bay Area", "Yelp dropped a list Tuesday ranking the best pizza in America while simultaneously celebrating");
		News news5 = new News("fionna", "Crypto Analyst Says Bitcoin (BTC) and Ethereum (ETH) Look Bullish", "A closely followed crypto analyst says that leading digital assets Bitcoin (BTC) and Ethereum (ETH) are showing bullish movements");
		News news6 = new News("john", "Inside the wild life of bitcoin bandits Heather Morgan", "At the height of the pandemic in 2020, when she wasnt teaching herself Russian, creating Salvador Dali-inspired");
		News news7 = new News("dave", "Kudlow: The harder you work, the less you're taking home - Fox Business", "FOX Business host Larry Kudlow voices his concerns over the rising consumer prices on 'Kudlow.");
		
		newsList.add(news1);
		newsList.add(news2);
		newsList.add(news3);
		newsList.add(news4);
		newsList.add(news5);
		newsList.add(news6);
		newsList.add(news7);
		
		HashMap<String, ArrayList<News>> map = new HashMap<String, ArrayList<News>>();
		map.put("USA", newsList);
		
		return map;
		
	}
	
}
