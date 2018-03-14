/*
 * Done by Zhumazhenis Dairabay
 * Lab 3
 * Exercise 6
 * Last edited 29.01.2018
 */

public class Vehicle {
	public int mYear;
	public String mBrand;
	public String mModel;
	public int mMiles;
	public int mPrice;
	
	public Vehicle() {
		/*
		 * default values
		 */
		mYear = 0; 
		mBrand = "";
		mModel = "";
		mMiles = 0;
		mPrice = 0;
	}

	/*
	 * boolean worthBuying(int budget) method checks the users budget whether is
	 * enough or not to buy vehicle.
	 */
	public boolean worthBuying(int budget) {
		return budget >= mPrice;
	}
}
