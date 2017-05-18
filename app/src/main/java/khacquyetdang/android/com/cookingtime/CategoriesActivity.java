package khacquyetdang.android.com.cookingtime;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
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
import khacquyetdang.android.com.cookingtime.database.Plat;

import static java.util.Arrays.asList;

public class CategoriesActivity extends AppCompatActivity {


    private List<Categorie> categories;
    private CategoriesAdapter categoriesAdapter;
    private RecyclerView categoriesRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        setUpCategories();
        categoriesAdapter = new CategoriesAdapter(CategoriesActivity.this);

        categoriesRecyclerView = (RecyclerView) findViewById(R.id.categoryRecyclerView);
        //categoriesRecyclerView.addItemDecoration(new DividerItemDecoration(CategoriesActivity.this));
        categoriesRecyclerView.setItemAnimator(new DefaultItemAnimator());
        categoriesRecyclerView.setAdapter(categoriesAdapter);
        categoriesRecyclerView.setLayoutManager(new LinearLayoutManager(CategoriesActivity.this));
    }

    public void setUpCategories() {


        Plat oeufDur = new Plat("CUISSON D’UN OEUF DUR",
                "Dur dur la cuisson des oeufs ? Mais non c’est pas si compliqué, suivez le guide !",
                R.drawable.plat_oeufs_dur);


        Plat oeufALaCoque = new Plat("OEUF À LA COQUE",
                "Classique parmi les classique, découvrez quelle est le bon temps de cuisson pour un oeuf à la coque...",
                R.drawable.plat_oeufs_brouilles);

        Plat frites = new Plat("Les Frites",
                "Au four ou à la friteuse, un classique incontournable pour les enfants commas les plus grands… Apprenez à les faire dorées et croustillantes!",
                R.drawable.plat_frites);


        Plat riz = new Plat("LE RIZ",
                "Élément de base de nombreux plats asiatiques ou espagnols, le riz peut se cuire de différentes manières selon son origine (blanc, jaune, long…).",
                R.drawable.plat_riz);


        Plat pate = new Plat("LES PÂTES",
                "Pas besoin d’être italien pour réussir la cuisson de ses pâtes, « al dente » ou non. Fermes ou fondantes, à vous de choisir.",
                R.drawable.plat_pates);


        Plat croqueMonsieur = new Plat("CUISSON D’UN OEUF DUR",
                "Du pain de mie, du jambon, du fromage et une noix de beurre… L’indémodable sandwich toasté, au four ou à la poêle !",
                R.drawable.plat_oeufs_dur);


        Plat oeufPoche = new Plat("OEUF POCHÉ",
                "Découvrez les astuces pour réussir à tous les coups la cuisson d’un oeuf poché.",
                R.drawable.plat_oeuf_poche);


        Plat quicheLorraine = new Plat("QUICHE LORRAINE",
                "Les ingrédients pour une quiche lorraine « inratable »",
                R.drawable.plat_quiche_lorraine);


        Plat oeufBrouille = new Plat(" LES OEUFS BROUILLÉS",
                "Les oeufs brouillés, un grand classique de la cuisine New-Yorkaise et anglo-saxonne !",
                R.drawable.plat_oeufs_brouilles);


        Plat coquillettes = new Plat(" LES OEUFS BROUILLÉS",
                "Les oeufs brouillés, un grand classique de la cuisine New-Yorkaise et anglo-saxonne !",
                R.drawable.plat_oeufs_brouilles);

        ArrayList<Plat> classiquePlats = new ArrayList<>(asList(
                oeufDur, oeufALaCoque, frites, riz, pate, croqueMonsieur, oeufPoche, quicheLorraine, oeufBrouille, coquillettes
        ));
        Categorie classiqueCategorie = new Categorie("LES CLASSIQUES",
                "Pâtes, riz, frites, oeufs et bien d’autres classiques dont les temps de cuisson sont invariables."
                , R.drawable.categorie_classiques);
        classiqueCategorie.setPlats(classiquePlats);
        categories = new ArrayList<>(
                asList(classiqueCategorie,
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

    public class DividerItemDecoration extends RecyclerView.ItemDecoration {

        private Drawable mDivider;

        public DividerItemDecoration(Context context) {
            mDivider = context.getResources().getDrawable(R.drawable.line_divider);
        }

        @Override
        public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
            int left = parent.getPaddingLeft();
            int right = parent.getWidth() - parent.getPaddingRight();

            int childCount = parent.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = parent.getChildAt(i);

                RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();

                int top = child.getBottom() + params.bottomMargin;
                int bottom = top + mDivider.getIntrinsicHeight();

                mDivider.setBounds(left, top, right, bottom);
                mDivider.draw(c);
            }
        }
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
