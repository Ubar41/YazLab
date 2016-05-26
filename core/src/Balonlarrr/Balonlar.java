package Balonlarrr;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public abstract class Balonlar {
    public Balonlar(){}
    public abstract void render(SpriteBatch spriteBatch);
    public abstract Rectangle getrect();
    public abstract void bhareket();

    public abstract int getX();
    public abstract int getY();
    public abstract int getTip();
}
