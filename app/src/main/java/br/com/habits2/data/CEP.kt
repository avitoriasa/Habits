package br.com.habits2.data

import com.google.gson.annotations.SerializedName

class CEP {

    @SerializedName("cep") val cep: String;
    @SerializedName("uf") val uf: String;
    @SerializedName("complemento") val complemento: String;
    @SerializedName("bairro") val bairro: String;
    @SerializedName("rua") val rua: String;
    @SerializedName("numero") val numero: String;

}