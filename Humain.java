package com;

import base.Joueur;

public class Humain extends Joueur{
	
	public Humain(String nom, int pion)
	{
		super(nom,pion);
	}
	
	//Tour du joueur humain.
	public void jouer(Plateau plateau) 
	{
		int length = plateau.getPlateau()[0].length;
		int x;
		
		System.out.println("Tour du joueur " + nom);
		//L'utilisateur entre les coordonn�es.
		do
		{
			System.out.println("Entrez le num�ro de la colonne : ");
			x = Jeu.scanner.nextInt();
		}while(x < 0 || x >= length);
		
		//Place le pion sur le plateau.
		plateau.placer(pion, x);
		
		//Affichage du plateau apr�s le tour de jeu.
		plateau.Afficher();
	}
}
