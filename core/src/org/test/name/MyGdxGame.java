package org.test.name;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import org.test.name.utils.Snake;

public class MyGdxGame extends ApplicationAdapter{
    SpriteBatch batch;
    Snake snake;
    float yPosition;
    float xPosition;

    @Override
    public void create() {
        batch = new SpriteBatch();
        snake = new Snake(new Texture("Skull.png"));
    }

    @Override
    public void render() {
        ScreenUtils.clear(1, 0, 0, 1);

        snake.readInput();
        batch.begin();
        snake.draw(batch);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        snake.dispose();
    }
}
