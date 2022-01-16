


		public class ThreadaProgram extends Thread
		{
		 	public void run()
		 	{
		  		System.out.println("concurrent thread started running..");
		}
		 	public static void main( String args[] )
		 	{
		  		ThreadaProgram mt = new  ThreadaProgram();
		  		mt.start();
		 	}
		}


	


