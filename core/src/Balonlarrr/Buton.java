package Balonlarrr;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by Admin on 25.5.2016.
 */
public class Buton {
        Texture img;
        TextureRegion balon;
        Rectangle balonkaresi;
        int x,y;
    String yazi;
  public  Buton(int x , int y,String yazi)
    {
        this.x=x;
        this.y=y;
        this.yazi=yazi;
        balonkaresi=new Rectangle(x,y+150,500,125);

    }

    public void render(SpriteBatch spriteBatch){
        img = new Texture(yazi);
        balon = new TextureRegion(img);
        spriteBatch.begin();
        spriteBatch.draw(balon,x,y,500,125);
        spriteBatch.end();
    }

    public Rectangle getBalonkaresi() {
        return balonkaresi;
    }
}
