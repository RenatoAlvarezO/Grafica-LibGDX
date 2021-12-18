package org.test.name.utils;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Obstacle implements IObject{

    private Texture texture;
    public float xPosition;
    public float yPosition;

    public Obstacle(Texture texture) {
        this.texture = texture;
        this.yPosition = 0f;
        this.xPosition = 0f;
    }

    public Obstacle(Texture texture, float xPosition, float yPosition) {
        this.texture = texture;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    @Override
    public void draw(SpriteBatch batch) {
        batch.draw(texture,xPosition,yPosition);
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
