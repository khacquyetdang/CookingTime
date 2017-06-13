package khacquyetdang.android.com.cookingtime;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TimePicker;

import khacquyetdang.android.com.cookingtime.Utility;
import khacquyetdang.android.com.cookingtime.database.Plat;

/**
 * Created by dang on 13/06/2017.
 */

public class MinuteurActivity extends AppCompatActivity {

    private Plat _plat;
    private ProgressBar progressBar;
    private TextView timeTxtView;
    private Button stop_cooking_btn;
    private Button start_cooking_btn;
    private EditText timeEditText;

    public View timeLayout;
    private int currentTime;
    private CountDownTimer countDownTimer;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minuteur);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        _plat = (Plat) getIntent().getSerializableExtra("extra_plat");
        currentTime = _plat.getTimesInMinutes() * 60;

        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setMax(currentTime);

        timeTxtView = (TextView) findViewById(R.id.time_txt_view);
        timeTxtView.setText(Utility.timeToStr(currentTime));

        start_cooking_btn = (Button) findViewById(R.id.start_cooking_btn);

        stop_cooking_btn = (Button) findViewById(R.id.stop_cooking_btn);


        start_cooking_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startTimer();
            }
        });
        stop_cooking_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setProgress(0);
                timeTxtView.setText(Utility.timeToStr(0));
                timeEditText.setText(Utility.timeToStr(0));
                if (countDownTimer != null)
                {
                    countDownTimer.cancel();
                }
                countDownTimer = null;
                timeEditText.setEnabled(true);
                timeEditText.setInputType(InputType.TYPE_DATETIME_VARIATION_TIME);
                timeEditText.setFocusable(true);
            }
        });
        timeEditText = (EditText) findViewById(R.id.timeEditText);
        timeEditText.setText(Utility.timeToStr(currentTime));
        timeEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                try {
                    currentTime = Utility.timeStrToSec(timeEditText.getText().toString());
                    progressBar.setMax(currentTime);
                    timeTxtView.setText(Utility.timeToStr(currentTime));
                } catch (Exception e){
                    Log.e(MinuteurActivity.class.getSimpleName(), e.getMessage());
                }
            }
        });
    }


    private void startTimer()
    {
        timeEditText.setFocusable(false);
        timeEditText.setEnabled(false);
        final long millisInFuture = currentTime * 1000;
        long stickInterval = 1000;
        countDownTimer = new CountDownTimer(millisInFuture, stickInterval) {
            @Override
            public void onTick(long timeRemainInMillSecond) {
                int timeRemainInSec = (int) timeRemainInMillSecond / 1000;
                timeTxtView.setText(Utility.timeToStr(timeRemainInSec ));
                int progress = (int) (millisInFuture - timeRemainInMillSecond) / 1000;
                progressBar.setProgress(progress );
            }

            @Override
            public void onFinish() {
                timeTxtView.setText(Utility.timeToStr(0));
                timeEditText.setEnabled(true);
                timeEditText.setInputType(InputType.TYPE_DATETIME_VARIATION_TIME);
                timeEditText.setFocusable(true);
                progressBar.setProgress(currentTime);

            }
        };
        countDownTimer.start();
        /*
        ObjectAnimator animation = ObjectAnimator.ofInt (progressBar, "progress", 0, (int) currentTime); // see this max value coming back here, we animale towards that value
        animation.setDuration (currentTime * 1000); //in milliseconds
        animation.setRepeatCount(1);
        //animation.setRepeatMode(Animation.ABSOLUTE);

        animation.setInterpolator (new DecelerateInterpolator());
        animation.start ();

        animation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator updatedAnimation) {
                // You can use the animated value in a property that uses the
                // same type as the animation. In this case, you can use the
                // float value in the translationX property.
                Integer animatedValue = (Integer) updatedAnimation.getAnimatedValue();
                Integer remainTime = new Integer(currentTime - animatedValue);
                timeTxtView.setText(Utility.timeToStr((remainTime)));
            }
        });*/

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        countDownTimer = null;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
