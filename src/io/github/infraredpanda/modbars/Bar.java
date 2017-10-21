package io.github.infraredpanda.modbars;

public class Bar
{
	double calories;
	double fat;
	double cholesterol;
	double sodium;
	double carbs;
	double fiber;
	double sugar;
	double protein;

	public Bar(double cal, double fat, double cholesterol, double sodium, double carbs, double fiber, double sugar, double protein)
	{
		this.calories = cal;
		this.fat = fat;
		this.cholesterol = cholesterol;
		this.sodium = sodium;
		this.carbs = carbs;
		this.fiber = fiber;
		this.sugar = sugar;
		this.protein = protein;
	}
//Max Levine is a God
//#ModBarMonday
	public String toString()
	{
		return ("Calories : " + calories + " Fat : " + fat + "g Cholesterol : " + cholesterol + "mg Sodium  : " + sodium + "mg Carbs : " + carbs + "mg Fiber : " + fiber + "g Sugar : " + sugar + "g Protein : " + protein + "g");
	}
}
