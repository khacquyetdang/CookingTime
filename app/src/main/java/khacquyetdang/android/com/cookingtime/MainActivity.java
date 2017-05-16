package khacquyetdang.android.com.cookingtime;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import khacquyetdang.android.com.cookingtime.database.Categorie;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {


    private List<Categorie> categories;
    private CategoriesAdapter categoriesAdapter;
    private RecyclerView categoriesRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        setUpCategories();
        categoriesAdapter = new CategoriesAdapter(MainActivity.this);

        categoriesRecyclerView = (RecyclerView) findViewById(R.id.categoryRecyclerView);
        //categoriesRecyclerView.setItemAnimator(new DefaultItemAnimator());
        categoriesRecyclerView.setAdapter(categoriesAdapter);
        categoriesRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }

    public void setUpCategories() {
        categories = new ArrayList<>(
                asList(new Categorie("LES CLASSIQUES",
                                "Pâtes, riz, frites, oeufs et bien d’autres classiques dont les temps de cuisson sont invariables."
                                , R.drawable.categorie_classiques),
                        new Categorie("BARBECUE",
                                "Retrouvez ici tous les temps de cuisson pour vos viandes et poissons au barbecue."
                                , R.drawable.categorie_bbq),
                        new Categorie("LES GRATINS",
                                "Apprenez comment réaliser la cuisson parfaite d’un gratin en obtenant une texture dorée et croustillante."
                                , R.drawable.categorie_gratin),
                        new Categorie("LES DESSERTS",
                                "Les temps de cuissons en pâtisserie sont précis et très important. La cuisson des desserts n’aura plus aucun secret pour vous !"
                                , R.drawable.categorie_desserts),
                        new Categorie("LES VIANDES",
                                "Pour connaître le temps de cuisson d’une viande saignante, bleue ou bien cuite."
                                , R.drawable.categorie_viandes),
                        new Categorie("LES LÉGUMES ET FÉCULENTS",
                                "Découvrez les techniques de cuissons des légumes et féculents au four, à l’eau, à la vapeur, à la poêle, etc..."
                                , R.drawable.categorie_legumes),
                        new Categorie("POISSONS ET FRUITS DE MER",
                                "La pêche a été bonne ? Retrouvez ici les temps de cuissons adéquats pour vos poissons et crustacés."
                                , R.drawable.categorie_fruit_de_mer)
                )
        );

    }

    /**
     * Created by Yasir Ameen on 1/26/2016.
     */
    public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.myViewHolder> {

        private final LayoutInflater inflater;

        public CategoriesAdapter(Context context){
            inflater = LayoutInflater.from(context);
        }
        @Override
        public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = inflater.inflate(R.layout.categorie_row,parent,false);
            myViewHolder holder = new myViewHolder(view);

            return holder;
        }

        @Override
        public void onBindViewHolder(myViewHolder holder, int position) {
            Categorie categorie  = categories.get(position);
            holder._title.setText(categorie.getTitle());
            holder._desc.setText(categorie.getDescription());
            holder._imgview.setImageResource(categorie.getImgUrl());
        }


        @Override
        public int getItemCount() {
            return categories.size();
        }

        public class myViewHolder extends RecyclerView.ViewHolder {

            ImageView _imgview;
            TextView _title;
            TextView _desc;

            public myViewHolder(View itemView) {
                super(itemView);
                _imgview = (ImageView) itemView.findViewById(R.id.categorieImg);
                _title = (TextView) itemView.findViewById(R.id.categorieTitle);
                _desc = (TextView) itemView.findViewById(R.id.categorieDesc);
            }
        }
    }
}
