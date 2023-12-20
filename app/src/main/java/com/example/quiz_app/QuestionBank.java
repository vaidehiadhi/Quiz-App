package com.example.quiz_app;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {

    private static List<QuestionsList> javaQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList question1 = new QuestionsList("Who invented Java Programming?", "Guido van Rossum", "James Gosling", "Dennis Ritchie", "Bjarne Stroustrup", "James Gosling", "");
        final QuestionsList question2 = new QuestionsList("Which component is used to compile, debug and execute the java programs?", " JRE", "JIT", "JDK", "JVM", "JDK", "");
        final QuestionsList question3 = new QuestionsList("Which one of the following is not a Java feature?", "Object-oriented", "Use of pointers", "Portable", "Dynamic and Extensible", "Use of pointers", "");
        final QuestionsList question4 = new QuestionsList("Which of these cannot be used for a variable name in Java?", "identifier & keyword", "identifier", "keyword", "none", "keyword", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);

        return questionsLists;
    }


    private static List<QuestionsList> phpQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList question1 = new QuestionsList("What is PHP?", "PHP is an open-source programming language","PHP is used to develop dynamic and interactive websites","PHP is a server-side scripting language","All of the mentioned","All of the mentioned","");
        final QuestionsList question2 = new QuestionsList("Who is the father of PHP?","Drek Kolkevi" ,"Rasmus Lerdorf ","Willam Makepiece"," List Barely","Rasmus Lerdorf","");
        final QuestionsList question3 = new QuestionsList("What does PHP stand for?","PHP stands for Preprocessor Home Page" ,"PHP stands for Pretext Hypertext Processor","PHP stands for Hypertext Preprocessor","PHP stands for Hypertext Preprocessor","PHP stands for Hypertext Preprocessor","");
        final QuestionsList question4 = new QuestionsList("Which of the following is the correct syntax to write a PHP code?", "<?php ?>", "< php >", "< ? php ?>", "<? ?>", "<? ?>", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);

        return questionsLists;
    }
    private static List<QuestionsList> htmlQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList question1 = new QuestionsList("What is HTML?", "HTML describes the structure of a webpage","HTML is the standard markup language mainly used to create web pages","HTML consists of a set of elements that helps the browser how to view the content","All of the mentioned","All of the mentioned","");
        final QuestionsList question2 = new QuestionsList("Who is the father of HTML","Drek Kolkevi" ," Tim Berners-Lee","Willam Makepiece"," List Barely"," Tim Berners-Lee","");
        final QuestionsList question3 = new QuestionsList("Which of the following is used to read an HTML page and render it?","Web server" ," Web network","Web browser"," Web matrix","Web browser","");
        final QuestionsList question4 = new QuestionsList("Which of the following is the correct syntax to write a HTML code?", "</doctype html>", "<doctype html>", "<doctype html!>", " <!doctype html>", "<!doctype html>", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);

        return questionsLists;
    }

    private static List<QuestionsList> androidQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList question1 = new QuestionsList("Android is", "an operating system","a web browser","a web server","None of the above","an operating system","");
        final QuestionsList question2 = new QuestionsList("For which of the following Android is mainly developed?","Servers" ,"Desktops","Laptops","Mobile devices","Mobile devices","");
        final QuestionsList question3 = new QuestionsList("Which of the following virtual machine is used by the Android operating system?","JVM" ,"Dalvik virtual machine","Simple virtual machine","Dalvik virtual machine","Web browser","");
        final QuestionsList question4 = new QuestionsList("APK stands for", "Android Phone Kit", "Android Page Kit", "Android Package Kit", "None of the above", "Android Package Kit", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "java":
                return javaQuestions();

            case "php":
                return phpQuestions();

            case "android":
                return androidQuestions();

            default:
                return htmlQuestions();
        }
    }




}
