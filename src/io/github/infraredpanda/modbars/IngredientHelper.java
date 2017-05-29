package io.github.infraredpanda.modbars;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class IngredientHelper
{
	private ArrayList<Ingredient> ingredientList = new ArrayList<Ingredient>();

	public IngredientHelper(String fileName)
	{
		loadData(fileName);
	}

	private void loadData(String fileName)
	{
		String name;
		int servings;
		int cal;
		int fat;
		int cholesterol;
		int sodium;
		int carbs;
		int fiber;
		int sugar;
		int protein;

		Scanner inFile;
		try
		{
			inFile = new Scanner(new File(fileName));

			int numIngredients = inFile.nextInt();

			inFile.nextLine();// needed to flush EOL

			for (int i = 0; i < numIngredients; i++)
			{
				name = inFile.nextLine();
				servings = inFile.nextInt();
				cal = inFile.nextInt();
				fat = inFile.nextInt();
				cholesterol = inFile.nextInt();
				sodium = inFile.nextInt();
				carbs = inFile.nextInt();
				fiber = inFile.nextInt();
				sugar = inFile.nextInt();
				protein = inFile.nextInt();

				if (inFile.hasNextLine())
					inFile.nextLine(); // needed to flush EOL
				ingredientList.add(new Ingredient(name, servings, cal, fat, cholesterol, sodium, carbs, fiber, sugar, protein));
			}
		}
		catch (IOException e)
		{
			System.out.println("Error: " + e.getMessage());
		}
	}

	public ArrayList<Ingredient> getIngredientList()
	{
		return ingredientList;
	}
}
