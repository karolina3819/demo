package com.example.demo;

public main throws IOException {
    String url ="http://localgost:8080/logowanie";
    URL obj= new URL(url);
    HttpURLConnection connection =(HttpURLConnection) obj.openConnection();
    connection.setRequestProperty("User-Agent","Test");

    Bufferreader in =new Buffereader(
          new Input
            String inputline;
            StringBuffer odpowiedz =new Stringbuffer();
            while((inputline=in.readLine())!=null){
            odpowiedz.append(inputLine);
            odpowiedz.toString();
            }
        }
        )
