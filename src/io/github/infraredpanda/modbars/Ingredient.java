package io.github.infraredpanda.modbars;

public class Ingredient
{
	private String name;

	private int servings;

	private int calories;

	private int fat;
	// private double satfat;
	// private double transfat;
	// private double polyfat;
	// private double monofat;

	private int cholesterol;

	private int sodium;

	private int carbs;
	private int fiber;
	private int sugar;

	private int protein;

	public Ingredient(String name, int servings, int cal, int fat, int cholesterol, int sodium, int carbs, int fiber, int sugar, int protein)
	{
		this.name = name;
		this.servings = servings;
		this.calories = cal;
		this.fat = fat;
		this.cholesterol = cholesterol;
		this.sodium = sodium;
		this.carbs = carbs;
		this.fiber = fiber;
		this.sugar = sugar;
		this.protein = protein;
	}

	public int getServings()
	{
		return servings;
	}

	public void setServings(int servings)
	{
		this.servings = servings;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getCalories()
	{
		return calories;
	}

	public void setCalories(int calories)
	{
		this.calories = calories;
	}

	public int getFat()
	{
		return fat;
	}

	public void setFat(int fat)
	{
		this.fat = fat;
	}

	public int getCholesterol()
	{
		return cholesterol;
	}

	public void setCholesterol(int cholesterol)
	{
		this.cholesterol = cholesterol;
	}

	public int getSodium()
	{
		return sodium;
	}

	public void setSodium(int sodium)
	{
		this.sodium = sodium;
	}

	public int getCarbs()
	{
		return carbs;
	}

	public void setCarbs(int carbs)
	{
		this.carbs = carbs;
	}

	public int getFiber()
	{
		return fiber;
	}

	public void setFiber(int fiber)
	{
		this.fiber = fiber;
	}

	public int getSugar()
	{
		return sugar;
	}

	public void setSugar(int sugar)
	{
		this.sugar = sugar;
	}

	public int getProtein()
	{
		return protein;
	}

	public void setProtein(int protein)
	{
		this.protein = protein;
	}

}
