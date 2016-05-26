package tiklamalar;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.OyunBasla;


public class skor {
    static BitmapFont font;
    public static void render(SpriteBatch skr) {
        skr.begin();
        font = new BitmapFont(Gdx.files.internal("font/arial-32.fnt"),false);
        font.setColor(Color.WHITE);
        font.getData().setScale(5);
       // font.getData().setLineHeight(1100);

        font.draw(skr, String.valueOf((int) OyunBasla.puanlama), 100,1150);



        skr.end();
    }
}
