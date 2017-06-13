package khacquyetdang.android.com.cookingtime;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import khacquyetdang.android.com.cookingtime.database.Plat;

/**
 * Created by dang on 27/05/2017.
 */

public class PlatDetailActivity extends AppCompatActivity {
    private final String TAG = PlatDetailActivity.class.getClass().toString();
    private ImageView _platImageAppBar;
    private AppBarLayout htab_appbar;
    private FloatingActionButton fabBtn;
    private Plat _plat;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plat_detail);

        _plat = (Plat) getIntent().getSerializableExtra("extra_plat");

        final Toolbar toolbar = (Toolbar) findViewById(R.id.htab_toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(_plat.getName());
        }
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        final CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.htab_collapse_toolbar);

        _platImageAppBar = (ImageView) findViewById(R.id.platImageAppBar);
        Picasso.with(getBaseContext()).load(_plat.getImg_url()).fit().centerCrop().into(_platImageAppBar);

        try {
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), _plat.getImg_url());
            Palette.from(bitmap).generate(new Palette.PaletteAsyncListener() {
                @SuppressWarnings("ResourceType")
                @Override
                public void onGenerated(Palette palette) {

                    int vibrantColor = palette.getVibrantColor(R.color.primary_500);
                    int vibrantDarkColor = palette.getDarkVibrantColor(R.color.primary_700);
                    collapsingToolbarLayout.setContentScrimColor(vibrantColor);
                    collapsingToolbarLayout.setStatusBarScrimColor(vibrantDarkColor);
                }
            });

        } catch (Exception e) {
            // if Bitmap fetch fails, fallback to primary colors
            Log.e(TAG, "onCreate: failed to create bitmap from background", e.fillInStackTrace());
            collapsingToolbarLayout.setContentScrimColor(
                    ContextCompat.getColor(this, R.color.primary_500)
            );
            collapsingToolbarLayout.setStatusBarScrimColor(
                    ContextCompat.getColor(this, R.color.primary_700)
            );
        }

        String recipe = _plat.getRecipe();
        TextView textView = (TextView) findViewById(R.id.textContentView);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            textView.setText(Html.fromHtml(recipe,
                    Html.FROM_HTML_MODE_COMPACT));
        } else {
            textView.setText(Html.fromHtml(recipe));
        }
        fabBtn = (FloatingActionButton) findViewById(R.id.fab_detail);

        fabBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent minuteurIntent = new Intent(PlatDetailActivity.this, MinuteurActivity.class);
                minuteurIntent.putExtra("extra_plat", _plat);
                startActivity(minuteurIntent);
            }
        });
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
