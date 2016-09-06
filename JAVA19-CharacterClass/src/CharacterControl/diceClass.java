package CharacterControl;

 


public class diceClass {

	//Attributes
	private int numSides;
	private int diceRollValue;
	
	//Constructors
	
	public diceClass(int sides)
	{
		this.numSides = sides;
	}
	
	public diceClass()
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
	
	public int diceOnOrUnder (int threshold)
	{
		if (diceRollValue <= threshold)
			return 1;
		else
			return 0;
	}
	
	public int diceOnOrOver (int threshold)
	{
		if (diceRollValue >= threshold)
			return 1;
		else
			return 0;
	}
	
	public int diceEquals (int target)
	{
		if (diceRollValue == target)
			return 1;
		else
			return 0;
	}	
	

}
