public class UsingSubPackage {                                
  public static void main(String[] argv) {                    
    flag.math.Rectangle re = new flag.math.Rectangle(1,3,5,7);
    flag.math.Circle    ci = new flag.math.Circle(3,6,9);     
    flag.math.Cylinder  cy = new flag.math.Cylinder(2,4,6,8); 
                                                              
    System.out.println(re.toString());                        
    System.out.println(ci.toString());                        
    System.out.println(cy.toString());                        
  }                                                           
}