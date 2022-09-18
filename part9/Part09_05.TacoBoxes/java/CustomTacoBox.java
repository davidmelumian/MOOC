/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class CustomTacoBox implements TacoBox {
    private int initialTaco;
    public CustomTacoBox(int initialTaco){
        this.initialTaco=initialTaco;
    }

    @Override
    public int tacosRemaining() {
        return initialTaco;
    }

    @Override
    public void eat() {
        if (initialTaco-1>=0){
            initialTaco--;
        }

    }
}