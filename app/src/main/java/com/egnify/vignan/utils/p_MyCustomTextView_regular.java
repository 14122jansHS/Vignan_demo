package com.egnify.vignan.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by janardhanyerranagu on 9/19/15.
 */
public class p_MyCustomTextView_regular extends TextView {

    public p_MyCustomTextView_regular(Context context, AttributeSet arrt) {
        super(context,arrt);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/OpenSans-Regular.ttf"));
    }


}
