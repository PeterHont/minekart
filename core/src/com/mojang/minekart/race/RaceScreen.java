package com.mojang.minekart.race;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector2;
import com.mojang.minekart.MineKartGame;

public class RaceScreen extends ScreenAdapter {
    public TiledMap map;

    public OrthogonalTiledMapRenderer renderer;
    public OrthographicCamera camera;

    public float movementSpeed = 10.0f;

    public RaceScreen(MineKartGame game) {
        map = new TmxMapLoader().load("Simple.tmx");
        renderer = new OrthogonalTiledMapRenderer(map, 1.0f / 16.0f);

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 15, 15);
    }

    @Override
    public void render(float delta) {
        update(delta);

        Gdx.gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();
        renderer.setView(camera);
        renderer.render();
    }

    public void update(float deltaTime) {
        Vector2 movement = new Vector2(0.0f, 0.0f);
        

        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            movement.add(1.0f, 0.0f);
        }

        if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
            movement.add(0.0f, 1.0f);
        }

        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            movement.add(-1.0f, 0.0f);
        }

        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            movement.add(0.0f, -1.0f);
        }
        
        // What is the deal with these names?
        movement.nor(); // movement = normalize(movement)
        movement.scl(movementSpeed * deltaTime); // movement *= movementSpeed * deltaTime
        camera.translate(movement);
    }
    
    @Override
    public void dispose () {
    }
}
