package io.github.infraredpanda.modbars.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GUI extends JFrame
{
	public GUI()
	{
		setTitle("meme");
		setSize(400, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
	}

	private void buildPanel()
	{
		bagelPanel = new BagelPanel();

		setLayout(new BorderLayout());

		buildButtonPanel();

		add(greetingPanel, BorderLayout.NORTH);

		pack();

	}

	private class CalcButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == calcButton)
			{

				double subtotal, tax, total;

				subtotal = toppingPanel.getToppings() + coffeePanel.getCoffee() + bagelPanel.getBagel();

				tax = TAX_RATE;

				total = subtotal * tax;

				JOptionPane.showMessageDialog(null, "The price is " + total);
			}

			if (e.getSource() == exitButton)
			{
				System.exit(0);
			}
		}
	}
}
