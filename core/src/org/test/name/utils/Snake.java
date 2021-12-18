package org.test.name.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.List;

public class Snake implements IObject {
    private Texture texture;
    public float xPosition;
    public float yPosition;

    List<Texture> tailTextures;

    public Snake(Texture texture) {
        this.texture = texture;
        this.xPosition = 0f;
        this.yPosition = 0f;
    }

    public Snake(Texture texture, float xPosition, float yPosition) {
        this.texture = texture;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public void readInput() {
        if (Gdx.input.isKeyPressed(Input.Keys.W))
            yPosition += 2.0;
        if (Gdx.input.isKeyPressed(Input.Keys.S))
            yPosition -= 2.0;
        if (Gdx.input.isKeyPressed(Input.Keys.D))
            xPosition += 2.0;
        if (Gdx.input.isKeyPressed(Input.Keys.A))
            xPosition -= 2.0;
    }

    @Override
    public void draw(SpriteBatch batch) {
        batch.draw(texture, xPosition, yPosition);
    }

    @Override
    public void dispose() {
        texture.dispose();
    }

    public Texture getTexture() {
        return texture;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }
}
