package entities;

import java.util.List;

public interface Account {
	
	String getName();
	String getFileName();
	int getId();
	void setAccountName(String accountName);
	void setBoughtItems(List<Item> items);
	void setFileName(String fileName);
}
