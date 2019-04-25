package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String kf= JOptionPane.showInputDialog("How much nickelz u ahas?");
		// Convert their answer to an int using Integer.parseInt()
int nice = Integer.parseInt(kf);
		// Ask the user how many dimes they have, and convert their answer
String no= JOptionPane.showInputDialog("how much dimes u hass?");
int kind = Integer.parseInt(no);
		// Ask the user how many quarters they have, and convert their answer
String kfc = JOptionPane.showInputDialog("how much Q U A R T E R S do u have?");
int kool = Integer.parseInt(kfc);
		// Calculate how much money the user has and save it in a double variable 

int moolah=(kool*25)+(kind*10)+(nice*5);
if(moolah>100) {

	int money = 1;
	JOptionPane.showMessageDialog(null, money+"."+moolah);
}
		// Tell the user how much money they have

	}
}

