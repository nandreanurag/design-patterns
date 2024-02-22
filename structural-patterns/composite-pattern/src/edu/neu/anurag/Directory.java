package edu.neu.anurag;

import java.util.ArrayList;
import java.util.List;

//Composite Branch
public class Directory implements AbstractFile {

	private String name;
	private Indentation indentation;
	private List<AbstractFile> fileList = new ArrayList<>();

	public Directory(String name, Indentation indentation) {
		this.name = name;
		this.indentation = indentation;
	}

	public void addFile(AbstractFile file) {
		this.fileList.add(file);
	}

	public void removeFile(AbstractFile file) {
		this.fileList.remove(file);
	}

	@Override
	public void ls() {
		System.out.println(indentation.getIndentation() + name);
		indentation.increaseIndentation();
		for (AbstractFile file : fileList) {
			file.ls();
		}
		indentation.decreaseIndentation();
	}

}
