package com.example.mypegasus.learndrawapi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by MyPegasus on 2015/8/17.
 */
public class RotatingRectangle extends View {

	public RotatingRectangle(Context context) {
		super(context);
		initProperties();
	}

	public RotatingRectangle(Context context, AttributeSet attrs) {
		super(context, attrs);
		initProperties();
	}

	public RotatingRectangle(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		initProperties();
	}

	private void initProperties() {
		paint = new Paint();
		paint.setColor(Color.RED);
	}

	@Override
	public void draw(Canvas canvas) {
		super.draw(canvas);

		canvas.save();

		canvas.translate(200, 200);
//		canvas.rotate(degress);
		canvas.rotate(degress, 50, 50);
		canvas.drawRect(0, 0, 100, 100, paint);
		degress++;
		canvas.restore();
//		System.out.println("<<<<<<<<<<<<<<<<<<<<<");


		//invalidate();

		Handler handler = new Handler() {
			@Override
			public void handleMessage(Message msg) {
				super.handleMessage(msg);
				invalidate();
			}
		};
		Message msg = new Message();

		handler.sendMessageDelayed(msg, 100);
	}

	private Paint paint;
	private float degress = 0;
}
