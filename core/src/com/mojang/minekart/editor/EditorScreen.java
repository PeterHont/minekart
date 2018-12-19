package com.mojang.minekart.editor;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.mojang.minekart.MineKartGame;

public class EditorScreen extends ScreenAdapter {
    private MineKartGame game;
    private Stage stage;

    public EditorScreen(MineKartGame game) {
        this.game = game;
        stage = new Stage();


        Gdx.input.setInputProcessor(stage);
        switchScreenWhenTabIsPressed();


        Label topLabel = new Label("Your cart", game.skin);
        topLabel.setPosition(10, 400);
        stage.addActor(topLabel);

        CartGridView cartGridView = new CartGridView();
        cartGridView.setPosition(10, 200);
        stage.addActor(cartGridView);

        /*
        Label topLabel = new Label("Stuff you can buy", game.skin);
        topLabel.setPosition(10, 400);
        stage.addActor(topLabel);
        */

        ItemPoolView itemPoolView = new ItemPoolView();
        itemPoolView.setPosition(300, 300);
        stage.addActor(itemPoolView);

    }


    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        stage.act(delta);
        stage.draw();
    }


    private void addActor(Actor actor, int x, int y) {

    }

    private void addLabel(Label label, int x, int y) {

    }



    private void switchScreenWhenTabIsPressed() {
        stage.addListener(new InputListener() {
            @Override
            public boolean keyDown(InputEvent event, int keycode) {
                //If this is TAB key, switch to TrackScreen
                if (keycode == Input.Keys.NUM_2) {
                    System.out.println("EditorScreen - tab pressed");
                    game.showRaceScreen();
                }
                return super.keyDown(event, keycode);
            }
        });
    }

}
