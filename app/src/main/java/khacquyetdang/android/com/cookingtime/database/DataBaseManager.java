package khacquyetdang.android.com.cookingtime.database;

import java.util.ArrayList;
import java.util.List;

import khacquyetdang.android.com.cookingtime.R;

import static java.util.Arrays.asList;

/**
 * Created by dang on 05/06/2017.
 */

public class DataBaseManager {
    private static final DataBaseManager ourInstance = new DataBaseManager();

    public static DataBaseManager getInstance() {
        return ourInstance;
    }

    public List<Categorie> getCategories() {
        return categories;
    }

    public void setCategories(List<Categorie> categories) {
        this.categories = categories;
    }

    private List<Categorie> categories;

    public DataBaseManager() {

        Categorie classiqueCategorie = new Categorie("Les classiques",
                "Pâtes, riz, frites, oeufs et bien d’autres classiques dont les temps de cuisson sont invariables."
                , R.drawable.categorie_classiques);
        Categorie dessertCategorie = new Categorie("Les desserts",
                "Les temps de cuissons en pâtisserie sont précis et très important. La cuisson des desserts n’aura plus aucun secret pour vous !"
                , R.drawable.categorie_desserts);
        Categorie viandeCategorie = new Categorie("Les viandes",
                "Pour connaître le temps de cuisson d’une viande saignante, bleue ou bien cuite."
                , R.drawable.categorie_viandes);
        Categorie gratinCategorie = new Categorie("Les gratins",
                "Apprenez comment réaliser la cuisson parfaite d’un gratin en obtenant une texture dorée et croustillante."
                , R.drawable.categorie_gratin);

        Categorie fruitdeMer = new Categorie("Poissons et fruits de mer",
                "La pêche a été bonne ? Retrouvez ici les temps de cuissons adéquats pour vos poissons et crustacés."
                , R.drawable.categorie_fruit_de_mer);
        fruitdeMer.setPlats(setupPoissonFruitDeMers());

        Categorie legumesCat = new Categorie("Les légumes et féculents",
                "Découvrez les techniques de cuissons des légumes et féculents au four, à l’eau, à la vapeur, à la poêle, etc..."
                , R.drawable.categorie_legumes);
        legumesCat.setPlats(setUpLegumes());


        gratinCategorie.setPlats(setUpGratin());
        classiqueCategorie.setPlats(setUpClassiquePlat());
        dessertCategorie.setPlats(setUpDessert());
        viandeCategorie.setPlats(setUpViandes());
        categories = new ArrayList<>(
                asList(classiqueCategorie,
                        dessertCategorie,
                        fruitdeMer,
                        gratinCategorie,
                        viandeCategorie,
                        legumesCat
                )
        );

    }

    public ArrayList<Plat> setUpClassiquePlat() {

        Plat oeufDur = new Plat("Oeuf dur",
                "Dur dur la cuisson des oeufs ? Mais non c’est pas si compliqué, suivez le guide !",
                "<div><h1>Cuisson d’un oeuf dur</h1><br>" +
                        "<h2>Temps de cuisson des oeufs durs</h2><br>" +
                        "<p><strong>L’oeuf dur et l’oeuf mayonnaise</strong> en particulier est un " +
                        "<a href=\"http://www.tempsdecuisson.net/les-classiques\">grand classique</a> de la cuisine française. Indémodable même si il est de plus en plus difficile à trouver dans les bistrots parisiens, il est parfait en salade, à l’apéro ou en ballade à l’occasion d’un picnic. Pas si facile à cuire, l’oeuf dur doit être à température parfaite pour ne pas avoir un jaune trop sec mais surtout pas mollet. Comme souvent en cuisine le temps sera donc votre allié le plus précieux.</p>" +
                        "<br><p>Pour <strong>réussir la cuisson d’un oeuf dur</strong> il faut le faire bouillir avec sa coquille pendant <strong>10 minutes</strong> en moyenne.</p>" +
                        "<br><p>Dans les faits, en fonction de la taille de l’oeuf*, de sa température (l’oeuf sort-il du frigo ou non ?) et de sa date de ponte (frais ou moins frais),<strong> le temps de cuisson d’un oeuf dur</strong> pourra varier entre <strong>8 et 11 minutes</strong>.</p><br>" +
                        "<p>En général, préférez pas assez de cuisson à trop de cuisson car cela risquerait de faire verdir le jaune tandis que le blanc sera&nbsp;vraisemblablement&nbsp;cuit au bout de 3 à 4 minutes seulement.</p>" +
                        "<br><p>Pensez également à ajouter un peu de vinaigre et de sel dans l’eau de cuisson et à bien refroidir les oeufs sous un jet d’eau froide une fois les 10 minutes écoulées.</p>" +
                        "<br><p><em>Si vous le pouvez, pensez à toujours préparer vos oeufs à température ambiante.</em></p>" +
                        "<br><h2>Calibre et taille des œuf : Il y a 4 calibres pour l’œuf :</h2><br>" +
                        "<ul>" +
                        "<li> Cuisson oeuf dur petit calibre : moins de 53g (plutôt 9 minutes de cuisson)</li>" +
                        "<li> Cuisson oeuf dur moyen calibre : de 53 à 63g</li>" +
                        "<li> Cuisson oeuf dur gros calibre : de 63 à 73g</li>" +
                        "<li> Cuisson oeuf dur très gros calibre : plus de 73g (plutôt 11 minutes de cuisson)</li>" +
                        "</ul>" +
                        "</div><br>"
                , R.drawable.plat_oeuf_dur, 10);


        Plat oeufALaCoque = new Plat("Oeuf à la coque",
                "Classique parmi les classique, découvrez quelle est le bon temps de cuisson pour un oeuf à la coque...",
                "<div><h2>L’oeuf à la coque : plaisir des grands et des petits</h2><br>" +
                        "<p>Ah, l’oeuf à la coque.&nbsp;Mouillette, fromage, saumon fumé, beurre, du sel et du poivre pour diner léger ou au petit déjeuner c’est toujours un plaisir pour les grands comme pour les petits. " +
                        "A condition de réussir une cuisson parfaite !</p>" +
                        "<br><h3>Le règle des 3-6-9</h3><br><p style=\"text-align: justify;\">" +
                        "La règle la plus simple et la plus facile à retenir pour la cuisson des oeufs, est la règle «&nbsp;3-6-9.&nbsp;» Soit " +
                        "<strong>3 minutes dans l’eau bouillante</strong> " +
                        "pour obtenir un <strong>oeuf coque</strong>. Puis 6 pour un oeuf mollet et enfin 9 à 10 minutes pour&nbsp;la cuisson d’un&nbsp;<a href=\"http://www.tempsdecuisson.net/les-classiques/oeuf-dur\">oeuf dur</a>." +
                        "</p><h3 style=\"text-align: justify;\">Oui mais…</h3><br>" +
                        "<p>En fonction de la taille de l’oeuf et de sa température, il n’est pas rare que 3 min s’avère insuffisantes pour une cuisson parfaite. Aussi, si votre frigo est très froid et que l’oeuf en sort tout juste, 3’30 à 4 minutes peuvent&nbsp;parfaitement faire l’affaire surtout avec&nbsp;les gros oeufs fermiers. Le jaune ne sera pas cuit en dessous de 5 minutes et le blanc simplement blanchit mais pas encore figé.</p>" +
                        "<br><p style=\"text-align: justify;\"><em>Pour une cuisson rapide et facile <strong>d’un oeuf à la coque</strong> ne pas hésitez à plonger l’oeuf dans une eau salée et vinaigrée. Le sel accélère l’ébullition et le vinaigre solidifie la coquille de l’oeuf et coagule le blanc en cas de fissure.</em></p></div>", R.drawable.plat_oeuf_cocotte, 3);

        Plat frites = new Plat("Les Frites",
                "Au four ou à la friteuse, un classique incontournable pour les enfants commas les plus grands… Apprenez à les faire dorées et croustillantes!",
                "<div><h1>Les frites</h1><br>" +
                        "<h2>Temps de cuisson des frites</h2><br>" +
                        "<p>Pour obtenir des frites croustillantes et bien dorées il est recommandé de les cuire en deux fois. D’abord <strong>10 à 15 minutes</strong> avec une huile moyennement chaude (130-150°C) puis <strong>3 à 4 minutes</strong> dans de l’huile très chaude (180°C) pour les faire dorer.</p>" +
                        "<br><p>Si vous avez le temps, n’hésitez pas à faire tremper préalablement vos frites fraîches dans de l’eau chaude légèrement salées.</p></div>", R.drawable.plat_frites, 10);


        Plat riz = new Plat("Le riz",
                "Élément de base de nombreux plats asiatiques ou espagnols, le riz peut se cuire de différentes manières selon son origine (blanc, jaune, long…).",
                "<div><h1>Le riz</h1><h2>Quel est le temps de cuisson pour le riz ?</h2><p>&nbsp;</p><h3>À la Créole<strong>" +
                        "<br>&nbsp;</strong></h3>" +
                        "<p>Mettre un grand volume d’eau à bouillir et on faite cuire le riz à découvert. La cuisson se fait à l’eau frémissante salée pendant <strong>15 à 20 minutes</strong> après reprise de l’ébullition.</p>" +
                        "<br><h3>Façon Pilaf</h3>" +
                        "<br><p>Idéale pour cuire cuire un riz long grain. Mettre à chauffer une cuillère à soupe de beurre ou d’huile dans une casserole. Verser le riz et tourner à l’aide d’une spatule en bois. Lorsque le riz devient translucide, verser un verre d’eau chaude, et laisser frémir. Couvrir et laisser cuire à couvert de <strong>15 à 20 minutes.</strong></p></div>",
                R.drawable.plat_riz_blanc, 15);


        Plat pate = new Plat("Les pâtes",
                "Pas besoin d’être italien pour réussir la cuisson de ses pâtes, « al dente » ou non. Fermes ou fondantes, à vous de choisir.",
                "<div><h2>Temps de cuisson des pâtes</h2>" +
                        "<br><p>Pour <strong>100g de pâtes</strong>, compter un litre d’eau. Ajouter une poignée de sel de cuisine ou de sel de me au moment ou l’eau bout.</p>" +
                        "<br><p>Immergez vos pâtes dans l’eau bouillante en une seule fois. Remuez avec une fourchette en bois et racler le fond car les pâtes s’y accrochent en début de cuisson.<br>" +
                        "La cuisson se fait à feu vif dans une casserole découverte. Comptez traditionnellement <strong>entre 8 et 15 minutes</strong>. Ne pas accorder une confiance aveugle aux temps mentionnés sur les paquets de pâtes et goûtez vous-même pendant la cuisson.</p>" +
                        "<br><h2>Quel est le temps de cuisson pour des pâtes «&nbsp;al dente&nbsp;» ?" +
                        "</h2><br><p>En italien «&nbsp;al dente&nbsp;» se traduit en français par «&nbsp;sous la dent&nbsp;» ce qui signifie que vos pâtes doivent être fermes et fondantes à la fois. " +
                        "Il n’y a pas de secret miracle et la meilleure solution pour une bonne cuisson est de goûter régulièrement les pâtes pendant la cuisson.</p>" +
                        "<br><p>Une fois cuite, vos pâtes seront également <a href=\"http://www.tempsdecuisson.net/les-gratins/gratin-de-pates\" title=\"Gratin de pâtes\">délicieuse en gratin.</a></p></div>",
                R.drawable.plat_spaghetty, 8);


        Plat croqueMonsieur = new Plat("Croque monsieur",
                "Du pain de mie, du jambon, du fromage et une noix de beurre… L’indémodable sandwich toasté, au four ou à la poêle !",
                "<div><h2>Quel est le temps de cuisson pour le croque monsieur ?</h2>" +
                        "<br><p>&nbsp;</p><h3>&nbsp;À la poêle</h3>" +
                        "<br><p>Faites chauffer votre poêle et faîte fondre une noix de beurre. Une fois la poêle chaude, laisser cuire à feu doux environ <strong>8 minutes</strong>, 4 minutes de chaque côté.</p>" +
                        "<br><h3>Au four</h3>" +
                        "<br><p>Faire cuire environ <strong>10 minutes</strong> à 200°, retourner les croques monsieur à mi cuisson.</p></div>"
                ,
                R.drawable.plat_croque_monsieur, 8);


        Plat oeufPoche = new Plat("Oeuf poché",
                "Découvrez les astuces pour réussir à tous les coups la cuisson d’un oeuf poché.",
                "<div><h2>Cuisson d’un oeuf poché</h2>" +
                        "<br><p>Contrairement aux idées reçues, la cuisson de l’oeuf poché n’est pas si difficile que ça ! Reste que cette dernière ne &nbsp;tolère aucun écart de cuisson…</p>" +
                        "<br><p>Suivez nos conseils et maîtrisez comme un chef la cuisson de l’oeuf poché !</p>" +
                        "<br><h3>Cuisson de l’oeuf poché à l’eau</h3>" +
                        "<br><p style=\"text-align: justify;\">Faire frémir de l’eau. Ne pas la saler mais ajouter du vinaigre (1 à 2 cuillères à soupe) ou mettre du citron (1 à 2 cuillères à soupe) pour acidifier l’eau.</p>" +
                        "<br><p style=\"text-align: justify;\">Faire un tourbillon dans l’eau et y casser l’oeuf.</p><p style=\"text-align: justify;\">Laisser cuire <strong>3 minutes</strong>, récupérer délicatement l’oeuf puis le poser sur du papier absorbant.</p>" +
                        "<br><p style=\"text-align: justify;\"><em>Conseil : Pour réussir la cuisson de vos oeufs pochés, préférez tout de même des oeufs de bonne qualité, comme des oeufs certifiés biologiques, dont la meilleure consistance vous facilitera la tâche.</em></p></div>",
                R.drawable.plat_oeuf_poche, 3);


        Plat quicheLorraine = new Plat("Quiche lorraine",
                "Les ingrédients pour une quiche lorraine « inratable »",
                "<div><h1>Recette quiche lorraine facile</h1>" +
                        "<br><p><em>Avant de commencer,&nbsp;pré-chauffer le four à 220° ou thermostat 6-7 (chaleur tournante si possible).</em></p>" +
                        "<br><h2>Les ingrédients pour une quiche lorraine «&nbsp;inratable&nbsp;»</h2>" +
                        "<br><ul><li>une pâte à tarte feuilletée bio (vous pouvez la faire vous-même mais c’est assez complexe), bien meilleure qu’une pâte à tarte brisée…1er secret</li><li>3 oeufs</li><li>une brique de crème liquide entière ou allégée (comme il vous plaira)</li><li>250g de gruyère râpé</li><li>200g de lardons (fumés ou pas, comme vous avez)</li><li>du poivre</li><li>pas de sel, les lardons font le boulot…</li></ul><p>" +
                        "<br><em>Pensez toujours à bien sortir du réfrigérateur tous vos ingrédients une heure avant la cuisson.</em></p>" +
                        "<br><h2>Les étapes de la recette de la quiche lorraine</h2>" +
                        "<br><ol><li>Vous avez déjà pré-chauffé votre four…</li><li>Etaler la pâte feuilletée dans un moule à tarte. Retrousser les bords et piquer avec une fourchette</li><li>Dans un bol, casser les oeufs un par un, en fouettant bien chaque oeuf. 1 oeuf je fouette, j’ajoute 1 deuxième oeuf, je fouette…</li><li>Ajouter la crème liquide et une pincée de poivre</li><li>Ajouter une poignée de gruyère râpé dans le bol (2ème secret)</li><li>Remplir la pâte feuilletée avec votre préparation</li><li>Ajouter le gruyère sur tout le diamètre de la pâte</li><li>Enfourner environ 20 minutes. En surveillant.</li></ol><p>La quiche peut gonfler sur le dessus. Vous pouvez la sortir et percer la bulle avant de servir si c’est le cas.<br>Sinon, laissez dorer en surveillant.</p><p>Déguster avec une salade verte.</p><p>A noter : recette très facile pour les enfants qui peuvent réaliser toutes les étapes dès 4 ans !</p>" +
                        "<br><p><strong>Temps de cuisson de la quiche lorraine : 20 minutes</strong></p>" +
                        "<br><p>3ème secret : en petit cube pour l’apéro, en petites parts pour un pique-nique…</p></div>",
                R.drawable.plat_quiche_lorraine, 20);


        Plat oeufBrouille = new Plat(" Les oeufs brouillés",
                "Les oeufs brouillés, un grand classique de la cuisine New-Yorkaise et anglo-saxonne !",
                "<div><h1>Les oeufs brouillés</h1>" +
                        "<br><p><strong>Les oeufs brouillés</strong>, un grand classique de la cuisine New-Yorkaise et anglo-saxonne que vous pouvez consommer au petit-déjeuner, à l’occasion d’un brunch ou encore à l’occasion d’un diner rapide.</p><p>Tout d’abord, il faut savoir que les Américains les consomment presque toujours préparés avec de la crème fraîche ce qui n’est pas forcément le cas en France. A vous de voir à quel point vous avez besoin de calories ! Toujours est-il qu’il vous faudra environ 10 cl de crème liquides pour 6 oeufs, pour préparer des oeufs brouillés pour 4 personnes (en portion matinale) à l’américaine.</p>" +
                        "<br><h2>Temps de cuisson</h2>" +
                        "<br><p>Pour cuire et préparer vos oeufs brouillés <strong>il est très important de disposer d’une poêle anti-adhésive</strong> en très bon état et d’une cuillère ou d’une spatule en bois. Car le principe de la cuisson des oeufs brouillés est de mélanger en continu votre préparation (oeuf battus avec ou sans crème fraîche) dans une poêle légèrement beurrée (10 grammes environ). En gros, c’est comme pour faire une omelette mais sans figer les oeufs que vous devez brouiller à l’aide de votre cuillère ! Et ce, <strong>pendant 10 minutes environ</strong>. <em>N’oubliez pas de saler et poivrer largement.</em></p>" +
                        "<br><h2>Recettes</h2>" +
                        "<br><p>Les oeufs brouillés sont rarement servis natures. Ainsi n’hésitez pas à ajouter par exemple du fromage rapé à votre préparation (100 grammes pour 6), fromage qui peut accessoirement remplacer la crème pour éviter l’overdose de matière grasse ! Les oeufs brouillés s’accommodent également très bien de poivrons, <a href=\"https://www.tempsdecuisson.net/les-legumes-et-feculents/pomme-de-terre\">pommes de terres</a>, oignons, à l’image une fois encore des omelettes !&nbsp;Sans oublier les herbes aromatiques comme la ciboulette, la <a href=\"https://www.tempsdecuisson.net/dico/coriandre\">coriandre</a> ou le persil. <a href=\"https://www.tempsdecuisson.net/les-viandes\">Côté viande,</a> le bacon et les lardons seront les rois pour accompagner votre «&nbsp;breakfast&nbsp;» anglais.</p>" +
                        "<br><h2>Dégustation</h2>" +
                        "<br><p>Si l’oeuf brouillé peut tout à fait se déguster seul, il est également délicieux et on ne peut plus savoureux &nbsp;servi avec tomates fraiches coupé en tranches, une petite salade verte voire une mâche voire dégusté&nbsp;sur des toasts chauds. Par exemple réalisés à partir d’un pain légèrement brioché, un couple idéal pour le petit déjeuner !</p></div>",
                R.drawable.plat_oeufs_brouilles, 10);


        Plat coquillettes = new Plat("Les coquillettes",
                "La cuisson des coquillettes dans l’eau bouillante (salée) est très facile même si le temps de cuisson sera différent en fonction des marques et des goûts de chacun!",
                "<div><h1>Les coquillettes</h1>" +
                        "<br><p>La cuisson des coquillettes dans l’eau bouillante (salée) est très facile même si le temps de cuisson sera différent en fonction des marques et des goûts de chacun. Cela dit, contrairement à <a href=\"https://www.tempsdecuisson.net/les-classiques/les-pates\">d’autres type de pâtes</a>, la cuisson al dente est recommandée pour les coquillettes qui supportent moins bien une cuisson trop longue.</p>" +
                        "<br><h2>Temps de cuisson des coquillettes Panzani :</h2>" +
                        "<br><ul><li>Ferme : 7 minutes</li><li>Al dente : 8 minutes</li><li>Fondante : 9 minutes</li></ul>" +
                        "<br><h2>Temps de cuisson des coquillettes Barilla :</h2><ul><li>7 minutes</li></ul><p>&nbsp;</p></div>",
                R.drawable.plat_coquillettes_au_beurre, 8);

        return new ArrayList<>(asList(
                oeufDur, oeufALaCoque, frites, riz, pate, croqueMonsieur, oeufPoche, quicheLorraine, oeufBrouille, coquillettes
        ));

    }

    public ArrayList<Plat> setUpViandes() {

        Plat platRotiDePorc = new Plat("Rôti de porc",
                "Une bonne cuisson pour le rôti de porc consiste à obtenir une viande à la fois tendre et juteuse. Retrouvez ici son temps de cuisson en cocotte.",
                "<div><h1>Cuisson roti de porc à la cocotte</h1><p>Faites revenir dans un peu d’huile de cuisson votre roti sur chaque face pour les colorer. <strong>Couvrez et laissez cuire à feu doux pendant 1h30 environ soit 90 minutes</strong>. Vous pouvez ajouter avant de couvrir et après avoir baissé le feu, une tomate coupée en deux et un oignon émincé ce qui vous permettra de réaliser facilement un jus qui se mariera parfaitement avec votre viande et son accompagnement.</p></div>"
                , R.drawable.plat_viande_roti_de_porc_en_cocotte_a_la_moutarde, 90);


        Plat platBoeufBourguignon = new Plat("Boeuf bourguignon",
                "L’une des viandes fondantes par excellence ! Une cuisson qui prend du temps, mais plus c’est long, plus c’est bon !",
                "<div><h1>Boeuf bourguignon</h1><h2>La cuisson du boeuf bourguignon</h2><p>Le boeuf bourguignon est une délicieuse viande de boeuf cuisinée au vin rouge de Bourgogne, et accompagnée généralement de <a title=\"Champignons de Paris\" href=\"http://www.tempsdecuisson.net/les-legumes-et-feculents/champignons-de-paris\">champignons</a>, lardons, petits oignons, <a title=\"Carottes\" href=\"http://www.tempsdecuisson.net/les-legumes-et-feculents/carottes\">carottes</a> et parfois de pommes de terre.</p><p>Originaire de Bourgogne, comme son nom l’indique, le boeuf bourguignon est un plat typiquement dominical, dont le succès réside avant tout dans une cuisson bien maîtrisée.</p><p>Deux méthodes pour la cuisson du boeuf bourguignon.</p><h3>Cuisson au four</h3><p>Utiliser une cocotte en fonte que vous couvrirez pendant la cuisson.</p><p>Prévoyez environ <strong>3 h</strong> de cuisson à <strong>150°C</strong>.</p><p><em>N’oubliez pas de remuer régulièrement la viande dans son plat.</em></p><h3>A feu doux</h3><p>La cuisson à feu doux est une méthode plus traditionnelle.</p><p>Préférer la cocotte en fonte à l’autocuiseur pour une ce mode de cuisson doux et lent.</p><p>Prévoir <strong>2 h</strong>&nbsp;de cuisson tout en remuant la viande de temps en temps.</p></div>",
                R.drawable.plat_viande_boeuf_bourguignon,
                120);

        Plat platPateSable
                = new Plat("Poulet",
                "Le poulet au four, un classique du repas du dimanche midi en famille ! Découvrez comment cuire votre poulet pour obtenir une viande moelleuse.",
                "<div><h1>Poulet</h1><h2>Temps de cuisson du poulet</h2><p>&nbsp;</p><h3>Cuisson au four</h3><p>Placez votre <strong>poulet</strong> dans un plat prévu pour une cuisson au four.</p><p>Versez un verre d’eau dans le fond du plat et faîte cuire votre poulet à chaleur tournante à <strong>180°</strong>. Si votre four ne le permet pas, envisagez plutôt une cuisson traditionnelle à <strong>210°.</strong></p><p>Il faut en moyenne compter <strong>30 mn par 500g</strong>.</p><p>Pour un poulet entier de plus d’1 kilo, comptez au moins <strong>1 h à 1h15</strong> de cuisson.</p><p>Arrosez régulièrement le poulet avec son propre jus. Il est très important que le poulet soit au final bien cuit mais jamais sec avec une chair qui reste tendre.</p><h3>Cuisson au barbecue ou à la plancha</h3><p>Pour une cuisson du poulet au barbecue, quelques minutes de cuisson suffisent. C’est un mode de cuisson qui permet d’obtenir une viande bien grillée et croustillante, et de parfumer agréablement la chair.</p><p>Saisir rapidement les morceaux de poulet à feu vif, des deux côtés.</p><h3>Cuisson à la cocotte</h3><p><strong></strong>Pour réaliser un délicieux poulet braisé, rien de mieux qu’une cuisson à la cocotte.</p><p>Cette cuisson consiste à saisir&nbsp;brièvement&nbsp;le poulet dans un peu de matière grasse, puis à le faire cuire lentement dans une cocotte couverte, à feu doux, accompagné d’un peu de liquide et des légumes de votre choix. Vous pouvez également ajouter des herbes aromatiques qui parfumeront la chair du poulet : ail, fines herbes,&nbsp;échalotes…</p><p>Comptez environ une bonne heure de cuisson, jusqu’à ce que la chair soit tendre.</p><h3>Cuisson à la poêle</h3><p>Découpez le poulet en morceaux réguliers, idéalement en lanières.</p><p>Dans une grande poêle, ou un wok, faites revenir les morceaux accompagnés des légumes de votre choix et d’un peu de matière grasse à feu vif pendant <strong>15 à 20 mn</strong>.</p><h3>Le poulet poché</h3><p>Ce type de cuisson consiste à faire revenir les morceaux de poulet (farcis ou non) dans un liquide proche de l’ébullition.</p><p>C’est une cuisson très saine, qui permet d’obtenir une viande très tendre et parfumée.</p><p>Commencez par déposer votre poulet dans un liquide froid, idéalement un bouillon parfumé de fines herbes par exemple.</p><p>Faire chauffer le tout en veillant à ne jamais faire bouillir le liquide.</p><p>Comptez environ <strong>1h30</strong> de cuisson pour un poulet complet, et laissez doucement refroidir la viande dans son jus.</p><p><strong>Cuisson au micro-ondes</strong></p><p>Pour les plus&nbsp;pressés, sachez qu’il est possible de cuire le poulet au micro-ondes, en veillant toutefois à ne pas dépasser<strong>&nbsp;20mn</strong>&nbsp;de cuisson.</p><p>Par exemple, pour une moitié de poulet, comptez&nbsp;<strong>15 mn</strong>&nbsp;de cuisson à pleine puissance en retournant la viande une fois.</p></div>",
                R.drawable.plat_viande_poulet, 20);


        Plat rotiDeBoeufAuFour = new Plat("Roti de boeuf au four",
                "Cuisson facile, idéale si on ne souhaite pas rester en cuisine pour surveiller sa viande !",
                "<div><h1>Cuisson roti de boeuf au four</h1><p>Avant de&nbsp;démarrer la cuisson de votre rôti de boeuf au four, et c’est toujours le cas pour <a title=\"Les viandes\" href=\"http://www.tempsdecuisson.net/les-viandes\">les viandes</a>,&nbsp;<strong>votre rôti doit être conservé à température ambiante environ une heure avant sa préparation. &nbsp;</strong><em>Les temps de cuisson seront toujours plus fiables avec une nourriture à bonne température.</em></p><h2>Préparation de la viande :</h2><p>Déposé votre roti dans un plat à four et badigeonné-le d’huile de cuisson à l’aide d’un pinceau : huile de tournesol, huile d’olive, huile de pépin de raisin.</p><h2>Temps de cuisson pour un roti saignant :</h2><p>Pour obtenir une cuisson saignante qui est la cuisson recommandée pour un bon roti de boeuf, enfournez-le dans un four préchauffé <strong>à 240 degrés</strong> pendant 24 minutes. Il faudra penser à retourner votre roti à mi-cuisson soit 12 minutes sur chaque face. Si vous avez un four électrique, privilégiez un mode de cuisson statique plutôt que ventilé (chaleur tournante) qui pourrait dessécher la viande.</p><h2>Quel&nbsp;temps de cuisson pour un roti de boeuf au four&nbsp;:</h2><table><tbody><tr><td>Cuisson roti de boeuf 500 grammes saignant :</td><td>20 minutes (2 x 10)</td></tr><tr><td>24 minutes (2 x 12)</td><td>pour faire cuire un roti de 800 grammes;</td></tr><tr><td>26 minutes (2 x 13)</td><td>pour faire cuire un roti de 1 kilo;</td></tr><tr><td>30 minutes (2 x 15)</td><td>pour faire cuire un roti de 1,5 kilos;</td></tr><tr><td>40 minutes (2 x 20)</td><td>pour faire cuire un roti de 2 kilos.</td></tr></tbody></table><h2>Combien de temps cuire pour une cuisson moins saignante ?</h2><p>Pour un roti à point :</p><ul><li><strong>Cuisson roti de boeuf 500 grammes à point : 24 minutes (2 x 12)</strong></li><li>30 minutes (2 x 15) pour faire cuire un roti de 800 grammes;</li><li>34 minutes (2 x 17) pour faire cuire un roti de 1 kilo;</li><li>40 minutes (2 x 20) pour faire cuire un roti de 1,5 kilos;</li><li>50 minutes (2 x 25) pour faire cuire un roti de 2 kilos.</li></ul><p>Pour un roti bien cuit :</p><ul><li><strong>Cuisson roti de boeuf 500 grammes bien cuit : 30 minutes (2 x 15)</strong></li><li>36 minutes (2 x 18) pour faire cuire un roti de 800 grammes;</li><li>40 minutes (2 x 20) pour faire cuire un roti de 1 kilo;</li><li>50 minutes (2 x 25) pour faire cuire un roti de 1,5 kilos;</li><li>60 minutes (2 x 30) pour faire cuire un roti de 2 kilos.</li></ul><h2>Avant de servir</h2><p>Afin de déguster une viande bien tendre il est très important de laisser reposer votre roti après la cuisson en le couvrant d’aluminium pendant une dizaine de minutes avant de la découper et de la servir. Vous pouvez poser le roti sur une grille posée sur une assiette afin de récupérer un maximum de jus.</p><p>Pour obtenir du jus, déglacez votre plat de cuisson avec un petit verre d’eau en prenant bien soin de gratter avec une palette en bois. Mélanger la sauce obtenue avec le jus récupéré dans l’opération précédente.</p></div>",
                R.drawable.plat_viande_roti_de_boeuf_au_four, 15);


        Plat rotiDeBoeufAlaCocotte = new Plat("Roti de boeuf à la cocotte",
                "Faire cuire un roti de boeuf à la cocotte est une très bonne idée car cela permet de servir une viande saignante et grillée.",
                "<div><h1>Roti de boeuf à la cocotte</h1><p>Faire cuire un roti de boeuf à la cocotte est une très bonne idée car cela permet de servir une viande saignante et grillée. Pour y parvenir vous allez dans un premier temps saisir votre roti sur chaque face dans une cocotte très chaude dans laquelle vous aurez placé un peu d’huile de pépins de raisin ou à défaut de l’huile d’olive.</p><p><strong>Combien de temps ?</strong></p><p>Une fois bien coloré, couvrez votre roti et laissez cuire à feu moyen <strong>pendant 15 minutes environ pour un roti saignant, 20 minutes pour un roti à point et 25 minutes pour un roti bien cuit</strong>. Ces temps de cuisson sont valables pour un roti d’environ 1 kilo, à diminuer légèrement pour une pièce plus petite et inversement.</p><p><em>Comptez généralement 200 grammes par personne. </em></p><p>Pour assaisonner votre rôti de boeuf, vous pouvez le piquer avec&nbsp;<a title=\"Ail\" href=\"http://www.tempsdecuisson.net/dico/ail\">quelques petites gousses d’ail</a>&nbsp;en les insérant au coeur du rosbeef à l’aide d’une petite lame.<br>Pour l’accompagnement, des<a title=\"Haricots verts\" href=\"http://www.tempsdecuisson.net/les-legumes-et-feculents/haricots-verts\"> haricots verts</a> feront parfaitement l’affaire, tout comme des <a title=\"Pomme de terre\" href=\"http://www.tempsdecuisson.net/les-legumes-et-feculents/pomme-de-terre\">pommes de terres</a> sous n’importe quelle forme.</p></div>",
                R.drawable.plat_viande_roti_de_boeuf_a_la_cocotte, 8);


        Plat steakHache = new Plat("Steak haché",
                "Le steak haché c’est pour les petits et les grands !",
                "<div><h1>Steak haché</h1><p><strong>La cuisson du steak haché frais</strong> n’est pas particulièrement technique mais il est toujours important de les cuire à cœur et d’éviter de les manger trop saignant.</p><p>Ainsi on privilégiera toujours une cuisson sur un grill à viande à feu vif ou dans une poêle anti-adhésive (en évitant le <a href=\"http://www.tempsdecuisson.net/les-viandes/magret-de-canard/cuisson-au-barbecue\">barbecue</a>) sans graisse, car cela permettra de bien croûter le steak puis de l’attendrir sur un feu plus doux.</p><p>Trois minutes par face à feu moyen suffiront donc pour terminer la cuisson. (5 pour les steaks hachés surgelés.) Comme pour <a href=\"http://www.tempsdecuisson.net/les-viandes\">les autres viandes rouges</a>, n’hésitez pas à <em>laisser reposer quelques minutes à couvert avant de servir.</em></p><h2>La cuisson du steak haché frais* en détail :</h2><dl><dt>Cuisson saignante</dt><dd>1 minute par face.</dd><dt>Cuisson à point</dt><dd>2 minutes par face.</dd><dt>Cuisson à coeur, bien cuit.</dt><dd>3 minutes par face.</dd></dl><p>*frais = non surgelés (hachés par votre boucher ou conditionnés sous vide)</p></div>"
                ,
                R.drawable.plat_viande_steak_hache, 2);


        Plat canard = new Plat("Canard",
                "Avec le bon temps de cuisson du canard au four, réalisez de nombreuses recettes pour le réveillon !",
                "<div><h1>Canard</h1><h2>Temps de cuisson du canard</h2><p>Très apprécié sur les tables de Noël, le canard est une viande exquise qui permet de nombreuses recettes toute aussi délicieuses les unes que les autres !</p><h3>Cuisson au four</h3><p>Cuire un canard au four est simple, veillez toutefois à bien respecter les temps de cuisson afin de ne pas&nbsp;dessécher&nbsp;la viande.</p><p>Commencez par préchauffer votre four 15 à 20mn à<strong> 220°C</strong> (thermostat 6).</p><p>Placez la volaille dans un plat, accompagnez-la des ingrédients de votre choix <em>(<a title=\"Romarin\" href=\"http://www.tempsdecuisson.net/dico/romarin\">romarin</a>, herbes de Provence…)</em>, ajoutez l’équivalent d’un verre d’eau dans le fond puis enfournez le tout pendant <strong>50 mn</strong>.</p><p><strong>A partir de cette cuisson, vous pouvez réaliser de nombreuses recettes de canard rôti au four :</strong></p><ul><li>Canard rôti à l’orange (avec des zestes d’orange)</li><li>Canard rôti au citron (avec des zestes de citron)</li><li>Canard rôti au cognac (accompagné de quelques cuillères de bon cognac !)</li><li>Canard rôti à la mode&nbsp;provençale&nbsp;(en l’accompagnant d’olives)</li></ul><p><em><em>La viande de canard&nbsp;s’accommode&nbsp;très bien avec le sucré, n’hésitez pas à l’accompagner de fruits.</em></em></p><p><em><em></em>Bon appétit !</em></p></div>",
                R.drawable.plat_viande_canard_au_four, 3);


        Plat rosbeef = new Plat("Rosbeef",
                "Quel est le temps et la meilleure méthode de cuisson d’un rosbeef ?",
                "<div><h1>Cuisson rosbeef</h1><h2>Réussir la cuisson d’un rosbeef</h2><p>Le rosbeef doit être consommé saignant, sinon il devient sec et difficile à apprécier à sa juste valeur, d’autant moins avec un rosbeef de qualité que vous paierez facilement 25 euros le kilo chez votre boucher. Aussi, évitez de préparer un rosbeef si vous n’êtes pas entourés d’amateur de viande rouge. Par ailleurs, pour être certain de réussir votre cuisson, ne perdez pas de vu que le temps de cuisson de votre rosbeef dépend également de sa température. Vous pouvez donc le sortir du réfrigérateur avant de le préparer, il n’en sera que meilleur. <strong>1 heure au moins.</strong></p><blockquote><p>à retenir : Le rosbeef doit être servi saignant<br>et préparé à température ambiante</p></blockquote><h2>Meilleur technique de cuisson</h2><p>Pour obtenir une viande tendre et cuite à coeur, <strong>vous privilégierez toujours la cuisson du rosbeef au four</strong>. A&nbsp;haute température et si possible dans un four à chaleur tournante qui permet&nbsp;d’obtenir une cuisson plus homogène de votre rosbeef.</p><p>Cela étant, puisque la cuisson n’est jamais très longue, il peut être intéressant de démarrer la cuisson du rosbeef sur le feu, dans une poêle ou un caquelon adapté, et à feu très vif. L’intérêt d’une telle pré-cuisson sera d’obtenir un «&nbsp;croutage&nbsp;» rapide du rosbeef qui lui permettra de mieux tenir à la cuisson au four mais également de le colorer. Pour ce faire, on utilisera une huile adaptée que de l’huile de pépin de raison. Relativement neutre en bouche et qui tient bien la cuisson. Les plus gourmands pourront la mélanger avec une noix de beurre…</p><h2>Quel temps de cuisson ?</h2><p>Une fois doré sur chaque face, le rosbeef pourra alors être enfournée dans un four bien chaud (autour de 250°C, thermostat 8) pour<strong> une durée de 10 minutes maximum&nbsp;pour un rosbeef de 500 grammes</strong>. 5&nbsp;minutes&nbsp;de plus soit un quart d’heure au total pour un rosbeef&nbsp;de<strong> 1kg (15 minutes).</strong> Vous pouvez ensuite ajouter 1 minutes pour 100 grammes supplémentaires <strong>(environ 20 minutes pour un rosbeef de 1,5kg)</strong>.</p><h2>10 minutes maximum pour un rosbeef de 500 grammes.</h2><p>Une fois la cuisson terminée, pensez bien à emballer votre rosbeef dans du papier d’aluminium pendant une dizaine de minutes, il n’en sera que plus savoureux !</p><p>Bonne dégustation.</p><p>&nbsp;</p></div>",
                R.drawable.plat_viande_rosbeef, 20);


        Plat piece_a_fondue = new Plat("Pièce à fondue",
                "La pièce à fondue est un morceau de boeuf très tendre et très maigre généralement coupé dans le rumsteak (partie arrière/haute du boeuf) que vous trouverez sans problème dans votre supermarché habituel ou chez le boucher.",
                "<div><h1>Pièce à fondue</h1><p><strong>La pièce à fondue</strong> est un morceau de boeuf très tendre et très maigre généralement coupé dans le&nbsp;rumsteak (partie arrière/haute du boeuf) que vous trouverez&nbsp;sans problème&nbsp;dans votre supermarché habituel ou chez le boucher. Vendue autour de 20 euros le kilo,&nbsp;elle est évidemment tout indiquée pour la fondue bourguignonne, préalablement&nbsp;découpée en dés.</p><p>Mais avec des qualités gustatives proche du <a href=\"https://www.tempsdecuisson.net/les-viandes/filet-de-boeuf\">filet</a> vous pouvez tout à fait à adopter une autre méthode de cuisson pour votre pièce à fondue généralement calibrée autour de 400 grammes.</p><ul><li>Par exemple cuite comme<a href=\"https://www.tempsdecuisson.net/les-viandes/roti-de-boeuf/cuisson-a-la-cocotte\"> un roti en cocotte</a> : 5 à 6 minutes par face pas plus.</li><li>Préparée en tartare de boeuf.</li><li>Juste saisi&nbsp;en lamelle par exemple façon boeuf teriyaki.</li></ul><p>Bon appétit !</p></div>",
                R.drawable.plat_viande_piece_a_fondue, 120);


        Plat tournedos = new Plat("Tournedos",
                "Cuire un tournedos ? Rien de plus simple, un aller retour sur la poêle pour les amateur de viande saignante, quelques minutes de plus pour les autres.",
                "<div><h1>Tournedos</h1><h2>Temps de cuisson des tournedos</h2><p style=\"text-align: justify;\">Pour cuire vos tournedos, commencer par chauffer votre poêle avec une noix matière grasses. Pour une cuisson saignante, faites revenir vos tournedos <strong>4 minutes</strong> de chaque côté. Compter <strong>2 minutes</strong> pour une cuisson bleue et entre <strong>7 et 8 minutes</strong> pour une viande «&nbsp;à point.&nbsp;»</p></div>",
                R.drawable.plat_viande_tournedos, 8);

        Plat filetMignonAgneau = new Plat("Filet mignon d’agneau",
                "Découvrez nos conseils et astuces pour réaliser un filet mignon d’agneau parfait.",
                "<div><h1>Filet mignon d’agneau</h1><h2>Le temps de cuisson du filet mignon d’agneau</h2><p>Le filet d’agneau est une viande composée de deux parties qui se trouvent de part et d’autre de l’échine, dans la région lombaire de l’agneau. Riche en protéine, mais aussi en zinc et en vitamines B, c’est une viande appréciée en toute saison, dont la&nbsp;saveur délicate fait d’elle une viande festive que l’on sert notamment à Pâques.</p><p>Le filet d’agneau est une viande savoureuse dont la cuisson doit respecter la tendresse, découvrez comment procéder selon le mode de cuisson choisi.</p><h3>Cuisson au four</h3><p>Le temps de cuisson du filet mignon d’agneau au four est proportionnel à son poids.</p><p>Comptez <strong>25mn</strong> de cuisson <strong>par kilo</strong> de viande.</p><p>Enfournez le filet d’agneau à <strong>200°C, </strong>assaisonné de thym et de romarin par exemple.</p><h3>Cuisson à la poêle</h3><p>Le filet mignon d’agneau poêlé est un délice !</p><p>Faites revenir votre viande dans une poêle pendant <strong>30 à 35 mn</strong>, accompagnée d’une noisette de beurre ou d’un filet d’huile d’olive.</p><p>Vous pouvez en profiter pour faire revenir toute sorte de légumes avec votre viande, comme des carottes par exemple.</p><p><em>Le jus de cuisson peut être utilisé pour réaliser une sauce.</em></p></div>",
                R.drawable.plat_viande_filet_agneau_au_four, 25);

        Plat magretDeCanard = new Plat("Magret de canard au barbecue",
                "La cuisson parfaite d’un magret de canard consiste à faire fondre la graisse tout en gardant une peau croustillante et une viande rosée.",
                "<div><h1>Cuisson au barbecue</h1><h2>Temps de cuisson du magret de canard au barbecue</h2><p><em>Pensez toujours à sortir vos magrets du frigo une heure avant leur préparation.</em></p><h3>Combien de temps ?</h3><p><strong>La cuisson du magret de canard au&nbsp;barbecue (gaz, charbon ou modèle de type Weber – on évitera l’électrique )</strong>&nbsp;est rapide sur forte braise ou à feu très vif. Pas plus de&nbsp;<strong>5 à 6 minutes</strong>&nbsp;par face même pour des gros magrets. Toutefois, il convient de faire attention à l’excès de graisse qui aura tendance à s’enflammer sous la viande. Il convient donc généralement de réduire autant que possible la partie graisseuse.</p><h3>Une alternative : les brochettes</h3><p>Mieux, n’hésitez à réaliser des brochettes avec votre magret en le coupant en huit, d’abord en deux dans la longueur puis en quatre dans la largeur. En ne laissant que le gras nécessaire à la cuisson. Pour parfumer vos magrets n’hésitez pas à ajouter des morceaux de fruits à vos brochettes (pruneaux, abricots, etc..) que vous pourrez servir avec la semoule.</p><p>Pour la cuisson des brochettes de magret de canard, 8 à 10 minutes tout au plus en les retournant très régulièrement. Attention au canard trop cuit qui devient alors très fort en bouche !</p><p><em>Si vous utilisez un barbecue classique (à charbon) pour la cuisson de vos magrets, évitez de trop le charger en viande et munissez vous d’un peu d’eau pour arroser les braises en cours de cuisson.</em></p><h3>Dressage</h3><p>Vous pouvez servir le magret entier ou servir un demi magret par assiette. Si vous le servez émincé en tranche, pensez à chauffer vos assiettes préalablement car le magret tranché refroidit très vite</p></div>",
                R.drawable.plat_viande_magret_canard_bbc, 10);

        return new ArrayList<>(asList(
                platPateSable, rotiDeBoeufAuFour, rotiDeBoeufAlaCocotte,
                filetMignonAgneau, platBoeufBourguignon, platRotiDePorc,
                steakHache, canard, rosbeef, piece_a_fondue, tournedos, magretDeCanard
        ));

    }


    public ArrayList<Plat> setUpDessert() {

        Plat platCremeBrulee = new Plat("Crème brûlée",
                "Apprenez comment réussir la cuisson d’une crème brûlée avant de la passée au chalumeau.",
                "<div><h1>Crème brûlée</h1>" +
                        "<h2>Temps de cuisson de la crème brûlée</h2>" +
                        "<p style=\"text-align: justify;\">" +
                        "Une fois votre préparation terminée, mettez la crème dans des ramequins et enfourner au four à <strong>105°</strong> (thermostat 3-4) pendant <strong>1h15 à 1h30</strong>.</p><p style=\"text-align: justify;\">Pour vérifier la cuisson, assurez-vous que la crème ne soit plus liquide, juste prise. Saupoudrer ensuite de sucre roux et faite le griller au chalumeau ou au four position grill.</p></div>"
                , R.drawable.plat_creme_brulee, 10);


        Plat platCremeAnglaise = new Plat("Crème anglaise",
                "Pour accompagner tous vos dessert, concevez vous-même votre propre crème anglaise.",
                "<div><h1>Crème anglaise</h1><h2>Temps de cuisson d’une crème anglaise</h2>" +
                        "<p style=\"text-align: justify;\">" +
                        "Placez la casserole sur un feu moyen sans cesser de remuer le mélange à l’aide d’une cuillère en bois. La cuisson doit atteindre très précisément la température de <strong>85°C</strong>, mais pas plus, sinon elle sera trop épaisse et des grumeaux commenceront à se former.</p><p style=\"text - align:justify; \">Si vous ne disposez pas d’un thermomètre pour contrôler la température, comptez <strong>entre 2 et 3 minutes de cuisson</strong> pour 350 grammes de crème anglaise. La crème doit épaissir légèrement et devenir plus claire.</p><p style=\"text - align:justify;\">Pour vérifier la cuisson, vous pouvez passer votre doigt sur le dos de la spatule en bois nappée de crème : si la trace reste visible et que la crème ne coule pas dans le sillon que vous avez tracé, la crème est prête.</p></div>",
                R.drawable.plat_creme_anglaise,
                3);

        Plat platPateSable
                = new Plat("Pâte sablée",
                "Élément de base de beaucoup de dessert, découvrez ici le temps de cuisson idéal d’une pâte sablée.",
                "<div><h1>Pâte sablée</h1><h2 style=\"text-align: justify;\">" +
                        "Temps de cuisson d’une pâte sablée</h2><p style=\"text-align: justify;\">" +
                        "Pour obtenir une pâte sablée croustillante et bien dorée, placer la pâte dans un plat à tarte et percer la de petits trous à l’aide d’une fourchette.</p>" +
                        "<p style=\"text-align: justify;\">" +
                        "Placer ensuite votre plat à tarte dans votre four à mi-hauteur à <strong>180°C</strong> durant " +
                        "<strong>15 à 20 minutes</strong>. " +
                        "Contrôler votre pâte au bout de 12 minutes de cuisson pour vérifier qu’elle ne brûle pas. " +
                        "Si tel est le cas, réduisez le thermostat de votre four pour la fin de la cuisson.</p></div>",
                R.drawable.plat_pate_sable, 10);


        Plat platFlanAuxOeufs = new Plat("Flan aux oeufs",
                "Une préparation classique et simple. Pas de quoi en faire tout un flan !",
                "<div><h1>Flan aux oeufs</h1><h2>Temps de cuisson d’un flan aux oeufs</h2><p style=\"text-align: justify;\">Commencer par préchauffer votre four à 150° (thermostat 5). Une fois la préparation de votre votre flan terminée, faite le cuire au four pendant <strong>45 minutes</strong> à <strong>150°</strong>.</p><p style=\"text-align: justify;\">Pour vérifier la cuisson, planter un couteau. S’il ressort sans trace, la cuisson est terminée. Laisser ensuite reposer votre flan au réfrigérateur pendant plusieurs heures.</p></div>",
                R.drawable.plat_dessert_flan_aux_oeufs, 15);


        Plat plat_dessert_panettone = new Plat("Panettone",
                "Découvrez combien de temps cuit le panettone, dessert italien traditionnel de Noël...",
                "<div><h2>La cuisson du panettone</h2><p>&nbsp;</p><p>Le panettone est un dessert originaire d’Italie, plus précisément du Piémont. C’est une brioche fourrée aux raisons secs, aux fruits confits et aux zestes d’agrumes, qui fait partie des desserts&nbsp;traditionnels&nbsp;de&nbsp;Noël.</a></p><p>Sa préparation simple nécessite tout de même un respect absolu du temps de cuisson, pour obtenir un panettone moelleux comme une brioche à l’intérieur, et bien doré à l’extérieur.</p><h3>CUISSON AU FOUR</h3><p>Commencez par enfourner votre préparation à<strong> 200°C</strong> (thermostat 6/7), puis laissez cuire le panettone<strong> 10 mn.</strong><br>Ensuite, baissez votre &nbsp;four à <strong>150°C</strong> (thermostat 5) et continuez à faire cuire votre dessert <strong>30 à 40 mn</strong> maximum.</p><p><em>Le panetonne est délicieux accompagné de confiture… Bon appétit !</em></p></div>",
                R.drawable.plat_dessert_panettone, 40);


        Plat dessertFondantChocolat = new Plat("Fondant au chocolat",
                "Au four ou au micron-ondes, un dessert qui fait fondre à tous les coups...",
                "<div><h1>Fondant au chocolat</h1><h2 style=\"text-align: justify;\">Temps de cuisson pour un fondant au chocolat</h2><p>&nbsp;</p><h3>Cuisson au four</h3><p style=\"text-align: justify;\">Enfournez votre fondant au chocolat à mi-hauteur dans votre four et comptez&nbsp;<strong>12 minutes</strong> de cuisson thermostat 7 (210°).</p><p style=\"text-align: justify;\">Vérifiez régulièrement la cuisson de vos fondants en plongeant une lame de couteau dans votre chocolat. Si des morceaux de fondant juste cuits s’accrochent à la lame, c’est que la cuisson est terminée.</p><p style=\"text-align: justify;\"><strong>Au micro-ondes :</strong> compter environ <strong>4 minutes</strong> à 900 watts.</p></div>",
                R.drawable.plat_dessert_fondant_chocolat, 8);


        Plat financiers = new Plat("Financiers",
                "Très simple à réaliser chez soi et rapidement cuit, le financier est une petite pâtisserie très appréciée des gourmands.",
                "<div><h1>Financiers</h1>" +
                        "<h2>Temps de cuisson du financier</h2>" +
                        "<p>Le financier est une petite patisserie relativement grasse mais très apprécié des gourmands. On trouve des financiers dans de nombreuses boulangerie mais ce sont des petits gateaux très simples à réaliser chez soi.<br>" +
                        "Souvent à base d’amandes, la pâte peut-être agrémentée de noisettes mais également de fruits. " +
                        "Financiers aux fruit-rouges ou aux poires par exemple.</p><h3>Cuisson au four</h3><p>Composés d’une grande quantité de beurre les financiers doivent cuire suffisamment longtemps pour se tenir une fois sortis du four mais auront tendance à brûler rapidement sur le dessus dans un four très chaud. Il conviendra donc cuire vos financiers entre <strong>10 et 12 minutes dans un four à 180° (four 6 à 7)</strong>.</p><p>Bien entendu cela dépendra aussi et surtout de la taille de votre moule.</p></div>"
                ,
                R.drawable.plat_desset_financier, 8);


        Plat crumble = new Plat("Crumble",
                "Du classique crumble aux pommes au plus audacieux crumble salé, la réussite de ce dessert simple à réaliser tient avant tout à une cuisson parfaitement réussie !",
                "<div><h1>Crumble</h1><h2>Temps de cuisson du crumble</h2><p>Mélange de pâte sablée et de fruits fondants, le crumble est le dessert idéal pour finir un repas automnal. En effet, cette recette originaire de Grande-Bretagne se marie parfaitement avec les fruits de la fin de l’été, pommes, coings, figues ou rhubarbe… La version la plus appréciée reste cependant le classique crumble aux pommes agrémenté de <a title=\"Cannelle\" href=\"http://www.tempsdecuisson.net/dico/cannelle\">cannelle</a>.</p><p>Si la préparation du crumble est facile à réaliser, obtenir une pâte croquante et dorée tout en conservant des fruits fondants nécessite de bien maîtriser sa cuisson.</p><p>Commencez par déposer vos fruits au fond d’un plat, et émiettez votre pâte sablée au dessus.</p><p>Laissez ensuite cuire votre crumble au four pendant<strong> 30 mn</strong> à 210°C.</p><p><em>Pour obtenir un crumble doré à souhait, activez le grill de votre four pendant les 5 dernières minutes de sa cuisson !</em></p></div>",
                R.drawable.plat_dessert_crumble, 3);


        Plat clafoutis = new Plat("Clafoutis",
                "Du classique clafoutis aux cerises en passant par celui à la pomme, apprenez comment réussir la cuisson de ce dessert qui s’accommode volontiers avec tous les fruits de la saison",
                "<div><h1>Clafoutis</h1><h2>Le temps de cuisson du clafoutis</h2><p>Disposez vos fruits au fond d’un moule beurré et fariné, puis versez votre préparation dessus.</p><p>Enfournez le tout à 180° pendant <strong>20 à 25 mn.</strong></p><p><em>Attendez que votre clafoutis&nbsp;tiédisse&nbsp;avant de le démouler, puis saupoudrez-le de sucre glace. Bon appétit !</em></p></div>",
                R.drawable.plat_dessert_raspberry_clafoutis, 20);


        Plat meringue = new Plat("Meringue",
                "La préparation de la meringue est facile mais sa cuisson subtile dépend du type de four utilisé… De la classique meringue française à la redoutable meringue italienne, maîtrisez la cuisson de votre meringue comme un chef !",
                "<div><h1>Meringue</h1><h2>Temps de cuisson de la meringue</h2>" +
                        "<p>Pour obtenir une meringue blanche et bien ferme, la cuisson doit être parfaitement réalisée.</p>" +
                        "<h3>La meringue française</h3><p>Après avoir réalisé votre préparation, préchauffez votre four à 180°, puis déposez vos meringues sur du papier sulfurisé en formant des petits tas espacés les uns des autres.</p><p><strong>Cuisson au&nbsp;four électrique :&nbsp;</strong>placez votre plaque <strong>2h </strong>dans la partie basse du four.</p><p><strong>Cuisson au four à gaz :</strong>&nbsp;laissez cuire vos meringues pendant <strong>2h</strong> dans la partie haute du four.</p><p><em>Dans les deux cas,</em> <em>aérez le four toutes les 20 mn en ouvrant la porte.</em></p><h3>La meringue suisse</h3><p>Formez vos petits tas de meringues sur du papier sulfurisé et laissez-les sécher pendant <strong>30mn</strong> tout en préchauffant le four à 120°.</p><p>Quelque soit le type de four, enfournez votre plaque à mi-hauteur et laissez cuire vos meringues pendant <strong>1h30</strong>.</p><p><em>Toutes les 30 mn, ouvrez la porte de votre four pour laisser s’échapper la vapeur.</em></p><p>Vos meringues sont cuites si elles se détachent facilement, sinon retournez-les et laissez-les cuire <strong>20 mn </strong>supplémentaires.</p><h3>Cuisson pochée</h3><p>Il est aussi possible de cuire ses meringues en les pochant.</p><p>Chauffez une grande casserole d’eau jusqu’à ce que celle-ci frémisse sans jamais bouillir.</p><p>Déposez délicatement à la surface de l’eau de petites quenelles de meringues à l’aide de deux cuillères à soupe.</p><p>Laissez-les cuire <strong>30s</strong>, retournez-les puis&nbsp;refaites-les cuire <strong>30s</strong>.</p><p>Egouttez-les sur du papier absorbant. C’est prêt !</p></div>",
                R.drawable.plat_dessert_meringue, 120);


        Plat platdessertPommesAuFour = new Plat("Pommes au four",
                "Rapides à préparer, les pommes au four doivent leur croquant et leur saveur à la maîtrise parfaite de leur cuisson.\n" +
                        "Suivez nos conseils pour réaliser de délicieuses pommes cuites à coeur !",
                "<div><h1>Pommes au four</h1><h2>Temps de cuisson des pommes au four</h2><p><strong>Pour un dessert facile et toujours délicieux, optez pour les pommes au four !&nbsp;</strong></p><p>Préchauffez votre four <strong>thermostat 6</strong>.</p><p>Pellez et&nbsp;équeutez vos pommes, puis disposez-les dans un plat à four.</p><p>Versez dessus un grand verre d’eau et saupoudrez généreusement le tout de sucre.</p><p>Vous n’avez plus qu’à enfournez vos pommes pendant <strong>30 mn</strong>.</p><p><em>Servez-les bien chaudes !</em></p><p><strong>Cuisson des pommes au Babycook</strong></p><p>Cuire des pommes au Babycook est simple, coupez-les en morceaux puis laissez-les cuire avec le <strong>niveau 2</strong> de l’appareil, c’est-à-dire pendant <strong>10 mn</strong>.</p></div>",
                R.drawable.plat_dessert_pompe_au_four, 8);

        Plat platdesserttarteauPommes = new Plat("Tarte aux pommes",
                "La cuisson de la tarte aux pommes doit être maîtrisée pour obtenir une pâte croquante et des pommes bien dorées. Découvrez le temps de cuisson de ce dessert toujours autant apprécié.",
                "<div><h1>Tarte aux pommes</h1><h2>Temps de cuisson de la tarte aux pommes</h2><p>Après avoir préparé votre tarte aux pommes, enfournez-la <strong>30 à 40 mn</strong> dans un four préchauffé <strong>à 180 degrés</strong>.</p><p><em>Pour bien faire dorer vos pommes, ajoutez quelques morceaux de beurre dessus !</em></p></div>",
                R.drawable.plat_dessert_tarte_aux_pommes, 8);


        Plat platdessertCremeAuCaramel = new Plat("Crème au caramel",
                "Un dessert simple et enfantin qui requiert une cuisson bien précise ! Découvrez ici comment cuire parfaitement vos crèmes au caramel.",
                "<div><h1>Crème au caramel</h1><h2>Temps de cuisson de la crème au caramel</h2>" +
                        "<p>Pendant la préparation de vos crèmes au caramel, préchauffez votre four à <strong>150°C.</strong></p><p><strong></strong>Déposez dedans un plat à moitié rempli d’eau et assez large pour contenir tous vos ramequins.</p><p>Une fois votre préparation terminée et vos ramequins remplis, disposez-les dans le plat et laissez-les cuire au bain-marie pendant<strong> 20 mn.</strong></p><p><em>Après la cuisson placez vos crèmes au caramel au frais pendant quelques heures… Bon appétit !</em></p></div>",
                R.drawable.plat_dessert_creme_au_caramel, 8);


        Plat platdessertBananeFlambe = new Plat("Banane flambée",
                "Découvrez le temps de cuisson idéal des bananes flambées, véritable dessert de chef !",
                "<div><h1>Banane flambée</h1>" +
                        "<h2>Temps de cuisson des bananes flambées</h2>" +
                        "<p>Si les bananes ne se flambent qu’au rhum, leur cuisson peut être réalisée de deux façons :</p><h3>Cuisson à la&nbsp;poêle</h3><p>Faîtes fondre un peu de beurre dans une poêle, déposez vos bananes entières accompagnées de sucre et de jus de citron.</p><p>Laissez-les cuir <strong>6 à 8 mn</strong> à feu moyen, puis <strong>4 à 5 mn</strong> à feu vif.</p><p>Coupez votre feu, arrosez les bananes de rhum et faîtes-les flamber jusqu’à ce que les flammes s’éteignent d’elles-même.</p><h3>Cuisson au four</h3><p>Préchauffez votre four à <strong>220°C.</strong></p><p>Sur une plaque saupoudrée de sucre en poudre, déposez vos bananes coupées sur la longueur.</p><p>Rajoutez du jus de citron, et de petits morceaux de beurre dessus.</p><p>Enfournez le tout <strong>7 à 10 mn.</strong></p><p><em>A la sortie du four, faites flamber vos bananes avec du rhum, jusqu’à la fin des flammes.</em></p></div>",
                R.drawable.plat_dessert_banane_flambee, 8);

        Plat platdessertBrownie = new Plat("Brownie",
                "Découvrez combien de temps cuire le brownie, ce délicieux gâteau au chocolat venu d’Outre Atlantiqueé",
                "<div><h1>Brownie</h1><h2>La cuisson du brownie</h2><p>Originaires d’Outre Atlantique, les brownies sont des carrés chocolatés et plats, &nbsp;délicieusement fondant à l’intérieur, et terriblement craquant à l’extérieur…</p><p>Un dessert savoureux dont la réussite tient autant au choix d’un chocolat de bonne qualité, qu’à une cuisson minutieuse. Bien que&nbsp;brève, cette dernière doit être bien surveillée afin d’obtenir un brownie moelleux et ferme à la fois.</p><h3>Cuisson au four</h3><p>Après avoir préchauffé votre four à <strong>180°C</strong>, thermostat 6, enfournez votre préparation dans un plat carré pendant <strong>15 à 20 mn.</strong></p><p>Attention à ne pas dépasser le temps de cuisson.</p><p><em>Bon appétit !</em></p></div>",
                R.drawable.plat_dessert_brownie, 15);


        Plat platGateauAuYaourt = new Plat("Gâteau au yaourt",
                "Découvrez le temps de cuisson idéal de ce délicieux dessert si facile à réaliser.",
                "<div><h1>Gâteau au yaourt</h1><h2>Temps de cuisson du gâteau au yaourt</h2><p>Pendant la préparation de votre&nbsp;pâte&nbsp;à gâteau, préchauffez votre four à <strong>200°C</strong>, thermostat 6.</p><p>N’oubliez pas de bien beurrer votre moule, puis verser dedans votre préparation.</p><p>Vous n’avez plus qu’à l’enfourner pendant <strong>30 mn</strong> et le tour est joué !</p><p><em>Vérifiez au bout de 20 mn la cuisson de votre&nbsp;gâteau.&nbsp;Enfoncez un couteau dedans, si rien ne reste collé sur la lame c’est qu’il est déjà temps de le sortir.</em></p><p>&nbsp;</p></div>",
                R.drawable.plat_dessert_gateau_au_yaourt, 30);


        return new ArrayList<>(asList(
                platCremeBrulee, platdessertBananeFlambe,
                platdessertBrownie, platGateauAuYaourt,
                platCremeAnglaise, platPateSable, platFlanAuxOeufs, dessertFondantChocolat,
                platdesserttarteauPommes, platdessertCremeAuCaramel,
                financiers, crumble, clafoutis, meringue, platdessertPommesAuFour, plat_dessert_panettone
        ));

    }

    public ArrayList<Plat> setUpGratin() {

        Plat gratinDauphinois = new Plat("Dauphinois",
                "Originaire de la région du Dauphiné, c’est la star des gratins. Découvrez comment obtenir une cuisson fondante.",
                "<div><h1>Gratin dauphinois</h1><h2 style=\"text-align: justify;\">Temps de cuisson du gratin dauphinois</h2><p style=\"text-align: justify;\">Le gratin dauphinois est l’une des recettes traditionnelles phares de la région lyonnaise. Pour garder un aspect doré sur le dessus et obtenir des tranches de pommes de terre moelleuse, <strong>la cuisson du gratin</strong> dauphinois sera primordiale.</p><p style=\"text-align: justify;\">Dans votre plat à gratin, disposez les pommes de terres en tranches puis versez avec du lait. Mettez votre plat au <strong>four thermostat 6</strong> (180°C) pendant <strong>45 minutes à 1 heure</strong>. Selon la quantité de pommes de terre et la taille de votre gratin, la cuisson pourra être plus longue pour garantir son côté moelleux.</p><p style=\"text-align: justify;\">Attention, si le haut de votre gratin dauphinois dore trop, n’hésitez pas à le couvrir d’une feuille d’aluminium pendant la fin de la cuisson.</p></div>"
                , R.drawable.plat_gratin_dauphinois, 45);


        Plat gratinPates = new Plat("Pâtes",
                "Un grand classique dans l’univers des gratins ! Un plat simple dont le secret réside dans le croquant du dessus et le fondant des pâtes.",
                "<div><h1>Crème anglaise</h1><h2>Temps de cuisson d’une crème anglaise</h2>" +
                        "<p style=\"text-align: justify;\">" +
                        "Placez la casserole sur un feu moyen sans cesser de remuer le mélange à l’aide d’une cuillère en bois. La cuisson doit atteindre très précisément la température de <strong>85°C</strong>, mais pas plus, sinon elle sera trop épaisse et des grumeaux commenceront à se former.</p><p style=\"text - align:justify; \">Si vous ne disposez pas d’un thermomètre pour contrôler la température, comptez <strong>entre 2 et 3 minutes de cuisson</strong> pour 350 grammes de crème anglaise. La crème doit épaissir légèrement et devenir plus claire.</p><p style=\"text - align:justify;\">Pour vérifier la cuisson, vous pouvez passer votre doigt sur le dos de la spatule en bois nappée de crème : si la trace reste visible et que la crème ne coule pas dans le sillon que vous avez tracé, la crème est prête.</p></div>",
                R.drawable.plat_gratin_pate,
                15);

        Plat gratinCourgettes
                = new Plat("Courgettes",
                "La réussite d’un délicieux gratin de courgettes dépend en partie de sa cuisson. Découvrez comment réaliser ce plat facile et idéal en toutes saisons.",
                "<div><h1>Gratin de courgettes</h1><h2>Temps de cuisson du gratin de courgettes</h2><p>Pour réussir un gratin savoureux et croquant, il est primordial de bien faire dégorger les courgettes.</p><p>Pour cela, coupez-les en rondelles épaisses et plongez-les dans une casserole d’eau bouillante pendant<strong> 15 mn.</strong></p><p>Après les avoir bien égouttées, disposez vos courgettes dans un plat à gratin, rajoutez votre liant et saupoudrez le tout de fromage. Pour finir, placez votre plat au four pendant 45 mn, en actionnant le mode «&nbsp;grill&nbsp;» durant&nbsp;<strong>les 5 dernières minutes.</strong></p><p><em>Savez-vous qu’il est possible de réaliser rapidement un petit gratin de courgettes au micro-ondes ?</em></p><p>Placez vos rondelles de courgettes dans un récipient rempli d’eau salé, et laissez-les cuire pendant <strong> 6mn</strong> à pleine puissance. Disposez-les ensuite dans un petit plat à gratin, ajoutez votre liant et du fromage, puis faîtes cuire le tout pendant <strong> 6mn !</strong></p></div>",
                R.drawable.plat_gratin_courgette, 60);


        Plat gratinCourge = new Plat("Courge",
                "Une préparation classique et simple. Pas de quoi en faire tout un flan !",
                "<div><h1>Gratin de courge</h1><h2>Temps de cuisson du gratin de courge</h2><p>La courge, aliment incontournable de l’hiver, se déguste de nombreuses façons : soupe, soufflé, purée… Sans oublier l’incontournable gratin, qui apporte plus de consistance et de croquant au légume. La cuisson de ce plat d’automne requiert toutefois une attention toute particulière afin de conserver la chair de la courge tendre et juteuse.</p><p>Commencez par préparer vos courges et votre liant, puis placez le tout dans un plat à gratin.</p><p>Saupoudrez généreusement votre préparation de gruyère râpé.</p><p>Ensuite, enfournez votre gratin et laissez-le cuire pendant <strong>30 mn</strong> à 200°C.</p><p>Pour un gratin bien croquant, activez le grill de votre four pendant les 5 dernières minutes de cuisson.</p><p><em>Pour relever le gout des courges, râpez un peu de <a title=\"Noix de muscade\" href=\"http://www.tempsdecuisson.net/dico/noix-de-muscade\">noix de muscade</a> dessus !</em></p></div>",
                R.drawable.plat_gratin_courge, 30);


        Plat gratinEndives = new Plat("Endives",
                "Maîtrisez parfaitement la cuisson du gratin d’endives, et réalisez de nombreuses variantes originales !",
                "<div><h1>Gratin d’endives</h1><h2>Temps de cuisson du gratin d’endives</h2><p>Généralement réalisé avec du jambon et une sauce béchamel, le gratin d’endives&nbsp;s’accommode tout aussi bien avec d’autres aliments, comme le bleu d’Auvergne, le bacon ou bien le saumon.</p><p>Du classique gratin d’endives jambon béchamel, aux gratins d’endives les plus originaux, la cuisson de ce plat doit être parfaitement maîtrisé afin de conserver la bonne tenue des endives tout en gratinant parfaitement le dessus.</p><p>Voici la marche à suivre :</p><p>Commencez par faire cuire vos endives à la vapeur pendant <strong>10 mn.</strong><br>Veillez bien à ne pas dépasser 15mn de cuisson sous peine d’obtenir des endives trop molles par la suite.<br>Pendant ce temps là préchauffez votre four en position grill.<br>Laissez refroidir quelques instants les endives, puis déposez-les dans un plat à gratin.<br>Rajoutez les ingrédients de votre choix (sauce béchamel, gruyères, jambon, etc…), et enfournez le tout pendant <strong>10mn</strong> jusqu’à obtenir une texture craquante et dorée.</p><p><em>Bon appétit !</em></p></div>",
                R.drawable.plat_gratin_endive, 10);


        Plat aubergines = new Plat("Aubergines",
                "Découvrez comment cuire le gratin d’aubergines pour obtenir un gratin léger et parfaitement doré.",
                "<div><h1>Gratin d’aubergines</h1><h2>Temps de cuisson du gratin d’aubergines</h2><p>L<a title=\"Aubergine\" href=\"http://www.tempsdecuisson.net/les-legumes-et-feculents/aubergine\">‘aubergine</a>, légume composé à plus de 90% d’eau et riche de nombreux vitamines et minéraux, doit être cuite avec précaution pour conserver sa bonne tenue ainsi que ses bienfaits.</p><p>Commencez par éplucher les aubergines, puis découpez-les en rondelles.</p><p>Idéalement, saupoudrez les rondelles de sel puis faites-les dégorger pendant 1 heure; ce qui vous permettra d’obtenir un gratin qui ne rendra pas trop de jus.</p><p>Faites revenir les aubergines légèrement huilées dans une grande poêle, à feu moyen pendant <strong>10 mn</strong>.</p><p>Pour finir, disposez les aubergines accompagnées des aliments de votre choix (coulis de tomates, viande…), déposez une fine couche de gruyère sur le dessus puis enfournez votre gratin <strong>20 mn</strong> à 200°C.</p><p><em>Bon appétit !</em></p></div>"
                ,
                R.drawable.plat_gratin_aubergine, 30);


        return new ArrayList<>(asList(
                gratinPates, gratinCourgettes, gratinCourge, gratinEndives,
                aubergines, gratinDauphinois
        ));

    }

    public ArrayList<Plat> setupPoissonFruitDeMers() {

        Plat langoustine = new Plat("Langoustine",
                "Découvrez ici la meilleure méthode pour faire cuire vos langoustines en moins de dix minutes.",
                "<div><h1>Gratin dauphinois</h1><h2 style=\"text-align: justify;\">Temps de cuisson du gratin dauphinois</h2><p style=\"text-align: justify;\">Le gratin dauphinois est l’une des recettes traditionnelles phares de la région lyonnaise. Pour garder un aspect doré sur le dessus et obtenir des tranches de pommes de terre moelleuse, <strong>la cuisson du gratin</strong> dauphinois sera primordiale.</p><p style=\"text-align: justify;\">Dans votre plat à gratin, disposez les pommes de terres en tranches puis versez avec du lait. Mettez votre plat au <strong>four thermostat 6</strong> (180°C) pendant <strong>45 minutes à 1 heure</strong>. Selon la quantité de pommes de terre et la taille de votre gratin, la cuisson pourra être plus longue pour garantir son côté moelleux.</p><p style=\"text-align: justify;\">Attention, si le haut de votre gratin dauphinois dore trop, n’hésitez pas à le couvrir d’une feuille d’aluminium pendant la fin de la cuisson.</p></div>"
                , R.drawable.plat_fruit_de_mer_langoustine, 45);


        Plat coquilleSaintJaques = new Plat("Coquilles Saint-jacques",
                "La coquille Saint-Jacques est l’un des mets les plus délicats et les plus raffinés de la mer. Attention à la cuisson !",
                "<div><h1>Coquilles Saint-Jacques</h1><h2>Cuisson de la coquille Saint-Jacques</h2><p>La cuisson des coquilles Saint-Jacques se réalise en 2 étapes :</p><p>Pour arriver à une cuisson&nbsp;parfaite&nbsp;des coquilles Saint-Jacques, veillez à ne pas les laisser cuire trop longtemps. Vous obtiendrez ainsi une texture tendre et savoureuse.</p><p><strong>Étape 1&nbsp;</strong>: Dans une poêle, chauffer à feu vif 10 grammes de beurre et ajouter 2 cuillères d’huile d’olive pour ne pas que ce dernier devienne noir.</p><p><strong>Etape 2&nbsp;</strong>: Une fois le beurre fondu, mettez vos coquilles Saint-Jacques dans votre poêle encore chaude. Faites les revenir <strong>entre 1 et 2 minutes</strong> sur chaque face jusqu’à avoir une couleur dorée.</p></div>",
                R.drawable.plat_fruit_de_coquilles_saint_jacque,
                2);

        Plat moules
                = new Plat("Moules",
                "La réussite d’un délicieux gratin de courgettes dépend en partie de sa cuisson. Découvrez comment réaliser ce plat facile et idéal en toutes saisons.",
                "<div><h1>Moules</h1><h2 style=\"text-align: justify;\">Cuisson des moules</h2><p style=\"text-align: justify;\">La cuisson des moules est assez courte, environ entre <strong>5 et 10 minutes</strong>. Si les moules s’ouvre complètements, c’est qu’elles sont cuites.</p><p style=\"text-align: justify;\">La cuisson se fait dans un faitout ou une marmite à <strong>feux vif</strong>. Remplissez votre faitout d’eau à moitié. N’hésitez pas à les remuer de temps en temps.</p></div>",
                R.drawable.plat_fruit_de_moule, 7);


        Plat homard = new Plat("Homard",
                "C’est le crustacé dont la cuisson est redouté car il faut le préparer vivant. Retrouvez ici son temps de cuisson idéal selon son poids.",
                "<div><h1>Homard</h1><h2 style=\"text-align: justify;\">Temps de cuisson d’un homard</h2><p style=\"text-align: justify;\">Remplissez une casserole d’eau avec suffisamment de profondeur pour que le liquide recouvre entièrement le homard. Attention : ne pas cuire plus de deux homards en même temps.</p><p style=\"text-align: justify;\">Pour la de cuisson, comptez <strong>12 minutes pour 450 g</strong> et environ 1 minute de plus par 125 g additionnels.</p></div>",
                R.drawable.plat_fruit_de_mer_homard, 12);


        Plat truite = new Plat("Truite",
                "La truite demande une cuisson précise et délicate. Découvrez ici son temps de cuisson idéal pour une préparation au four en papillote ou à la poêle.",
                "<div><h1>Truite</h1><h2 style=\"text-align: justify;\">Temps de cuisson d’une truite</h2><p style=\"text-align: justify;\">La truite est un poisson qui sèche assez vite. Il faut donc réduire le temps de cuisson et ajouter de la matière grasse dans la poêle ou alors préférer une cuisson à la vapeur.</p><p style=\"text-align: justify;\">Au four, préparez votre truite en papillote et mettez la au four à <strong>180°</strong> pendant <strong>20 minutes</strong>. À la poêle, mettez votre truite sur feu fort et faites la dorer pendant <strong>4 à 6 minutes</strong> sur chaque côté.</p></div>",
                R.drawable.plat_fruit_de_mer_truite, 20);


        Plat courtbouillon = new Plat("Poisson au court-bouillon",
                "Attention à ne pas noyer le poisson ! La cuisson au court-bouillon est recommandée pour conserver toutes les saveurs du poisson.",
                "<div><h1>Cuisson du poisson au court-bouillon</h1><h2 style=\"text-align: justify;\">Temps de cuisson d’un poisson au court-bouillon :</h2><p style=\"text-align: justify;\">Pour garder toutes les saveurs du poisson, la cuisson au court-bouillon est idéale. Le court-bouillon est un bouillon épicé, assaisonné avec du vinaigre( ou du vin). Il doit être réalisé à l’avance puis refroidi.</p><p style=\"text-align: justify;\">Pour la cuisson, plongez votre poisson dans le court-bouillon refroidi. Portez ensuite à ébullition sur feux doux :</p><p style=\"text-align: justify;\">–<strong> 6 à 7 minutes</strong> pour un filet<br>– <strong>10 à 12 minutes</strong> pour un darne<br>– Crustacés (langouste, tourteau, araignée de mer) : <strong>18 à 20 minutes par kilo</strong><br>– Truite, saumon : <strong>10 minutes</strong> environ<br>– Écrevisses : <strong>6 à 8 minutes</strong> environ.</p></div>"
                ,
                R.drawable.plat_fruit_de_poisson_court_bouillon, 10);


        Plat huitresgratinees = new Plat("Huitres gratinées",
                "Parce que les huitres ne se mangent pas seulement crues, vous pouvez également les faire gratiner au four.",
                "<div><h1>Huitres gratinées</h1><h2 style=\"text-align: justify;\">Cuisson des huitres gratinées</h2><p style=\"text-align: justify;\"><strong>Au sabayon de champagne (pour une douzaine d’huitres) :</strong></p><p style=\"text-align: justify;\">Ouvrez vos huîtres et détachez-les des coquilles. Conservez l’eau des huitres puis faites la chauffer. Une fois que l’eau frémie, ajouter les huîtres pendant <strong>30 secondes</strong> puis égouttez-les. Remettez ensuite les huitres dans leurs coquilles (rincées).</p><p style=\"text-align: justify;\"><strong>Préparez le sabayon</strong> : mélangez l’eau des huîtres avec 20 cl de champagne. Assaisonnez avec du sel et du poivre. Faites bouillir puis laissez réduire <strong>3 minutes</strong>. Pendant ce temps, fouettez 5 jaunes d’oeufs pour les rendre écumeux. Incorporez le mélange au champagne sans cesser de fouetter et laissez cuire <strong>3 minutes</strong> à feu doux et ajoutez une cuillère de crème fraîche en continuant de fouetter.</p><p style=\"text-align: justify;\">Disposez le sabayon sur les huîtres. Allumez votre four en mode gril et faites dorer le tout pendant environ <strong>2 minutes</strong>.</p><p style=\"text-align: justify;\"></p></div>"
                ,
                R.drawable.plat_fruit_de_mer_huitre_gratinees, 3);


        Plat crabe = new Plat("Crabe",
                "Comme le homard, le crabe se cuit vivant. Découvrez ici son temps de cuisson qui peut varier en fonction de la taille du crustacé.",
                "<div><h1>Crabe</h1><p>Pour cuire un crabe, on suit généralement la même méthode que pour le homard. Il faut plonger le crabe vivant dans une casserole d’eau bouillante et salée. Attention, dans certains cas, le crabe risque de perdre ses pattes dans l’eau, il est donc préférable de placer le crustacé au congélateur pendant que vous mettez votre eau à bouillir.</p><p>Le temps de cuisson dépend de la taille du crabe. En règle générale, comptez <strong>15 à 20 minutes</strong> pour un crabe de 15 centimètres, poussez jusqu’à 30 minutes pour un très gros crustacé.</p></div>"
                ,
                R.drawable.plat_fruit_de_mer_crabe, 20);


        Plat bulots = new Plat("Bulots",
                "Découvrez la cuisson subtile des bulots et apprennez à conservez leur chair tendre et savoureuse.",
                "<div><h1>Bulots</h1><h2>Temps de cuisson des bulots</h2><p>Pêché au large de la Manche, ce petit coquillage habituellement dégusté en entrée fait aussi office de délicieuse garniture pour accompagner vos <a title=\"Poissons et fruits de mer\" href=\"http://www.tempsdecuisson.net/poissons-et-fruits-de-mer\">poissons</a>. Le crustacé préféré des normands requiert toutefois une cuisson attentive car trop cuit, sa chair devient dure et le bulot perd toute sa saveur.</p><p>Avant leur cuisson, commencez par laisser dégorger vos bulots pendant <strong>1 à 2 h</strong> dans une eau salée.</p><p>Une fois cette action effectuée, rincez-les bien et placez les coquillages dans une grande casserole d’eau salée.</p><p>Rajoutez du sel, du poivre et du <a title=\"Thym\" href=\"http://www.tempsdecuisson.net/dico/thym\">thym</a>, et portez l’eau à ébullition pendant <strong>20 mn.</strong></p><p>Laissez ensuite refroidir vos bulots encore plongé dans l’eau de leur cuisson.</p><p>Enfin, sortez les coquillages puis égouttez-les bien.</p><p><em>Vous pouvez maintenant les déguster à l’aide de pics, accompagnés de mayonnaise faîte maison !</em></p></div>"
                ,
                R.drawable.plat_fruit_de_mer_bulot, 20);

        Plat tourteaux = new Plat("Tourteaux",
                "Découvrez comment cuire les célèbres « crabes dormeurs », afin de conserver leurs chairs tendres et fraîches et réaliser de nombreuses recettes savoureuses.",
                "<div><h1>Gratin d’aubergines</h1><h2>Temps de cuisson du gratin d’aubergines</h2><p>L<a title=\"Aubergine\" href=\"http://www.tempsdecuisson.net/les-legumes-et-feculents/aubergine\">‘aubergine</a>, légume composé à plus de 90% d’eau et riche de nombreux vitamines et minéraux, doit être cuite avec précaution pour conserver sa bonne tenue ainsi que ses bienfaits.</p><p>Commencez par éplucher les aubergines, puis découpez-les en rondelles.</p><p>Idéalement, saupoudrez les rondelles de sel puis faites-les dégorger pendant 1 heure; ce qui vous permettra d’obtenir un gratin qui ne rendra pas trop de jus.</p><p>Faites revenir les aubergines légèrement huilées dans une grande poêle, à feu moyen pendant <strong>10 mn</strong>.</p><p>Pour finir, disposez les aubergines accompagnées des aliments de votre choix (coulis de tomates, viande…), déposez une fine couche de gruyère sur le dessus puis enfournez votre gratin <strong>20 mn</strong> à 200°C.</p><p><em>Bon appétit !</em></p></div>"
                ,
                R.drawable.plat_fruit_de_tourteaux, 20);


        Plat barGrille = new Plat("Bar grillé",
                "Maîtrisez la cuisson du bar au four et surprenez vos convives !",
                "<div><h1>Bar grillé</h1><h2>La cuisson du bar grillé</h2><p>Poisson très apprécié au menu de réveillon, le bar grillé ravira tous vos convives. Sa chair tendre se prête à toutes sortes de recettes, et &nbsp;pratiquement dépourvue d’arrêtes elle peut être facilement dégustée par les enfants. C’est donc une très bonne idée de plat pour un Noël familial et gourmet !</p><h3><strong>Cuisson au four</strong></h3><p>Commencez par préchauffez le grill de votre four.</p><p>Videz le bar en veillant à ne pas l’écailler, rincez-le bien puis&nbsp;badigeonnez généreusement le poisson d’huile.</p><p>Enfournez le bar à mi-hauteur du grill pendant <strong>25 mn</strong>. N’oubliez pas de le&nbsp;retourner&nbsp;à mi-cuisson afin qu’il soit bien grillé de chaque côté.</p><p><strong>Avec ce type de cuisson il est possible de réaliser toutes sortes de recettes :</strong></p><p>Avant d’enfourner le bar, pratiquez de petites incisions de chaque côté du poisson pour y insérer des feuilles de sauge et de fenouil.</p><p><em>Salez et poivrez, servez le tout accompagné de pommes de terre sautées et vous obtenez un délicieux plat de Noël&nbsp;!</em></p></div>"
                ,
                R.drawable.plat_fruit_de_mer_bar_grille, 25);


        Plat saumon = new Plat("Saumon",
                "La cuisson du saumon en papillote permet de réaliser de nombreuses recettes de Noël faciles !",
                "<div><h1>Saumon</h1><h2>Temps de cuisson du saumon</h2><p>Poisson festif par excellence, le saumon ravira sans nul doute les papilles de vos invités ! C’est un poisson qui se prête à de nombreux modes de cuisson, découvrez ici les principaux.</p><h3>Cuisson au four</h3><p>Déposez vos pavés de saumon dans un plat passant au four.</p><p>La cuisson du saumon au four s’effectue à <strong>180°C</strong> (ou thermostat 6), pendant <strong>25 mn</strong>.</p><h3>Cuisson à la poêle</h3><p>Faites cuire vos filets de saumon à feu moyen, accompagnés de matière grasse, <strong>3 à 5 mn</strong>, de chaque côté.</p><h3>Cuisson du saumon grillé</h3><p>Pour réaliser des pavés de saumons grillés, commencez par les saisir à feu vif, côté peau, pendant <strong>3mn</strong>; puis laissez-les cuire à feu moyen <strong>3 à 5 mn</strong> de chaque côté.</p><h3>Cuisson du saumon poché</h3><p>La cuisson du saumon poché se réalise en général dans un court bouillon de votre choix, qui peut être préparé à l’avance.</p><p>Faites chauffer votre court-bouillon, puis maintenez le feu afin d’obtenir un liquide&nbsp;brûlant, mais jamais bouillant.</p><p>Plongez les pavés de saumons, et laissez-les cuire environ<strong> 7 à 10</strong> <strong>mn,</strong> en veillant à ne jamais les faire bouillir.</p><p>Les saumons sont cuits lorsque leur chair est tendre.</p><h3>Cuisson du saumon en&nbsp;papillotes</h3><p>La cuisson du saumon en papillote est facile et elle permet d’accompagner le poisson de légumes divers et variés.</p><p>Préchauffez votre four à <strong>210°C</strong> pendant 10 mn.</p><p>Pendant ce temps-là, découpez des feuilles de papier sulfurisé puis disposez dedans un pavé de saumon, accompagné d’un filet d’huile, de quelques gouttes de citron et des légumes de votre choix.</p><p>Refermez soigneusement le papier en le roulant aux extrémités, comme les emballages des bonbons.</p><p>Déposez les papillotes dans un plat et enfournez le tout pendant <strong>20 mn</strong>.</p><p><strong>Idée de recette de saumon en papillote :</strong></p><p>Accompagnez chaque pavé de saumon d’une demi tomate et d’une moitié de courgette finement découpées.</p><p><em>Assaisonnez&nbsp;le tout d’herbes de Provence et le tour est joué !</em></p></div>"
                ,
                R.drawable.plat_fruit_de_mer_saumon, 25);


        Plat crevettes = new Plat("Crevettes",
                "Découvrez combien de temps dure la cuisson brève des crevettes, et réalisez toutes sortes de plats à base de ce délicieux petit crustacé !",
                "<div><h1>Crevettes</h1><h2>La cuisson des crevettes</h2><p>La cuisson de ces petits crustacés péchés le plus souvent au large des cotes bretonnes est rapide et simple !</p><p>Très appréciée en apéritif par exemple, la crevette se retrouve également dans de nombreuses recettes diverses et variées : verrines, brochettes, briques, salades, etc… Mais aussi comme accompagnement de nombreux poissons. Et après s’être embêté à les décortiquer, il serait dommage de&nbsp;rater&nbsp;leur cuisson !</p><h3>Les crevettes grises</h3><p>La cuisson des crevettes grises se réalise dans une eau bouillante et salée, pendant <strong>2 à 5 mn</strong> maximum.</p><h3>Les crevettes roses ou bouquets</h3><p>La cuisson des crevettes roses est extrêmement rapide !</p><p>Elle s’effectue dans une casserole d’eau bouillante, pendant <strong>30 secondes</strong> maximum.</p><p><em>Vous pouvez également, après leur cuisson à l’eau, poêler légèrement les crevettes et ainsi les rendre plus croquantes.</em></p></div>"
                ,
                R.drawable.plat_fruit_de_mer_crevette, 3);


        Plat lotte = new Plat("Lotte",
                "Découvrez les différents mode et temps de cuisson de la lotte, un poisson à la chair tendre mais fragile.",
                "<div><h1>Lotte</h1><h2>Cuisson de la lotte</h2><p>Très proche de l’anguille, mais plus petite, la lotte est très appréciée pour sa chair délicate que l’on a tendance&nbsp;à&nbsp;sur-cuire, et qui devient vite «&nbsp;caoutchouteuse&nbsp;» si l’on maîtrise mal sa cuisson.&nbsp;Car au contraire des autres poissons, plus sa cuisson dure, plus la lotte se&nbsp;raffermie.</p><p>C’est en Mars que l’on trouve les lottes les plus savoureuses. Choisissez-les bien nacrées !</p><p>La lotte est un poisson qui peut être cuit de différentes manières.</p><h3>Cuisson à la poêle</h3><p>Faire cuire les filets de poisson <strong>4 à 5 mn</strong> de chaque côté, à feu soutenu.</p><h3>Cuisson pochée</h3><p>La cuisson de la lotte pochée s’effectue dans un court-bouillon porté à ébullition pendant <strong>5mn.</strong></p><h3>Lotte rôtie</h3><p>Pour obtenir des filets de lotte bien rôtis, commencez par les saisir à feu vif dans une poêle graissée pendant <strong>3 mn</strong> de chaque côté, puis finissez la cuisson à feu doux pendant <strong>2 à 3 mn </strong>par côté, selon la taille de vos filets.</p><h3>Cuisson en papillotes</h3><p>Une fois les&nbsp;papillotes&nbsp;prêtent, enfournez-les à<strong> 180°C</strong> pendant <strong>25 mn.</strong></p><h3>A la vapeur</h3><p>C’est le mode de cuisson le plus diététique de la lotte.<br>La cuisson des lottes à la vapeur dure <strong>10 mn</strong>.</p></div>"
                ,
                R.drawable.plat_fruit_de_mer_lotte, 25);

        Plat cabillaud = new Plat("Cabillaud",
                "Découvrez les différents temps de cuisson du cabillaud, un poisson à la saveur subtile",
                "<div><h1>Cabillaud</h1><h2>Temps de cuisson du cabillaud</h2><p>Le cabillaud est une sorte de morue qui vit dans les eaux froides de l’Atlantique et du Pacifique. C’est un poisson pêché en grande quantité, que l’on retrouve facilement toute l’année chez son poissonier ou dans les rayons surgelés des supermarchés.</p><p>Sachez cependant que c’est au mois d’avril que le cabillaud offre une chair des plus délicieuses, permettant ainsi aux plus gourmets d’entre nous d’en mesurer sa pleine saveur !</p><h3>Cuisson à la poêle</h3><p>Farinez légèrement les deux faces du poisson, puis faites-les revenir <strong>3 à 5 mn</strong> de chaque côté dans une poêle huilée, à feu modéré.</p><h3>Cuisson au four</h3><p>La cuisson des filets de cabillaud au four s’effectue dans un four préchauffé, à<strong> 200°C</strong>, pendant <strong>15 à 20 mn</strong>.</p><h3>Cuisson à la vapeur</h3><p>Cuisson saine par excellence, elle permet également de conserver la blancheur de la chair du cabillaud.</p><p>Comptez <strong>7 mn</strong> de cuisson pour des filets de cabillaud frais, et <strong>20 mn</strong> pour des cabillauds surgelés.</p></div>"
                ,
                R.drawable.plat_fruit_de_mer_cabillaud, 20);


        Plat lieu = new Plat("Lieu",
                "Apprenez à cuire le lieu, poisson savoureux et riche en minéraux, de façon à obtenir une chair tendre tout en conservant ses bienfaits.",
                "<div><h1>Lieu</h1><h2>La cuisson du lieu</h2><p>Le lieu est un poisson qui peut être cuit de nombreuses façons. Particulièrement digeste et maigre, c’est le poisson des régimes par excellence, et pour les gourmands, il permet donc les accompagnements les plus savoureux… Sans culpabiliser !</p><p>Le lieu est par ailleurs un aliment riche en nombreux minéraux, tel que le phosphore, et regorge également de vitamines du groupe B. Raisons de plus pour faire attention à la cuisson de sa chair et ainsi conserver tous ses bienfaits.</p><h3>A la vapeur</h3><p>Cette cuisson vous permettra de conserver au mieux tous les apports du poisson.</p><p>Faites cuire dans un auto-cuiseur les filets de lieu pendant <strong>10 mn</strong> maximum.</p><h3>A la poêle</h3><p>La cuisson du lieu poêlé s’effectue à feu moyen, en faisant revenir les filets de chaque côté pendant <strong>4 à 5 mn.</strong></p><h3>Au four</h3><p>Dans un four préchauffé à 180°C, faites cuire le lieu pendant <strong>20 mn</strong> maximum.</p></div>"
                ,
                R.drawable.plat_fruit_de_mer_lieu, 20);


        Plat colin = new Plat("Colin",
                "Découvrez les temps de cuisson du colin, un poisson à la chair dénué d’arrêtes.",
                "<div><h1>Colin</h1><h2>La cuisson du colin</h2><p>Le colin est un poisson qui supporte tous les modes de cuisson à condition de bien respecter les durées, sous peine d’effriter sa chair délicate.</p><p>Savoureux au mois de Mars, le colin est facile à cuisiner et sa chair contient peu d’arrêtes. C’est donc un poisson idéal à servir aux enfants !</p><h3>A la vapeur</h3><p>C’est le mode de cuisson le plus adapté car il n’agresse pas la chair du poisson.</p><p>Les filets de colin frais sont à cuire pendant <strong>5 à 10 mn</strong> dans votre auto-cuiseur, quand au filets surgelés, comptez <strong>10 à 15 mn</strong> de cuisson.</p><h3>Au court-bouillon</h3><p>Placez le colin dans un court-bouillon froid, puis une fois l’eau bouillante, comptez <strong>15 mn</strong> de cuisson.</p><h3>En papillotes</h3><p>Une fois vos papillotes prêtent, enfournez-les <strong>20 à 25 mn à 210°C</strong>, ou thermostat 7.</p><h3>Au four</h3><p>La cuisson du colin au four s’effectue dans un four préchauffé à <strong>180°C</strong> pendant<strong> 10 à 15 mn</strong>.</p><p>&nbsp;</p><p>&nbsp;</p></div>"
                ,
                R.drawable.plat_fruit_de_mer_colin, 15);


        Plat sole = new Plat("Sole",
                "Découvrez les différents temps de cuisson de la sole, poisson très apprécié des gourmets !",
                "<div><h1>Sole</h1><h2>La cuisson de la sole</h2><p>La sole est un poisson noble à 4 filets, très apprécié pour la qualité irréprochable de sa chair, tendre et ferme à la fois. C’est un aliment qui regorge de nutriments essentiels, dont un fort apport en protéines. Les façons de la cuire sont diverses, le tout étant de ne pas dépasser les temps de cuisson, sous peine d’obtenir un poisson flétri.</p><h3>Au four</h3><p>La cuisson au four de la sole s’effectue dans un four préchauffé à <strong>200°C</strong> ou thermostat 6, et dure<strong> 30 mn</strong>.</p><p><em>Pensez bien, si ce n’est pas déjà fait, à enlever la peau de la sole avant de la cuire.</em></p><p><strong>A la poêle</strong></p><p>Faites dorer les filets de sole dans une poêle, accompagnés d’un peu de matière grasse, pendant <strong>4 à 5 mn </strong>par côté.</p><h3>En papillotes</h3><p>Après avoir confectionné vos papillotes de sole, placez les au four pendant <strong>30 mn</strong>, à <strong>210°C</strong>.</p></div>"
                ,
                R.drawable.plat_fruit_de_mer_sole, 30);
        Plat thon = new Plat("Thon",
                "Découvrez les différents temps de cuisson du thon, un poisson riche en protéines.",
                "<div><h1>Thon</h1><h2>La cuisson du thon</h2><p>Le thon rouge, ou albacore, se déguste mi-cuit de manière à conserver sa chair tendre et savoureuse. Car si la cuisson du thon est simple, le principal danger est d’obtenir une chair trop cuite et beaucoup trop dure.</p><h3>A la poêle</h3><p>La meilleure façon d’obtenir un&nbsp;steak&nbsp;de thon tendre et de le faire revenir à la poêle.</p><p>Commencer par faire chauffer un filet d’huile à feu vif, puis déposez les morceaux de thon.</p><p>Faites-les revenir à feu vif pendant <strong>3 mn</strong> de chaque côté.</p><h3>En papillotes</h3><p>Cette cuisson permet à la chair du thon d’absorber et de restituer toutes les saveurs des ingrédients dont il est&nbsp;accommodé.</p><p>Une fois les papillotes prêtent, laissez-les cuir <strong>30 mn</strong> à <strong>200°C</strong>.</p><h3>Rôti au four</h3><p>La cuisson du thon au four dure <strong>30 mn</strong> et s’effectue dans un four préchauffé à <strong>210°C</strong>, thermostat 6 ou 7.</p></div>"
                ,
                R.drawable.plat_fruit_de_mer_thon, 3);
        Plat raie = new Plat("Raie",
                "Découvrez combien de temps cuire la raie afin d’obtenir un poisson dénué de tout aspect visqueux.",
                "<div><h1>Raie</h1><h2>La cuisson de la raie</h2><p>Combien de temps cuire les ailes de raie ?</p><p>Dans la raie, seules les ailes sont&nbsp;comestibles, le corps ne se déguste pas. La raie est un poisson composé de beaucoup d’eau, et dont la chair contient un fort apport en protéine. Sa cuisson doit donc être bien maîtrisée afin de conserver la tendresse du poisson et maintenir ses qualités&nbsp;nutritionnelles.</p><p>Son aspect visqueux, totalement naturel et même synonyme de&nbsp;fraîcheur, &nbsp;peut être enlevé grâce à une cuisson maîtrisée.</p><p>Sachez également que la raie possède une chair presque dénuée&nbsp;d’arrêtes, ce qui en fait un poisson parfait pour les plus petits !</p><h3>CUISSON POCHÉE</h3><p>La cuisson pochée est la plus souvent utilisée, cette dernière étant facile à réaliser.&nbsp;Plongez les ailes de raie dans une eau bouillante pendant <strong>15 mn</strong> environ.</p><h3>CUISSON AU FOUR</h3><p>Dans un plat adapté, laissez cuire les ailes de raie pendant <strong>15 à 25 mn</strong> maximum, à 200°C.</p><h3>CUISSON A LA POÊLE</h3><p>Vous pouvez également faire revenir les ailes de raie à la poêle, accompagnées d’un peu de matière grasse, <strong>5 mn</strong> de chaque côté.</p><p><em>Pour&nbsp;<strong>enlever la peau</strong>&nbsp;de la raie facilement, commencez par pocher les ailes à l’eau bouillante pendant <strong>2mn</strong>. Ensuite, sur une surface plane, grattez la peau de chaque côté à l’aide d’un couteau.</em></p></div>"
                ,
                R.drawable.plat_fruit_de_mer_raie, 20);
        Plat dorade = new Plat("Dorade",
                "Au four, à la poêle, ou encore en croûte de sel, apprenez tout sur les différentes cuissons de la dorade !",
                "<div><h1>Dorade</h1><h2>La cuisson de la dorade</h2><p>Au four, en papillotes, en croûte de sel, grillée au barbecue, ou simplement à la poêle… La dorade, ou daurade – qu’elle soit rose, grise ou royale -, est un poisson savoureux qui peut se cuire et&nbsp;s’accommoder&nbsp;de différentes manières.</p><p>La dorade présente un aspect luisant et rebondi, et une chair savoureuse, qui peut se déguster aussi bien nature&nbsp;que accommodée&nbsp;d’herbes aromatiques comme le <a title=\"Thym\" href=\"http://www.tempsdecuisson.net/dico/thym\">thym</a> ou encore les herbes de Provence…</p><h3>AU FOUR</h3><p>La cuisson de la dorade au four dure <strong>30 mn</strong>&nbsp;dans un four préchauffé à <strong>180°C</strong>.</p><h3>CUISSON EN PAPILLOTES</h3><p>Après avoir préparé vos dorades en papillotes, laissez-les cuire <strong>20 mn</strong> dans un four préchauffé à <strong>180°C</strong>.</p><h3>A LA POÊLE</h3><p>Pour faire revenir des filets de dorade, commencez par faire chauffer un filet d’huile d’olive dans votre poêle, puis saisissez chaque coté du poisson pendant environ <strong>1 mn</strong>.</p><h3>CUISSON EN&nbsp;CROÛTE&nbsp;DE SEL</h3><p>Une fois la dorade préparée et recouverte d’une épaisse couche de sel, environ 1 cm, laissez-la cuire<strong> 20 mn</strong> dans un four à <strong>200°C</strong>.</p><h3>AU BARBECUE</h3><p>Une dorade de taille importe cuit <strong>15 à 20 mn</strong> de chaque côté, <strong>10 à 15 mn</strong> pour les plus petites.</p></div>"
                ,
                R.drawable.plat_fruit_de_mer_dorade, 15);
        Plat merlan = new Plat("Merlan",
                "Apprenez tout de la cuisson du merlan, poisson à la chair délicate.",
                "<div><h1>Merlan</h1><h2>La cuisson du merlan</h2><p><span style=\"font-family: Arial, Helvetica, sans-serif; font-size: small;\">Le merlan est un poisson à la chair fine et légèrement sucrée, qui s’effrite facilement. Sa cuisson doit donc être bien maîtrisée pour préserver sa chair.&nbsp;</span></p><p><span style=\"font-family: Arial, Helvetica, sans-serif; font-size: small;\">Sachez par ailleurs qu’il est préférable de ne pas enlever la peau du merlan avant de le faire cuire, afin de garder sa saveur et sa texture intacte.</span></p><p><span style=\"font-family: Arial, Helvetica, sans-serif; font-size: small;\">Le merlan se prépare entier ou en filet. Traditionnellement, il est&nbsp;<strong>frit «&nbsp;en colère&nbsp;» ou «&nbsp;enragé&nbsp;»</strong>&nbsp;: on lui fait mordre la queue pour faciliter sa manipulation et le faire passer plus facilement dans une poêle. Pour des raisons diététiques et pratiques, la friture est aujourd’hui un mode de préparation moins fréquent.</span></p><p><span style=\"font-family: Arial, Helvetica, sans-serif; font-size: small;\">On le prépare donc plus souvent&nbsp;<strong>entier et fariné, à la poêle ou au four</strong>. Il se cuisine également grillé, poché au vin, dans un bouillon aromatique, pané, dans les farces, les pains et les mousses, en papillote ou au citron. On peut accompagner le merlan de légumes ou de pommes de terre. Il est également fréquemment utilisé pour les&nbsp;<strong>soupes de poissons</strong>, auxquelles il apporte un certain moelleux.</span></p><p><span style=\"font-family: Arial, Helvetica, sans-serif; font-size: small;\">Sa chair fine et son goût légèrement sucré&nbsp;<strong>plaît généralement aux enfants</strong>. Cuisiner du merlan est donc un bon moyen pour leur apprendre à apprécier le poisson</span></p></div>"
                ,
                R.drawable.plat_fruit_de_mer_merlan, 30);


        return new ArrayList<>(asList(
                dorade, moules, homard, truite,
                crabe, bulots, tourteaux, barGrille, saumon, merlan,
                langoustine, huitresgratinees,
                crevettes, lotte, cabillaud, lieu, colin, sole,
                thon, raie, coquilleSaintJaques, courtbouillon
        ));
    }

    public ArrayList<Plat> setUpLegumes() {

        Plat aubergine = new Plat("Aubergine",
                "Découvrez les temps de cuisson de l’aubergine au four et à l’eau bouillante.",
                "TEMPS DE CUISSON DE L’AUBERGINE\n" +
                        "L’inconvénient majeur lors de la cuisson de l’aubergine est que ce légume absorbe très rapidement la matière grasse. L’astuce est de dégorger l’aubergine (enlever le maximum d’eau contenue dans celle-ci).\n" +
                        "\n" +
                        "Cuisson au four : Préchauffez le four thermostat 6 (180°C) puis découpez l’aubergine dans la longueur en deux parties. bien taillader la pulpe avec la lame du couteau de façon à faire des entailles un peu profonde. Enfourner au four  durant 30 minutes. Pour une cuisson parfaite, l’aubergine doit être moelleuse.\n" +
                        "\n" +
                        "Cuisson à l’eau  : À la casserole dans l’eau bouillante, les aubergines doivent cuire 10 à 15 minutes selon leur taille."
                , R.drawable.plat_legume_aubergine, 30);


        Plat chouFleur = new Plat("Chou-fleur",
                "Cuire votre chou-fleur à la vapeur dans votre autocuiseur ou à l’eau bouillante, c’est facile. Suivez le guide...",
                "<div><h1>Chou-Fleur</h1><h2>Quel est le temps de cuisson d’un chou-fleur?</h2><p>Il existe plusieurs façons de faire cuire un chou-fleur, sachant qu’il se déguste tout aussi bien cru à l’apéritif accompagné d’une sauce.</p><h3>Cuisson du chou-fleur à l’eau bouillonnante</h3><p>Comptez <strong>entre 15 et 20 minutes</strong> de cuisson en fonction de la taille du chou-fleur. Pensez à saler votre eau de cuisson</p><h3>Cuisson du chou-fleur à la vapeur ou à l’aide d’un <a href=\"https://www.tempsdecuisson.net/shop/autocuiseur\">autocuiseur</a></h3><p>Comptez <strong>entre 5 et 10 minutes</strong> de cuisson en fonction de la taille du chou-fleur</p><h3>Cuisson du chou-fleur au Babycook<strong>&nbsp;</strong></h3><p>Celle-ci s’effectue avec le niveau 3 de votre Babycook, et dure environ <strong>15 mn</strong>.</p></div>",
                R.drawable.plat_legume_chou_fleur,
                15);

        Plat pomme_de_terre
                = new Plat("Pomme de terre",
                "Avec ou sans patates ?",
                "<div><h1>Pomme de terre</h1><p>La pomme de terre, en fonction de sa variété (ratte, grenaille, amandine…) et de sa taille peut se cuisiner de mille et une façons ou presque afin d’accompagner avec goût <a title=\"Les viandes\" href=\"http://www.tempsdecuisson.net/les-viandes\">viandes</a>, volailles et <a title=\"Poissons et fruits de mer\" href=\"http://www.tempsdecuisson.net/poissons-et-fruits-de-mer\">poissons</a>.</p><h3>Cuisson à l’eau</h3><p>Servies avec du beurre et du sel la pomme de terre à l’eau se cuit avec la peau une vingtaine de minute dans une eau bouillante salée.</p><h3>Cuisson au four</h3><p>Mode de cuisson idéal pour des pommes de terres de petits calibres la cuisson au four prend du temps. Comptez une bonne heure dans un four à 180°.</p><h3>Cuisson en papillote</h3><p>Parfait avec une viande rouge la <strong>pomme de terre en robe des champs</strong> est adaptée aux pommes de terres les plus grosses qui doivent être bien fermes. Cuites au four environ 1h30 dans du papier aluminium avec leur peau et sans graisse, elles peuvent être servies avec une sauce crème fraiche ciboulette échalotes.</p><h3>Cuisson à la poêle</h3><p>Pour faire sauter à la poêle vos pommes de terre, rien de plus simple.</p><p>Après les avoir épluchées puis coupées en dès, faîtes les revenir à feu vif dans une sauteuse avec un filet d’huile pendant <strong>15 à 20 mn.</strong></p><h3>Pommes «&nbsp;grenailles&nbsp;»</h3><p>«&nbsp;Façon Brasserie&nbsp;» la pomme de terre grenaille est fondante et généreusement grillée. Avec leur peau les pommes de terres sont cuites à l’eau une vingtaine de minute puis rôties à feu doux 30 minutes dans une grande coquelle en fonte avec de lui d’olive et un peu de beurre. N’hésitez pas à saler en fin de cuisson.</p><h3>Cuisson au Babycook</h3><p>Pour faire cuire des pommes de terre au Babycook utilisez le<strong> niveau 3</strong> de l’appareil, soit <strong>15 mn</strong> de cuisson.</p></div>",
                R.drawable.plat_legume_pomme_de_terre, 15);


        Plat carottes = new Plat("Carottes",
                "A l’eau, à la vapeur, à la poêle, au four… Découvrez ici les différents modes et temps de cuisson des carottes, aliment star des régimes !",
                "<div><h1>Carottes</h1><h2>Cuisson des carottes</h2><p>Aliment sain par excellence, la carotte peu se cuire de différentes façons. Cependant si vous souhaitez conserver au mieux tous ses nutriments, la cuisson &nbsp;des carottes à la vapeur est la meilleure option. Découvrez ici les différentes manières de faire cuire vos carottes.</p><p><span style=\"text-decoration: underline;\"><strong>A la vapeur</strong></span><strong> :</strong></p><p>Remplissez d’eau le fond de votre <a href=\"https://www.tempsdecuisson.net/shop/autocuiseur\">cocotte-minute</a>, placez-la à feu vif jusqu’à ce que l’eau frémisse.</p><p>Déposez dans le panier vos rondelles de carottes finement coupées, puis placez ce dernier dans la cocotte, en veillant à ce qu’il ne touche pas l’eau.</p><p>Refermez le couvercle. Quand la cocotte siffle, laissez cuire vos carottes<strong> 8 à 12 mn</strong> à feu moyen.</p><p><em>Faîtes varier le temps de cuisson pour obtenir des carottes plus ou moins croquantes !</em></p><p><span style=\"text-decoration: underline;\"><strong>A l’eau</strong></span><strong> :</strong></p><p>Portez à ébullition une grande casserole d’eau salée, puis laissez cuire vos carottes en rondelles pendant <strong>20 mn</strong>, à feu vif.</p><p><span style=\"text-decoration: underline;\"><strong>A la poêle</strong></span><strong> :</strong></p><p>Faîtes fondre un peu de matière grasse dans une sauteuse.</p><p>Déposez vos carottes coupées en rondelles et faîtes-les revenir à feu moyen pendant <strong>15 à 20 mn</strong> en les remuant régulièrement.</p><p><span style=\"text-decoration: underline;\"><strong>Au four</strong></span><strong> :</strong></p><p>Préchauffez votre four à 180 degrés.</p><p>Disposez vos carottes entières dans un plat, puis&nbsp;assaisonnez-les d’un filet d’huile d’olive et d’herbes aromatiques (<a title=\"Thym\" href=\"http://www.tempsdecuisson.net/dico/thym\">thym</a>, romarin…)</p><p>Recouvrez le plat de papier aluminium et laissez cuire le tout <strong>35 mn</strong>, à 180 degrés.</p><p><em><br></em></p><p>&nbsp;</p><p>&nbsp;</p></div>",
                R.drawable.plat_legume_carrotte, 20);


        Plat poivrons = new Plat("Poivrons",
                "A l’eau, à la poêle, au four… Découvrez comment cuire vos poivrons sans qu’ils ne perdent de leur croquant.",
                "<div><h1>Poivrons</h1><h2>Temps de cuisson du poivron</h2><p>Rouge, jaune, vert, peu importe la couleur… Seule la cuisson compte !&nbsp;Découvrez les différentes manières de cuire vos poivrons.</p><p><strong>Au four&nbsp;</strong></p><p>Préchauffez votre four à 240 degrés.</p><p>Disposez les poivrons en entier dans un plat à four traditionnel, ajoutez un filet d’huile d’olive, quelques aromates (<a title=\"Thym\" href=\"http://www.tempsdecuisson.net/dico/thym\">thym</a>, laurier…), et enfournez le tout pendant <strong>20 mn</strong>.</p><p><em>Une fois cuite, la peau du poivron se décollera facilement.</em></p><p><strong>A la poêle</strong></p><p>Faîtes revenir vos poivrons coupés en lamelles ou en dès, et accompagnés d’un filet d’huile d’olive pendant <strong>15 mn</strong>.</p><p><strong>A la vapeur</strong></p><p>Après avoir coupé vos poivrons, faîtes les mijoter dans votre auto-cuiseur pendant <strong>15 mn</strong>.</p><p><em>Astuce : si vous souhaitez les manger crus, faîtes bouillir vos poivrons entiers dans de l’eau salée pendant <strong>10 mn</strong>, la peau se décollera parfaitement !</em></p></div>",
                R.drawable.plat_legume_poivron, 10);


        Plat brocolis = new Plat("Brocolis",
                "Légume très riche en vitamines, fibres et minéraux, le brocolis doit se cuire avec précaution afin de conserver au mieux ses nutriments et sa couleur.",
                "<div><h1>Brocolis</h1><h2>Temps de cuisson des brocolis</h2><p>Le brocolis peut se cuire rapidement et de différentes manières.</p><p><strong><span style=\"text-decoration: underline;\">A la vapeur</span> :</strong></p><p>Faites cuire vos brocolis <strong>5 mn</strong>&nbsp;et pas plus dans votre <a href=\"https://www.tempsdecuisson.net/shop/autocuiseur\">auto-cuiseur</a>, afin de ne pas perdre leur croquant.</p><p><strong><span style=\"text-decoration: underline;\">A l’eau</span> :</strong></p><p>Dans une casserole d’eau bouillante et salée, laissez cuire vos brocolis pendant <strong>8 mn.</strong></p><p><strong><span style=\"text-decoration: underline;\">A la poêle</span> :</strong></p><p>Faites rissoler à feu vif pendant <strong>10 mn</strong> vos brocolis avec un peu de matière grasse.</p></div>"
                ,
                R.drawable.plat_legume_brocolis, 10);


        Plat ratatouille = new Plat("Ratatouille",
                "Si la recette de la ratatouille possède plusieurs variantes, son temps de cuisson ne varie pas. Découvrez-le et réalisez enfin une ratatouille parfaitement cuite !",
                "<div><h1>Ratatouille</h1><h2>Temps de cuisson de la ratatouille</h2><p>La ratatouille, plat d’origine niçoise aux saveurs parfumées de Provence et d’été, ne pardonne aucune faute de cuisson. Composée généralement de tomates, de courgettes, de poivrons, d’aubergines, d’oignons et d<a title=\"Ail\" href=\"http://www.tempsdecuisson.net/dico/ail\">‘ail</a>, cette recette méditerranéenne accompagne à merveille les viandes, les <a title=\"Les viandes\" href=\"http://www.tempsdecuisson.net/les-viandes\">grillades</a> et les poissons.</p><p>Il existe deux manières de faire cuire la ratatouille. La première, un peu plus longue, consiste à faire cuire l’un après l’autre chaque légume. La deuxième se réalise en mélangeant tous les légumes et en les laissant mijoter ensemble.</p><p><strong>Cuisson de la ratatouille en séparant les légumes :</strong></p><p>Commencez par faire cuire vos tomates.</p><p>Découpez-les en quartier puis faîtes-les revenir <strong>10 mn</strong> à feu doux dans une casserole huilée.</p><p>Ensuite, faîtes cuire à la poêle vos aubergines découpées en dès pendant <strong>20 mn environ</strong>.</p><p>Place aux courgettes ! Laissez-les cuire découpées en rondelles pendant <strong>20 mn environ</strong>, toujours à la poêle.</p><p>Pour cuire vos poivrons, découpez-les sur la longueur puis faîtes-les sauter à la poêle pendant <strong>15 mn</strong>.</p><p>Les oignons se font revenir à feu vif dans une poêle jusqu’à ce qu’ils blondissent.</p><p>Pour finir, mélangez le tout dans une grande casserole puis laissez mijoter votre plat <strong>10 mn</strong> supplémentaires, accompagné d’herbes de Provence et d’<a title=\"Ail\" href=\"http://www.tempsdecuisson.net/dico/ail\">ail</a>.</p><p><strong>Cuisson de la ratatouille en mélangeant les légumes :</strong></p><p>Mélangez dans votre cocotte-minute les tomates en quartiers, les aubergines en dès, les courgettes en rondelles, sans oublier les oignons, l’ail et les aromates.</p><p>Lorsque votre cocotte siffle, laissez cuire le tout pendant <strong>15 mn</strong>.</p><p>Ensuite, faîtes mijoter votre ratatouille <strong>10 mn</strong> supplémentaires à feu doux et sans couvercle afin que toutes les saveurs se mélangent bien.</p><p><em>Servez-la chaude ou bien dégustez-la froide. Bon appétit !</em></p><p>&nbsp;</p><p>&nbsp;</p></div>"
                ,
                R.drawable.plat_legume_ratatouille, 45);


        Plat courgettes = new Plat("Courgettes",
                "Légume très riche en vitamines, fibres et minéraux, le brocolis doit se cuire avec précaution afin de conserver au mieux ses nutriments et sa couleur.",
                "<div><h2>Temps de cuisson des courgettes</h2><p>Composée à 95 % d’eau, la courgette est un aliment à faible apport calorifique mais riche en oligo-éléments,minéraux et vitamines.</p><p>Il existe plusieurs manières de cuire les courgettes, toutes doivent être bien maîtrisées afin de conserver les bienfaits du légume. Notez que les cuissons à l’eau et à la vapeur sont celles qui vous permettront de garder au mieux tous les nutriments des courgettes.</p><p><em>Il est préférable d’assaisonner les courgettes à la fin de leur cuisson, afin que le sel ne&nbsp;dessèche&nbsp;pas le légume et que celui-ci garde toute sa tenue.</em></p><h3>Cuisson à l’eau</h3><p>Après avoir préparé vos courgettes, plongez-les dans une casserole d’eau légèrement salée et laissez-les cuire pendant environ <strong>15 mn.</strong></p><h3>Cuisson à la vapeur</h3><p>Une fois vos courgettes coupées en rondelles, placez-les dans votre <a href=\"https://www.tempsdecuisson.net/shop/autocuiseur\">auto-cuiseur</a> pendant<strong> 9 mn</strong>.</p><h3>Cuisson à la poêle</h3><p>Ce mode de cuisson est idéal si vous souhaitez cuisiner plusieurs légumes à la fois ou préparer une bonne ratatouille !</p><p>Coupez vos courgettes en fines rondelles puis faites-les revenir pendant <strong>15 mn</strong> à feu modéré, accompagnées d’un filet d’huile.</p><h3>Courgettes au four</h3><p>Si vous souhaitez cuisiner des courgettes farcies, vous devez opter pour la cuisson au four.</p><p>Après les avoir préparées, enfournez-les pendant <strong>20 mn</strong> à 200/220°C.</p><h3>Cuisson au Babycook</h3><p>Les bébés&nbsp;raffolent&nbsp;des courgettes et leur cuisson au Babycook est très rapide.</p><p>Elle s’effectue en utilisant le<strong> niveau 2</strong> de votre appareil, et dure environ <strong>10 mn</strong>.</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p></div>"
                ,
                R.drawable.plat_legume_courgette, 10);


        Plat chouBlanc = new Plat("CHOU BLANC",
                "Préparez de délicieuses choucroutes ou salades avec le bon temps de cuisson du chou blanc !",
                "<div><h1>Chou blanc</h1><h2>La cuisson du chou blanc</h2><p>Le chou blanc est une variété de chou pouvant peser jusqu’à plusieurs kilos. Issu de la même famille que le <a title=\"Navet\" href=\"http://www.tempsdecuisson.net/les-legumes-et-feculents/le-navet\">navet</a>, et le radis, sa saveur est relativement proche.</p><p>Composé de feuilles lisses, vert pâle à l’extérieur et blanches à l’intérieur, le chou blanc permet la préparation de nombreuses salades rafraîchissantes, idéales au printemps.</p><p>En hiver, c’est le chou blanc que l’on retrouve avec plaisir dans nos choucroutes traditionnelles !</p><p>Gorgé de vitamines et de minéraux, ce légume doit être cuit avec précaution en limitant sa cuisson à 15 minutes maximum.</p><h3>CUISSON A LA CASSEROLE</h3><p>C’est la cuisson la plus saine.</p><p>Après avoir enlevé les feuilles extérieures et coupé le chou en 4, en veillant à retirer le trognon; laissez cuire les lamelles de chou dans une eau bouillante pendant <strong>15 mn</strong>.</p><h3>CUISSON A LA&nbsp;POÊLE</h3><p>Ce mode de cuisson offre un chou plus croquant.</p><p>Préparez votre chou comme détaillé ci-dessus, puis faites revenir les lamelles, accompagnées d’un peu de matière grasse, pendant <strong>12 minutes</strong>.</p></div>"
                ,
                R.drawable.plat_legume_chou_blanc, 15);


        Plat chataigne = new Plat("Châtaigne",
                "Réchauffez vos soirées automnales avec les bons temps de cuisson de la châtaigne !",
                "<div><h2>Cuisson des châtaignes</h2><p>A consommer sans modération tout au long de l’automne, la châtaigne contient peu de matières grasses et de nombreux oligo-éléments. C’est l’aliment parfait pour prendre des forces avant l’hiver !</p><p>Découvrez les différentes façons de cuire les châtaignes.</p><h3>Au four</h3><p>Préchauffez votre four à 220 degrés.</p><p>Fendez toutes vos châtaignes à l’aide d’un couteau.</p><p>Déposez-les sur une plaque puis laissez-les cuire pendant <strong>20&nbsp;mn</strong>.</p><p><em>Retournez-les à mi-cuisson pour les griller de manière uniforme.</em></p><h3>A l’eau</h3><p>Plongez-les dans une grande casserole d’eau bouillante et laissez-les cuire<strong> 45&nbsp;mn</strong> à feu vif.</p><p><em>Ne les entaillez pas afin qu’elles ne se gorgent pas d’eau.</em></p><h3>A la poêle percée</h3><p>Entaillez les châtaignes, et faîtes-les revenir à feu vif dans une poêle percée pendant <strong>15 à 20 mn</strong>.</p><p><em>Vous pouvez vous servir de ce mode de cuisson si vous&nbsp;possédez&nbsp;une cheminée, optez alors pour une poêle percée à manche long.</em></p><h3>Au barbecue</h3><p>Incisez vos châtaignes puis déposez-les sur une grille.</p><p>Laissez-les griller au dessus des braises pendant <strong>20 mn</strong>.</p><p><em>Vous pouvez aussi utiliser une plancha pour les griller, c’est le même temps de cuisson qu’au barbecue !</em></p></div>"
                ,
                R.drawable.plat_legume_chataigne, 20);


        return new ArrayList<>(asList(
                chouFleur, pomme_de_terre, carottes, poivrons,
                brocolis, aubergine, chouBlanc, courgettes, ratatouille
                , chataigne
        ));

    }


}
