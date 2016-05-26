package Balonlarrr;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;


public class  YesilBalon extends Balonlar {
    Texture img;
    TextureRegion balon;
    int x;
    int y;
    Rectangle balonkaresi;
    public YesilBalon(int x,int y )
    {
        this.x=x;
        this.y=y;


    }
    public void render(SpriteBatch spriteBatch){
        img = new Texture("balonbg.png");
        // Random randomBalon = new Random();
        // Random randomXkord = new Random();
        // Random randomYkord = new Random();
        balon = new TextureRegion(img,0,0,120,150);
        balonkaresi=new Rectangle(x,y,240,400);
        spriteBatch.begin();
        spriteBatch.draw(balon,x,y,240,300);
        spriteBatch.end();
    }


    @Override
    public Rectangle getrect() {
        return balonkaresi;
    }

    @Override
    public void bhareket() {
       y = y+15;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getTip() {
        return 4;
    }
}
