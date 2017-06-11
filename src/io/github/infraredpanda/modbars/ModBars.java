package io.github.infraredpanda.modbars;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;

import io.github.infraredpanda.modbars.gui.GUI;

public class ModBars
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter file name : ");
		String fileName = in.nextLine();
		IngredientHelper ingredientData = new IngredientHelper(fileName + ".txt");

		BarHelper barData = new BarHelper();
		ArrayList<Ingredient> ingredientList = ingredientData.getIngredientList();
		barData.calculateTotals(ingredientList);
		Bar bar = barData.calculateTotals(ingredientList);
		System.out.println(bar.toString());
		in.close();
	}

	public ModBars()
	{
		GUI gui = new GUI();
		
		
	}
}
