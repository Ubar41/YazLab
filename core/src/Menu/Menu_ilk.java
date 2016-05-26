package Menu;

/**
 * Created by Admin on 25.5.2016.
 */
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent;
import com.badlogic.gdx.utils.viewport.StretchViewport;

public class Menu_ilk implements Screen {

    private Stage stage;
    private Skin skin;
    private SpriteBatch batch;

    public Menu_ilk() {

        Gdx.app.log("OptionsScreen", "Attached");

        create();

    }

    private void create() {

        batch = new SpriteBatch();
        skin = new Skin();
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);

        Pixmap pixmap = new Pixmap(100, 100, Format.RGBA8888);
        pixmap.setColor(Color.GREEN);
        pixmap.fill();

        skin.add("white", new Texture(pixmap));

        BitmapFont bfont = new BitmapFont();

        skin.add("default", bfont);

        TextButtonStyle textButtonStyle = new TextButtonStyle();
        textButtonStyle.up = skin.newDrawable("white", Color.DARK_GRAY);
        textButtonStyle.down = skin.newDrawable("white", Color.DARK_GRAY);
        textButtonStyle.checked = skin.newDrawable("white", Color.BLUE);
        textButtonStyle.over = skin.newDrawable("white", Color.LIGHT_GRAY);
        textButtonStyle.font = skin.getFont("default");
        skin.add("default", textButtonStyle);

        final TextButton textButton = new TextButton("UPDATE", textButtonStyle);
        textButton.setPosition(200, 200);
        stage.addActor(textButton);
        stage.addActor(textButton);
        stage.addActor(textButton);

        textButton.addListener(new ChangeListener() {
            public void changed (ChangeEvent event, Actor actor) {
                textButton.setText("Submitting...");

            }
        });

    }

    @Override
    public void render(float delta) {

        // White background
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        stage.act(Math.min(Gdx.graphics.getDeltaTime(), 1 / 30f));
        stage.draw();

    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log("OptionsScreen", "resizing");
        stage.setViewport(new StretchViewport(width, height));
    }

    @Override
    public void show() {
        Gdx.app.log("OptionsScreen", "show called");
    }

    @Override
    public void hide() {
        Gdx.app.log("OptionsScreen", "hide called");
    }

    @Override
    public void pause() {
        Gdx.app.log("OptionsScreen", "pause called");
    }

    @Override
    public void resume() {
        Gdx.app.log("OptionsScreen", "resume called");
    }

    @Override
    public void dispose() {
        stage.dispose();
        skin.dispose();
    }

}