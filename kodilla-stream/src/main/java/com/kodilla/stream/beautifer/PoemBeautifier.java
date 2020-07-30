package com.kodilla.stream.beautifer;

public class PoemBeautifier {
    public String beautify(String text, PoemDecorator poemDecorator){

        String newText = poemDecorator.decorate(text);
        return newText;

    }
    public String toUpper(String text){
        return text.toUpperCase();
    }
}
