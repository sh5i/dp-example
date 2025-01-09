import node.Directory;
import node.Entry;
import node.File;
import node.Link;
import observer.SizeObserver;
import visitor.ListVisitor;

public class Main {
    public static void main(String[] args) {
        Directory rootDir = new Directory("rootDir");
        Directory dir1 = new Directory("dir1");
        File file1 = new File("file1", 100);
        file1.addObserver(new SizeObserver());
        rootDir.add(file1);
        rootDir.add(dir1);
        dir1.add(new File("file2", 200));
        dir1.add(new File("file3", 300));
        Link link1 = new Link(file1);
        dir1.add(link1);

        System.out.println("total size : " + rootDir.getSize());
        rootDir.accept(new ListVisitor());

        file1.setSize(50);

        ((Entry)file1).setContent("this is file1");
        System.out.println(file1.getContent());
        ((Entry)link1).setContent("this is link1");
        System.out.println(file1.getContent());
    }
}
