import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine; //WE NEED TO INCLUDE THIS IN APP.JAVA FILE TO USE VELOCITY TEMPLATES

import static spark.Spark.*;  //"*" IMPORTS ALL LIBRARIES FROM CURRENT PATH



public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");

    get("/", (request, response) -> { // "/" will automatically take us to the root url
      return new ModelAndView(new HashMap(), "templates/hello.vtl");
    }, new VelocityTemplateEngine());

    get("/favorite_photos", (request, response) -> {
        return new ModelAndView(new HashMap(), "templates/favorite_photos.vtl");
    }, new VelocityTemplateEngine());
  }
}
