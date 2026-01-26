package Serliazation;

import java.io.FileInputStream;

import java.io.ObjectInputStream;


public class Demo {
	public static void main(String[] args) throws Exception {
        FileInputStream fos = new FileInputStream("D:\\data.ser");
		ObjectInputStream oos = new ObjectInputStream(fos);
		
		Students obj = (Students) oos.readObject();
		
		System.out.println(obj.name);
		System.out.println(obj.addrees);
		System.out.println(obj.roll);
		System.out.println(obj.collegename);
		
		
		

}}
