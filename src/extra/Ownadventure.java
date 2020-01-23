package extra;

import javax.swing.JOptionPane;

public class Ownadventure {

	public static void main(String[] args) {
int Trophies = 0;
		JOptionPane.showMessageDialog(null, "Hello");
		JOptionPane.showMessageDialog(null, "You are selected for timeline skipping");
		JOptionPane.showMessageDialog(null, "How do you feel?");
		JOptionPane.showMessageDialog(null, "Nevermind it doesnt matter");
		int q = JOptionPane.showConfirmDialog(null,
				"You are going to enter the Time Machine to enter different timelines, do you agree?");
		if (q == 1) {
			JOptionPane.showMessageDialog(null, "You leave and dont return.");
			JOptionPane.showMessageDialog(null, "Ending 4/");
			System.exit(0);
		}
		JOptionPane.showMessageDialog(null,
				"We are about to enter the 'Forest' timeline here we go aniygaufviayfvyvafyutafgvgavfuavfasyfvyfvausbfaj");

		int w = JOptionPane.showOptionDialog(null, "You have entered the 'Forest' timeline, what do you do?",
				"Forest Timeline", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Enter the Time Machine",
						"Go into a cave ", "Go into the smaller cave", "Go out into the open" },
				null);
		if (w == 0) {
			int t = JOptionPane.showOptionDialog(null, "You have entered the Time Machine, what do you do?",
					"Time Machine", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Go back to our timeline", "Break it", "Exit Time Machine", "Press random buttons" },
					null);
			if (t == 3) {
				JOptionPane.showMessageDialog(null, "The Time Machine explodes along with you");
				JOptionPane.showMessageDialog(null, "Ending 7/");
				System.exit(3);
			}
			if (t == 1) {
				JOptionPane.showMessageDialog(null,
						"The Time Machine broke, and before you realized it, it exploded along with you");
				JOptionPane.showMessageDialog(null, "Ending 8/");
				System.exit(3);
			}
			if (t == 0) {
				JOptionPane.showMessageDialog(null,
						"You go back to your house, of which you grow old, have grandchildren and die peacefully at the age of 84");
				JOptionPane.showMessageDialog(null, "Ending 9/");
				System.exit(4);
			}
			if (t == 2) {
				int y = JOptionPane.showOptionDialog(null, "You exit the Time Machine, what do you do?",
						"Forest Timeline", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Enter a cave", "Enter a smaller cave", "Go out into the open" }, null);
			}

		}
		if (w == 3) {
			JOptionPane.showMessageDialog(null, "You get eaten by a slender fleshy humanoid");
			JOptionPane.showMessageDialog(null, "Ending 5/");
			System.exit(1);
		}
		if (w == 1) {
			JOptionPane.showMessageDialog(null, "You find a small cheese statue");
			Trophies = Trophies+1 ;
			JOptionPane.showMessageDialog(null, "+1 Trophies Current Trophies: " + Trophies);

			int e = JOptionPane.showOptionDialog(null, "Now what do you do?", "Cave", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Exit cave ", "Go deeper into cave", }, null);
			if (e == 1) {
				JOptionPane.showMessageDialog(null, "You get lost and are never seen again.");
				JOptionPane.showMessageDialog(null, "Ending 6/");
				System.exit(2);
			}
			if(e == 0) {
			int r = JOptionPane.showOptionDialog(null, "You have exited the cave, what do you do? ", "Forest Timeline",
					0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Enter the smaller cave", "Enter the Time Machine", "Go out into the open" }, null);

			if (r == 1) {
				int u = JOptionPane.showOptionDialog(null, "You have entered the Time Machine, what do you do?",
						"Time Machine", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {
								"Go back to our timeline", "Break it", "Exit Time Machine", "Press random buttons" },
						null);
				if (u == 3) {
					JOptionPane.showMessageDialog(null, "The Time Machine explodes along with you");
					JOptionPane.showMessageDialog(null, "Ending 12/");
					System.exit(3);
				}
				if (u == 1) {
					JOptionPane.showMessageDialog(null,
							"The Time Machine broke, and before you realized it, it exploded along with you");
					JOptionPane.showMessageDialog(null, "Ending 11/");
					System.exit(3);
				}
				if (u == 0) {
					JOptionPane.showMessageDialog(null,
							"You go back to your house, of which you grow old, have grandchildren and die peacefully at the age of 84");
					JOptionPane.showMessageDialog(null, "Ending 10/");
					System.exit(4);
				}
				if (u == 2) {
					int i = JOptionPane.showOptionDialog(null, "You exit the Time Machine, what do you do?",
							"Forest Timeline", 0, JOptionPane.INFORMATION_MESSAGE, null,
							new String[] { "Enter a smaller cave", "Go out into the open" }, null);
				if(i == 0) {
					JOptionPane.showMessageDialog(null, "You rest inside that cave for the night.");
				JOptionPane.showMessageDialog(null, "Checkpoint Saved");
				
				int o = JOptionPane.showOptionDialog(null, "Now what do you do?", "Cave", 0,
						JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Exit cave ", "Rest Longer", }, null);
	if(o == 0) {
		JOptionPane.showMessageDialog(null, "You exit the cave and sunrise passed");
		
		
	}
	if(o == 1) {
		JOptionPane.showMessageDialog(null, "You wake up to see that you slept untill the next night, and a tall fleshy humanoid eats you");
		JOptionPane.showMessageDialog(null, "Ending 4/");
	}
				
				
				}
				
				
				}
				
				
		
				
				
			}
			}
		}
	}
void checkpoint1 () {
JOptionPane.showMessageDialog(null, "You rest inside that cave that night.");

int o = JOptionPane.showOptionDialog(null, "Now what do you do?", "Cave", 0,
		JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Exit cave ", "Rest Longer", }, null);
if(o == 0) {
JOptionPane.showMessageDialog(null, "You exit the cave and sunrise passed");


}
if(o == 1) {
JOptionPane.showMessageDialog(null, "You wake up to see that you slept untill the next night, and a tall fleshy humanoid eats you");
JOptionPane.showMessageDialog(null, "Ending 4/");
}

}
}


