package ru.basanov.portalad;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DateService {

    public Date getDate() {
        return new Date();
    }
}
