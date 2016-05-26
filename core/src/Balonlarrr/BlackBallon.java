package Balonlarrr;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;


public class BlackBallon extends Balonlar{

    Texture img;
    TextureRegion balon;

    int x;
    int y;
    int seviye;
    Rectangle balonkaresi;
    public BlackBallon(int x,int y,int seviye)
    {
        this.x=x;
        this.y=y;
        this.seviye=seviye;
    }
    public void render(SpriteBatch spriteBatch){
        img = new Texture("balonbg.png");

        balon = new TextureRegion(img,372,0,120,150);
        balonkaresi=new Rectangle(x,y,240,300);
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
        x=(x+seviye);
        y=(y+seviye);

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
        return 1;
    }
}
