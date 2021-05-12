package gt.com.christmastreesguatemala;

import java.util.*;

public class TreeBombsDecorator extends TreeDecorator {

    public TreeBombsDecorator(WoodTree woodTree) {
         super(woodTree);
         this.addTreeBombs(woodTree);
    }
   
    
   
    public void addTreeBombs(WoodTree tree) {
        if (tree instanceof CypressTree){        
          System.out.println("Decorando árbol de Ciprés con bombas");
      }
      if (tree instanceof PineTree){        
          System.out.println("Decorando árbol de Pino con bombas");
      }
      if (tree instanceof ChiriviscoTree){         
          System.out.println("Decorando árbol de Chirivisco con bombas");
      }
      if (tree instanceof SpruceTree){         
          System.out.println("Decorando árbol de Pinabete con bombas");
      }
      
      if (tree instanceof PinidaeTree){         
          System.out.println("Decorando árbol de Pinidae con bombas");
      }
    }

}