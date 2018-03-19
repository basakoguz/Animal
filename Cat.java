

public class Cat extends Animal {

  public Cat(){
    //With super() or w/o is the same.
    //If the super constructor requires an input such as Animal(int age)
    //super(5) would be useful to refer to the Animal() constructor
    super(3);
    System.out.println("A cat has been created.");
  }

  public void eat(){
    System.out.println("A cat is eating...");
  }

  public void sleep(){
    System.out.println("The cat is sleeping..");
  }/* V2.0 - This one also an overiding method.
  But we did not specifically mentioned @Override. This works too. But @Override is best practice.
  If overrided superclass method changes, compiler will give error.
  Because it knows that this method is an overriding method and its name,
  parameters, return type etc. (i.e. its signature) should match the original one in superclass.*/

  public void meow(){
    System.out.println("A cat meows!");
  }

  public void prance(){
    System.out.println("A cat is prancing.");
  }
}
