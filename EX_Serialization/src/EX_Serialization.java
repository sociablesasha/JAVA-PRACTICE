import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EX_Serialization {
	private static String filename = "C:/Temp/object.dat";
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			/*oos.writeObject(new Integer(10));
			oos.writeObject(new Double(3.14));
			oos.writeObject(new int[]{1,2,3});
			oos.writeObject(new String("ȫ�浿"));*/
			A classA = new A();
			classA.field1 = 1;
			classA.field2.field1 = 2;
			classA.field3 = 3;
			oos.writeObject(classA);
			oos.flush();
			oos.close();
			fos.close();
			
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			/*Integer obj1 = (Integer)ois.readObject();
			Double obj2 = (Double)ois.readObject();
			int[] obj3 = (int[])ois.readObject();
			String obj4 = (String)ois.readObject();*/
			A temp = (A)ois.readObject();
			ois.close();
			fis.close();
			
			System.out.println("===> " + temp.field1);
			System.out.println("===> " + temp.field2.field1);
			System.out.println("===> " + temp.field3);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException ee) {
			ee.printStackTrace();
		} catch(ClassNotFoundException eee) {
			eee.printStackTrace();
		}
	}
}
