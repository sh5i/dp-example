package visitor;

import node.Directory;
import node.Entry;
import node.File;
import node.Link;

public class ListVisitor implements Visitor {
    private String currentDir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        for (Entry e : directory) {
            e.accept(this);
        }
        currentDir = saveDir;
    }

    @Override
	public void visit(Link link) {
		System.out.println(currentDir + "/" + link.getName() + "@" + link);
	}
}
