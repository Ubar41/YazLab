package Balonlarrr;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;

public class RedBallon extends Balonlar {
    Texture img;
    TextureRegion balon;
    int x;
    int y;
    int rota = 0;
    Rectangle balonkaresi;
    public RedBallon(int x,int y )
    {
        this.x=x;
        this.y=y;


    }
    public void render(SpriteBatch spriteBatch){
        img = new Texture("balonbg.png");
        balon = new TextureRegion(img,124,0,120,150);
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
       //1920x1080
        if(rota==0 && !(x<850))
            rota = 1;

        if(rota == 1 && !(x>0))
            rota = 0;

        if(rota==0)
            x=x+8;
        else
            x=x-8;

        y=(y+5);


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
        return 2;
    }
}
