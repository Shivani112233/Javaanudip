package july19;

 class Thread2 extends Thread {

	public void run() {
		for(int i=0; i<30; i++) {
			System.out.println("print the first thread" +i);
		}
	}
	
}

 class Thread3 extends Thread {

		public void run() {
			for(int i=40; i<=78; i++) {
				System.out.println("print the secomd thread" +i);
			}
		}
		
	}
 class Thread4 extends Thread {

		public void run() {
			for(int i=80; i<=90; i++) {
				System.out.println("print the third thread" +i);
			}
		}
		
	}