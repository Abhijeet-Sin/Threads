package Threado;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.File;
 

public class Tabular {

	public static void main(String[] args) {
		Book book = new Book ("Naina Gayana",25); 
		ObjectInputStream objin = null;
		ObjectOutputStream objout = null;
		try {
			objout = new ObjectOutputStream(new FileOutputStream(new File ("first.txt")));
			objout.writeObject(book);
			System.out.println("object written into the class safely");
			objout.close();
			objin = new ObjectInputStream(new FileInputStream(new File ("first.txt")));
			Book retor =(Book) objin.readObject();
			System.out.println("Author name retrived From the File "+retor.getAuthorName());
			System.out.println("Price rerived From the FIle " +retor.getPrice());
			objin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		 
		
	}

}
