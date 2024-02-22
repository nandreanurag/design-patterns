package edu.neu.anurag;

// Leaf
public class File implements AbstractFile {

	private String name;
	private Indentation indentation;

	public File(String name, Indentation indentation) {
		this.name = name;
		this.indentation = indentation;
	}

	@Override
	public void ls() {
		System.out.println(indentation.getIndentation() +
				name);

	}

}
