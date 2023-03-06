package services;

import entities.Item;

public interface InputManagementService {
	void addTotalUser();
	void removeAccount(String accountName);
	void addItem(Item item);
}
