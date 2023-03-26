package sealedClasses;

/*
* Sealed class. Allows us to control the inheritance
*/
public sealed class Vehicle permits fourWheeler, twoWheeler {
}