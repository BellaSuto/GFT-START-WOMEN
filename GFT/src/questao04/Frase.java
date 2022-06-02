package questao04;

public class Frase {
    private static String frase;

    public static void main(String[] args) {

        String[] frasesProntas = { "Zebras caolhas de Java querem passar fax para moças gigantes de New York",
                "Jane quer LP, fax, CD, giz, TV e bom whisky",
                "Cheguei aqui"
        };

        frase = String.valueOf(frasesProntas);

            frase = frase.toUpperCase(); // Convertir a mayúscula para simplificar comparaciones
            String letrasDoAlfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
            letrasDoAlfabeto.length();
                if (frase.contains(Character.toString(letrasDoAlfabeto.charAt(0)))) {
                    System.out.println("é Pangrama");

                }else {
                    System.out.println("Não é pangrama");
                }
            }
    }
