package com.mycompany.spark.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import static spark.Spark.*;

@ManagedBean(name = "helloSpark")
@RequestScoped
public class HelloSpark {

    public void init() {
        get("/hello.jsf", (req, res) -> "Hello World From JSF 2!!!");

    }

    public void doAction() {
        get("/hello.jsf", (req, res) -> "Hello World From Action!");

    }
    
      public String doSecondAction() {
        get("/hello.jsf", (req, res) -> "Hello World From Action!");
        return "hello";
    }

    public static void main(final String[] args) {
        get("/hello.jsf", (req, res) -> "Hello World From JSF");
    }
}
