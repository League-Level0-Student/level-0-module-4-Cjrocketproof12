package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWekday, isVacation;

		/** You MUST use the above boolean variables in your code */

		/**
		 * Ask the user for these values using a confirm dialog like the one below
		 * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head",
		 * JOptionPane.YES_NO_OPTION);
		 */

		int noooorha = JOptionPane.showConfirmDialog(null, "Is it a vactation?", "Sleepy Head",
				JOptionPane.YES_NO_OPTION);

		int nnnoooah = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head",
				JOptionPane.YES_NO_OPTION);

		isVacation = (noooorha == 0);
		isWekday = (nnnoooah == 0);
		if (isVacation || !isWekday) {
			JOptionPane.showMessageDialog(null, "s l e e p  m o r e");
		}

		else if (isWekday) {

			System.out.println(nnnoooah);
			if (isVacation) {
				JOptionPane.showMessageDialog(null, "s l e e p  m o r e");
			} else {
				JOptionPane.showMessageDialog(null, "get up k i d r e n");

			}

		}

		/**
		 * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!�? If it is a weekday, and we are on vacation, print “sleep
		 * in�?.
		 */
	}
}
