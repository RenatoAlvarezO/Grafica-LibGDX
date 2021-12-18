package org.test.name.utils;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Food implements IObject {

    private Texture texture;
    public float xPosition;
    public float yPosition;

    public Food(Texture texture) {
        this.texture = texture;
        this.yPosition = 0f;
        this.xPosition = 0f;
    }

    public Food(Texture texture, float xPosition, float yPosition) {
        this.texture = texture;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
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
