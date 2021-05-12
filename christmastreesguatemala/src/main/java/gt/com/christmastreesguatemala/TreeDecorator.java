package gt.com.christmastreesguatemala;

import java.util.*;

public abstract class TreeDecorator implements WoodTree {
     protected WoodTree woodTree;
     
    public TreeDecorator(WoodTree woodTree ) {
        this.woodTree= woodTree;
    }
    
    @Override
    public void make() {
       woodTree.make();
        
    }

}