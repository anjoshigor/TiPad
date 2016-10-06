package com.anjoshigor.tipad;

/**
 * Created by anjoshigor on 05/10/16.
 */

public class Pergunta {
    private int id;
    private String pergunta;
    private String opcao1, opcao2, opcao3, opcao4;
    private String resposta;

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    private String assunto;

    public Pergunta(){
        this.id = 0;
        this.assunto = "Pancreas";
        this.pergunta = "Pergunta Padrão";
        this.opcao1 = "Resposta 1";
        this.opcao2 = "Resposta 2";
        this.opcao3 = "Resposta 3";
        this.opcao4 = "Resposta 4";
        this.resposta = opcao1;
    }

    public Pergunta(String assunto, String pergunta, String opcao1, String opcao2, String opcao3,
                    String opcao4, String resposta){
        this.assunto = assunto;
        this.pergunta = pergunta;
        this.opcao1 = opcao1;
        this.opcao2 = opcao2;
        this.opcao3 = opcao3;
        this.opcao4 = opcao4;
        this.resposta = resposta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getopcao1() {
        return opcao1;
    }

    public void setopcao1(String opcao1) {
        this.opcao1 = opcao1;
    }

    public String getopcao2() {
        return opcao2;
    }

    public void setopcao2(String opcao2) {
        this.opcao2 = opcao2;
    }

    public String getopcao3() {
        return opcao3;
    }

    public void setopcao3(String opcao3) {
        this.opcao3 = opcao3;
    }

    public String getopcao4() {
        return opcao4;
    }

    public void setopcao4(String opcao4) {
        this.opcao4 = opcao4;
    }

    public String getresposta() {
        return resposta;
    }

    public void setresposta(String resposta) {
        this.resposta = resposta;
    }
}
