package gt.com.christmastreesguatemala;

import java.util.*;

public class WoodTreeFacade {
    private List<WoodTree> christmasTrees;
      
    public WoodTreeFacade() {
        TreeFactory treeFactory = new TreeFactory();
        this.christmasTrees = new ArrayList();
        this.christmasTrees.add(treeFactory.getTree(TreeType.SPRUCE));
        this.christmasTrees.add(treeFactory.getTree(TreeType.CHIRIVISCO));
        this.christmasTrees.add(treeFactory.getTree(TreeType.PINE));
        this.christmasTrees.add(treeFactory.getTree(TreeType.PINIDAE));
        this.christmasTrees.add(treeFactory.getTree(TreeType.CYPRESS));
        
    }
    public void DecorateTrees(){
        TreeDecoratorFactory decoradorFactory = new TreeDecoratorFactory();
        
        for (WoodTree tree: this.christmasTrees){
            System.out.println("_____________________________________________________________");
            TreeDecorator treDecoratorPlace = decoradorFactory.getDecorator(DecoratorType.PLACE, tree);
            treDecoratorPlace.make();
            TreeDecorator treDecoratorBombs = decoradorFactory.getDecorator(DecoratorType.BOMBS, tree);
            TreeDecorator treDecoratorLights = decoradorFactory.getDecorator(DecoratorType.LIGHTS, tree);
            TreeDecorator treDecoratorSnow = decoradorFactory.getDecorator(DecoratorType.SNOW, tree);
            TreeDecorator treDecoratorStar = decoradorFactory.getDecorator(DecoratorType.STAR, tree);
        }
        
    }

   

}