package com.cruz.ethelon;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import java.util.Locale;

public class FirstScreen extends Activity {
    Animation fade_in, fade_out;
    ViewFlipper viewFlipper;
    float x1,x2,y1,y2;
    TextView tx1,tx2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_first_screen);

////        AssetManager am = getApplicationContext().getAssets();
////        Typeface typeface = Typeface.createFromAsset(am,
////                String.format(Locale.US,"fonts/%s","Montserrat-Bold.tff"));
//        tx1 = (TextView) findViewById(R.id.textView);
//        Typeface custom_font = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/Montserrat-Bold.tff");
//        tx1.setTypeface(custom_font);

        ImageView login = (ImageView) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstScreen.this,FiveColorChangingTabsActivity.class);
                startActivity(intent);
            }
        });
        viewFlipper = (ViewFlipper) this.findViewById(R.id.bckgrndViewFlipper1);
        fade_in = AnimationUtils.loadAnimation(this,
                android.R.anim.fade_in);
        fade_out = AnimationUtils.loadAnimation(this,
                android.R.anim.fade_out);
        viewFlipper.setInAnimation(fade_in);
        viewFlipper.setOutAnimation(fade_out);
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.showNext();
    }

    public boolean onTouchEvent(MotionEvent touchevent){
        switch (touchevent.getAction()) {
            case MotionEvent.ACTION_DOWN :
                x1 = touchevent.getX();
                y1 = touchevent.getY();
                break;

            case MotionEvent.ACTION_UP :
                x2 = touchevent.getX();
                y2 = touchevent.getY();
                if(x1 > x2)
                    viewFlipper.showNext();
                if(x1 < x2)
                    viewFlipper.showPrevious();
                break;
        }
        return false;
    }

}
