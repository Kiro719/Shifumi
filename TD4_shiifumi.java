package Shifumi;
import java.util.Scanner;

public class TD4_shiifumi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int restart;
		// TODO Auto-generated method stub

		do {
			int choix;
			int choixPC;
			int point = 0;
			int pointPC = 0;
			int nbpoint =0;
			Scanner sc= new Scanner (System.in);
			restart = 0;

			System.out.println("combien de point ?(3-5-10)");	
			nbpoint = sc.nextInt();	
			do { // on répéte si on veut recommencer la partie

				do { //on r�p�te si on saisie autre chose que 1 2 ou 3

					//le joueur fait un choix entre 1 et 3
					System.out.println("¤(1),_(2) ou >(3) ?");
					choix = sc.nextInt();
					if(choix <1 || choix>3) 
					{
						System.out.println("erreur veuillez resaisir");
					}
				}while(choix<1 || choix>3);

				//on d�termine une valeur al�atoire entre 1 et 3
				choixPC= (int)(Math.random()*(3))+1;

				Thread.sleep(3*1000);
				System.out.println(choixPC);

				switch(choix) {
				case 1 : // cas joueur choisit PIERRE 
					switch(choixPC) {
					case 1: // cas PC choisit PIERRE 
						System.out.println("match nul");
						break;
					case 2: // cas PC choisit FEUILLE
						System.out.println("Perdu");
						pointPC = pointPC+1;
						break;
					case 3: // cas PC choisit CISEAU
						System.out.println("GG");
						point = point+1;
						break;
					}
					break;
				case 2 : // cas joueur choisit FEUILLE 
					switch(choixPC) {
					case 1: // cas PC choisit PIERRE
						System.out.println("GG");
						point = point+1;
						break;
					case 2: // cas PC choisit FEUILLE
						System.out.println("match nul");
						break;
					case 3: // cas PC choisit CISEAU
						System.out.println("Perdu");
						pointPC = pointPC+1;
						break;
					}
					break;
				case 3 : // cas joueur choisit CISEAU 
					switch(choixPC) {
					case 1: // cas PC choisit PIERRE
						System.out.println("Perdu");
						pointPC = pointPC+1;
						break;

					case 2: // cas PC choisit FEUILLE
						System.out.println("GG");
						point = point+1;
						break;

					case 3: // cas PC choisit CISEAU
						System.out.println("Match nul");
						break;
					}
				}
				System.out.println("Vos points :"+point+" - Point PC ="+pointPC);

			}while(nbpoint!=pointPC && nbpoint !=point) 
				;
			System.out.println("fin de la partie");

			if(point==nbpoint) {
				System.out.println("Victoire du joueur");
			}
			else
				System.out.println("Victoire de la machine");


			System.out.println("On recommence ? oui(1), non(0)");

			restart = sc.nextInt();

		}while(restart!=0) ;
	}

}
