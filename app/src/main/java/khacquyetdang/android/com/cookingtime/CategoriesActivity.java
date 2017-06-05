package khacquyetdang.android.com.cookingtime;

import android.content.Context;
import android.content.Intent;
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
import khacquyetdang.android.com.cookingtime.database.DataBaseManager;
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

        categories = DataBaseManager.getInstance().getCategories();
        categoriesAdapter = new CategoriesAdapter(CategoriesActivity.this);
        categoriesRecyclerView = (RecyclerView) findViewById(R.id.categoryRecyclerView);
        //categoriesRecyclerView.addItemDecoration(new DividerItemDecoration(CategoriesActivity.this));
        categoriesRecyclerView.setItemAnimator(new DefaultItemAnimator());
        categoriesRecyclerView.setAdapter(categoriesAdapter);
        categoriesRecyclerView.setLayoutManager(new LinearLayoutManager(CategoriesActivity.this));
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
            final Categorie categorie  = categories.get(position);
            holder._title.setText(categorie.getTitle());
            holder._desc.setText(categorie.getShortDescription());
            holder._imgview.setImageResource(categorie.getImgUrl());
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent platActivityIntent = new Intent(CategoriesActivity.this, PlatsActivity.class);
                    platActivityIntent.putExtra("categorie", categorie);
                    startActivity(platActivityIntent);
                }
            });
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
