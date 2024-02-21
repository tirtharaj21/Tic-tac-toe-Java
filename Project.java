import java.util.*;

public class Project {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m[][] = new int[3][3];
		int i, a, b, c = 0;
		System.out.println("** Welcome to the tic tac show game for 3x3 matrix **");
		System.out.println("player 1 enters the value as '9' and player 2 as '6'");
		System.out.print("Enter your name of player 1:");
		String s1 = in.nextLine();
		System.out.print("mail id: " + in.nextLine());

		System.out.print("Enter your name of player 2:");
		String s2 = in.nextLine();
		System.out.print("mail id: " + in.nextLine());

		for (i = 0; i < 9; i++) {
			if (i % 2 == 0) {
				System.out.println(s1 + " enter row number and column number ");
				a = in.nextInt();
				b = in.nextInt();
				m[a][b] = 9;
				for (a = 0; a < 3; a++) {
					for (b = 0; b < 3; b++) {
						System.out.print(m[a][b] + " ");
					}
					System.out.println();
				}
				a = 0;
				b = 0;
				if (m[0][0] == m[2][2] && m[1][1] == m[2][2]) {
					if (m[1][1] == 9) {
						System.out.println("Congratulations " + s1 + " you are the winner");
						c++;
						break;
					} else if (m[1][1] == 6) {
						System.out.println("Congratulations " + s2 + " you are the winner");
						c++;
						break;
					}
				} else if (m[0][2] == m[2][2] && m[1][2] == m[2][2]) {
					if (m[1][2] == 9) {
						System.out.println("Congratulations " + s1 + " you are the winner");
						c++;
						break;
					} else if (m[1][2] == 6) {
						System.out.println("Congratulations " + s2 + " you are the winner");
						c++;
						break;
					}
				} else if (m[0][2] == m[2][0] && m[1][1] == m[2][0]) {
					if (m[1][1] == 9) {
						System.out.println("Congratulations " + s1 + " you are the winner");
						c++;
						break;
					} else if (m[1][1] == 6) {
						System.out.println("Congratulations " + s2 + " you are the winner");
						c++;
						break;
					}
				} else if (m[0][1] == m[2][1] && m[1][1] == m[2][1]) {
					if (m[1][1] == 9) {
						System.out.println("Congratulations " + s1 + " you are the winner");
						c++;
						break;
					} else if (m[1][1] == 6) {
						System.out.println("Congratulations " + s2 + " you are the winner");
						c++;
						break;
					}
				} else if (m[1][0] == m[1][2] && m[1][1] == m[1][2]) {
					if (m[1][1] == 9) {
						System.out.println("Congratulations " + s1 + " you are the winner");
						c++;
						break;
					} else if (m[1][1] == 6) {
						System.out.println("Congratulations " + s2 + " you are the winner");
						c++;
						break;
					}
				} else if (m[0][0] == m[2][0] && m[1][0] == m[2][0]) {
					if (m[1][0] == 9) {
						System.out.println("Congratulations " + s1 + " you are the winner");
						c++;
						break;
					} else if (m[1][0] == 6) {
						System.out.println("Congratulations " + s2 + " you are the winner");
						c++;
						break;
					}
				} else if (m[0][0] == m[0][2] && m[0][1] == m[0][2]) {
					if (m[0][1] == 9) {
						System.out.println("Congratulations " + s1 + " you are the winner");
						c++;
						break;
					} else if (m[0][1] == 6) {
						System.out.println("Congratulations " + s2 + " you are the winner");
						c++;
						break;
					}
				} else if (m[2][0] == m[2][2] && m[2][1] == m[2][2]) {
					if (m[2][1] == 9) {
						System.out.println("Congratulations " + s1 + " you are the winner");
						c++;
						break;
					} else if (m[2][1] == 6) {
						System.out.println("Congratulations " + s2 + " you are the winner");
						c++;
						break;
					}
				}
			} else {
				System.out.println(s2 + " enter row number and column number");
				a = in.nextInt();
				b = in.nextInt();
				m[a][b] = 6;
				for (a = 0; a < 3; a++) {
					for (b = 0; b < 3; b++) {
						System.out.print(m[a][b] + " ");
					}
					System.out.println();
				}
				a = 0;
				b = 0;
				if (m[0][0] == m[2][2] && m[1][1] == m[2][2]) {
					if (m[1][1] == 9) {
						System.out.println("Congratulations " + s1 + " you are the winner");
						c++;
						break;
					} else if (m[1][1] == 6) {
						System.out.println("Congratulations " + s2 + " you are the winner");
						c++;
						break;
					}
				} else if (m[0][2] == m[2][2] && m[1][2] == m[2][2]) {
					if (m[1][2] == 9) {
						System.out.println("Congratulations " + s1 + " you are the winner");
						c++;
						break;
					} else if (m[1][2] == 6) {
						System.out.println("Congratulations " + s2 + " you are the winner");
						c++;
						break;
					}
				} else if (m[0][2] == m[2][0] && m[1][1] == m[2][0]) {
					if (m[1][1] == 9) {
						System.out.println("Congratulations " + s1 + " you are the winner");
						c++;
						break;
					} else if (m[1][1] == 6) {
						System.out.println("Congratulations " + s2 + " you are the winner");
						c++;
						break;
					}
				} else if (m[0][1] == m[2][1] && m[1][1] == m[2][1]) {
					if (m[1][1] == 9) {
						System.out.println("Congratulations " + s1 + " you are the winner");
						c++;
						break;
					} else if (m[1][1] == 6) {
						System.out.println("Congratulations " + s2 + " you are the winner");
						c++;
						break;
					}
				} else if (m[1][0] == m[1][2] && m[1][1] == m[1][2]) {
					if (m[1][1] == 9) {
						System.out.println("Congratulations " + s1 + " you are the winner");
						c++;
						break;
					} else if (m[1][1] == 6) {
						System.out.println("Congratulations " + s2 + " you are the winner");
						c++;
						break;
					}
				} else if (m[0][0] == m[2][0] && m[1][0] == m[2][0]) {
					if (m[1][0] == 9) {
						System.out.println("Congratulations " + s1 + " you are the winner");
						c++;
						break;
					} else if (m[1][0] == 6) {
						System.out.println("Congratulations " + s2 + " you are the winner");
						c++;
						break;
					}
				} else if (m[0][0] == m[0][2] && m[0][1] == m[0][2]) {
					if (m[0][1] == 9) {
						System.out.println("Congratulations " + s1 + " you are the winner");
						c++;
						break;
					} else if (m[0][1] == 6) {
						System.out.println("Congratulations " + s2 + " you are the winner");
						c++;
						break;
					}
				} else if (m[2][0] == m[2][2] && m[2][1] == m[2][2]) {
					if (m[2][1] == 9) {
						System.out.println("Congratulations " + s1 + " you are the winner");
						c++;
						break;
					} else if (m[2][1] == 6) {
						System.out.println("Congratulations " + s2 + " you are the winner");
						c++;
						break;
					}
				}
			}
		}
		if (c == 0)
			System.out.println("It's a DRAW.Sorry,No player wins");
		System.out.println("Press 0 to exit or 1 to again play the game");
		int ch = in.nextInt();
		if (ch == 0)
			System.exit(0);
		if (ch == 1)
			main(args);
	}
}