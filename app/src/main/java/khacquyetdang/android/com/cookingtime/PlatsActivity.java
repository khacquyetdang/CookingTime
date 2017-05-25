package khacquyetdang.android.com.cookingtime;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import khacquyetdang.android.com.cookingtime.database.Plat;

import static java.util.Arrays.asList;

public class PlatsActivity extends AppCompatActivity {


    private List<Plat> plats;
    private PlatsAdapter platsAdapter;
    private RecyclerView platsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_plat_list);
        setUpPlats();
        platsAdapter = new PlatsAdapter(PlatsActivity.this);

        platsRecyclerView = (RecyclerView) findViewById(R.id.platsRecyclerView);
        //platsRecyclerView.addItemDecoration(new DividerItemDecoration(CategoriesActivity.this));
        platsRecyclerView.setItemAnimator(new DefaultItemAnimator());
        platsRecyclerView.setAdapter(platsAdapter);
        platsRecyclerView.setLayoutManager(new GridLayoutManager(PlatsActivity.this, 2));
    }

    public void setUpPlats() {


        Plat oeufDur = new Plat("Oeuf dur",
                "Dur dur la cuisson des oeufs ? Mais non c’est pas si compliqué, suivez le guide !",
                R.drawable.plat_oeuf_dur, 10);


        Plat oeufALaCoque = new Plat("Oeuf à la coque",
                "Classique parmi les classique, découvrez quelle est le bon temps de cuisson pour un oeuf à la coque...",
                R.drawable.plat_oeuf_cocotte, 3);

        Plat frites = new Plat("Les Frites",
                "Au four ou à la friteuse, un classique incontournable pour les enfants commas les plus grands… Apprenez à les faire dorées et croustillantes!",
                R.drawable.plat_frites, 10);


        Plat riz = new Plat("Le riz",
                "Élément de base de nombreux plats asiatiques ou espagnols, le riz peut se cuire de différentes manières selon son origine (blanc, jaune, long…).",
                R.drawable.plat_riz_blanc, 15);


        Plat pate = new Plat("Les pâtes",
                "Pas besoin d’être italien pour réussir la cuisson de ses pâtes, « al dente » ou non. Fermes ou fondantes, à vous de choisir.",
                R.drawable.plat_spaghetty, 8);


        Plat croqueMonsieur = new Plat("Croque monsieur",
                "Du pain de mie, du jambon, du fromage et une noix de beurre… L’indémodable sandwich toasté, au four ou à la poêle !",
                R.drawable.plat_croque_monsieur, 8);


        Plat oeufPoche = new Plat("Oeuf poché",
                "Découvrez les astuces pour réussir à tous les coups la cuisson d’un oeuf poché.",
                R.drawable.plat_oeuf_poche, 3);


        Plat quicheLorraine = new Plat("Quiche lorraine",
                "Les ingrédients pour une quiche lorraine « inratable »",
                R.drawable.plat_quiche_lorraine, 20);


        Plat oeufBrouille = new Plat(" Les oeufs brouillés",
                "Les oeufs brouillés, un grand classique de la cuisine New-Yorkaise et anglo-saxonne !",
                R.drawable.plat_oeufs_brouilles, 10 );


        Plat coquillettes = new Plat("Les coquillettes",
                "La cuisson des coquillettes dans l’eau bouillante (salée) est très facile même si le temps de cuisson sera différent en fonction des marques et des goûts de chacun!",
                R.drawable.plat_coquillettes_au_beurre,  8);

        ArrayList<Plat> classiquePlats = new ArrayList<>(asList(
                oeufDur, oeufALaCoque, frites, riz, pate, croqueMonsieur, oeufPoche, quicheLorraine, oeufBrouille, coquillettes
        ));
        plats = classiquePlats;
    }

    /**
     * Created by Yasir Ameen on 1/26/2016.
     */
    public class PlatsAdapter extends RecyclerView.Adapter<PlatsAdapter.myViewHolder> {

        private final LayoutInflater inflater;

        public PlatsAdapter(Context context) {
            inflater = LayoutInflater.from(context);
        }

        @Override
        public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = inflater.inflate(R.layout.plat_row, parent, false);
            myViewHolder holder = new myViewHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(myViewHolder holder, int position) {
            Plat plat= plats.get(position);
            holder._name.setText(plat.getName());
            Picasso.with(getBaseContext()).load(plat.getImg_url()).into(holder._imgview);
            String timeCooking = String.format(getResources().getString(R.string.time_cooking_in_minutes), plat.getTimesInMinutes());
            holder._time.setText(timeCooking);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }


        @Override
        public int getItemCount() {
            return plats.size();
        }

        public class myViewHolder extends RecyclerView.ViewHolder {

            ImageView _imgview;
            TextView _name;
            TextView _time;

            public myViewHolder(View itemView) {
                super(itemView);
                _imgview = (ImageView) itemView.findViewById(R.id.platImg);
                _name = (TextView) itemView.findViewById(R.id.platName);
                _time = (TextView) itemView.findViewById(R.id.platDuration);
            }
        }
    }
}
