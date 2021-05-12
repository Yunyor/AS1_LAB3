package gt.com.christmastreesguatemala;

import java.util.*;

public class TreeSnowDecorator extends TreeDecorator {

    public TreeSnowDecorator(WoodTree woodTree) {
             super(woodTree);
             this.addTreeSnow(woodTree);
    }
    
    public void addTreeSnow(WoodTree tree) {
       if (tree instanceof CypressTree){        
          System.out.println("Decorando árbol de Ciprés con Nieve");
      }
      if (tree instanceof PineTree){        
          System.out.println("Decorando árbol de Pino con Nieve");
      }
      if (tree instanceof ChiriviscoTree){         
          System.out.println("Decorando árbol de Chirivisco con Nieve");
      }
      if (tree instanceof SpruceTree){         
          System.out.println("Decorando árbol de Pinabete con Nieve");
      }
      
      if (tree instanceof PinidaeTree){         
          System.out.println("Decorando árbol de Pinidae con Nieve");
      }
    }

}