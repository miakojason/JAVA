interface Face {   // ©w¸q Face ¤¶­±
   void smile(); 
}

public class AnonyFace2 {
  public static void main(String[] argv) {

    new Face() { 
       public void smile()   
         { System.out.print("^_^"); }
    }.smile(); 
  }
}
