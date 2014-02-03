#include thisIsAClass

main () {
	
	//accessing static variable without an instance
	thisIsAClass.statVar;

	//cannot access without an instance
	thisIsAClass.inVar1;

	//instantiating new object of class thisIsAClass
	thisIsAClass className = new thisIsAClass();

	//not allowed?
	thisIsAClass.inVar1 = 56;

	//using object's public function
	className.changeInVar1(4);

}