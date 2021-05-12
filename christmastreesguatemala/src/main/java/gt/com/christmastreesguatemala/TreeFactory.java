package gt.com.christmastreesguatemala;

import java.util.*;

public class TreeFactory {

    public TreeFactory() {
    }

    public WoodTree getTree(TreeType treeType) {
        switch(treeType){
           case SPRUCE: return new SpruceTree();
           case CHIRIVISCO: return new ChiriviscoTree();
           case PINE: return new PineTree();
           case CYPRESS: return new CypressTree();
           case PINIDAE: return new PinidaeTree();
           default: return null;
       }
    }

}