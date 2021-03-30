package ro.ase.csie.cts.g1094.dp.test;

import ro.ase.csie.cts.g1094.dp.builder.Pistol;
import ro.ase.csie.cts.g1094.dp.builder.SuperHero;
import ro.ase.csie.cts.g1094.dp.builder.SuperHero.SuperHeroBuilder;

public class TestBuilder {

	public static void main(String[] args) {
		
// IF THE DEFAULT CONSTRUCTOR IS PUBLIC
	//1. Create the object
		//SuperHero superHero = new SuperHero();
		
    //2. Init the object (DON'T FORGET)
		//superHero.name = "Superman";
		//superHero.lifePoints = 100;
		//superHero.superPower = "Can fly";
		//superHero.superPower = "Laser eyes";
		
		
// IF THE DEFAULT + CONSTR WITH ARGS ARE PRIVATE
		//SuperHero superHero = 
				//new SuperHero("Superman",100,false,false,null,
						//new Pistol(), "Laser eyes",null);

		
		//because of this from the class
		SuperHero superman = new SuperHero.SuperHeroBuilder("Superman", 100)
				.addSuperPower("Fly")
				.addLeftWeapon(new Pistol())
				.build();		
		
		SuperHero joker = new SuperHero.SuperHeroBuilder("Joker", 200)
				.isVillain()
				.addLeftWeapon(new Pistol())
				.addRightWeapon(new Pistol())
				.build();
	}

}
