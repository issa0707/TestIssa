package fr.ibformation.application;

import java.util.Scanner;

public class NombreMystere {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
        System.out.println("Bienvenue sur le jeu du nombre mystère !");
        System.out.println("Bonne chance !");
		int nbrMagique = (int)(100.0 * Math.random())+1;
		//System.out.println(nbrMagique);

		for (int i = 0; i < 7; i++) {
			System.out.println("choisirr un nombre entre");
			int nbrChoisi = sc.nextInt();
			if (nbrChoisi > 0 && nbrChoisi < 100 ) {

				if (nbrChoisi < nbrMagique) {
					System.out.println("cest plus !");
				}
				else if  (nbrChoisi > nbrMagique) {
					System.out.println("(c'est moins !");
				}

				else {
					System.out.println("vous avez gané !");
					break;
				}
			}
			else {
				System.out.println("le nombre doit être entre 0 et 100");
			}
		}




	}

}
