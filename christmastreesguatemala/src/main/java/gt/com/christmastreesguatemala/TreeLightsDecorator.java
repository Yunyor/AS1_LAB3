package gt.com.christmastreesguatemala;

import java.util.*;

public class TreeLightsDecorator extends TreeBombsDecorator {

    public TreeLightsDecorator(WoodTree woodTree) {
         super(woodTree);
         this.addLights(woodTree);
    }
  
    public void addLights(WoodTree tree) {
     if (tree instanceof CypressTree){        
          System.out.println("Decorando árbol de Ciprés con Luces");
      }
      if (tree instanceof PineTree){        
          System.out.println("Decorando árbol de Pino con Luces");
      }
      if (tree instanceof ChiriviscoTree){         
          System.out.println("Decorando árbol de Chirivisco con Luces");
      }
      if (tree instanceof SpruceTree){         
          System.out.println("Decorando árbol de Pinabete con Luces");
      }
      
      if (tree instanceof PinidaeTree){         
          System.out.println("Decorando árbol de Pinidae con Luces");
      }
    }

}