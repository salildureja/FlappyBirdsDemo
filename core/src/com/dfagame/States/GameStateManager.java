package com.dfagame.States;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

/**
 * Created by salildureja on 2/23/17.
 */

public class GameStateManager {
    private Stack<State> states;

    public GameStateManager() {
        states = new Stack<State>();
    }

    public void push(State s) {
        states.push(s);
    }

    public void pop() {
        states.pop();
    }

    public void set(State s) {
        states.pop();
        states.push(s);
    }

    // dt: delta time - the change in time between two renders
    public void update(float dt) {
        states.peek().update(dt);
    }

    public void render(SpriteBatch sb) {
        states.peek().render(sb);
    }
}
