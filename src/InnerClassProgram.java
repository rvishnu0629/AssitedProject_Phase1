
public class InnerClassProgram {

		 private String msg="Welcome to Java"; 
		 
		 class Inner{  
		  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
		 }  



		 public static void main(String[] args) {

			InnerClassProgram obj=new InnerClassProgram();
			InnerClassProgram.Inner in=obj.new Inner();  
			in.hello();  
			

	}

}

