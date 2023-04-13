package test;

import baseURL.JsonPlaceHolderBaseURL;
import org.junit.Test;

public class C19_Put_TestDataClassKullanimi extends JsonPlaceHolderBaseURL {
     /*
    https://jsonplaceholder.typicode.com/posts/70 url'ine asagidaki body’e sahip bir PUT
    request yolladigimizda donen response’in
    status kodunun 200, content type’inin “application/json; charset=utf-8”,
    Connection header degerinin “keep-alive”
    ve response body’sinin asagida verilen ile ayni oldugunu test ediniz
    Request Body
        {
        "title":"Ali",
        "body":"Merhaba",
        "userId":10,
        "id":70
        }
    Expected Data
        {
        "title":"Ali",
        "body":"Merhaba",
        "userId":10,
        "id":70
        }
  */
    @Test
    public void put01(){
        //1-url hazırla
        specJsonPlace.pathParams("pp1","posts","pp2","70");


    }


}
