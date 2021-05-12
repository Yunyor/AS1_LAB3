package gt.com.christmastreesguatemala;

import java.util.*;

public class TreeDecoratorFactory {

    public TreeDecoratorFactory() {
    }

    public TreeDecorator getDecorator(DecoratorType decoratorType,WoodTree treeType) {
        switch(decoratorType){
           case PLACE: return new TreePlaceDecorator(treeType);
           case BOMBS: return new TreeBombsDecorator(treeType);
           case STAR: return new TreeStarDecorator(treeType);
           case SNOW: return new TreeSnowDecorator(treeType);
           case LIGHTS: return new TreeLightsDecorator(treeType);
           default: return null;
       }
    }

}