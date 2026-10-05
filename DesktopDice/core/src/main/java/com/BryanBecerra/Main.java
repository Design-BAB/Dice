package com.BryanBecerra;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private SpriteBatch batch;
    private BitmapFont font;
    private Dice myDice;
    
    @Override
    public void create() {
        batch = new SpriteBatch();
        font = new BitmapFont(); // default font
        myDice = new Dice();
        myDice.roll();
    }
    
    @Override
    public void render() {
        if (Gdx.input.isKeyJustPressed(Input.Keys.X)) {
            myDice.roll();
        }
        //draw loop
        ScreenUtils.clear(0, 0, 0, 1); // green background
        batch.begin();
        myDice.draw(batch);
        font.draw(batch, "Welcome!", 20, 50);
        batch.end();
    }
    
    @Override
    public void dispose() {
        batch.dispose();
        font.dispose();
    }
    
}