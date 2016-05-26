package com.mygdx.game;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import java.util.ArrayList;
import java.util.Random;

import Balonlarrr.Background;
import Balonlarrr.Balonlar;
import Balonlarrr.BlackBallon;
import Balonlarrr.Buton;
import Balonlarrr.Buton1;
import Balonlarrr.RedBallon;
import Balonlarrr.YellowBallon;
import Balonlarrr.YesilBalon;
import tiklamalar.skor;
import tiklamalar.tiklama;

public class OyunBasla extends ApplicationAdapter {
	public static Buton [] buton;
	public static Buton1[] buton1;
	private float zaman,dt;
	private BitmapFont font2;
	public static Background back;
	 SpriteBatch batch;
	Texture img2;
	Texture img;

	Random random;
	int x=0;
	int y =0;
	skor skor;
	public static int puanlama = 0;
	public static int menudurum=0;
	public static int sesdurum=0;

	public  OyunBasla()
	{
		dt=0.06f;
		zaman=30;
		skor = new skor();
	}
	public static ArrayList<Balonlar> b;
	@Override
	public void create () {
		batch = new SpriteBatch();
		b = new ArrayList<Balonlar>();
		random=new Random();
		int a = random.nextInt(4);
		b.add(new YesilBalon(random.nextInt(800),0));
		b.add(new YellowBallon(random.nextInt(800),random.nextInt(850)));
		b.add(new RedBallon(random.nextInt(800),random.nextInt(850)));
		b.add(new BlackBallon(random.nextInt(800), random.nextInt(850)));
		Gdx.input.setInputProcessor(new tiklama(b));
		buton = new Buton[5] ;
		buton1= new Buton1[1];
		buton[0] = new Buton(300,1200,"b1.png");
		buton[1]= new Buton(300,1000,"b2.png");
        buton[2]=new Buton(300,800,"b3.png");
		buton[3]=new Buton(300,600,"b4.png");
		buton[4]=new Buton(300,400,"b5.png");
       buton1[0]=new Buton1(0,0,"hakkimizda.png");

         back=new Background(0,0,"back.png");
	}
	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

	back.render(batch);

		if(menudurum==0)
		{
			for (int i = 0; i <buton.length ; i++) {
				buton[i].render(batch);
			}

		}

		else if(menudurum==1)
		{

			for (int i = 0; i <b.size() ; i++) {
				if(5>b.size())
			{int a = random.nextInt(4);
				if(a==0)
				{
					b.add(new BlackBallon(random.nextInt(800),random.nextInt(850)));
				}
				if(a==1)
				{
					b.add(new RedBallon(random.nextInt(800),random.nextInt(850)));
				}
				if(a==2)
				{
					b.add(new YellowBallon(random.nextInt(800),random.nextInt(850)));
				}
				if(a==3)
				{
					b.add(new YesilBalon(random.nextInt(800),0));
				}
			}
				b.get(i).bhareket();
				b.get(i).render(batch);
				if(b.get(i).getX()>850 && b.get(i).getY()>1080)
				{

					if(b.get(i).getTip()==1)
					{
						b.add(new BlackBallon(480,0));
					}
					if(b.get(i).getTip()==2)
					{
						b.add(new RedBallon(360,0));
					}
					if(b.get(i).getTip()==3)
					{
						b.add(new YellowBallon(240,0));
					}
					if(b.get(i).getTip()==4)
					{
						b.add(new YesilBalon(0,0));
					}
					b.remove(i);

				}


			}

			tiklamalar.skor.render(batch);
			batch.begin();



			font2 = new BitmapFont();
			font2.setColor(Color.MAGENTA);
			font2.getData().setScale(10);
			if(zaman >0)
				zaman -= dt;
			font2.draw(batch, String.valueOf((int) zaman), 300, 800);
			batch.end();

		}
		else if(menudurum==2)
		{
			buton1[0].render(batch);
		}
	}
}
