package io.randomnumber;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

import java.util.Random;

public class RandomNumberService {

  public static void main(String[] args) {
   Javalin.create()
           .get("/hashcode",get -> get.result(getRandomNumber()))
           .start(7070);
  }

  private static String getRandomNumber(){
    Random random = new Random();
    return String.format("%04d", random.nextInt(10000 ));
  }
}
