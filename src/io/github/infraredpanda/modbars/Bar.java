package io.github.infraredpanda.modbars;

public class Bar
{
	int calories;
	int fat;
	int cholesterol;
	int sodium;
	int carbs;
	int fiber;
	int sugar;
	int protein;

	public Bar(int cal, int fat, int cholesterol, int sodium, int carbs, int fiber, int sugar, int protein)
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

	public String toString()
	{
		return ("Calories : " + calories + " Fat : " + fat + "g Cholesterol : " + cholesterol + "mg Sodium  : " + sodium + "mg Carbs : " + carbs + "mg Fiber : " + fiber + "g Sugar : " + sugar + "g Protein : " + protein + "g");
	}
}
