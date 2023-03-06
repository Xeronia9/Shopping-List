package entities.imp;

import java.util.List;
import entities.Account;
import entities.Item;

public class DefaultAccount implements Account {
	
	private String accountName;
	private int uniqueId;
	private static int id;
	private List<Item> boughtItems;
	private String fileName;
	
	static {
		//TODO code for taking id from a file or database
	}
	
	public DefaultAccount(String accountName) {
		
		this.accountName = accountName;
		this.uniqueId = this.id;
		id++;
		//TODO write some code to add number of user to a file or a database
		
	}
	
	@Override
	public String getName() {
		
		return this.accountName;
	}
	
	@Override
	public int getId() {
		
		return this.uniqueId;
	}
	
	@Override
	public void setAccountName(String accountName) {	
		
		this.accountName = accountName;
	}

	@Override
	public void setBoughtItems(List<Item> items) {
		
		this.boughtItems = items;
	}
	
	@Override
	public String toString() {
		
		return "";
	}

	@Override
	public String getFileName() {
		
		return this.fileName;
	}

	@Override
	public void setFileName(String fileName) {
		
		this.fileName = fileName;
	}
	

}
