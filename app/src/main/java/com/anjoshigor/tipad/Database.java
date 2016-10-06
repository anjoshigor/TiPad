package com.anjoshigor.tipad;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anjoshigor on 05/10/16.
 */

public class Database extends SQLiteOpenHelper {
    /**PARAMETERS**/
    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "Tipad";
    private static final String TABLE = "perguntas";
    private static final String KEY_ID = "id";
    private static final String KEY_PERGUNTA = "pergunta";
    private static final String KEY_RESPOSTA = "resposta";
    private static final String KEY_OPCAO1 = "opcao1";
    private static final String KEY_OPCAO2 = "opcao2";
    private static final String KEY_OPCAO3 = "opcao3";
    private static final String KEY_OPCAO4 = "opcao4";
    private static final String KEY_ASSUNTO = "assunto";

    private SQLiteDatabase dbTipad;

    public Database(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        dbTipad=db;
        String sqlQuery = "CREATE TABLE IF NOT EXISTS " + TABLE + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + KEY_ASSUNTO + " TEXT, "
                + KEY_PERGUNTA + " TEXT, "
                + KEY_OPCAO1 + " TEXT, "
                + KEY_OPCAO2 + " TEXT, "
                + KEY_OPCAO3 + " TEXT, "
                + KEY_OPCAO4 + " TEXT, "
                +KEY_RESPOSTA+" TEXT)";
        db.execSQL(sqlQuery);
        addQuestions();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE);
        // Create tables again
        onCreate(db);
    }

    private void addQuestions(){
        Pergunta p0=new Pergunta("Tireóide","Sobre a glândula, é correto dizer que:","É a segunda glândula a se desenvolver.","Possui intensa atividade apenas em adultos.","É formada por células diferenciadas, os folículos.","Seus hormônios são produtos da assimilação de Potássio.","É formada por células diferenciadas, os folículos.");
        this.addQuestion(p0);
        Pergunta p1=new Pergunta("Tireóide","Sobre conhecimentos morfofisiológicos da glândula Tireóide assinale a alternativa incorreta:","Células foliculares são formadas em seu interior por uma região chamada Colóide, armazenadora dos hormônios tireoidianos.","Paratireoide são quatro pequenas glândulas endócrinas próximas à tireoide importante para homeostase do Magnésio.","Tireóide assimila o íon iodo e para síntese hormonal precisa de pois oxidar esse íon, convertendo em iodo (I2) para eficaz assimilação.","Tireoglobulina é o peptídeo base para formação dos hormônios T3 e T4.","Paratireoide são quatro pequenas glândulas endócrinas próximas à tireoide importante para homeostase do Magnésio.");
        this.addQuestion(p1);
        Pergunta p2=new Pergunta("Tireóide","Sobre a formação dos Hormônios T3 e T4, é incorreto o que se informa em:"," Tireoglobulina possui anéis benzênicos (A e B), os quais incorporam apenas um iodo."," Se dois iodos se ligam ao anel A e 1 se liga ao anel B há a formação de Triodotrionina."," Se um iodo se liga ao anel A e dois se ligam ao anel B há a formação de treodina que é inativa."," Se há incorporação de quatro iodos no anel há a fomação de Tiroxina.","  Tireoglobulina possui anéis benzênicos (A e B) os quais incorporam apenas um iodo.");
        this.addQuestion(p2);
        Pergunta p3=new Pergunta("Tireóide","Conhecimentos gerais sobre o iodo, hormônios T3 e T4, e fisiopatologias assinale a correta:"," Doença de Graves é uma patologia autoimune que atinge diferentes tecidos, a exemplo de alterações no nervo óptico e distúrbios no Sistema nervoso central."," Há a necessidade de 150 gramas de iodo que devem ser consumidas semanalmente."," Cretinismo é uma deficiência renal consequente do hipotireoidismo."," Bócio, Hipo/hipertireioidismo são patologias relacionadas apenas à concentração de I2."," Doença de Graves é uma patologia autoimune que atinge diferentes tecidos, a exemplo de alterações no nervo óptico e distúrbios no Sistema nervoso central");
        this.addQuestion(p3);
        Pergunta p4=new Pergunta("Tireóide","Sobre os mecanismos de síntese dos hormônios tireoidianos assinale a correta:"," A peroxidase tireioide é a enzima responsável pelas fases de Oxidação, organização e acoplamento durante a produção de T3 e T4."," Para fase de clivagem das ligações com a tireoglobulina, o complexo formado pelo peptídeo + DIT+MIT+ T3 + T4, é transportado para o peroxissomo."," Para o íon adentrar a célula precisa de um cotransportador com o hidrogênio e posteriormente pela membrana sofre um contratransporte com cloreto, sendo o iodo colocado para fora próximo à região do coloide (canal de Fendrick)."," DIT (Diiodotirosina) + MIT (Monoidotirosina) formam o T4."," A peroxidase tireioide é a enzima responsável pelas fases de Oxidação, organização e acoplamento durante a produção de T3 e T4.");
        this.addQuestion(p4);
        Pergunta p5=new Pergunta("Glândula Adrenal","Em cada uma das 3 zonas do córtex adrenal é produzido um hormônio diferente. São eles:","Glomerular: Aldosterona"," Fasciculada: Cortisol"," Reticular: esteróides androgênicos."," Glomerular: Cortisol"," Fasciculada: Esteroides androgênicos");
        this.addQuestion(p5);
        Pergunta p6=new Pergunta("Glândula Adrenal","Qual o precursor dos hormônios do córtex adrenal?"," Aminoácidos."," Esteróides (Colesterol)."," Peptídeos."," Carboidratos."," Esteróides (Colesterol).");
        this.addQuestion(p6);
        Pergunta p7=new Pergunta("Glândula Adrenal","A aldosterona, hormônio produzido na zona glomerular do córtex adrenal, possui como função:"," Manutenção da temperatura corporal."," Regulação do ciclo circadiano."," Manutenção dos níveis de glicose no sangue."," Regulação do balanço eletrolítico."," Regulação do balanço eletrolítico.");
        this.addQuestion(p7);
        Pergunta p8=new Pergunta("Glândula Adrenal","A Doença de Addison se trata de um distúrbio onde:"," Ocorre a destruição das células do córtex adrenal, e a consequente deficiência na produção dos hormônios do córtex."," Multiplicação desenfreada das células adrenais, tendo como consequência, a disfunção da glândula."," Alteração na produção dos hormônios devido um acumulo de líquido na glândula."," Disfunção do órgão gerado por um processo inflamatório causado por mecanismos autoimune."," Ocorre a destruição das células do córtex adrenal, e a consequente deficiência na produção dos hormônios do córtex.");
        this.addQuestion(p8);
        Pergunta p9=new Pergunta("Glândula Adrenal","Os principais sintomas da Doença de Addison são:"," Palidez, sobrepeso, tosse, secreção nasal."," Distúrbios alimentares, problemas gástricos, cansaço."," Hiperpigmentação labial, fadiga, náusea, escurecimento da pele e tontura ao levantar."," Dores abdominais, fadiga, surgimento de cancros na pele, tontura ao levantar."," Hiperpigmentação labial, fadiga, náusea, escurecimento da pele e tontura ao levantar.");
        this.addQuestion(p9);
        Pergunta p10=new Pergunta("Pâncreas","O pâncreas é uma glândula localizada atrás do estômago que produz hormônios e enzimas que participam do processo de digestão. Em virtude da capacidade de produzir hormônios e enzimas, o pâncreas é considerado uma glândula:"," endócrina"," glicêmica","  mista"," exócrina"," mista.");
        this.addQuestion(p10);
        Pergunta p11=new Pergunta("Pâncreas","Em 1869, um patologista alemão descreveu aglomerados de células formando estruturas arredondadas ou ovoides, dispersas no tecido pancreático. Essas estruturas chegaram à literatura com o nome de:"," Ilhotas de Burdach."," Ilhotas de Langerhans."," Ilhotas de células."," Ilhotas de Ludwig."," Ilhotas de Langerhans.");
        this.addQuestion(p11);
        Pergunta p12=new Pergunta("Pâncreas","Nas ilhotas pancreáticas existem três tipos de células, um deles é responsável pela produção de um dos hormônios que ajudam na regulação da glicose sanguínea, a insulina. Essas são denominadas:"," Células Alfa."," Células Beta."," Células Gama."," Células Delta."," Células Beta.");
        this.addQuestion(p12);
        Pergunta p13=new Pergunta("Pâncreas","O pâncreas é uma glândula que, além de enzimas digestivas, é responsável pela produção de dois hormônios denominados de:"," Adrenalina e noradrenalina."," FSH e LH."," Insulina e glucagon."," Progesterona e testosterona."," Insulina e glucagon.");
        this.addQuestion(p13);
        Pergunta p14=new Pergunta("Pâncreas","A produção de suco pancreático é feita por estímulos nervosos e também por fatores hormonais. Analise as alternativas a seguir e marque o nome dos hormônios que estimulam a liberação desse suco."," Cortisol e progesterona."," Prolactina e ocitocina."," Somatotrofina e hormônio luteinizante."," Secretina e pancreosina."," Secretina e pancreosina.");
        this.addQuestion(p14);


        //tableToString(dbTipad,TABLE);
    }

    public void addQuestion(Pergunta pergunta) {
        ContentValues values = new ContentValues();
        values.put(KEY_ASSUNTO, pergunta.getAssunto());
        values.put(KEY_PERGUNTA, pergunta.getPergunta());
        values.put(KEY_OPCAO1, pergunta.getopcao1());
        values.put(KEY_OPCAO2, pergunta.getopcao2());
        values.put(KEY_OPCAO3, pergunta.getopcao3());
        values.put(KEY_OPCAO4, pergunta.getopcao4());
        values.put(KEY_RESPOSTA, pergunta.getresposta());

        // Inserindo linha
        dbTipad.insert(TABLE, null, values);
    }

    public List<Pergunta> getAllQuestionsByAssunto(String assunto) {
        List<Pergunta> perguntasList = new ArrayList<Pergunta>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE + " WHERE assunto = "+"\""+assunto+"\"";
        Log.i("DATABASE", "Query: "+selectQuery);

        dbTipad=this.getReadableDatabase();
        Cursor cursor = dbTipad.rawQuery(selectQuery, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Pergunta pergunta = new Pergunta();
                pergunta.setId(cursor.getInt(0));
                pergunta.setAssunto(cursor.getString(1));
                pergunta.setPergunta(cursor.getString(2));
                pergunta.setopcao1(cursor.getString(3));
                pergunta.setopcao2(cursor.getString(4));
                pergunta.setopcao3(cursor.getString(5));
                pergunta.setopcao4(cursor.getString(6));
                pergunta.setresposta(cursor.getString(7));
                perguntasList.add(pergunta);
            } while (cursor.moveToNext());
        }
        // return pergunta list
        return perguntasList;
    }

    public String tableToString(SQLiteDatabase db, String tableName) {
        Log.d("","tableToString called");
        String tableString = String.format("Table %s:\n", tableName);
        Cursor allRows  = db.rawQuery("SELECT * FROM " + tableName, null);
        tableString += cursorToString(allRows);
        return tableString;
    }

    public String cursorToString(Cursor cursor){
        String cursorString = "";
        if (cursor.moveToFirst() ){
            String[] columnNames = cursor.getColumnNames();
            for (String name: columnNames)
                cursorString += String.format("%s ][ ", name);
            cursorString += "\n";
            do {
                for (String name: columnNames) {
                    cursorString += String.format("%s ][ ",
                            cursor.getString(cursor.getColumnIndex(name)));
                }
                cursorString += "\n";
            } while (cursor.moveToNext());
        }
        return cursorString;
    }
}
