package com.interfaceExample;


import java.util.List;

//Create a simple interface (tip: name it Saveable or ISaveable)
//That interface allows an object to be saved to some sort of storage medium. 
//(tip: use arraylist)
//The exact type of medium is not known to the interface (nor to the classes that implement it).
//The interface will just specify two methods, one to return an ArrayList of values to be saved
//and the other to populate the object's fields from an ArrayList (parameter).
//
//Create a few sample classes that implement your Saveable interface (we've used the idea of a game,
//with Players and Monsters, but you can create any type of classes that you want).
//
//Override the toString() method for each of your classes so that they can be easily printed to enable
//the program to be tested easier.
//
//In Main, write a method that takes an object that implements the interface as a parameter and
//"saves" the values e.g. calls the method defined in the interface.

public interface ISaveable {
  
	List<String> write();
    void read(List<String> savedValues);

}
