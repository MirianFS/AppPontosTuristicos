package com.example.mirian.myapplication.BancoDeDados;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.mirian.myapplication.Model.PontoTuristico;

/**
 * Created by Mirian on 12/06/2017.
 */

public class BDPontoTuristico extends SQLiteOpenHelper {

    private static final int VERSAO_BANCO =1;
    private static final String BANCO_PONTOTURISTICO = "bd_pontoturistico";

    private static final String TABELA_PONTOTURISTICO = "tb_pontoturistico";

    private static final String COLUNA_CODIGO = "codigo";
    private static final String COLUNA_NOME = "nome";
    private static final String COLUNA_FOTO = "foto";
    private static final String COLUNA_LOCAL = "local";
    private static final String COLUNA_DESCRICAO = "descricao";
    private static final String COLUNA_DATA = "data";
    private static final String COLUNA_ENTRADA = "entrada";


    public BDPontoTuristico(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, BANCO_PONTOTURISTICO, null, VERSAO_BANCO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String QUERY_COLUNA = "CREATE TABLE" + TABELA_PONTOTURISTICO + "("
                + COLUNA_CODIGO + " INTEGER PRIMARY KEY, "
                + COLUNA_NOME + " TEXT,"
                + COLUNA_FOTO + " TEXT"
                + COLUNA_LOCAL + " TEXT"
                + COLUNA_DESCRICAO + "TEXT"
                + COLUNA_DATA + " TEXT"
                + COLUNA_ENTRADA + " TEXT)";

        db.execSQL(QUERY_COLUNA);
    }

    void adicionarPontoTuristico (PontoTuristico pontoTuristico){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(COLUNA_NOME, pontoTuristico.getNome());
        values.put(COLUNA_FOTO, pontoTuristico.getFoto());
        values.put(COLUNA_LOCAL, pontoTuristico.getLocal());
        values.put(COLUNA_DESCRICAO, pontoTuristico.getDescricao());
        values.put(COLUNA_DATA, pontoTuristico.getData());
        values.put(COLUNA_ENTRADA, pontoTuristico.getEntrada());

        db.insert(TABELA_PONTOTURISTICO, null, values);
        db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
