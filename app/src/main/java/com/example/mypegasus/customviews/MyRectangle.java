package com.example.mypegasus.customviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by MyPegasus on 2015/8/17.
 */
public class MyRectangle extends View {

	public MyRectangle(Context context) {
		super(context);
	}

	public MyRectangle(Context context, AttributeSet attrs) {
		super(context, attrs);

		TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.MyRectangle);

		int color = ta.getColor(R.styleable.MyRectangle_rect_color, 0xffff0000);
		setBackgroundColor(color);

		ta.recycle();
	}
}
