package Balonlarrr;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by Admin on 26.5.2016.
 */
public class Background {

    Texture img;
    TextureRegion balon;
    int x,y;
    String yazi;
    public  Background(int x , int y,String yazi)
    {
        this.x=x;
        this.y=y;
        this.yazi=yazi;
      //  balonkaresi=new Rectangle(x,y,1080,1920);
        img = new Texture(yazi);
    }

    public void render (SpriteBatch spriteBatch) {

        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); // This cryptic line clears the screen.
        spriteBatch.begin();
        // Drawing goes here!
        spriteBatch.draw(img,0,0,1080,1920);
        spriteBatch.end();
    }

   /*public Rectangle getBalonkaresi() {
    return balonkaresi;
    }*/


}
