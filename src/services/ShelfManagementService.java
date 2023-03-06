package services;

import entities.Item;

public interface ShelfManagementService {
	Item getItemByName();
	Item getItemsByCategory();
	Item getAllItems();
	void addNewItemToShelf(Item item);
	void addItemsFromData();
}
