package khacquyetdang.android.com.cookingtime;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by dang on 27/05/2017.
 */

public class PlatDetailActivity extends AppCompatActivity {
    private final String TAG = PlatDetailActivity.class.getClass().toString();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plat_detail);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.htab_toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Quiche Lorraine");
        }
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        final CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.htab_collapse_toolbar);

        try {
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.plat_riz_blanc);
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

        TextView textView = (TextView) findViewById(R.id.textContentView);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            textView.setText(Html.fromHtml("<div><h1>Recette quiche lorraine facile</h1><p><em>Avant de commencer,&nbsp;pré-chauffer le four à 220° ou thermostat 6-7 (chaleur tournante si possible)</em></p><h2>Les ingrédients pour une quiche lorraine «&nbsp;inratable&nbsp;»</h2><ul><li>une pâte à tarte feuilletée bio (vous pouvez la faire vous-même mais c’est assez complexe), bien meilleure qu’une pâte à tarte brisée…1er secret</li><li>3 oeufs</li><li>une brique de crème liquide entière ou allégée (comme il vous plaira)</li><li>250g de gruyère râpé</li><li>200g de lardons (fumés ou pas, comme vous avez)</li><li>du poivre</li><li>pas de sel, les lardons font le boulot…</li></ul><p><em>Pensez toujours à bien sortir du réfrigérateur tous vos ingrédients une heure avant la cuisson.</em></p><h2>Les étapes de la recette de la quiche lorraine</h2><ol><li>Vous avez déjà pré-chauffé votre four…</li><li>Etaler la pâte feuilletée dans un moule à tarte. Retrousser les bords et piquer avec une fourchette</li><li>Dans un bol, casser les oeufs un par un, en fouettant bien chaque oeuf. 1 oeuf je fouette, j’ajoute 1 deuxième oeuf, je fouette…</li><li>Ajouter la crème liquide et une pincée de poivre</li><li>Ajouter une poignée de gruyère râpé dans le bol (2ème secret)</li><li>Remplir la pâte feuilletée avec votre préparation</li><li>Ajouter le gruyère sur tout le diamètre de la pâte</li><li>Enfourner environ 20 minutes. En surveillant.</li></ol><p>La quiche peut gonfler sur le dessus. Vous pouvez la sortir et percer la bulle avant de servir si c’est le cas.<br>Sinon, laissez dorer en surveillant.</p><p>Déguster avec une salade verte.</p><p>A noter : recette très facile pour les enfants qui peuvent réaliser toutes les étapes dès 4 ans !</p><p><strong>Temps de cuisson de la quiche lorraine : 20 minutes</strong></p><p>3ème secret : en petit cube pour l’apéro, en petites parts pour un pique-nique…</p></div>",
                    Html.FROM_HTML_MODE_COMPACT));
        } else {
            textView.setText(Html.fromHtml("<div><h1>Recette quiche lorraine facile</h1><p><em>Avant de commencer,&nbsp;pré-chauffer le four à 220° ou thermostat 6-7 (chaleur tournante si possible)</em></p><h2>Les ingrédients pour une quiche lorraine «&nbsp;inratable&nbsp;»</h2><ul><li>une pâte à tarte feuilletée bio (vous pouvez la faire vous-même mais c’est assez complexe), bien meilleure qu’une pâte à tarte brisée…1er secret</li><li>3 oeufs</li><li>une brique de crème liquide entière ou allégée (comme il vous plaira)</li><li>250g de gruyère râpé</li><li>200g de lardons (fumés ou pas, comme vous avez)</li><li>du poivre</li><li>pas de sel, les lardons font le boulot…</li></ul><p><em>Pensez toujours à bien sortir du réfrigérateur tous vos ingrédients une heure avant la cuisson.</em></p><h2>Les étapes de la recette de la quiche lorraine</h2><ol><li>Vous avez déjà pré-chauffé votre four…</li><li>Etaler la pâte feuilletée dans un moule à tarte. Retrousser les bords et piquer avec une fourchette</li><li>Dans un bol, casser les oeufs un par un, en fouettant bien chaque oeuf. 1 oeuf je fouette, j’ajoute 1 deuxième oeuf, je fouette…</li><li>Ajouter la crème liquide et une pincée de poivre</li><li>Ajouter une poignée de gruyère râpé dans le bol (2ème secret)</li><li>Remplir la pâte feuilletée avec votre préparation</li><li>Ajouter le gruyère sur tout le diamètre de la pâte</li><li>Enfourner environ 20 minutes. En surveillant.</li></ol><p>La quiche peut gonfler sur le dessus. Vous pouvez la sortir et percer la bulle avant de servir si c’est le cas.<br>Sinon, laissez dorer en surveillant.</p><p>Déguster avec une salade verte.</p><p>A noter : recette très facile pour les enfants qui peuvent réaliser toutes les étapes dès 4 ans !</p><p><strong>Temps de cuisson de la quiche lorraine : 20 minutes</strong></p><p>3ème secret : en petit cube pour l’apéro, en petites parts pour un pique-nique…</p></div>"));
        }
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
