package treeset;


import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
class Student implements Comparable<Student>  {  //creating student object which implements comparable
//class defines instance and class fields,methods and inner classes as
//well as specifying the interfaces the class implements and the 
//immediate superclass of the class
//implements means you are using the elements of a Java Interface in your class. 
//Java Comparable interface is used to order the objects of user-defined class
    String name; //creating variables for student class taking three properties name,rollno and department
    int rollno;
    String department;
 
    public String getName() {           
   //creating get methods and set methods for the Student class for three properties
        return name;
    }
  //void is used to define the return type of the method
    public void setName(String name) {
        this.name = name;
    }
 
    public int getRollno() {
        return rollno;
        //returning the value
    }
 
    public void setRollno(int rollno) {
        this.rollno = rollno;
      //this will refer current object 
    }
 
    Student(String name, int rollno){   
   //creating constructor and passing two parameters
        this.name=name;
        this.rollno=rollno;
    }
    Student(String name, int rollno,String department){ 
    //creating constructor and passing three parameters
        this.name=name;
        this.rollno=rollno;
        this.department=department;
    }
    public String getDepartment() {
        return department;
    }
 
    public void setDepartment(String department) {
        this.department = department;
    }
 
    @Override   
    public int compareTo(Student obj) {          
  //here using compareTo method we are comparing the objects and returning the values 
        if (this.getRollno() == obj.getRollno())
        	return 0;
        else
        
       if (this.getRollno() < obj.getRollno())
    	   return 1;
        else
        	
       	return -1;
        	
}
 
}
public class TreeSetDemo {
                //here created main class as HashSetDemo

             public static void main(String[] args) {    
            	 //created main method
          	   
            	 TreeSet<Student> treeSet = new TreeSet<Student>();  
            	 //created treeset interface object for the student class   
                 
                 //adding elements to TreeSet 
              treeSet.add(new Student("puddin",1,"IIT"));
              treeSet.add(new Student("jack",3,"EEE"));
              treeSet.add(new Student("emy cuddy",8,"CIVIL"));
              treeSet.add(new Student("simon senick",9,"CEC"));
              treeSet.add(new Student("joffery",4,"ECE"));
              
                   
              Iterator itr = treeSet.iterator(); 
         //using iterator we are iterating the tree set 
           
           while(itr.hasNext()){
           
               Student obj= (Student)itr.next(); 
 //here it gives the output as three values as in tree set it 
               System.out.println(obj.getName()+"  "+obj.getRollno()+"  "+obj.getDepartment()); 

            }         
}
}