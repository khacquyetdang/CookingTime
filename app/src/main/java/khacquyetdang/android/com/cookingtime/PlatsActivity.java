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
        platsRecyclerView.setHasFixedSize(true);
        platsRecyclerView.setItemViewCacheSize(20);
        platsRecyclerView.setDrawingCacheEnabled(true);
        platsRecyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);
        //platsRecyclerView.addItemDecoration(new DividerItemDecoration(CategoriesActivity.this));
        platsRecyclerView.setItemAnimator(new DefaultItemAnimator());
        platsRecyclerView.setAdapter(platsAdapter);
        platsRecyclerView.setLayoutManager(new GridLayoutManager(PlatsActivity.this, 2));
    }

    public void setUpPlats() {


        Plat oeufDur = new Plat("Oeuf dur",
                "Dur dur la cuisson des oeufs ? Mais non c’est pas si compliqué, suivez le guide !",
                "<div><h1>Cuisson d’un oeuf dur</h1>" +
                        "<h2>Temps de cuisson des oeufs durs</h2>" +
                        "<p><strong>L’oeuf dur et l’oeuf mayonnaise</strong> en particulier est un <a href=\"http://www.tempsdecuisson.net/les-classiques\">grand classique</a> de la cuisine française. Indémodable même si il est de plus en plus difficile à trouver dans les bistrots parisiens, il est parfait en salade, à l’apéro ou en ballade à l’occasion d’un picnic. Pas si facile à cuire, l’oeuf dur doit être à température parfaite pour ne pas avoir un jaune trop sec mais surtout pas mollet. Comme souvent en cuisine le temps sera donc votre allié le plus précieux.</p><p>Pour <strong>réussir la cuisson d’un oeuf dur</strong> il faut le faire bouillir avec sa coquille pendant <strong>10 minutes</strong> en moyenne.</p><p>Dans les faits, en fonction de la taille de l’oeuf*, de sa température (l’oeuf sort-il du frigo ou non ?) et de sa date de ponte (frais ou moins frais),<strong> le temps de cuisson d’un oeuf dur</strong> pourra varier entre <strong>8 et 11 minutes</strong>.</p><p>En général, préférez pas assez de cuisson à trop de cuisson car cela risquerait de faire verdir le jaune tandis que le blanc sera&nbsp;vraisemblablement&nbsp;cuit au bout de 3 à 4 minutes seulement.</p><p>Pensez également à ajouter un peu de vinaigre et de sel dans l’eau de cuisson et à bien refroidir les oeufs sous un jet d’eau froide une fois les 10 minutes écoulées.</p><p><em>Si vous le pouvez, pensez à toujours préparer vos oeufs à température ambiante.</em></p><h2>Calibre et taille des œuf : Il y a 4 calibres pour l’œuf :</h2><ul><li>Cuisson oeuf dur petit calibre : moins de 53g (plutôt 9 minutes de cuisson)</li><li>Cuisson oeuf dur moyen calibre : de 53 à 63g</li><li>Cuisson oeuf dur gros calibre : de 63 à 73g</li><li>Cuisson oeuf dur très gros calibre : plus de 73g (plutôt 11 minutes de cuisson)</li></ul></div>"
                , R.drawable.plat_oeuf_dur, 10);


        Plat oeufALaCoque = new Plat("Oeuf à la coque",
                "Classique parmi les classique, découvrez quelle est le bon temps de cuisson pour un oeuf à la coque...",
                "<div><h1>Oeuf à la coque</h1><h2>L’oeuf à la coque : plaisir des grands et des petits</h2><p>Ah, l’oeuf à la coque.&nbsp;Mouillette, fromage, saumon fumé, beurre, du sel et du poivre pour diner léger ou au petit déjeuner c’est toujours un plaisir pour les grands comme pour les petits. A condition de réussir une cuisson parfaite !</p><h3>Le règle des 3-6-9</h3><p style=\"text-align: justify;\">La règle la plus simple et la plus facile à retenir pour la cuisson des oeufs, est la règle «&nbsp;3-6-9.&nbsp;» Soit <strong>3 minutes dans l’eau bouillante</strong> pour obtenir un <strong>oeuf coque</strong>. Puis 6 pour un oeuf mollet et enfin 9 à 10 minutes pour&nbsp;la cuisson d’un&nbsp;<a href=\"http://www.tempsdecuisson.net/les-classiques/oeuf-dur\">oeuf dur</a>.</p><h3 style=\"text-align: justify;\">Oui mais…</h3><p>En fonction de la taille de l’oeuf et de sa température, il n’est pas rare que 3 min s’avère insuffisantes pour une cuisson parfaite. Aussi, si votre frigo est très froid et que l’oeuf en sort tout juste, 3’30 à 4 minutes peuvent&nbsp;parfaitement faire l’affaire surtout avec&nbsp;les gros oeufs fermiers. Le jaune ne sera pas cuit en dessous de 5 minutes et le blanc simplement blanchit mais pas encore figé.</p><p style=\"text-align: justify;\"><em>Pour une cuisson rapide et facile <strong>d’un oeuf à la coque</strong> ne pas hésitez à plonger l’oeuf dans une eau salée et vinaigrée. Le sel accélère l’ébullition et le vinaigre solidifie la coquille de l’oeuf et coagule le blanc en cas de fissure.</em></p></div>", R.drawable.plat_oeuf_cocotte, 3);

        Plat frites = new Plat("Les Frites",
                "Au four ou à la friteuse, un classique incontournable pour les enfants commas les plus grands… Apprenez à les faire dorées et croustillantes!",
                "<div><h1>Les frites</h1><h2>Temps de cuisson des frites</h2><p>Pour obtenir des frites croustillantes et bien dorées il est recommandé de les cuire en deux fois. D’abord <strong>10 à 15 minutes</strong> avec une huile moyennement chaude (130-150°C) puis <strong>3 à 4 minutes</strong> dans de l’huile très chaude (180°C) pour les faire dorer.</p><p>Si vous avez le temps, n’hésitez pas à faire tremper préalablement vos frites fraîches dans de l’eau chaude légèrement salées.</p></div>", R.drawable.plat_frites, 10);


        Plat riz = new Plat("Le riz",
                "Élément de base de nombreux plats asiatiques ou espagnols, le riz peut se cuire de différentes manières selon son origine (blanc, jaune, long…).",
                "<div><h1>Le riz</h1><h2>Quel est le temps de cuisson pour le riz ?</h2><p>&nbsp;</p><h3>À la Créole<strong>&nbsp;</strong></h3><p>Mettre un grand volume d’eau à bouillir et on faite cuire le riz à découvert. La cuisson se fait à l’eau frémissante salée pendant <strong>15 à 20 minutes</strong> après reprise de l’ébullition.</p><h3>Façon Pilaf</h3><p>Idéale pour cuire cuire un riz long grain. Mettre à chauffer une cuillère à soupe de beurre ou d’huile dans une casserole. Verser le riz et tourner à l’aide d’une spatule en bois. Lorsque le riz devient translucide, verser un verre d’eau chaude, et laisser frémir. Couvrir et laisser cuire à couvert de <strong>15 à 20 minutes.</strong></p></div>",
                R.drawable.plat_riz_blanc, 15);


        Plat pate = new Plat("Les pâtes",
                "Pas besoin d’être italien pour réussir la cuisson de ses pâtes, « al dente » ou non. Fermes ou fondantes, à vous de choisir.",
                "<div><h1>Les pâtes</h1><h2>Temps de cuisson des pâtes</h2><p>Pour <strong>100g de pâtes</strong>, compter un litre d’eau. Ajouter une poignée de sel de cuisine ou de sel de me au moment ou l’eau bout.</p><p>Immergez vos pâtes dans l’eau bouillante en une seule fois. Remuez avec une fourchette en bois et racler le fond car les pâtes s’y accrochent en début de cuisson. La cuisson se fait à feu vif dans une casserole découverte. Comptez traditionnellement <strong>entre 8 et 15 minutes</strong>. Ne pas accorder une confiance aveugle aux temps mentionnés sur les paquets de pâtes et goûtez vous-même pendant la cuisson.</p><h2>Quel est le temps de cuisson pour des pâtes «&nbsp;al dente&nbsp;» ?</h2><p>En italien «&nbsp;al dente&nbsp;» se traduit en français par «&nbsp;sous la dent&nbsp;» ce qui signifie que vos pâtes doivent être fermes et fondantes à la fois. Il n’y a pas de secret miracle et la meilleure solution pour une bonne cuisson est de goûter régulièrement les pâtes pendant la cuisson.</p><p>Une fois cuite, vos pâtes seront également <a href=\"http://www.tempsdecuisson.net/les-gratins/gratin-de-pates\" title=\"Gratin de pâtes\">délicieuse en gratin.</a></p></div>",
                R.drawable.plat_spaghetty, 8);


        Plat croqueMonsieur = new Plat("Croque monsieur",
                "Du pain de mie, du jambon, du fromage et une noix de beurre… L’indémodable sandwich toasté, au four ou à la poêle !",
                "<div><h1>Croque monsieur</h1><h2>Quel est le temps de cuisson pour le croque monsieur ?</h2><p>&nbsp;</p><h3>&nbsp;À la poêle</h3><p>Faites chauffer votre poêle et faîte fondre une noix de beurre. Une fois la poêle chaude, laisser cuire à feu doux environ <strong>8 minutes</strong>, 4 minutes de chaque côté.</p><h3>Au four</h3><p>Faire cuire environ <strong>10 minutes</strong> à 200°, retourner les croques monsieur à mi cuisson.</p></div>"
                ,
                R.drawable.plat_croque_monsieur, 8);


        Plat oeufPoche = new Plat("Oeuf poché",
                "Découvrez les astuces pour réussir à tous les coups la cuisson d’un oeuf poché.",
                "<div><h1>Oeuf poché</h1><h2>Cuisson d’un oeuf poché</h2><p>Contrairement aux idées reçues, la cuisson de l’oeuf poché n’est pas si difficile que ça ! Reste que cette dernière ne &nbsp;tolère aucun écart de cuisson…</p><p>Suivez nos conseils et maîtrisez comme un chef la cuisson de l’oeuf poché !</p><h3>Cuisson de l’oeuf poché à l’eau</h3><p style=\"text-align: justify;\">Faire frémir de l’eau. Ne pas la saler mais ajouter du vinaigre (1 à 2 cuillères à soupe) ou mettre du citron (1 à 2 cuillères à soupe) pour acidifier l’eau.</p><p style=\"text-align: justify;\">Faire un tourbillon dans l’eau et y casser l’oeuf.</p><p style=\"text-align: justify;\">Laisser cuire <strong>3 minutes</strong>, récupérer délicatement l’oeuf puis le poser sur du papier absorbant</p><p style=\"text-align: justify;\"><em>Conseil : Pour réussir la cuisson de vos oeufs pochés, préférez tout de même des oeufs de bonne qualité, comme des oeufs certifiés biologiques, dont la meilleure consistance vous facilitera la tâche.</em></p></div>",
                R.drawable.plat_oeuf_poche, 3);


        Plat quicheLorraine = new Plat("Quiche lorraine",
                "Les ingrédients pour une quiche lorraine « inratable »",
                "<div><h1>Recette quiche lorraine facile</h1><p><em>Avant de commencer,&nbsp;pré-chauffer le four à 220° ou thermostat 6-7 (chaleur tournante si possible)</em></p><h2>Les ingrédients pour une quiche lorraine «&nbsp;inratable&nbsp;»</h2><ul><li>une pâte à tarte feuilletée bio (vous pouvez la faire vous-même mais c’est assez complexe), bien meilleure qu’une pâte à tarte brisée…1er secret</li><li>3 oeufs</li><li>une brique de crème liquide entière ou allégée (comme il vous plaira)</li><li>250g de gruyère râpé</li><li>200g de lardons (fumés ou pas, comme vous avez)</li><li>du poivre</li><li>pas de sel, les lardons font le boulot…</li></ul><p><em>Pensez toujours à bien sortir du réfrigérateur tous vos ingrédients une heure avant la cuisson.</em></p><h2>Les étapes de la recette de la quiche lorraine</h2><ol><li>Vous avez déjà pré-chauffé votre four…</li><li>Etaler la pâte feuilletée dans un moule à tarte. Retrousser les bords et piquer avec une fourchette</li><li>Dans un bol, casser les oeufs un par un, en fouettant bien chaque oeuf. 1 oeuf je fouette, j’ajoute 1 deuxième oeuf, je fouette…</li><li>Ajouter la crème liquide et une pincée de poivre</li><li>Ajouter une poignée de gruyère râpé dans le bol (2ème secret)</li><li>Remplir la pâte feuilletée avec votre préparation</li><li>Ajouter le gruyère sur tout le diamètre de la pâte</li><li>Enfourner environ 20 minutes. En surveillant.</li></ol><p>La quiche peut gonfler sur le dessus. Vous pouvez la sortir et percer la bulle avant de servir si c’est le cas.<br>Sinon, laissez dorer en surveillant.</p><p>Déguster avec une salade verte.</p><p>A noter : recette très facile pour les enfants qui peuvent réaliser toutes les étapes dès 4 ans !</p><p><strong>Temps de cuisson de la quiche lorraine : 20 minutes</strong></p><p>3ème secret : en petit cube pour l’apéro, en petites parts pour un pique-nique…</p></div>",
                R.drawable.plat_quiche_lorraine, 20);


        Plat oeufBrouille = new Plat(" Les oeufs brouillés",
                "Les oeufs brouillés, un grand classique de la cuisine New-Yorkaise et anglo-saxonne !",
                "<div><h1>Les oeufs brouillés</h1><p><strong>Les oeufs brouillés</strong>, un grand classique de la cuisine New-Yorkaise et anglo-saxonne que vous pouvez consommer au petit-déjeuner, à l’occasion d’un brunch ou encore à l’occasion d’un diner rapide.</p><p>Tout d’abord, il faut savoir que les Américains les consomment presque toujours préparés avec de la crème fraîche ce qui n’est pas forcément le cas en France. A vous de voir à quel point vous avez besoin de calories ! Toujours est-il qu’il vous faudra environ 10 cl de crème liquides pour 6 oeufs, pour préparer des oeufs brouillés pour 4 personnes (en portion matinale) à l’américaine.</p><h2>Temps de cuisson</h2><p>Pour cuire et préparer vos oeufs brouillés <strong>il est très important de disposer d’une poêle anti-adhésive</strong> en très bon état et d’une cuillère ou d’une spatule en bois. Car le principe de la cuisson des oeufs brouillés est de mélanger en continu votre préparation (oeuf battus avec ou sans crème fraîche) dans une poêle légèrement beurrée (10 grammes environ). En gros, c’est comme pour faire une omelette mais sans figer les oeufs que vous devez brouiller à l’aide de votre cuillère ! Et ce, <strong>pendant 10 minutes environ</strong>. <em>N’oubliez pas de saler et poivrer largement.</em></p><h2>Recettes</h2><p>Les oeufs brouillés sont rarement servis natures. Ainsi n’hésitez pas à ajouter par exemple du fromage rapé à votre préparation (100 grammes pour 6), fromage qui peut accessoirement remplacer la crème pour éviter l’overdose de matière grasse ! Les oeufs brouillés s’accommodent également très bien de poivrons, <a href=\"https://www.tempsdecuisson.net/les-legumes-et-feculents/pomme-de-terre\">pommes de terres</a>, oignons, à l’image une fois encore des omelettes !&nbsp;Sans oublier les herbes aromatiques comme la ciboulette, la <a href=\"https://www.tempsdecuisson.net/dico/coriandre\">coriandre</a> ou le persil. <a href=\"https://www.tempsdecuisson.net/les-viandes\">Côté viande,</a> le bacon et les lardons seront les rois pour accompagner votre «&nbsp;breakfast&nbsp;» anglais.</p><h2>Dégustation</h2><p>Si l’oeuf brouillé peut tout à fait se déguster seul, il est également délicieux et on ne peut plus savoureux &nbsp;servi avec tomates fraiches coupé en tranches, une petite salade verte voire une mâche voire dégusté&nbsp;sur des toasts chauds. Par exemple réalisés à partir d’un pain légèrement brioché, un couple idéal pour le petit déjeuner !</p></div>",
                R.drawable.plat_oeufs_brouilles, 10);


        Plat coquillettes = new Plat("Les coquillettes",
                "La cuisson des coquillettes dans l’eau bouillante (salée) est très facile même si le temps de cuisson sera différent en fonction des marques et des goûts de chacun!",
                "<div><h1>Les coquillettes</h1><p>La cuisson des coquillettes dans l’eau bouillante (salée) est très facile même si le temps de cuisson sera différent en fonction des marques et des goûts de chacun. Cela dit, contrairement à <a href=\"https://www.tempsdecuisson.net/les-classiques/les-pates\">d’autres type de pâtes</a>, la cuisson al dente est recommandée pour les coquillettes qui supportent moins bien une cuisson trop longue.</p><h2>Temps de cuisson des coquillettes Panzani :</h2><ul><li>Ferme : 7 minutes</li><li>Al dente : 8 minutes</li><li>Fondante : 9 minutes</li></ul><h2>Temps de cuisson des coquillettes Barilla :</h2><ul><li>7 minutes</li></ul><p>&nbsp;</p></div>",
                R.drawable.plat_coquillettes_au_beurre, 8);

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
            Plat plat = plats.get(position);
            holder._name.setText(plat.getName());
            Picasso.with(getBaseContext()).load(plat.getImg_url()).fit().centerCrop().into(holder._imgview);
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
