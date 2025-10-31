import java.io.*;
public class ConnectionClose{
    public static void main(String[] args){
	FileWriter fw = null;
	try{
		fw = new FileWriter("C:\\nonexistent\\abc.txt");

		fw.write("output :");
		fw.flush();
		//fw.close();
	}

	catch(IOException ex){
		ex.printStackTrace();
	}
	finally{
		try{
			if(fw!=null){
				fw.close();
			}
		}
		catch(IOException ex){
			System.out.println("connection is closed");
			ex.printStackTrace();
		}
	}
    }
}