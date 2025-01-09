package visitor;

import node.Directory;
import node.File;
import node.Link;

public interface Visitor {
    void visit(File file);
    void visit(Directory directory);
    void visit(Link link);
}
