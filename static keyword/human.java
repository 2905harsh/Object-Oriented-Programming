class human{
         String name;
         int age;
         static int Population;
          
         // Constructor
         public human(String name , int age){
          this.name = name;
          this.age = age;
          human.Population++;
         }

}

// 1. Static variable can be accessed without creating an any instance of a class. They are not dependent on object.
// 2. Static variable is shared among all the instances of the class.
// 3. Static variable can be accessed without using the object name or reference.
// 4. We can also make the method static.