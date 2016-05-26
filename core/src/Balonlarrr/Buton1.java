package Balonlarrr;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by Admin on 26.5.2016.
 */
public class Buton1 {


    Texture img;
    TextureRegion balon;
    Rectangle balonkaresi;
    int x,y;
    String yazi;
    public  Buton1(int x , int y,String yazi)
    {
        this.x=x;
        this.y=y;
        this.yazi=yazi;
        balonkaresi=new Rectangle(0,0,1080,1920);

    }

    public void render(SpriteBatch spriteBatch){
        img = new Texture(yazi);

        balon = new TextureRegion(img);

        spriteBatch.begin();
        spriteBatch.draw(balon,0,0,1080,1920);
        spriteBatch.end();
    }

    public Rectangle getBalonkaresi() {
        return balonkaresi;
    }
}
