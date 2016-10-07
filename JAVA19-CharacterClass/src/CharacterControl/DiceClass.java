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
 


public class DiceClass {

	//Attributes
	private int numSides;
	private int diceRollValue;
	
	//Constructors
	
	public DiceClass(int sides)
	{
		this.numSides = sides;
	}
	
	public DiceClass()
	{
		this(6);
	}
	
	//Methods

	
	public int rollDice ()
	{
		diceRollValue = 1 + (int)(Math.random() * numSides);
		
		return this.diceRollValue;
	}
	
	
	public void setNumSides (int sides)
	{
		this.numSides = sides;
	}
	
	public int getDiceValue ()
	{
		return diceRollValue;
	}
	
	public boolean diceOnOrUnder (int threshold)
	{
		if (diceRollValue >= threshold)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean diceOnOrOver (int threshold)
	{
		if (diceRollValue >= threshold)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean diceEquals (int target)
	{
		if (diceRollValue == target)
		{
			return true;
		}
		else
		{
			return false;
		}
	}	

}
