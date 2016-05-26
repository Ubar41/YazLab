package tiklamalar;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.mygdx.game.OyunBasla;

import java.util.ArrayList;

import Balonlarrr.Balonlar;


public class tiklama implements InputProcessor {
    ArrayList<Balonlar> b;

    Sound sound = Gdx.audio.newSound(Gdx.files.internal("balon.mp3"));

    public tiklama(ArrayList<Balonlar> b)
    {
        this.b=b;
    }
    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {

       // sound.play(0.1f);
        if(OyunBasla.menudurum == 3 || OyunBasla.menudurum == 2){
            if(OyunBasla.buton2[0].getBalonkaresi().contains(screenX,1920-screenY)){
                OyunBasla.menudurum=0;
                return false;
            }
        }


        if(OyunBasla.menudurum==0)
        {
            for (int i = 0; i <OyunBasla.buton.length ; i++) {
                if(OyunBasla.buton[i].getBalonkaresi().contains(screenX,1920-screenY))
                {
                    if(i==0)
                    {
                        OyunBasla.menudurum=1;
                        return false;
                    }
                    else if(i==4)
                    {
                        System.exit(0);
                        return false;
                    }

                    else if(i==3)
                    {
                        OyunBasla.sesdurum=1;
                    }
                    else if(i==2)
                    {
                        OyunBasla.menudurum=2;
                    }
                  //  OyunBasla.tur_top.add()
                   /* int count = OyunBasla.tur_top.size();

                    for (int k = 0; k < OyunBasla.tur_top.size(); k++) {
                      //  int value = OyunBasla.tur_top.get(i);
                      //  System.out.println("Element: " + value);
                        tur_top
                    } */
                }

            }
        }


        if(OyunBasla.menudurum==1)
        {
            for (int i = 0; i <b.size() ; i++) {
                if(b.get(i).getrect().contains(screenX,1920-screenY))
                {
                    if(b.get(i).getTip() == 1){
                        OyunBasla.puanlama = OyunBasla.puanlama-10;
                       if(OyunBasla.sesdurum==0)
                       {
                           sound.play(0.1f);
                       }


                    }

                    if(b.get(i).getTip() == 2){
                        OyunBasla.puanlama = OyunBasla.puanlama+10;
                        if(OyunBasla.sesdurum==0)
                        {
                            sound.play(0.1f);
                        }
                    }

                    if(b.get(i).getTip() == 3){
                        OyunBasla.puanlama = OyunBasla.puanlama+20;
                        if(OyunBasla.sesdurum==0)
                        {
                            sound.play(0.1f);
                        }
                    }
                    if(b.get(i).getTip() == 4){
                        OyunBasla.puanlama = OyunBasla.puanlama+5;
                        if(OyunBasla.sesdurum==0)
                        {
                            sound.play(0.1f);
                        }
                    }

                    b.remove(i);
                }
            }
        }



        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
