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
        classiqueCategorie.setPlats(setUpClassiquePlat());
        dessertCategorie.setPlats(setUpDessert());
        categories = new ArrayList<>(
                asList(classiqueCategorie,
                        dessertCategorie,
                        new Categorie("Barbecue",
                                "Retrouvez ici tous les temps de cuisson pour vos viandes et poissons au barbecue."
                                , R.drawable.categorie_bbq),
                        new Categorie("Les gratins",
                                "Apprenez comment réaliser la cuisson parfaite d’un gratin en obtenant une texture dorée et croustillante."
                                , R.drawable.categorie_gratin),
                        new Categorie("Les viandes",
                                "Pour connaître le temps de cuisson d’une viande saignante, bleue ou bien cuite."
                                , R.drawable.categorie_viandes),
                        new Categorie("Les légumes et féculents",
                                "Découvrez les techniques de cuissons des légumes et féculents au four, à l’eau, à la vapeur, à la poêle, etc..."
                                , R.drawable.categorie_legumes),
                        new Categorie("Poissons et fruits de mer",
                                "La pêche a été bonne ? Retrouvez ici les temps de cuissons adéquats pour vos poissons et crustacés."
                                , R.drawable.categorie_fruit_de_mer)
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
                R.drawable.plat_flan_aux_oeufs, 15);


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
                financiers, crumble, clafoutis, meringue, platdessertPommesAuFour
        ));

    }

}
