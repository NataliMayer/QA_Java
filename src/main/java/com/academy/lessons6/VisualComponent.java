package com.academy.lessons6;

public interface VisualComponent {
    void draw();

    default void draw3d() {
        System.out.println("Visual3D");

    }

}
