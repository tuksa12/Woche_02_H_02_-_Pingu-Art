package pgdp.pinguart;

import static pgdp.MiniJava.*;

public class PinguArt {

	public static void main(String[] args) {

		//Declaration.
		int n =0;
		int []Zahl = new int[8];
		int first;
		int second;
		int third;
		int fourth;
		int fifth;
		int sixth;
		int seventh;
		int eighth;

		//Loop for the reading of the input.
		while (n<8){
			Zahl[n] = readInt("Bitte geben Sie eine Pingu-Art-Zahl ein:");
			n++;}


		//Beginning of the Pingu-Art.
		write("+---[PinguArt]---+");

		//Reset of the variable.
		n = 0;

		//Each of the variables below represents more or less the position of the individuals numbers
		//inside the number provided by the input.
		while (n<8) {
			first = Zahl[n]/10000000;
			second = Zahl[n]/1000000;
			third = Zahl[n]/100000;
			fourth = Zahl[n]/10000;
			fifth = Zahl[n]/1000;
			sixth = Zahl[n]/100;
			seventh = Zahl[n]/10;
			eighth = Zahl[n];

			//Specific times that the program will draw the right edges.
			if (n==0 || n == 2 || n == 4 || n == 6){
				writeConsole("|");}

				//Repetition of tests to each individual number to draw the specific figure of each
				// one of them.
				if (eighth%5 ==0 && eighth%2 == 0)
					writeConsole(" ");
				if (eighth == 1 || eighth%5 ==1 && eighth%2 == 1)
					writeConsole("-");
				if (eighth == 2 || eighth%5 ==2 && eighth%2 == 0)
					writeConsole("~");
				if (eighth == 3 || eighth%5 ==3 && eighth%2 == 1)
					writeConsole("P");

				if (seventh%5 ==0 && seventh%2 == 0)
					writeConsole(" ");
				if (seventh == 1 || seventh%5 ==1 && seventh%2 == 1)
					writeConsole("-");
				if (seventh == 2 || seventh%5 ==2 && seventh%2 == 0)
					writeConsole("~");
				if (seventh == 3 || seventh%5 ==3 && seventh%2 == 1)
					writeConsole("P");

				if (sixth%5 ==0 && sixth%2 == 0)
					writeConsole(" ");
				if (sixth == 1 || sixth%5 ==1 && sixth%2 == 1)
					writeConsole("-");
				if (sixth == 2 || sixth%5 ==2 && sixth%2 == 0)
					writeConsole("~");
				if (sixth == 3 || sixth%5 ==3 && sixth%2 == 1)
					writeConsole("P");

				if (fifth%5 ==0 && fifth%2 == 0)
					writeConsole(" ");
				if (fifth == 1 || fifth%5 ==1 && fifth%2 == 1)
					writeConsole("-");
				if (fifth == 2 || fifth%5 ==2 && fifth%2 == 0)
					writeConsole("~");
				if (fifth == 3 || fifth%5 ==3 && fifth%2 == 1)
					writeConsole("P");

				if (fourth%5 ==0 && fourth%2 == 0)
					writeConsole(" ");
				if (fourth == 1 || fourth%5 ==1 && fourth%2 == 1)
					writeConsole("-");
				if (fourth == 2 || fourth%5 ==2 && fourth%2 == 0)
					writeConsole("~");
				if (fourth == 3 || fourth%5 ==3 && fourth%2 == 1)
					writeConsole("P");

				if (third%5 ==0 && third%2 == 0)
					writeConsole(" ");
				if (third == 1 || third%5 ==1 && third%2 == 1)
					writeConsole("-");
				if (third == 2 || third%5 ==2 && third%2 == 0)
					writeConsole("~");
				if (third == 3 || third%5 ==3 && third%2 == 1)
					writeConsole("P");

				if (second%5 ==0 && second%2 == 0)
					writeConsole(" ");
				if (second == 1 || second%5 ==1 && second%2 == 1)
					writeConsole("-");
				if (second == 2 || second%5 ==2 && second%2 == 0)
					writeConsole("~");
				if (second == 3 || second%5 ==3 && second%2 == 1)
					writeConsole("P");

				if (first%5 ==0 && first%2 == 0)
					writeConsole(" ");
				if (first == 1 || first%5 ==1 && first%2 == 1)
					writeConsole("-");
				if (first == 2 || first%5 ==2 && first%2 == 0)
					writeConsole("~");
				if (first == 3 || first%5 ==3 && first%2 == 1)
					writeConsole("P");

			//Specific times that the program will draw the left edges.
			if (n==1 || n == 3 || n == 5 || n == 7){
				writeConsole("|\n");
			}
			n++;
		}
		writeConsole("+----------------+");
		//End of program.
	}
}
