package gt.com.christmastreesguatemala;

import java.util.*;

public class TreePlaceDecorator extends TreeDecorator {

    public TreePlaceDecorator(WoodTree woodTree) {
            super(woodTree);
    }

    @Override
    public void make() {
        this.woodTree.make();
        this.place(woodTree);
        
    }
    public void place(WoodTree tree) {
      if (tree instanceof CypressTree){        
          System.out.println("Colocando árbol de Ciprés");
      }
      if (tree instanceof PineTree){        
          System.out.println("Colocando árbol de Pino");
      }
      if (tree instanceof ChiriviscoTree){         
          System.out.println("Colocando árbol de Chirivisco");
      }
      if (tree instanceof SpruceTree){         
          System.out.println("Colocando árbol de Pinabete");
      }
      
      if (tree instanceof PinidaeTree){         
          System.out.println("Colocando árbol de Pinidae");
      }
            
    }

}