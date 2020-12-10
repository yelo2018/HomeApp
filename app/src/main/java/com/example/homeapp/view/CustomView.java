package com.example.homeapp.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

public class CustomView extends View {

    private int lastX;
    private int lastY;

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr){
        super(context, attrs, defStyleAttr);
    }

    public CustomView(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    public CustomView(Context context){
        super(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int)event.getX();
        int y = (int)event.getY();

        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                lastX = x;
                lastY = y;
                break;

                case MotionEvent.ACTION_MOVE:
                    int offsetX = x - lastX;
                    int offsetY = y - lastY;

                    moveViewParams(offsetX, offsetY);
                    break;
        }

        return true;
    }

    private void moveViewParams(int offsetX, int offsetY){
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = getLeft() + offsetX;
        layoutParams.topMargin = getTop() + offsetY;
        setLayoutParams(layoutParams);
    }

    private void moveViewLayout(int offsetX, int offsetY){
        layout(getLeft()+offsetX, getTop()+offsetY,
                getRight()+offsetX, getBottom()+offsetY);
    }
}
