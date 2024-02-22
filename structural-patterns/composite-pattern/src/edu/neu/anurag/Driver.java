package edu.neu.anurag;

public class Driver {

	public static void main(String[] args) {
		Indentation id= new Indentation();
		AbstractFile d1=new Directory("d1", id);
		AbstractFile d2=new Directory("d2", id);
		AbstractFile f1=new File("f1", id);
		AbstractFile f2=new File("f2", id);
		AbstractFile f3=new File("f3", id);
		AbstractFile f4=new File("f4", id);
	    ((Directory)d1).addFile(f1);
	    ((Directory)d1).addFile(f2);
	    ((Directory)d1).addFile(f3);
	    ((Directory)d2).addFile(f4);
	    d1.ls();
	    d2.ls();
	}
}
