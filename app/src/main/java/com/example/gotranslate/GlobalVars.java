package com.example.gotranslate;


import java.util.ArrayList;

public class GlobalVars   //it is used for global languages
{
    public static String BASE_REQ_URL = "https://translate.yandex.net/api/v1.5/tr.json/";
    public static ArrayList<String> LANGUAGE_CODES = new ArrayList<String>();
    public static int DEFAULT_LANG_POS = 16;
    public GlobalVars(){}
}
