package entities.imp;

import java.util.ArrayList;
import java.util.List;
import entities.Item;
import entities.Shelf;

public class DefaultShelf implements Shelf {
	
	private String category;
	private List<Item> items;
	
	public DefaultShelf(String category) {
		this.category = category;
		this.items = new ArrayList<>();
	}

	@Override
	public String getCategory() {
		
		return this.category;
	}

	@Override
	public List<Item> getItems() {
		
		return this.items;
	}

	@Override
	public void setCategory(String categoryName) {
		
		this.category = categoryName;
	}
	
	@Override
	public void listAllItems() {
		items.forEach(x -> System.out.println(x));
	}

}
