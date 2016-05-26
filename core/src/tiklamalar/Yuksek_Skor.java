package tiklamalar;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.OyunBasla;

/**
 * Created by Ahmet on 26.5.2016.
 */
public class Yuksek_Skor {
    static BitmapFont font;
    public static void render(SpriteBatch skr) {
        skr.begin();
        font = new BitmapFont(Gdx.files.internal("font/arial-32.fnt"),false);
        font.setColor(Color.GREEN);
        font.getData().setScale(2);
        // font.getData().setLineHeight(1100);
        font.draw(skr,"Skor : "+String.valueOf((int) OyunBasla.puanlama), 100,1200);
        font.draw(skr,"Hight Scor : "+String.valueOf((int) OyunBasla.high_scor), 100,1000);
        skr.end();
    }
}
