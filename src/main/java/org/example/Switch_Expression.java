package org.example;

public class Switch_Expression {

    public static void main(String[] args) {

        String test = "a";
        int qtd = 0;
        /*System.out.println(
                switch (test) {
                    case "a", "b", "c" -> 1;
                    case "d" -> 2;
                    default -> 0;
                }
        );*/

      /*  switch (test) {
            case "a", "b", "c" -> qtd = 1;
            case "d" -> qtd = 2;
            default -> qtd = 0;
        } */
       /* test = "e";
        qtd = switch (test) {
            case "a":
            case "b":
            case "c":
                yield 1;
            case "d":
                yield 2;
            default:
                yield 0;
        }; */
        test = "e";
        qtd = switch (test) {
            case "a", "b", "c" -> {
                yield 1;
            }
            case "d" ->{
                yield 2;
            }
            default -> {
                yield 0;
            }
        };


        System.out.println(qtd);


    }
}