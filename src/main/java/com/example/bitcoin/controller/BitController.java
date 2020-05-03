package com.example.bitcoin.controller;

import com.example.bitcoin.entity.*;
import com.example.bitcoin.service.BitService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BitController {
    @Autowired
    private BitService bitService;
    @GetMapping("/")
    public String callApi(Model model) throws JsonProcessingException {
        Big big = bitService.getApi();
        USD usd = big.getUsd();
        model.addAttribute(usd);
        AUD aud = big.getAud();
        model.addAttribute(aud);
        BRL brl = big.getBrl();
        model.addAttribute(brl);
        CAD cad = big.getCad();
        model.addAttribute(cad);
        CHF chf = big.getChf();
        model.addAttribute(chf);
        CLP clp = big.getClp();
        model.addAttribute(clp);
        CNY cny = big.getCny();
        model.addAttribute(cny);
        DKK dkk = big.getDkk();
        model.addAttribute(dkk);
        EUR eur = big.getEur();
        model.addAttribute(eur);
        GBP gbp = big.getGbp();
        model.addAttribute(gbp);
        HKD hkd = big.getHkd();
        model.addAttribute(hkd);
        INR inr = big.getInr();
        model.addAttribute(inr);
        ISK isk = big.getIsk();
        model.addAttribute(isk);
        JPY jpy = big.getJpy();
        model.addAttribute(jpy);
        KRW krw = big.getKrw();
        model.addAttribute(krw);
        NZD nzd = big.getNzd();
        model.addAttribute(nzd);
        PLN pln = big.getPln();
        model.addAttribute(pln);
        RUB rub = big.getRub();
        model.addAttribute(rub);
        SEK sek = big.getSek();
        model.addAttribute(sek);
        SGD sgd = big.getSgd();
        model.addAttribute(sgd);
        THB thb = big.getThb();
        model.addAttribute(thb);
        TRY try1 = big.getTry1();
        model.addAttribute(try1);
        TWD twd = big.getTwd();
        model.addAttribute(twd);


        return "home";
    }


}
