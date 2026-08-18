public class ExemploString {

    public static void main(String args[]) {

        String str1, str2, str3;

        str1 = " um texto qualquer   .xxxxx.....     ";

        System.out.println("[" + str1 + "]");

        str1 = str1.trim();

        System.out.println("apos o trim [" + str1 + "]");

        System.out.println("tamanho do str1 = "
                + str1.length());


        // substituir substring dentro da String

        str2 = str1.replace("texto", "teste");

        System.out.println("str2[" + str2 + "]");

        str2 = str2.replace(".", "$$");

        System.out.println("str2[" + str2 + "]");


        // Extrair uma substring

        str2 = str1.substring(3, 8);

        System.out.println("str2[" + str2 + "]");


        // Procurar uma substring

        str2 = "joao.silva@gmail.com";

        int posicao = str2.indexOf('@');

        System.out.println(str2
                + " - o @ esta na posicao " + posicao);

        System.out.println("Usuario : "
                + str2.substring(0, str2.indexOf('@')));

        System.out.println("Dominio : "
                + str2.substring(str2.indexOf('@') + 1).toUpperCase());


        // toUpperCase = transforma para maiúsculo
        // toLowerCase = transforma para minúsculo


        // Converter outros tipos para String

        int valor = 5;

        str3 = String.valueOf(valor);


        // Quebra uma String em vetores

        String valores = "4/6/2/55/22/9";

        String[] arraysValores = valores.split("/");

        System.out.println("arraysValores[3] = "
                + arraysValores[3]);


        // Percorra o arrayValores mostrando todos os valores na tela

        System.out.println("Percorra arraysValores");

        for (int i = 0; i < arraysValores.length; i++) {

            System.out.println("arraysValores[" + i + "] = "
                    + arraysValores[i]);
        }
    }
}
}
