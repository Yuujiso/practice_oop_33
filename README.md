# C++ programm but in Java

We want to create a container, whose content is strictly identified with the rainbow colours, 
which are, classically speaking, a total of seven: red, orange, yellow, green, blue, indigo, 
violet. 
To do this, we need to create a class Rainbow capable to contain a valid subset of rainbow 
colours.
The class must have:
• A Default Constructor whose function is to create an empty container with no colour.
• A member function insert that takes as input a name of a valid colour to store in the 
container. The class must be able to read colour names written with or without capital 
letters (example: Red, RED, red…). Colours that are not in the rainbow spectrum (pink, 
brown, black…) cannot be saved in the container.
• A member function print to show on screen the content of the container. The colours 
must be printed in the rainbow order from red to violet. 
• A member function addition to create a union between the calling rainbow object and 
another rainbow object passed as input. The function will output a third object that
contains the union of the colours. A colour that appears two times must not be repeated.
• A member function intersection to find the intersection between the calling rainbow 
object and another one passed as input. The function will output a third object that
contains the intersection of the colours. The intersection can be empty.

# Example

If the content of the main test function is the following:
 ```Rainbow a, b, c;
 a.insert("red");
 a.insert("Blue");
 a.insert("GreeN");
 a.insert("pink");
 std::cout << "Content of a: ";
 a.print();
 std::cout << std::endl;
 b.insert("Red");
 b.insert("orange");
 std::cout << "Content of b: ";
 b.print();
 std::cout << std::endl;
 c = a.addition(b);
 std::cout << "Content of c (addition): ";
 c.print();
 std::cout << std::endl;
 c = a.intersection(b);
 std::cout << "Content of c (intersection): ";
 c.print();
 std::cout << std::endl;

The output should look like:
Content of a: red green blue
Content of b: red orange
Content of c (addition): red orange green blue
Content of c (intersection): red
``` 
###### _But, sure, I have implemented it in Java style._
