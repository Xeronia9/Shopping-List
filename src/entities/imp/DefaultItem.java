package entities.imp;

import java.util.Map;
import java.util.Set;

import entities.Item;

public class DefaultItem implements Item {
	
	private String itemName;
	private String category;
	private String measuringUnit;
	private Map<String, Double> monthlyPrice;
	
	public DefaultItem(String itemName, String category, String measuringUnit) {
		this.itemName = itemName;
		this.category = category;
		this.measuringUnit = measuringUnit;
	}

	@Override
	public String getName() {
		
		return this.itemName;
	}

	@Override
	public String getCategory() {
		
		return this.category;
	}

	@Override
	public String getMeasuringUnit() {
		
		return this.measuringUnit;
	}

	@Override
	public String getMonthlyPrice() {
		
		String prices = "";
		if (boughtHistoryExists()) {
			for (Map.Entry<String, Double> entry : this.monthlyPrice.entrySet()) {
				prices = prices + entry.getKey() + " : " + entry.getValue();
			}
		}
		return prices;
	}

	@Override
	public void setPrice(String time, Double price) {
		
		this.monthlyPrice.put(time, price);
	}

	@Override
	public void setName(String itemName) {
		
		this.itemName = itemName;
	}

	@Override
	public void setMeasuringUnit(String unit) {

		this.measuringUnit = unit;
	}

	@Override
	public void setCategory(String categoryName) {
		
		this.category = categoryName;
	}

	@Override
	public double getLastBoughtPrice() {
		// TODO returning recently bought price
		return 0;
	}
	
	@Override
	public String toString() {
		return this.itemName + "   " + this.category + "   " + this.measuringUnit + "\n" + this.getMonthlyPrice();
	}
	
	private boolean boughtHistoryExists() {
		if (this.monthlyPrice == null) {
			return false;
		}
		return true;
	}

}
