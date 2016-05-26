package Balonlarrr;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.mygdx.game.OyunBasla;


public class YellowBallon extends Balonlar{
    private float zaman,dt;
    Texture img;
    TextureRegion balon;
    int x;
    int y;
    Rectangle balonkaresi;
    ShapeRenderer shapeRenderer;
    public YellowBallon(int x,int y )
    {
        this.x=x;
        this.y=y;

    shapeRenderer=new ShapeRenderer();
    }
    public void render(SpriteBatch spriteBatch){
        img = new Texture("balonbg.png");
        balon = new TextureRegion(img,248,0,120,150);
        balonkaresi=new Rectangle(x,y,240,400);
        spriteBatch.begin();
        spriteBatch.draw(balon,x,y,240,300);
        spriteBatch.end();
        dt = Gdx.graphics.getDeltaTime();

    }


    @Override
    public Rectangle getrect() {
        return balonkaresi;
    }

    @Override
    public void bhareket() {

        dt=0.06f;
        zaman=1;
        if(zaman >0)
            zaman -= dt;
        else
            OyunBasla.b.add(new BlackBallon(480,0));
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
        return 3;
    }
}
