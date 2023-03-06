package entities;

import java.util.List;

public interface Shelf {

	String getCategory();
	List<Item> getItems();
	void setCategory(String categoryName);
	void listAllItems();
}
