package com.example.mirian.myapplication.Model;

/**
 * Created by Mirian on 12/06/2017.
 */

public class PontoTuristico {
    int codigo;
    String nome;
    String foto;
    String local;
    String descricao;
    String data;
    String entrada;

    public PontoTuristico(){

    }

    public PontoTuristico (int codigo, String nome, String foto, String local, String descricao, String data, String entrada){
        this.codigo = codigo;
        this.nome = nome;
        this.foto = foto;
        this.local = local;
        this.descricao = descricao;
        this.data = data;
        this.entrada = entrada;
    }

    public PontoTuristico (String nome, String foto, String local, String descricao, String data, String entrada){
        this.nome = nome;
        this.foto = foto;
        this.local = local;
        this.descricao = descricao;
        this.data = data;
        this.entrada = entrada;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }
}
