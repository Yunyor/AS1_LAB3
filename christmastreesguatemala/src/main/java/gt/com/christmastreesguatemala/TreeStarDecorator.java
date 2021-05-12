package gt.com.christmastreesguatemala;

import java.util.*;

public class TreeStarDecorator extends TreeDecorator {

    public TreeStarDecorator(WoodTree woodTree) {
        super(woodTree);
        this.addTreeStar(woodTree);
    }
  
    
    public void addTreeStar(WoodTree tree) {
      if (tree instanceof CypressTree){        
          System.out.println("Decorando el árbol de Ciprés con la estrella de navidad");
      }
      if (tree instanceof PineTree){        
          System.out.println("Decorando el árbol de Pino con la estrella de navidad");
      }
      if (tree instanceof ChiriviscoTree){         
          System.out.println("Decorando el árbol de Chirivisco con la estrella de navidad");
      }
      if (tree instanceof SpruceTree){         
          System.out.println("Decorando el árbol de Pinabete con la estrella de navidad");
      }
      
      if (tree instanceof PinidaeTree){         
          System.out.println("Decorando el árbol de Pinidae con la estrella de navidad");
      }
    }

}