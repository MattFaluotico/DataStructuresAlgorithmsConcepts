class thisIsAClass {
	
	// these are static variables
	static int statVar;


	// these are instance variables
	private int inVar1;
	private int inVar2;


	//constructor
	thisIsAClass() {
		inVar1 = 1;
		inVar2 = 2;
	}


	//public method changing instance variable
	public changeInVar1(int input)
	{
		this.inVar1 = input;
	}

}