package com.ahmed.co;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutPutWriting {
	public static void main(String[] args)throws FileNotFoundException,IOException {
		FileOutputStream fls =new FileOutputStream("sos.txt");
		DataOutputStream dis = new DataOutputStream(fls);
		dis.writeByte(97);
		dis.writeShort(98);
		dis.writeInt(99);
		dis.writeLong(100);
		dis.writeFloat(101);
		dis.writeDouble(102);
		dis.writeChar(103);
		dis.writeBoolean(true);
		dis.writeUTF("ashok");
		System.out.println("Data saved in file");
	}

}
