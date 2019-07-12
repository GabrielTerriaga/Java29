package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		// BASICO MANUALMENTE
		String path = "c:\\temp\\java.txt";

		FileReader fr = null;

		BufferedReader br = null;

		try {
			fr = new FileReader(path);
			// bufferedReader só é instanciado a partir de um FileReader
			br = new BufferedReader(fr);

			String line = br.readLine(); // ler uma linha, se tiver no final ele retorna nulo

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
