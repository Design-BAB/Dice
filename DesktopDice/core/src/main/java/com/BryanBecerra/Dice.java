/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BryanBecerra;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import java.util.Random;

public class Dice {
    private final int SIDES_OF_DIE = 6;
    private final int X = 100;
    private final int Y = 100;
    private Texture[] dieTexture = new Texture[SIDES_OF_DIE];
    private Random randomNumbers;
    private int currentVal;

    public Dice() {
        for(int i = 1; i <= SIDES_OF_DIE; i++) {
            var sb = new StringBuilder();
            sb.append(i);
            sb.append("Die.bmp");
            var textureLocation = sb.toString();
            IO.println(textureLocation);
            dieTexture[i-1] = new Texture(textureLocation);
        }
        currentVal = 1;
        randomNumbers = new Random();
    }
    
    public void roll() {
        currentVal = randomNumbers.nextInt(6) + 1;
    }
    
    public int getCurrentVal() {
        return currentVal;
    }
    
    public void draw(SpriteBatch batch) {
        batch.draw(dieTexture[currentVal - 1], X, Y);
    }
    
    public void dispose() {
        for(int i = 1; i < SIDES_OF_DIE; i++) {
            dieTexture[i-1].dispose();
        }
    }
}
