<Java Inheritance>
Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.
The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. 
When you inherit from an existing class, you can reuse methods and fields of the parent class.


Why do we use Inheritance?

* For method overriding (So runtime polymorphism can be achieve)

* Code reuseability.

>> There are two types (Superclass/Parent class) and (Subclass/ Child class)


(Example of how to use keyword)

//Parent Class

Class Vehicle {

  protected void honk ()
  
  public void honk() {
  
  System.out.println("Tuut, tuut!")}
  
  }
  
}


// Child Class

Class Car extends Vehicle {

  private String modelName = "Mustand";

  public static void main (String args[]) {

    Car myCar = new Car ();

    myCar.honk ();

    System.out.println(myCar.brand + " " + myCar.ModelName);
    
  }
  
}
  

