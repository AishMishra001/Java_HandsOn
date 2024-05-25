public class NonPrimitiveDT {
  public static void main(String[] args){
    // Non Primitive data types : 

    // STRINGS -- 
    String name1 = "Aman" ; 
    System.out.println(name1.length()) ; 
    String name2 = "Ram" ; 

    // Concatitation : 
    String name3 = name1 + " and "+ name2 ; 
    System.out.println(name3) ; 


// To find the position of a character in a string : 
    System.out.println(name1.charAt(0)); 

    // replace : 

    // IN JAVA STRINGS ARE IMMUTABLE ---  That is why we have to store the replace char string in a new string  
    String name4 = name1.replace('a','l');
    System.out.println(name4) ; 

    // substring : 

    String name5 = name1.substring(1,3);
    
    System.out.println(name5) ;

    
  }
}