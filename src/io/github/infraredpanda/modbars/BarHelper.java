package io.github.infraredpanda.modbars;

import java.util.ArrayList;

public class BarHelper
{
	String name;
	double servings;
	double calories;
	double fat;
	double cholesterol;
	double sodium;
	double carbs;
	double fiber;
	double sugar;
	double protein;

	public Bar calculateTotals(ArrayList<Ingredient> ingredientList)
	{
		double cal = 0;
		double fat = 0;
		double cholesterol = 0;
		double sodium = 0;
		double carbs = 0;
		double fiber = 0;
		double sugar = 0;
		double protein = 0;

		for (Ingredient i : ingredientList)
		{
			double s = i.getServings();
			cal += i.getCalories() * s;
			fat += i.getFat() * s;
			cholesterol += i.getCholesterol() * s;
			sodium += i.getSodium() * s;
			carbs += i.getCarbs() * s;
			fiber += i.getFiber() * s;
			sugar += i.getSugar() * s;
			protein += i.getProtein() * s;
		}
		return new Bar(cal, fat, cholesterol, sodium, carbs, fiber, sugar, protein);
	}
}
