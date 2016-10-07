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

import java.util.ArrayList;

public class GenericCharacterClass {

	//Attributes
	private String character_name;
	
	private int fighting;
	private int shooting;
	private int strength;
	private int health;
	private ArrayList<String> skills;
	
	private int current_health;
	private boolean alive;
	
	private int level;
	private long xp;
	
	//Constructor
	public GenericCharacterClass (String name, int fight, int shoot, int str, int hth)
	{
		//Set initial values
		character_name = name;
		
		fighting = fight;
		shooting = shoot;
		strength = str;
		health = current_health = hth;

		alive = true;
		
		level = 1;
		xp=0;
		
		skills = new ArrayList<String>();
		
		printCharacterSheet();
	}
	
	//Method
	public void printCharacterSheet()
	{
		System.out.println("");
		System.out.println("CHARACTER SHEET");
		
		System.out.println("Name:" + character_name);
		
		System.out.println("Fighting: " + fighting);
		System.out.println("Shooting: " + shooting);
		System.out.println("Strength: " + strength);
		System.out.println("Health:   " + health);
		
		System.out.println("");
		System.out.println("Current health:   " + current_health);
		System.out.println("");
		
		System.out.println("SKILLS");
		for (String this_skill:skills)
		{
			System.out.println("    "+this_skill);
		}
		System.out.println("");
		
		System.out.println("Level:      " + level);		
		System.out.println("Experience: " + xp);
		
		if(alive==true)
			System.out.println("ALIVE");
		else
			System.out.println("DEAD");
		
		System.out.println("");
		System.out.println("");
	}
	
	public void addExperience (int number)
	{
		xp += (long) number;
		System.out.println("Experience added");
		System.out.println("    Current experience: " + xp);
	}
	
	
	public void level_up (String attribute)
	{
		boolean change = false;
		
		if (xp < 1000)
		{
			System.out.println("Insufficient experience to level up");
			System.out.println("    Current experience: " + xp);
		}
		else
		{
			switch(attribute)
			{
			case "Strength":
				if(strength < 18)
				{
					strength++;
					change=true;
				}
				else
				{
					System.out.println("Strength already at maximum");
				}
				break;
			case "Shooting":
				if(shooting < 18)
				{
					shooting++;
					change=true;
				}
				else
				{
					System.out.println("Shooting already at maximum");
				}	
				break;
			case "Fighting":
				if(fighting < 18)
				{
					fighting++;
					change=true;
				}
				else
				{
					System.out.println("Fighting already at maximum");
				}
				break;
			case "Health":
				if(health < 18)
				{
					health++;
					current_health++;
					change=true;
				}
				else
				{
					System.out.println("Health already at maximum");
				}
				break;
			default:
				//Assume it's a skill to add
				change=addSkill(attribute);
			}
			
			// If change happened, print about it
			if (change==true)
			{
				xp -= 1000;
				level++;
				System.out.println("LEVEL UP!");
				printCharacterSheet();
			}
		}
	}
	
	private boolean addSkill(String newSkill)
	{
		
		if(skills.contains(newSkill))
		{
			System.out.println("Already knows "+ newSkill);
			return false;
		}
		else
		{
			skills.add(newSkill);
			return true;
		}
		
	}
	
	public void takeWound ()
	{
		System.out.println("Taking wound");
		current_health--;
		
		if (current_health == 0)
		{
			/*
			 * If the character has the skill Fake Death, then they might
			 * only be mostly dead
			 */
			if(skills.contains("Fake Death"))
			{
				DiceClass cheatDeath = new DiceClass(2);
				if (cheatDeath.rollDice() == 1)
				{
					current_health = 1;
					System.out.println("Character fakes death on 1 health");
					return;
				}
			}
			
			//Otherwise - game over
			alive = false;
			System.out.println("    " + character_name + " has died");
			printCharacterSheet();
		}
		else
		{
			System.out.println("    Current health: " + current_health);
		}
	}
	
	public void healing ()
	{
		if (current_health < health)
		{
			System.out.println("Healing");
			current_health++;
			System.out.println("    Current health: " + current_health);
		}
	}
	
	public void resurrect ()
	{
		//Only works on the dead
		if (alive=false)
		{
			//Needs 100xp to do this
			if (xp>=100)
			{
				xp -= 100;
				alive=true;
				DiceClass raise_health = new DiceClass(6);
				
				//We're adding 2D6 worth here
				current_health += raise_health.rollDice();
				current_health += raise_health.rollDice();
				
				System.out.println("Ressurection");
				System.out.println("    Current health: " + current_health);
			}
		}
	}

	
	
	
	
}
