package July2;

public class Ecceptionhw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ecceptionhw ee =new Ecceptionhw();
        try {
            ee.method1();
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e);
        }
    }

    void method1() throws Exception {
        method2();
    }

    void method2() throws Exception {
        method3();
    }

    void method3() throws Exception {
        throw new Exception("Exception thrown in method3");
    }
	}


