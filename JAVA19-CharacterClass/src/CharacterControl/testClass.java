package CharacterControl;

/*
 * This program is part of my learning Java series
 * This one explores code for an RPG character
 * 
 * Find the blog here,
 * http://testsheepnz.blogspot.co.nz/2016/09/java-19-rpg-character-class.html
 * 
 * For more information - please reread.
 * 
 * Mike Talks, Sept 2016
 */

import org.junit.Test;

public class testClass {

	@Test
	public void characterMerida ()
	{
		genericCharacterClass hero = new genericCharacterClass("Merida", 13, 18, 10, 12);
		hero.addExperience(5000);
		hero.level_up("Shooting");
		hero.level_up("Archery");
	}
	
	@Test
	public void characterMulan ()
	{
		genericCharacterClass hero = new genericCharacterClass("Mulan", 13, 13, 12, 13);
		hero.addExperience(9000);
		hero.level_up("Fighting");
		hero.level_up("Fighting");
		hero.level_up("Cross-dressing");
		hero.level_up("Martial arts");
		hero.level_up("Resilient");
		hero.level_up("Natural leader");
	}	
	
	@Test
	public void characterTinkerbell ()
	{
		genericCharacterClass hero = new genericCharacterClass("Tinkerbell", 10, 13, 16, 8);
		hero.addExperience(5000);
		hero.level_up("Magic wand");
		hero.level_up("Flight");
	}
	
	@Test
	public void characterPocahontas ()
	{
		genericCharacterClass hero = new genericCharacterClass("Pocahontas", 13, 12, 14, 15);
		hero.addExperience(5000);
		hero.level_up("Running");
		hero.level_up("Tracking");
		hero.level_up("Understanding languages");
	}
	
	@Test
	public void characterSnowWhite ()
	{
		genericCharacterClass hero = new genericCharacterClass("Snow White", 11, 11, 10, 10);
		hero.addExperience(5000);
		hero.level_up("Animal control");
		hero.level_up("Fake death");
	}
	
	@Test
	public void characterJasmine ()
	{
		genericCharacterClass hero = new genericCharacterClass("Jasmine", 12, 12, 18, 20);
		hero.addExperience(5000);
		hero.level_up("Tiger familiar - Rajah");
		hero.level_up("Flying carpet");
	}
	
	@Test
	public void characterAriel ()
	{
		genericCharacterClass hero = new genericCharacterClass("Ariel", 12, 12, 10, 12);
		hero.addExperience(5000);
		hero.level_up("Breath underwater");
		hero.level_up("Swimming");
		hero.level_up("Animal control - marine");
	}
	
	
	@Test
	public void characterEsla ()
	{
		genericCharacterClass hero = new genericCharacterClass("Elsa", 10, 12, 15, 10);
		hero.addExperience(5000);
		hero.level_up("Ice control");
		hero.level_up("The cold doesn't bother her");
	}
}
