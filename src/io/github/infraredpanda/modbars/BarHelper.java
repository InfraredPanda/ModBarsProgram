package io.github.infraredpanda.modbars;

import java.util.ArrayList;

public class BarHelper
{
	String name;
	int servings;
	int calories;
	int fat;
	int cholesterol;
	int sodium;
	int carbs;
	int fiber;
	int sugar;
	int protein;

	public Bar calculateTotals(ArrayList<Ingredient> ingredientList)
	{
		int cal = 0;
		int fat = 0;
		int cholesterol = 0;
		int sodium = 0;
		int carbs = 0;
		int fiber = 0;
		int sugar = 0;
		int protein = 0;

		for (Ingredient i : ingredientList)
		{
			int s = i.getServings();
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
