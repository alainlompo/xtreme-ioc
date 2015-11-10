package org.hypernovae.apis.beans.collectible;

import java.util.List;

public class Shop {
	
	private String shopName;
	private List<Article> articles;
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Shop name: " + shopName + "\n");
		if (articles != null ) {
			for (Article art: articles) {
				builder.append(art +"\n");
			}
		}
		return builder.toString();
		
	}

}
