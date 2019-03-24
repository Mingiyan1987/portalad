package ru.basanov.portalad.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import ru.basanov.portalad.model.Sale;

import javax.annotation.PostConstruct;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class SaleService {

    private Map<String, Sale> sales =new LinkedHashMap<>();

    @PostConstruct
    private void init() {
        merge(new Sale("Футбол", "12.02.2018", "3000"));
        merge(new Sale("Баскетбол", "20.01.2018", "1202"));
        merge(new Sale("Волейбол", "02.12.2016", "9054"));
    }

    public void merge(final Sale sale) {
        sales.put(sale.getId(), sale);
    }



}
