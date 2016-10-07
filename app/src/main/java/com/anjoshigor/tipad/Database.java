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
        Pergunta p1=new Pergunta("Tireóide","Sobre conhecimentos morfofisiológicos da glândula Tireoide assinale a alternativa incorreta:"," Células foliculares são formadas em seu interior por uma região chamada Colóide, armazenadora dos hormônios tireoidianos."," Paratireoide são quatro pequenas glândulas endócrinas próximas à tireoide importante para homeostase do Magnésio."," Tireoide assimila o íon iodo e para síntese hormonal precisa de pois oxidar esse íon, convertendo em iodo (I2) para eficaz assimilação."," Tireoglobulina é o peptídeo base para formação dos hormônios T3 e T4."," Paratireoide são quatro pequenas glândulas endócrinas próximas à tireoide importante para homeostase do Magnésio.");
        this.addQuestion(p1);
        Pergunta p2=new Pergunta("Tireóide","Sobre a formação dos Hormônios T3 e T4, é incorreto o que se informa em:"," Tireoglobulina possui anéis benzênicos (A e B), os quais incorporam apenas um iodo."," Se dois iodos se ligam ao anel A e 1 se liga ao anel B há a formação de Triodotrionina."," Se um iodo se liga ao anel A e dois se ligam ao anel B há a formação de treodina que é inativa."," Se há incorporação de quatro iodos no anel há a fomação de Tiroxina."," Tireoglobulina possui anéis benzênicos (A e B) os quais incorporam apenas um iodo.");
        this.addQuestion(p2);
        Pergunta p3=new Pergunta("Tireóide","Conhecimentos gerais sobre o iodo, hormônios T3 e T4, e fisiopatologias assinale a correta:"," Doença de Graves é uma patologia autoimune que atinge diferentes tecidos, a exemplo de alterações no nervo óptico e distúrbios no Sistema nervoso central."," Há a necessidade de 150 gramas de iodo que devem ser consumidas semanalmente."," Cretinismo é uma deficiência renal consequente do hipotireoidismo."," Bócio, Hipo/hipertireioidismo são patologias relacionadas apenas à concentração de I2."," Doença de Graves é uma patologia autoimune que atinge diferentes tecidos, a exemplo de alterações no nervo óptico e distúrbios no Sistema nervoso central.");
        this.addQuestion(p3);
        Pergunta p4=new Pergunta("Tireóide","Sobre os mecanismos de síntese dos hormônios tireoidianos assinale a correta:"," A peroxidase tireioide é a enzima responsável pelas fases de Oxidação, organização e acoplamento durante a produção de T3 e T4."," Para fase de clivagem das ligações com a tireoglobulina, o complexo formado pelo peptídeo + DIT+MIT+ T3 + T4, é transportado para o peroxissomo."," Para o íon adentrar a célula precisa de um cotransportador com o hidrogênio e posteriormente pela membrana sofre um contratransporte com cloreto, sendo o iodo colocado para fora próximo à região do coloide (canal de Fendrick)."," DIT (Diiodotirosina) + MIT (Monoidotirosina) formam o T4."," A peroxidase tireioide é a enzima responsável pelas fases de Oxidação, organização e acoplamento durante a produção de T3 e T4.");
        this.addQuestion(p4);
        Pergunta p5=new Pergunta("Tireóide","Assinale a incorreta:"," A síntese de T4 é maior que a de T3."," A maioria das células possui receptor na membrana para T3."," T3 e T4 por serem derivados de um aminoácido são Hidrofílicos, logo não precisam de transportadores."," Desiodase II é uma enzima que converte T4 em T3."," T3 e T4 por serem derivados de um aminoácido são Hidrofílicos, logo não precisam de transportadores.");
        this.addQuestion(p5);
        Pergunta p6=new Pergunta("Tireóide","Sobre a localização das estruturas envolvidas na liberação dos hormônios assinale a sequência correta:"," Sistema Porta-hipofisário (PVN e NA), Eminência média, Circulação sanguínea, Adenohipófise, Tireoide."," Sistema Porta-hipofisário (PVN e NA), Eminência Média, Adenohipófise, Circulação sanguínea, Tireoide."," Sistema Porta-hipofisário (PVN e NA), Circulação sanguínea, Eminência Média, Neuro-hipófise, Tireoide."," Sistema porta-hipotálamo (PVN e NA), Eminência média, Neuro-hipófise, Circulação sanguínea, Tireoide."," Sistema Porta-hipofisário (PVN e NA), Eminência Média, Adenohipófise, Circulação sanguínea, Tireoide.");
        this.addQuestion(p6);
        Pergunta p7=new Pergunta("Tireóide","Agora, sobre a cascata de sinalização envolvida na liberação dos hormônios é correto afirmar:"," TSH (Hormônio estimulante da Tireoide) estimula a via da Gi, aumentando a captação do Iodo."," TSH estimula as vias da PKC e PKG, aumentando o influxo de iodo e diminuindo o efeito trófico, respectivamente."," TSH estimula as vias da PKA e da PKC, aumentando a síntese e inserção do próprio receptor do TSH e aumentando a geração de H2O2."," TSH estimula a liberação de T3 e T4 por ativar a via da PKA, diminuindo o efluxo de iodo, e por mecanismo de realimentação positiva, aumentar a captação de iodo quando os níveis de tireoglobulina estão altos."," TSH estimula as vias da PKA e da PKC, aumentando a síntese e inserção do próprio receptor do TSH e aumentando a geração de H2O2.");
        this.addQuestion(p7);
        Pergunta p8=new Pergunta("Tireóide","O estímulo nos núcleos do hipotálamo para liberação de TRH e na inserção ou diminuição de receptores para TRH nas células tireotróficas da adeno-hipófise ocorrem, por realimentação negativa, pela modulação de:"," Ausência/Presença de TSH sanguíneo."," Assimilação do Iodo."," Concentração de T3 e T4."," Inserção de receptores na adenohipófise."," Concentração de T3 e T4.");
        this.addQuestion(p8);
        Pergunta p9=new Pergunta("Tireóide","Assinale a alternativa correta sobre as patologias envolvidas com a tireoide."," Insuficiência primária ocorre quando a doença acomete a glândula e é percebida na Doença de Graves que produz bastantes hormônios tireoidianos."," Aumento na concentração de T3 e T4 é característica de hipotireoidismo."," Diminuição na concentração de T3 e T4 é característica do Bócio."," Aumento de TSH é característica exclusiva identificação do hipertireoidismo."," Insuficiência primária ocorre quando a doença acomete a glândula e é percebida na Doença de Graves que produz bastantes hormônios tireoidianos.");
        this.addQuestion(p9);
        Pergunta p10=new Pergunta("Tireóide","Conhecimentos gerais sobre a Glândula Tireoide assinale a alternativa correta:"," Não há liberação basal de seus hormônios, sendo sintetizados apenas mediante a um estímulo."," São poucas as células que contêm receptores para seus hormônios."," O receptor específico para os hormônios é nuclear."," A ação em tecidos específicos é a diminuição do consumo de oxigênio."," O receptor específico para os hormônios é nuclear.");
        this.addQuestion(p10);
        Pergunta p11=new Pergunta("Tireóide","São algumas modulações das atividades dos hormônios tireoidianos, exceto:"," Catabolismo proteico em adultos."," Anabolismo proteico em crianças."," Produção de novas enzimas."," Redução do catabolismo de ácidos nucleicos."," Redução do catabolismo de ácidos nucleicos.");
        this.addQuestion(p11);
        Pergunta p12=new Pergunta("Tireóide","Conhecimentos gerais sobre os hormônios e a glândula assinale a alternativa CORRETA."," A natureza química dos hormônios é uma amina iodada."," Células foliculares da tireoide são células totipotentes."," Todos os hormônios são hidrossolúveis, derivados de um aminoácido, não precisando de transportadores específicos."," A biossíntese dos hormônios é a partir do iodo e da hemoglobina."," A natureza química dos hormônios é uma amina iodada.");
        this.addQuestion(p12);
        Pergunta p13=new Pergunta("Tireóide","Sobre o Hipotireoidismo, Hipertireoidismo e o bócio, assinale a alternativa correta:"," Bócio é o desenvolvimento da glândula devido ao aumento do TSH no plasma. Dependendo da insuficiência, pode se manifestar no hipotireoidismo ou no hipertireoidismo."," Hipertireoidismo provoca perda de peso, aumento de ingestão alimentar (fome), alto metabolismo, provocando também calor excessivo."," Hipotireoidismo é uma destruição autoimune da tireoide, logo nas células tireoidianas há um aumento da concentração de T3 e T4."," No Hipotireoidismo, na insuficiência há uma inibição do Núcleo paraventricular e Núcleo arqueado, respectivamente (NPV e NA). Há também a diminuição da síntese proteica."," Bócio é o desenvolvimento da glândula devido ao aumento do TSH no plasma. Dependendo da insuficiência, pode se manifestar no hipotireoidismo ou no hipertireoidismo.");
        this.addQuestion(p13);
        Pergunta p14=new Pergunta("Tireóide","Tratando-se em patologias tratamentos como medicamentos são antagonistas aos receptores, quando não resolvem, amenizam os sintomas. Em casos mais graves há a necessidade da remoção da glândula. Assinale a INCORRETA:"," Problemas na glândula podem causar alterações peso, na memória, na fertilidade, na concentração e no controle emocional."," Disfunções na tireoide acontecem apenas na fase adulta. Além disso, elas podem ocorrer mesmo sem a manifestação do bócio."," A doença de Graves é a causa mais comum de hipertireoidismo. Ela ocorre quando o sistema imunológico ataca a glândula tireoide, provocando produção excessiva de hormônios."," Cansaço, fadiga, calor excessivo, mãos trêmulas são alguns sintomas do hipertireoidismo."," Disfunções na tireoide acontecem apenas na fase adulta. Além disso, elas podem ocorrer mesmo sem a manifestação do bócio.");
        this.addQuestion(p14);
        Pergunta p15=new Pergunta("Glândula Adrenal","Em cada uma das 3 zonas do córtex adrenal é produzido um hormônio diferente. São eles:","Glomerular: Aldosterona\nFasciculada: Cortisol\nReticular: esteróides androgênicos."," Glomerular: Cortisol\nFasciculada: Esteroides androgênicos\nReticular: Hormônio Folículo Estimulante.","Glomerular: Aldosterona\nFasciculada:Noradrenalina\nReticular: Dopamina.","Glomerular:Aldosterona\nFasciculada: Hormônio Folículo Estimulante\nReticular: Esteroides androgênicos.","Glomerular: Aldosterona\nFasciculada: Cortisol\nReticular: esteróides androgênicos.");
        this.addQuestion(p15);
        Pergunta p16=new Pergunta("Glândula Adrenal","Qual o precursor dos hormônios do córtex adrenal?"," Aminoácidos."," Esteróides (Colesterol)."," Peptídeos."," Carboidratos."," Esteróides (Colesterol).");
        this.addQuestion(p16);
        Pergunta p17=new Pergunta("Glândula Adrenal","A aldosterona, hormônio produzido na zona glomerular do córtex adrenal, possui como função:"," Manutenção da temperatura corporal."," Regulação do ciclo circadiano."," Manutenção dos níveis de glicose no sangue."," Regulação do balanço eletrolítico."," Regulação do balanço eletrolítico.");
        this.addQuestion(p17);
        Pergunta p18=new Pergunta("Glândula Adrenal","A Doença de Addison se trata de um distúrbio onde:"," Ocorre a destruição das células do córtex adrenal, e a consequente deficiência na produção dos hormônios do córtex."," Multiplicação desenfreada das células adrenais, tendo como consequência, a disfunção da glândula."," Alteração na produção dos hormônios devido um acumulo de líquido na glândula."," Disfunção do órgão gerado por um processo inflamatório causado por mecanismos autoimune."," Ocorre a destruição das células do córtex adrenal, e a consequente deficiência na produção dos hormônios do córtex.");
        this.addQuestion(p18);
        Pergunta p19=new Pergunta("Glândula Adrenal","Os principais sintomas da Doença de Addison são:"," Palidez, sobrepeso, tosse, secreção nasal."," Distúrbios alimentares, problemas gástricos, cansaço."," Hiperpigmentação labial, fadiga, náusea, escurecimento da pele e tontura ao levantar."," Dores abdominais, fadiga, surgimento de cancros na pele, tontura ao levantar."," Hiperpigmentação labial, fadiga, náusea, escurecimento da pele e tontura ao levantar.");
        this.addQuestion(p19);
        Pergunta p20=new Pergunta("Glândula Adrenal","Se tratando da Doença de Addison, (que trata-se da destruição das células do córtex adrenal) qual o tratamento mais adequado que deve-se tomar ao se tratar dessa doença?"," Tomar hormônios para repor aqueles não produzidos pelas glândulas suprarrenais."," Melhorar a alimentação e adquirir hábitos saudáveis."," Fazer uso de medicamentos anti-inflamatórios e praticar atividade física."," Fazer uso de medicamentos que inibam a ação da glândula."," Tomar hormônios para repor aqueles não produzidos pelas glândulas suprarrenais.");
        this.addQuestion(p20);
        Pergunta p21=new Pergunta("Glândula Adrenal","A síntese de aldosterona é regulada por vários fatores, sendo seus principais:"," Níveis de osmolalidade do sistema."," Sistema renina-angiotensina-aldosterona e a concentração do íon potássio."," Concentrações sanguíneas de sódio e potássio."," Mudanças de temperatura corporal."," Sistema renina-angiotensina-aldosterona e a concentração do íon potássio.");
        this.addQuestion(p21);
        Pergunta p22=new Pergunta("Glândula Adrenal","A Síndrome de Cushing se trata de uma desordem endócrina, causada por:"," Níveis elevados de glicocorticoides, especialmente cortisol, no sangue.","Níveis abaixo do normal de glicocorticoides, especialmente cortisol, no sangue."," Alteração dos níveis de glicocorticoides no sangue ao longo do dia."," Ausência de glicocorticoides no sangue."," Níveis elevados de glicocorticoides, especialmente cortisol, no sangue.");
        this.addQuestion(p22);
        Pergunta p23=new Pergunta("Glândula Adrenal","Quais são os sintomas da Síndrome de Cushing?"," Magreza, perda de apetite, redução do desejo sexual, apatia."," Obesidade, distúrbios de comportamento, sensibilidade excessiva."," Perda da sensibilidade, hiperpigmentação labial, escurecimento da pele."," Face arredondada (face de lua cheia), obesidade centrípeta, hipertensão, excesso de gordura entre os ombros e acima das clavículas."," Face arredondada (face de lua cheia), obesidade centrípeta, hipertensão, excesso de gordura entre os ombros e acima das clavículas.");
        this.addQuestion(p23);
        Pergunta p24=new Pergunta("Glândula Adrenal","O cortisol, hormônio produzido pelo córtex adrenal, possui como efeitos no organismo:"," Aumenta a síntese e liberação de aquaporinas, agindo na regulação osmótica."," Controla os níveis de sódio no organismo e promove a liberação de ADH."," Age no metabolismo de proteínas, lipídeos e carboidratos, e afeta os níveis de glicose no sangue, protegendo o organismo contra a hipoglicemia."," Crescimento de massa muscular e sua definição, engrossamento da voz, estatura, crescimento de pelos no corpo."," Age no metabolismo de proteínas, lipídeos e carboidratos, e afeta os níveis de glicose no sangue, protegendo o organismo contra a hipoglicemia.");
        this.addQuestion(p24);
        Pergunta p25=new Pergunta("Glândula Adrenal","O cortisol possui, além das suas funções principais, o efeito de diminuição da permeabilidade dos capilares sanguíneos. Devido a esta propriedade, é comumente utilizado clinicamente, pois possui como ação:"," Ação antiespasmódica, suprimindo a contração do tecido muscular liso, especialmente em órgãos tubulares."," Analgésica e antipirética, utilizando contra infecções causadas por microrganismos."," Antidepressivo, agindo para aumentar os níveis de serotonina."," Ação anti-inflamatória, gerada por inflamações por processos alérgicos."," Ação anti-inflamatória, gerada por inflamações por processos alérgicos.");
        this.addQuestion(p25);
        Pergunta p26=new Pergunta("Glândula Adrenal","A respeito da localização, morfologia e fisiologia, as adrenais:"," São glândulas localizadas próximo ao musculo mastoide, com cerca de 5 cm. É revestido por uma camada fina, capaz de permitir a passagem de seus hormônios para a corrente sanguínea."," Glândulas que possuem a forma de um feijão, localizadas próximo as vertebras cervicais, com função de produzir hormônios peptídicos."," Glândula localizada no baixo ventre, com formato esférico, responsável por modular a concentração de glicose no sangue."," São glândulas localizadas na cavidade abdominal, anterosuperiormente aos rins, com cerca de 5 cm. São constituídas por duas partes histologicamente distintas (medula e córtex), e tem como função, a produção de diversos hormônios."," São glândulas localizadas na cavidade abdominal, anterosuperiormente aos rins, com cerca de 5 cm. São constituídas por duas partes histologicamente distintas (medula e córtex), e tem como função, a produção de diversos hormônios.");
        this.addQuestion(p26);
        Pergunta p27=new Pergunta("Glândula Adrenal","O que estimula a secreção de glicocorticoides?"," A liberação de ACTH (corticotropina) pela adeno-hipófise."," O aumento da concentração osmótica no sangue."," A ausência de ADH."," O aumento da concentração sanguínea de glicose."," A liberação de ACTH (corticotropina) pela adeno-hipófise.");
        this.addQuestion(p27);
        Pergunta p28=new Pergunta("Glândula Adrenal","Na parte medular da glândula adrenal se produz que tipo de hormônio?"," Catecolaminas."," Esteróides."," Pré-hormonios."," Homonios andrógenos."," Catecolaminas.");
        this.addQuestion(p28);
        Pergunta p29=new Pergunta("Glândula Adrenal","Que mecanismo se dá na estimulação da aldosterona?"," Será estimulada pela baixa concentração osmótica."," É estimulada pelos altos índices de glicose no sangue."," A estimulação da aldosterona é feita pelos níveis de Ang II e de potássio sérico (se o potássio está elevado, a aldosterona elimina potássio e reabsorve sódio e água)."," A estimulação da aldosterona é feita pelos níveis sódio, e de ANP, que age inibindo o sistema renina/angiotensina."," A estimulação da aldosterona é feita pelos níveis de Ang II e de potássio sérico (se o potássio está elevado, a aldosterona elimina potássio e reabsorve sódio e água).");
        this.addQuestion(p29);
        Pergunta p30=new Pergunta("Pâncreas","O pâncreas é uma glândula localizada atrás do estômago que produz hormônios e enzimas que participam do processo de digestão. Em virtude da capacidade de produzir hormônios e enzimas, o pâncreas é considerado uma glândula:","endócrina","glicêmica","mista","exócrina","mista");
        this.addQuestion(p30);
        Pergunta p31=new Pergunta("Pâncreas","Em 1869, um patologista alemão descreveu aglomerados de células formando estruturas arredondadas ou ovoides, dispersas no tecido pancreático. Essas estruturas chegaram à literatura com o nome de:"," Ilhotas de Burdach"," Ilhotas de Langerhans"," Ilhotas de células"," Ilhotas de Ludwig"," Ilhotas de Langerhans");
        this.addQuestion(p31);
        Pergunta p32=new Pergunta("Pâncreas","Nas ilhotas pancreáticas existem três tipos de células, um deles é responsável pela produção de um dos hormônios que ajudam na regulação da glicose sanguínea, a insulina. Essas são denominadas:"," Células Alfa"," Células Beta"," Células Gama"," Células Delta"," Células Beta");
        this.addQuestion(p32);
        Pergunta p33=new Pergunta("Pâncreas","O pâncreas é uma glândula que, além de enzimas digestivas, é responsável pela produção de dois hormônios denominados de:"," Adrenalina e noradrenalina"," FSH e LH"," Insulina e glucagon"," Progesterona e testosterona"," Insulina e glucagon");
        this.addQuestion(p33);
        Pergunta p34=new Pergunta("Pâncreas","A produção de suco pancreático é feita por estímulos nervosos e também por fatores hormonais. Analise as alternativas a seguir e marque o nome dos hormônios que estimulam a liberação desse suco."," Cortisol e progesterona"," Prolactina e ocitocina"," Somatotrofina e hormônio luteinizante"," Secretina e pancreosina"," Secretina e pancreosina");
        this.addQuestion(p34);
        Pergunta p35=new Pergunta("Pâncreas","No diabetes tipo 1, o sistema imunológico do paciente ataca as células _________ do pâncreas."," Gama."," Alfa."," Ômega."," Beta."," Beta.");
        this.addQuestion(p35);
        Pergunta p36=new Pergunta("Pâncreas","O controle da produção hormonal do pâncreas se dá pela percepção do aumento ou diminuição do ATP (Adenosina trifosfato). Quais são as células sensíveis ao aumento do ATP e qual hormônio elas produzem?"," beta e insulina."," alfa e insulina."," beta e glucagon."," alfa e glucagon."," beta e insulina.");
        this.addQuestion(p36);
        Pergunta p37=new Pergunta("Pâncreas","A desfosforilação da glicogênio sintase acarreta a síntese de glicogênio no fígado e no músculo. Efeito estimulado pelo(a):"," Somatostatina."," Peptídeo pancreático."," Insulina."," Glucagon."," Insulina.");
        this.addQuestion(p37);
        Pergunta p38=new Pergunta("Pâncreas","A diabetes mellitus é uma patologia pancreática. Existem dois tipos gerais de diabetes mellitus, a tipo 1 e a tipo 2. Sobre a Tipo 1:"," Também chamada não resistência à insulina."," Lesão das células alfa pancreáticas."," Sensibilidade à insulina."," Lesão das células beta pancreáticas."," Lesão das células beta pancreáticas.");
        this.addQuestion(p38);
        Pergunta p39=new Pergunta("Pâncreas","O controle da produção hormonal do pâncreas se dá pela percepção do aumento ou diminuição do ATP (Adenosina trifosfato). Quais são as células sensíveis à diminuição do ATP e qual hormônio elas produzem?"," beta e insulina."," alfa e insulina."," beta e glucagon."," alfa e glucagon."," alfa e glucagon.");
        this.addQuestion(p39);
        Pergunta p40=new Pergunta("Pâncreas","Qual outro órgão do corpo humano que junto ao pâncreas regula os níveis de glicose no sangue?"," Estômago."," Intestino."," Vesícula."," Fígado."," Fígado.");
        this.addQuestion(p40);
        Pergunta p41=new Pergunta("Pâncreas","O pâncreas está interligado por um canal (canal de Wirsung e o ducto de Oddi) à uma porção do intestino delgado:"," Duodeno."," Jesuno."," Ceco."," Cólon sigmoide."," Duodeno.");
        this.addQuestion(p41);
        Pergunta p42=new Pergunta("Pâncreas","Nas ilhotas pancreáticas existem três tipos de células, um deles é responsável pela produção de um dos hormônios que ajudam na regulação da glicose sanguínea, o glucagon. Essas são denominadas:"," Células Delta."," Células Alfa."," Células Gama."," Células Beta."," Células Alfa.");
        this.addQuestion(p42);
        Pergunta p43=new Pergunta("Pâncreas","Nas ilhotas pancreáticas existem três tipos de células, um deles produz um hormônio que ativa a via da proteína Gi, inibindo a produção e secreção de dois outros hormônios. Essas são denominadas:"," Células Delta."," Células Alfa."," Células Gama."," Células Beta."," Células Delta.");
        this.addQuestion(p43);
        Pergunta p44=new Pergunta("Pâncreas","Qual hormônio produzido pelo próprio pâncreas é responsável pela inibição da produção e secreção de dois hormônios pancreáticos, e qual tipo de célula das ilhotas pancreáticas é responsável por esse hormônio?"," Insulina, células beta."," Glucagon, células alfa."," Somatostatina, células gama."," Somatostatina, células delta."," Somatostatina, células delta.");
        this.addQuestion(p44);
        Pergunta p45=new Pergunta("Hipófise/Hipotálamo","A palavra hormônio vem do Grego “HORMON” que significa “o que coloca em movimento”, de HORME, “impulso, início”. A respeito da definição moderna de hormônio indique a resposta correta:"," Substância química produzida por tecidos especializados e secretada na corrente sanguínea, onde é conduzida até os tecidos-alvo."," Substância química não nutriente, produzida por uma glândula, capaz de conduzir determinada informação entre uma ou mais células."," Substância química não nutriente capaz de conduzir determinada informação entre uma ou mais células."," Substância química nutriente capaz de conduzir determinada informação entre uma ou mais células."," Substância química não nutriente capaz de conduzir determinada informação entre uma ou mais células.");
        this.addQuestion(p45);
        Pergunta p46=new Pergunta("Hipófise/Hipotálamo","Sobre o hipotálamo assinale a alternativa correta:"," Apresenta grupamentos neuronais que se relacionam ao controle da função endócrina, os quais, em conjunto, constituem o chamado adeno-hipotálamo endocrino."," Apresenta grupamentos neuronais que se relacionam ao controle da função endócrina, os quais, em conjunto, constituem o chamado hipotálamo endocrino, o hipotálamo só possui neurônios magnocelulares."," Apresenta grupamentos neuronais que se relacionam ao controle da função endócrina, os quais, em conjunto, constituem o chamado hipotálamo endocrino, o hipotálamo só possui neurônios parvicelulares."," O hipotálamo é uma estrututa do sistema nervoso central que está envolvida em uma série de processos fisiólogicos, tais como controle da temperatura corporal e ingestão alimentar, apresentando neurônios parvi e magnocelulares."," O hipotálamo é uma estrututa do sistema nervoso central que está envolvida em uma série de processos fisiólogicos, tais como controle da temperatura corporal e ingestão alimentar, apresentando neurônios parvi e magnocelulares.");
        this.addQuestion(p46);
        Pergunta p47=new Pergunta("Hipófise/Hipotálamo","A respeito dos neurônios parvi e magnocelulares indique a alternativa incorreta:"," Os neurônios parvicelulares se dirigem à rede de capilares presente na eminência mediana do hipotálamo, pertencente ao sistema porta-hipotálamo-hipofisário e vão para a adeno-hipófise. Os neurônios magnocelulares se dirigem à neuro-hipófise."," Os neurônios magnocelulares se dirigem à rede de capilares presente na eminência mediana do hipotálamo, pertencente ao sistema porta - hipotálamo - hipofisário. Os neurônios parvicelulares se dirigem à neuro-hipófise."," Os peptídios neuro-hipofisários são sintetizados por neurônios hipotalâmicos específicos conhecidos como magnocelulares."," Os neurônios hipotalâmicos que se relacionam com a adeno-hipófise constituem o sistema parvicelular ou tuberoinfundibular."," Os neurônios magnocelulares se dirigem à rede de capilares presente na eminência mediana do hipotálamo, pertencente ao sistema porta - hipotálamo - hipofisário. Os neurônios parvicelulares se dirigem à neuro-hipófise.");
        this.addQuestion(p47);
        Pergunta p48=new Pergunta("Hipófise/Hipotálamo","A função do sistema porta–hipotálamo-hipofisário é:"," Levar informações da neuro-hipófise para a adeno-hipófise."," Trazer informações da adeno – hipófise para a neuro–hipófise."," Levar informação do hipotálamo para a hipófise."," Levar informação do hipotálamo para a adeno-hipófise."," Levar informação do hipotálamo para a adeno-hipófise.");
        this.addQuestion(p48);
        Pergunta p49=new Pergunta("Hipófise/Hipotálamo","Observe as alternativas a seguir e marque a que apresenta apenas hormônios produzidos pela neuro-hipófise:"," Ocitocina e vasopressina."," Prolactina e ocitocina."," Vasopressina e somatotrofina."," Tireotrofina e ocitocina."," Ocitocina e vasopressina.");
        this.addQuestion(p49);
        Pergunta p50=new Pergunta("Hipófise/Hipotálamo","Dos tipos celulares citados à baixo, quais fazem parte da adeno-hipófise?"," Corticotrofos e glomerulares."," Lactotrofos e fasciculadas."," Tireotrofos e somatotrofos."," Gonadotrofos e reticulares."," Tireotrofos e somatotrofos.");
        this.addQuestion(p50);
        Pergunta p51=new Pergunta("Hipófise/Hipotálamo","Analise as alternativas a seguir e marque a que indica apenas hormônios liberados pela adeno – hipófise."," Hormônio folículo estimulante e ocitocina."," Hormônio luteinizante e vasopressina."," Somatotrofina e prolactina."," Vasopressina e prolactina."," Somatotrofina e prolactina.");
        this.addQuestion(p51);
        Pergunta p52=new Pergunta("Hipófise/Hipotálamo","O hormônio antidiurético, ou ADH, é um hormônio produzido pelo hipotálamo e liberado pela neuroipófise. A falta de ADH leva a uma doença conhecida como:"," A diabetes mellitus."," Diabetes insipidus."," Diabete gestacional."," hipertireoidismo."," Diabetes insipidus.");
        this.addQuestion(p52);
        Pergunta p53=new Pergunta("Hipófise/Hipotálamo","Todas as glândulas citadas abaixo são controladas diretamente pela hipófise, exceto:"," Ovário."," Tireoide."," Pâncreas."," Suprarrenal."," Pâncreas.");
        this.addQuestion(p53);
        Pergunta p54=new Pergunta("Hipófise/Hipotálamo","Marque a alternativa que indique três hormônios produzidos pela hipófise que agem em outras glândulas:"," Luteinizante, Calcitonina e Glicocorticoides."," Adrenocorticotrófico, Tireoideotrópico, Luteinizante."," Glicocorticoides, Paratormônio e Adrenalina."," Adrenalina, Tiroxina e Triiodotironina."," Adrenocorticotrófico, Tireoideotrópico, Luteinizante.");
        this.addQuestion(p54);
        Pergunta p55=new Pergunta("Hipófise/Hipotálamo","O hormônio produzido pelo hipotálamo e armazenado pela neuro-hipófise que estimula a contração dos músculos do útero na hora do parto é:"," Insulina."," Hormônio luteinizante."," prolactina."," ocitocina."," ocitocina.");
        this.addQuestion(p55);
        Pergunta p56=new Pergunta("Hipófise/Hipotálamo","A somatotropina é um hormônio produzido pela adeno-hipófise, que age estimulando:"," crescimento."," Secreção de leite."," Produção de testosterona"," Absorção de cálcio pelo sangue."," crescimento.");
        this.addQuestion(p56);
        Pergunta p57=new Pergunta("Hipófise/Hipotálamo","Qual das alternativas apresenta a causa de inibição da secreção de hormônio do crescimento pela adeno-hipófise?"," Sono."," Estresse."," Puberdade."," Somatomedinas."," Somatomedinas.");
        this.addQuestion(p57);
        Pergunta p58=new Pergunta("Hipófise/Hipotálamo","Um homem de 50 anos foi diagnosticado com galactorreia. O médico prescreve bromocriptina. A base da ação terapêutica da bromocriptina é que ela:","Antagoniza a ação da prolactina sobre a mama.","Aumenta a ação da prolactina sobre a mama.","Inibe a liberação de prolactina pela adeno-hipófise.","Inibe a liberação de prolactina pelo hipotálamo.","Inibe a liberação de prolactina pela adeno-hipófise.");
        this.addQuestion(p58);
        Pergunta p59=new Pergunta("Hipófise/Hipotálamo","Qual das seguintes substâncias deriva da pró-opiomelanocortina (POMC)?","Hormônio adrenocorticotrófico (ACTH).","Hormônio foliculoestimulante (FSH).","Cortisol.","Deidroepiandrosterona.","Hormônio adrenocorticotrófico (ACTH).");
        this.addQuestion(p59);


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
