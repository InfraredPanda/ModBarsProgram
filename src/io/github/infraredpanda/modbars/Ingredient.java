package io.github.infraredpanda.modbars;

public class Ingredient
{
	private String name;

	private double servings;

	private double calories;

	private double fat;
	// private double satfat;
	// private double transfat;
	// private double polyfat;
	// private double monofat;

	private double cholesterol;

	private double sodium;

	private double carbs;
	private double fiber;
	private double sugar;

	private double protein;

	public Ingredient(String name, double servings, double cal, double fat2, double cholesterol2, double sodium, double carbs, double fiber, double sugar, double protein)
	{
		this.name = name;
		this.servings = servings;
		this.calories = cal;
		this.fat = fat2;
		this.cholesterol = cholesterol2;
		this.sodium = sodium;
		this.carbs = carbs;
		this.fiber = fiber;
		this.sugar = sugar;
		this.protein = protein;
	}

	public double getServings()
	{
		return servings;
	}

	public void setServings(double servings)
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

	public double getCalories()
	{
		return calories;
	}

	public void setCalories(double calories)
	{
		this.calories = calories;
	}

	public double getFat()
	{
		return fat;
	}

	public void setFat(double fat)
	{
		this.fat = fat;
	}

	public double getCholesterol()
	{
		return cholesterol;
	}

	public void setCholesterol(double cholesterol)
	{
		this.cholesterol = cholesterol;
	}

	public double getSodium()
	{
		return sodium;
	}

	public void setSodium(double sodium)
	{
		this.sodium = sodium;
	}

	public double getCarbs()
	{
		return carbs;
	}

	public void setCarbs(double carbs)
	{
		this.carbs = carbs;
	}

	public double getFiber()
	{
		return fiber;
	}

	public void setFiber(double fiber)
	{
		this.fiber = fiber;
	}

	public double getSugar()
	{
		return sugar;
	}

	public void setSugar(double sugar)
	{
		this.sugar = sugar;
	}

	public double getProtein()
	{
		return protein;
	}

	public void setProtein(double protein)
	{
		this.protein = protein;
	}

}
