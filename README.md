# CSCI242-Recitation

It was pointed out that ArrayLists can be instantiated also, by leaving out the <Double> in the constructor call like below:
```
ArrayList<Double> gradePointAverages = new ArrayList();
```
Though this this possible, Java will imply that you are creating a <Double> ArrayList because of the left-handside but,
this leaves room for error, as the type does not SPECIFICALLY get declared in the call to the constructor

##### How would you create an ArrayList that holds several grade point averages?
```
ArrayList<Double> gradePointAverages = new ArrayList<Double>();
```

##### How can we determine the size of an ArrayList in Java?
```
int size = gradePointAverages.size();
```
##### Write a 'for' loop and a 'while' loop in Java to print the numbers 1 through n.
```
int n = 5;
for (int i = 0; i <= n; i++) {

  System.out.println(i);
  
}

---------------------

int i = 5;

while(i <= n) {  

  System.out.println(i);
  
  i++;
  
}
```
##### The ArrayList class has a constructor that takes an integer argument. What does it mean to instantiate an Arraylist using this constructor?
```
The integer argument will be used to set the initial capacity of the ArrayList. Since the ArrayList data structure can grow
dynamically, if the number of elements added approaches its default value, it will resize itself to accommodate for new
elements added on.
```
##### 
```
Scanner input = new Scanner(System.in);

ArrayList<Double> grades = new ArrayList<Double>();

double grade = 0.0;
double average = 0.0;

for (int i = 0; i < 5; i++) {

  System.out.println("Enter a grade point average: ");
  
  grade = input.nextDouble();
  
  grades.add(grade);

}

for (double g : grades) {

  average += g;
  
  }
  
  average /= grades.size();
  
  System.out.println("The average of the grades is: " + average);
```
  







