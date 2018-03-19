

public class Dog extends Animal{

  String sound = "ruff";

  //Constructor method for Dog requires two parameter.
  //So to create a Dog instance we need to give two parameteres as new Dog(6, "roff").
  //Animal constructor requires only one parameter. But we want dog (which is an animal) to require two.
  //So we put all required parameters in Dog(), and give matching parameters inside the super(age) as input.
  public Dog (int age, String sound){
    super(age);
    System.out.println("A dog has been created.");
    //this.age = 8; works if the age was defined as public.
    //Otherwise, it cannot be accessed and modified.
  }

  public void eat(){ /* V2.0 - Eat method in Animal became abstract.
    So Dog has its own overriding eat method.*/
    System.out.println("A dog is eating...");
  }/* V2.0 - If there are also different types of dogs (i.e. lower layers),
  this one also has to be like in Animal class--> public abstract eat();
  And then the type of dogs classes should have ovverriding eat methods.*/

  public void sleep(){
    System.out.println("The dog is sleeping..");
  } /* V2.0 - This one also an overiding method.
  But we did not specifically mentioned @Override. This works too. But @Override is best practice.
  If overrided superclass method changes, compiler will give error.
  Because it knows that this method is an overriding method and its name,
  parameters, return type etc. (i.e. its signature) should match the original one in superclass.*/

  public void ruff(){
    System.out.println("The dog says ruff.");
  }

  public void run(){
    System.out.println("A dog is running.");
  }

  @Override
  public void setColour(){
    colour = "white";
  }

}
