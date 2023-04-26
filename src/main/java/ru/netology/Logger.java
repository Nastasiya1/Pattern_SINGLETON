package ru.netology;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public final class Logger {
    private static Logger logger;
    private int num = 1;

    private Logger() {
    }

    public void log(String msg) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyy HH:mm:ss");
        Date date = new Date();
        System.out.println("[" + formatter.format(date) + " " + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}