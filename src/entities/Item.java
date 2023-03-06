package entities;

import java.util.Map;

public interface Item {

	String getName();
	String getCategory();
	String getMeasuringUnit();
	String getMonthlyPrice();
	double getLastBoughtPrice();
	void setPrice(String time, Double price);
	void setName(String itemName);
	void setMeasuringUnit(String unit);
	void setCategory(String categoryName);
}
