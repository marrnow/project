package com.example.bitcoin.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Big {
    @JsonProperty("USD")
    private USD usd;
    @JsonProperty("AUD")
    private AUD aud;
    @JsonProperty("BRL")
    private BRL brl;
    @JsonProperty("CAD")
    private CAD cad;
    @JsonProperty("CHF")
    private CHF chf;
    @JsonProperty("CLP")
    private CLP clp;
    @JsonProperty("CNY")
    private CNY cny;
    @JsonProperty("DKK")
    private DKK dkk;
    @JsonProperty("EUR")
    private EUR eur;
    @JsonProperty("GBP")
    private GBP gbp;
    @JsonProperty("HKD")
    private HKD hkd;
    @JsonProperty("INR")
    private INR inr;
    @JsonProperty("ISK")
    private ISK isk;
    @JsonProperty("JPY")
    private JPY jpy;
    @JsonProperty("KRW")
    private KRW krw;
    @JsonProperty("NZD")
    private NZD nzd;
    @JsonProperty("PLN")
    private PLN pln;
    @JsonProperty("RUB")
    private RUB rub;
    @JsonProperty("SEK")
    private SEK sek;
    @JsonProperty("SGD")
    private SGD sgd;
    @JsonProperty("THB")
    private THB thb;
    @JsonProperty("TRY")
    private TRY try1;
    @JsonProperty("TWD")
    private TWD twd;

    @Override
    public String toString() {
        return "Big{" +
                "usd=" + usd +
                ", aud=" + aud +
                ", brl=" + brl +
                ", cad=" + cad +
                ", chf=" + chf +
                ", clp=" + clp +
                ", cny=" + cny +
                ", dkk=" + dkk +
                ", eur=" + eur +
                ", gbp=" + gbp +
                ", hkd=" + hkd +
                ", inr=" + inr +
                ", isk=" + isk +
                ", jpy=" + jpy +
                ", krw=" + krw +
                ", nzd=" + nzd +
                ", pln=" + pln +
                ", rub=" + rub +
                ", sek=" + sek +
                ", sgd=" + sgd +
                ", thb=" + thb +
                ", try1=" + try1 +
                ", twd=" + twd +
                '}';
    }

    public CHF getChf() {
        return chf;
    }

    public void setChf(CHF chf) {
        this.chf = chf;
    }

    public USD getUsd() {
        return usd;
    }

    public void setUsd(USD usd) {
        this.usd = usd;
    }

    public AUD getAud() {
        return aud;
    }

    public void setAud(AUD aud) {
        this.aud = aud;
    }

    public BRL getBrl() {
        return brl;
    }

    public void setBrl(BRL brl) {
        this.brl = brl;
    }

    public CAD getCad() {
        return cad;
    }

    public void setCad(CAD cad) {
        this.cad = cad;
    }

    public CLP getClp() {
        return clp;
    }

    public void setClp(CLP clp) {
        this.clp = clp;
    }

    public CNY getCny() {
        return cny;
    }

    public void setCny(CNY cny) {
        this.cny = cny;
    }

    public DKK getDkk() {
        return dkk;
    }

    public void setDkk(DKK dkk) {
        this.dkk = dkk;
    }

    public EUR getEur() {
        return eur;
    }

    public void setEur(EUR eur) {
        this.eur = eur;
    }

    public GBP getGbp() {
        return gbp;
    }

    public void setGbp(GBP gbp) {
        this.gbp = gbp;
    }

    public HKD getHkd() {
        return hkd;
    }

    public void setHkd(HKD hkd) {
        this.hkd = hkd;
    }

    public INR getInr() {
        return inr;
    }

    public void setInr(INR inr) {
        this.inr = inr;
    }

    public ISK getIsk() {
        return isk;
    }

    public void setIsk(ISK isk) {
        this.isk = isk;
    }

    public JPY getJpy() {
        return jpy;
    }

    public void setJpy(JPY jpy) {
        this.jpy = jpy;
    }

    public KRW getKrw() {
        return krw;
    }

    public void setKrw(KRW krw) {
        this.krw = krw;
    }

    public NZD getNzd() {
        return nzd;
    }

    public void setNzd(NZD nzd) {
        this.nzd = nzd;
    }

    public PLN getPln() {
        return pln;
    }

    public void setPln(PLN pln) {
        this.pln = pln;
    }

    public RUB getRub() {
        return rub;
    }

    public void setRub(RUB rub) {
        this.rub = rub;
    }

    public SEK getSek() {
        return sek;
    }

    public void setSek(SEK sek) {
        this.sek = sek;
    }

    public SGD getSgd() {
        return sgd;
    }

    public void setSgd(SGD sgd) {
        this.sgd = sgd;
    }

    public THB getThb() {
        return thb;
    }

    public void setThb(THB thb) {
        this.thb = thb;
    }

    public TRY getTry1() {
        return try1;
    }

    public void setTry1(TRY try1) {
        this.try1 = try1;
    }

    public TWD getTwd() {
        return twd;
    }

    public void setTwd(TWD twd) {
        this.twd = twd;
    }
}
