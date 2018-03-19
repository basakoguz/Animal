

public abstract class Animal{
  private int age;
  public String colour;

  //The super(); within the Dog constructor refers to this Animal constructor.
  public Animal(int age){
    //this.age = age;
    this.age = age;
    colour = "black";
    System.out.println("An animal has been created!");
  }

  //public abstract void eat (); /* V2.0 - When this method became abstract,
    /*Dog/Cat classes should be abstract too, OR Dog/Cat
    each need to have an overriding eat() method.*/
    //System.out.println("An animal is eating...");
    /* V2.0 - Abstract method cannot have body. It should end with ';' and not have '{ }'*/

    public void sleep(){
      System.out.println("The animal is sleeping..");
    }

  //Since this method is public, everything this method returns can be accesible
  //out of this class (e.g. private int age)
  public int getAge(){
    return age;
  }

  public void setColour(){
    colour = "yellow";
  }

  public static void main (String[] args){
    //This constructor require to give the age value as an input.
    //Animal a = new Animal(5);
    /*V2.0 - We made the animal class abstract, so above line will not work any more.*/
    Dog d = new Dog(6, "hav");
    Cat c = new Cat();
    //d.eat();
    //c.eat();
    //c.meow();
    /* V 2.0 - Above line not needed for the learning subject*/
    //d.ruff();
    /* V 2.0 - Above line not needed for the learning subject*/
    /*a.eat(); V2.0 - Animal class became abstract. This line will not work any more.*/
    //d.run();
    /* V 2.0 - Above line not needed for the learning subject*/
    //c.prance();
    /* V 2.0 - Above line not needed for the learning subject*/
    //System.out.println("Cat's age is: " + c.getAge());
    //System.out.println("Dog's colour is: " + d.colour);
    //d.setColour(); Overriding example. setColour method in Dog changed the colour. Not the setColour method in Animal.
    //System.out.println("Dog's new colour is: " + d.colour);
    //System.out.println("Dog sound: " + d.sound);

    //Casting?????
  }
}
