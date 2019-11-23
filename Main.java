import java.util.Scanner;
import java.util.Random;

class Main {
  static Scanner entrada = new Scanner(System.in);

  // Função que imprime Game Over na tela
  static void soutGO() {
    System.out.println("Game Over");
  }

  // funcao que contem apenas contas simples
  static int equacaoSimples(int sorteado) {

    // cada numero possui uma pergunta dentro do Switch case e os numeros que serao
    // sorteados
    Random random = new Random();
    int perguntas[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int contador = 0;
    int meuTeste = 0;
    sorteado = random.nextInt(9);
    switch (perguntas[sorteado]) {
    case 1:
      boolean teste = false;
      // vai aparecer a pergunta enquanto a resposta NAO for a correta
      do {
        System.out.println("Resolva: (2^2)*(2^2)= ");
        System.out.printf("a) 13\nb) 18\nc) 16\n");
        System.out.println("Qual a resposta correta?");
        String resposta = entrada.next();
        String correto = "c";
        contador++;
        meuTeste = respondendoF(resposta, correto, contador);
        if (meuTeste == 8) {
          teste = true;
        } else if (meuTeste == 9) {
          sorteado = 8;
          teste = true;
        }
      } while (teste != true);
      break;
    case 2:
      boolean teste1 = false;
      // vai aparecer a pergunta enquanto a resposta NAO for a correta
      do {
        System.out.println("(6^7)/(6^5)= ");
        System.out.printf("a) 1298\nb) 1296\nc) 11294\n");
        System.out.println("Qual a resposta correta?");
        String resposta = entrada.next();
        String correto = "b";
        contador++;
        meuTeste = respondendoF(resposta, correto, contador);
        if (meuTeste == 8) {
          teste1 = true;
        } else if (meuTeste == 9) {
          sorteado = 8;
          teste1 = true;
        }
      } while (teste1 != true);
      break;

    case 3:
      boolean teste2 = false;
      // vai aparecer a pergunta enquanto a resposta NAO for a correta
      do {
        System.out.println("(4^2)^3)= ");
        System.out.printf("a) 4268\nb) 4096\nc) 5\n");
        System.out.println("Qual a resposta correta?");
        String resposta = entrada.next();
        String correto = "b";
        contador++;
        meuTeste = respondendoF(resposta, correto, contador);
        if (meuTeste == 8) {
          teste2 = true;
        } else if (meuTeste == 9) {
          sorteado = 8;
          teste2 = true;
        }
      } while (teste2 != true);
      break;

    case 4:
      boolean teste3 = false;
      // vai aparecer a pergunta enquanto a resposta NAO for a correta
      do {
        System.out.println("Raiz de 4 = ");
        System.out.printf("a) 2\nb) 4\nc) 16\n");
        System.out.println("Qual a resposta correta? ");
        String resposta = entrada.next();
        String correto = "a";
        contador++;
        meuTeste = respondendoF(resposta, correto, contador);
        if (meuTeste == 8) {
          teste3 = true;
        } else if (meuTeste == 9) {
          sorteado = 8;
          teste3 = true;
        }
      } while (teste3 != true);
      break;

    case 5:
      boolean teste4 = false;
      // vai aparecer a pergunta enquanto a resposta NAO for a correta
      do {
        System.out.println("Raiz de 9 = ");
        System.out.printf("a) 4\nb) 3\nc) 3,5\n");
        System.out.println("Qual a resposta correta?");
        String resposta = entrada.next();
        String correto = "b";
        contador++;
        meuTeste = respondendoF(resposta, correto, contador);
        if (meuTeste == 8) {
          teste4 = true;
        } else if (meuTeste == 9) {
          sorteado = 8;
          teste4 = true;
        }
      } while (teste4 != true);
      break;

    case 6:
      boolean teste5 = false;
      // vai aparecer a pergunta enquanto a resposta NAO for a correta
      do {
        System.out.println("Passe o numero 3 em decimal para binário: ");
        System.out.printf("a) 0011\nb) 0111\nc) 0010\n");
        System.out.println("Qual a resposta correta?");
        String resposta = entrada.next();
        String correto = "a";
        contador++;
        meuTeste = respondendoF(resposta, correto, contador);
        if (meuTeste == 8) {
          teste5 = true;
        } else if (meuTeste == 9) {
          sorteado = 8;
          teste5 = true;
        }
      } while (teste5 != true);
      break;

    case 7:
      boolean teste6 = false;
      // vai aparecer a pergunta enquanto a resposta NAO for a correta
      do {
        System.out.println("Qual o resultado da conta (5^10)+(4^5): ");
        System.out.printf("a) 3050\nb) 3225\nc) 3125\n");
        System.out.println("Qual a resposta correta?");
        String resposta = entrada.next();
        String correto = "c";
        contador++;
        meuTeste = respondendoF(resposta, correto, contador);
        if (meuTeste == 8) {
          teste6 = true;
        } else if (meuTeste == 9) {
          sorteado = 8;
          teste6 = true;
        }
      } while (teste6 != true);
      break;

    case 8:
      boolean teste7 = false;
      // vai aparecer a pergunta enquanto a resposta NAO for a correta
      do {
        System.out.println("7+7/7+7*7-7 = ");
        System.out.printf("a) 50\nb) 00\nc) 08\n");
        System.out.println("Qual a resposta correta?");
        String resposta = entrada.next();
        String correto = "a";
        contador++;
        meuTeste = respondendoF(resposta, correto, contador);
        if (meuTeste == 8) {
          teste7 = true;
        } else if (meuTeste == 9) {
          sorteado = 8;
          teste7 = true;
        }
      } while (teste7 != true);
      break;

    case 9:
      boolean teste8 = false;
      // vai aparecer a pergunta enquanto a resposta NAO for a correta
      do {
        System.out.println("Encontre o valor de X. 2^x = 4 ");
        System.out.printf("a) 4\nb) 2\nc) 8\n");
        System.out.println("Qual a resposta correta?");
        String resposta = entrada.next();
        String correto = "b";
        contador++;
        meuTeste = respondendoF(resposta, correto, contador);
        if (meuTeste == 8) {
          teste8 = true;
        } else if (meuTeste == 9) {
          sorteado = 8;
          teste8 = true;
        }
      } while (teste8 != true);
      break;
    }
    return sorteado;
  }

  // funcao que contem apenas contas de nivel medio
  static int equacaoMedia(int sorteado) {
    // dentro de cada numero possui uma pergunta e os numeros que serao sorteados
    // dentro do Switch case
    Random random = new Random();
    int contador = 0;
    int perguntas[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int meuTeste = 0;
    sorteado = random.nextInt(8);
    switch (perguntas[sorteado]) {

    case 1:
      boolean teste = false;
      // vai aparecer a pergunta enquanto a resposta NAO for a correta
      do {
        System.out.println("20x-4=5x");
        System.out.printf("a) 4/15\nb) 15/4\nc) -4/15\n");
        System.out.println("Qual a resposta correta?");
        String resposta = entrada.next();
        String correto = "a";
        contador++;
        meuTeste = respondendoM(resposta, correto, contador);
        if (meuTeste == 8) {
          teste = true;
        } else if (meuTeste == 9) {
          sorteado = 8;
          teste = true;
        }
      } while (teste != true);
      break;

    case 2:
      boolean teste1 = false;
      // vai aparecer a pergunta enquanto a resposta NAO for a correta
      do {
        System.out.println("Descubra o valor de X. 4x=-8x+36 ");
        System.out.printf("a) 36\nb) 3\nc) -36\n");
        System.out.println("Qual a resposta correta?");
        String resposta = entrada.next();
        String correto = "b";
        contador++;
        meuTeste = respondendoM(resposta, correto, contador);
        if (meuTeste == 8) {
          teste1 = true;
        } else if (meuTeste == 9) {
          sorteado = 8;
          teste1 = true;
        }
      } while (teste1 != true);
      break;

    case 3:
      boolean teste2 = false;
      // vai aparecer a pergunta enquanto a resposta NAO for a correta
      do {
        System.out.println("Descubra o valor de X. (4(x-3)=2x-5)");
        System.out.printf("a) 3\nb) 3,5\nc) -3\n");
        System.out.println("Qual a resposta correta?");
        String resposta = entrada.next();
        String correto = "b";
        contador++;
        meuTeste = respondendoM(resposta, correto, contador);
        if (meuTeste == 8) {
          teste2 = true;
        } else if (meuTeste == 9) {
          sorteado = 8;
          teste2 = true;
        }
      } while (teste2 != true);
      break;

    case 4:
      boolean teste3 = false;
      // vai aparecer a pergunta enquanto a resposta NAO for a correta
      do {
        System.out.println("Descubra o valor de X. x^2-16=0 ");
        System.out.printf("a) +-4\nb) +-16\nc) +-8\n");
        System.out.println("Qual a resposta correta? ");
        String resposta = entrada.next();
        String correto = "a";
        contador++;
        meuTeste = respondendoM(resposta, correto, contador);
        if (meuTeste == 8) {
          teste3 = true;
        } else if (meuTeste == 9) {
          sorteado = 8;
          teste3 = true;
        }
      } while (teste3 != true);
      break;

    case 5:
      boolean teste4 = false;
      // vai aparecer a pergunta enquanto a resposta NAO for a correta
      do {
        System.out.println("Usando metodo de substituição, descubra o valor de X e Y:  10x - 9y = 24 e y = x - 2");
        System.out.printf("a) X = 42, Y = 40\nb) X = -6, Y = 4\nc) X = 6, Y = 4\n");
        System.out.println("Qual a resposta correta?");
        String resposta = entrada.next();
        String correto = "c";
        contador++;
        meuTeste = respondendoM(resposta, correto, contador);
        if (meuTeste == 8) {
          teste4 = true;
        } else if (meuTeste == 9) {
          sorteado = 8;
          teste4 = true;
        }
      } while (teste4 != true);
      break;

    case 6:
      boolean teste5 = false;
      // vai aparecer a pergunta enquanto a resposta NAO for a correta
      do {
        System.out.println("Qual o valor de X e Y respectivamente? -7x - 6y = 4  e x = -3y + 8 ");
        System.out.printf("a) Y = 4, X = -4\nb) Y = -4, X = 4\nc) Y = -4, X = -4\n");
        System.out.println("Qual a resposta correta?");
        String resposta = entrada.next();
        String correto = "a";
        contador++;
        meuTeste = respondendoM(resposta, correto, contador);
        if (meuTeste == 8) {
          teste5 = true;
        } else if (meuTeste == 9) {
          sorteado = 8;
          teste5 = true;
        }
      } while (teste5 != true);
      break;

    case 7:
      boolean teste6 = false;
      // vai aparecer a pergunta enquanto a resposta NAO for a correta
      do {
        System.out.println("Usando metodo de substituição, descubra o valor de X e Y: 10x - 9y = 24 e y = x - 2 ");
        System.out.printf("a) X = -6, Y = -4\nb) X = -6, Y = 4\nc) X = 6, Y = 4\n");
        System.out.println("Qual a resposta correta?");
        String resposta = entrada.next();
        String correto = "c";
        contador++;
        meuTeste = respondendoM(resposta, correto, contador);
        if (meuTeste == 8) {
          teste6 = true;
        } else if (meuTeste == 9) {
          sorteado = 8;
          teste6 = true;
        }
      } while (teste6 != true);
      break;

    case 8:
      boolean teste7 = false;
      // vai aparecer a pergunta enquanto a resposta NAO for a correta
      do {
        System.out.println("Usando metodo de substituição, descubra o valor de Y:  5x - 4y = - 10 e y = 2x - 5");
        System.out.printf("a) Y = 15\nb) Y = 10\nc) Y = -10\n");
        System.out.println("Qual a resposta correta?");
        String resposta = entrada.next();
        String correto = "a";
        contador++;
        meuTeste = respondendoM(resposta, correto, contador);
        if (meuTeste == 8) {
          teste7 = true;
        } else if (meuTeste == 9) {
          sorteado = 8;
          teste7 = true;
        }
      } while (teste7 != true);
      break;
    }
    return sorteado;
  }

  // funcao que contem apenas uma conta de nivel dificil
  static int equacaoDificil(int sorteado) {
    Random random = new Random();
    int contador = 0;
    int perguntas[] = { 1 };
    int meuTeste = 0;
    sorteado = random.nextInt(1);
    switch (perguntas[sorteado]) {

    case 1:
      boolean teste = false;
      // vai aparecer a pergunta enquanto a resposta NAO for a correta
      do {
        System.out.println("Faça mudança de base e descubra valor de X: (2^x-1)+2^x= 48");
        System.out.printf("a) 4/15\nb) 15/4\nc) -4/15\n");
        System.out.println("Qual a resposta correta?");
        String resposta = entrada.next();
        String correto = "a";
        String correto1 = "A";
        contador++;
        meuTeste = respondendoD(resposta, correto, correto1, contador);
        if (meuTeste == 8) {
          teste = true;
        } else if (meuTeste == 9) {
          sorteado = 8;
          teste = true;
        }
      } while (teste != true);
      break;
    }
    return sorteado;
  }

  // funcao para o confirmador
  static boolean confirmador(String simNao) {

    boolean confirmador = false;
    if (simNao.equalsIgnoreCase("sim")) {
      confirmador = true;
    }
    return confirmador;
  }

  static int respondendoF(String resposta, String correto, int contador) {

    int sorteado = 0;

    if (resposta.equalsIgnoreCase(correto)) {
      sorteado = 8;
      System.out.println("RESPOSTA CORRETA");
      System.out.println("");
    } else if (contador == 2) {
      System.out.println("");
      System.out.println("RESPOSTA INCORRETA!");
      System.out.println("");
      System.out.println("***DICA PARA EQUAÇÃO***");
      System.out.println(
          "Acalme-se, lembre-se que você deve resolver as contas entre parenteses antes das demais, e que a ordem correta das contas é: exponenciação, radição, multiplicação, divisão, soma e subtração.");
      System.out.println("");
      System.out.println("***DICA PARA CONVERSÃO DE NUMERO BINÁRIO***");
      System.out.println(
          "Lembre-se, para transformar um número binário em decimal você deve multiplicar os numeros por dois elevado");
      System.out.println(
          "á sua posição, sempre começando da direita para esquerda e lembrando-se que a primeira posição é a 0");
      System.out.println("");
      contador++;
    } else if (contador == 3) {
      sorteado = 9;
    } else {
      System.out.println("RESPOSTA INCORRETA");
      System.out.println("");
      contador++;
    }
    return sorteado;
  }

  static int respondendoM(String resposta, String correto, int contador) {

    int sorteado = 0;

    if (resposta.equalsIgnoreCase(correto)) {
      sorteado = 8;
      System.out.println("RESPOSTA CORRETA");
      System.out.println("");
    } else if (contador == 2) {
      System.out.println("");
      System.out.println("RESPOSTA INCORRETA!");
      System.out.println("");
      System.out.println("***DICA***");
      System.out.println("Tente sempre isolar a incógnita na equação seja ela X ou Y.");
      System.out.println(
          "Vamos la, você consegue, lembre-se que você deve resolver as contas entre parenteses antes das demais, e que a ordem correta das contas é: exponenciação, radição, multiplicação, divisão, soma e subtração.");
      System.out.println("");
      System.out.println("***DICA SOBRE O MÉTODO DE SUBSTITUIÇÃO***");
      System.out.println(
          "Para utilizar o método de substituição, substitua o valor da segunda incógnita pela sua própria equação");
      System.out.println(
          "Por exemplo: se 2x+y=10 e y = 3x, então utilizando o método da substituição e substituindo y pelo seu valor ficamos com 2x+3x=10, logo 5x=10, então x = 10/5 e x=2");
      System.out.println("");
      contador++;
    } else if (contador == 3) {
      sorteado = 9;
    } else {
      System.out.println("RESPOSTA INCORRETA");
      System.out.println("");
      contador++;
    }
    return sorteado;
  }

  static int respondendoD(String resposta, String correto, String correto1, int contador) {

    int sorteado = 0;

    if (resposta.equals(correto) || resposta.equals(correto1)) {
      sorteado = 8;
      System.out.println("RESPOSTA CORRETA");
      System.out.println("");
    } else if (contador == 2) {
      System.out.println("");
      System.out.println("RESPOSTA INCORRETA!");
      System.out.println("");
      System.out.println("***DICA***");
      System.out.println("Tente sempre isolar a incógnita na equação seja ela X ou Y.");
      System.out.println(
          "Vamos la, você consegue, lembre-se que você deve resolver as contas entre parenteses antes das demais, e que a ordem correta das contas é: exponenciação, radição, multiplicação, divisão, soma e subtração.");
      System.out.println("");
      contador++;
    } else if (contador == 3) {
      sorteado = 9;

    } else {
      System.out.println("RESPOSTA INCORRETA");
      System.out.println("");
      contador++;
    }
    return sorteado;
  }

  static int ato1H(String nome, String escolha, int sorteado) {
    int x = 0;
    boolean game = false;
    while (game == false) {
      System.out.println("");
      System.out.println("Muito bem: " + nome + " seja muito bem vindo a Distopia Matemática.");
      System.out.print("");
      System.out.println("");
      System.out.println("");
      System.out.printf(
          "O ano é 2039, o mundo como você conhece não é o mesmo, há cerca de 8 anos uma guerra entre os EUA e a Rússia devastou o planeta, uma arma \n"
              + "de poder inimaginável foi utilizada pelo exército russo, ela atrapalhava o sitema cerebral dos atingidos, era como um PEM(pulso eletromagnético), na teoria desativava\n"
              + "cada parte da função cognitiva do soldado afetado por alguns minutos, na prática fez com que o cérebro de cada pessoa atingida virasse uma calculadora\n"
              + "ambulante, isso melhorava muito a capacidade de raciocinio lógico, e por conta disso, os atingidos passaram a ser chamados de Math's, porém, após\n"
              + "certo tempo efeitos colaterais começaram a aparecer, em momentos esporádicos, ao realizar uma ação, ora mundana, ora complexa, uma conta surgia em \n"
              + "suas mentes, para que essa ação acontecesse, o resultado precisava ser preciso. Vamos supor que um Math vai abrir uma porta, como num passe de mágica o \n"
              + "tempo parece parar a sua volta, e uma conta vem a mente, ele coloca a calculadora em sua mente para funcionar, resolve a conta e apresenta uma resposta,\n"
              + "se acertar, ele abre a porta sem problema algum, se errar, um movimento involuntário toma conta do seu corpo, e seu corpo não responde a essa ação, \n"
              + "e a conta reaparece em sua mente, erros excesivos causam problemas cerebrais que vão desde uma dor de cabeça simples, até um acidente vascular cerebral\n"
              + "que mais tarde leva a morte.\n"
              + "Após a guerra a arma foi deixada de lado pelas forças russas e caiu nas mãos de terroristas,  ela foi utilizada em diversos países e causou danos irreparaveis à milhares de pessoas.\n.\n.\n.\n"
              + "%s ao viajar para Londres, a negócios 2 anos atrás. Você caminhava próximo ao Big Bang, admirando aquela grandiosa construção. quando um zunido muito forte passou como um raio pelos seus ouvidos. Uma dor que você nunca sentiu antes tomou conta do seu cérebro, era como se mil abelhas ferroassem seu córtex cerebral. Você não enxergava muita coisa, a não ser os vultos das pessoas que ali estavam, fazendo o mesmo movimento que você, se contorcendo no chão até apagarem. Pouco tempo depois você acorda desnorteado. Você abre seus olhos mas não enxerga muita coisa, alguns números passam pela sua mente. E embora confuso você se levanta, olha em volta e a cada passo que dá um número surge em sua mente. Contas surgem e você logo entende que sua vida nunca mais será a mesma...agora você é um Math...\n\n",
          nome);

      System.out.printf(nome + ", você está viajando com sua esposa, Sara, em seu avião em direção \n"
          + "as ilhas exponenciais, conhecidas por seus acidentes aéreos. Você e sua esposa estão \n"
          + " indo para lá com um objetivo simples: fotografar a região, por pura e simples curiosidade.");
      System.out.println("");
      System.out.println("");
      System.out.printf("Ás 17 horas, desta sexta-feira. Vocês saem do território nacional e chegam ao \n"
          + "oceano atlântico. Algumas alterações na rota de vôo serão necessárias, a ilha esta ao noroeste \n"
          + "e uma grande tempestade se aproxima. ");
      System.out.println("");
      System.out.println("");
      System.out.println("***Esta parte do jogo funcionará como um tutorial***");
      System.out.println(
          "***Você deve sempre digitar a letra da opção que desejar. Seja em uma das escolhas do jogo, seja em uma das contas que lhe serão apresentadas.***");
      System.out.println(
          "***Você terá 3 chances para acertar a resposta das questões. Recomenda-se utilizar uma calculadora ou rascunho como auxílio***");
      System.out.println(
          "***Caso desperdice as 3 chances, você sofrerá consequências, as vezes no contexto da história, outras vezes, causando Game Over, e voltando ao menu***");
      System.out.println("");
      System.out.println("O que você fará? ");
      System.out.println("a - Diminuir  a altitude de vôo. \n" + "b - Subir  a altitude  de vôo. \n"
          + "c - Apenas manter a altitude.");
      escolha = entrada.next();

      // qualquer letra chamara a funcao que contem contas simples
      switch (escolha) {
      case "a":
      case "A":
      case "b":
      case "B":
      case "c":
      case "C":
        x = equacaoSimples(sorteado);
      }
      if (x == 8) {
        game = true;
        soutGO();
        break;
      }
      System.out.println("");
      System.out.println("");
      System.out.println("Vocês entram em uma nuvem, grande, escura e quase maciça; \n"
          + "mas isto não te assusta nem um pouco, você é um renomado Piloto \n"
          + "e sabe o que deve ser feito nesta circunstancia.");
      System.out.println("");
      System.out.println("");
      // boolean para manter a pergunta no laço até que seja feita a escolha correta
      boolean repeticao = false;
      while (repeticao != true) {
        System.out.println("Vamos lá " + nome + " tome a decisão correta: ");
        System.out.println("");
        System.out.println("a - Acompanhar os instrumentos e manter o controle da aeronave.");
        System.out.println("b - Tentar contato com a torre, para que a mesma possa te ajudar a sair dessa.");
        escolha = entrada.next();
        System.out.println("");
        if ("a".equalsIgnoreCase(escolha)) {
          x = equacaoSimples(sorteado);
          if (x == 8) {
            game = true;
            soutGO();
            break;
          } else
            System.out.println("Tudo certo, sua experiência faz com que você voe como se o clima não te impedisse.");
          System.out.println("");
          repeticao = true;

        } else if ("b".equalsIgnoreCase(escolha)) {
          System.out
              .println("Você não consegue contato com a torre de controle, seu rádio parece ter parado de funcionar.");
          System.out.println("");
        }
      }
      System.out.printf("Mas como em um piscar de olhos, os seus instrumentos ficam descontrolados. \n"
          + "(Sara): - O que houve %s? \n" + "(%s): - Não sei o que houve, isto nunca aconteceu!\n"
          + "(Sara): - Talvez seja a ilha, os boatos diziam isso. \n"
          + "(%s):- Amor você sabe que estes boatos não são verdadeiros, \n"
          + "isso é apenas um fenômeno natural... Eu acho. \n"
          + "O avião começa a perder estabilidade, uma turbulência muito forte começa a afetar a estabilidade do \n"
          + " avião. Sara começa a gritar assustada. Você tenta manter a calma e consegue continuar controlando \n"
          + "o avião, evitando qualquer problema maior; poucos segundos após isto um enorme raio branco acerta a sua \n"
          + "aeronave; vocês se assustam e gritam muito, ficam temporariamente cegos, durante isto você para de sentir o \n"
          + "motor do avião. \n Você agarra o manche na esperança de recuperar o controle: \n \n", nome, nome, nome);
      x = equacaoMedia(sorteado);
      if (x == 8) {
        System.out.printf(
            "Você sente algo diferente e logo repara que o avião esta perdendo sustentação e pode não haver mais o que fazer. \n "
                + "O avião começa a cair como uma pedra.");
        System.out.println("Você tenta novamente:");
        System.out.println("");
        x = equacaoMedia(sorteado);
        if (x == 8) {
          System.out.printf(
              " Nada parece estar dando certo hoje, você falha e o avião continua caindo como uma pedra em direção do oceano. \n"
                  + "Sem conseguir manter o controle do avião você e sua esposa estão complemente assustados; a grande nuvem começa \n"
                  + "a desaparecer e na sua frente e você vê a ilha ja encontrando o bico do seu avião..... \n \n \n");
          soutGO();
          game = true;
          break;
        } else {
          System.out.printf(
              "Você puxa o manche com toda a sua força e consegue estabilidade novamente, más ainda sem os motores. \n");
        }
      } else {
        System.out.printf("Você é realmente um exímio piloto e mantém o avião estável planando sem os motores. \n\n");
      }
      System.out.printf(" Agora sua missão é conseguir pousar com segurança na ilha.\n\n");
      x = equacaoMedia(sorteado);
      if (x == 8) {
        System.out.println(
            "Você ainda esta um pouco abalado pelo que aconteceu e algo esta atrapalhando suas habilidades como piloto, o avião começa a perder sustentação... você agora esta indo em direção a água");
        System.out.println(
            "Percebendo que não há mais tempo para um pouso calmo na praia, você tenta pousar de maneira suave sobre a água");
        System.out.printf("\n\n");
        x = equacaoMedia(sorteado);
        if (x == 8) {
          System.out.printf(
              "Mesmo tendo uma larga experiência em pousos você não consegue mais controlar esta aeronave e acaba acertando em cheio a água e não sobrevive ao impacto....");
          soutGO();
          game = true;
          break;
        } else {
          System.out.printf(
              "Você consegue com sua ampla experiencia como piloto pousar a aeronave sobre a água de maneira bem turbulenta, porém, segura. \nIsto por sua vez acaba chamando atenção desnecessária. \n Vocês estão próximos a costa, a noite ja esta caindo e se nota muito movimento na água em torno do avião. \n"
                  + "Ao olhar pela janela se veem muitos peixes estranhos e criaturas aparentemente hostis:");
          System.out.printf("(Sara): - O que devemos fazer %s ? \n"
              + "(%s):- Vamos esperar, a maré vai nos levar ate a praia em algum tempo. \n"
              + "(Sara):- Mas isto não é seguro! Vamos tentar nadar até lá.\n"
              + "(%s):- De forma alguma, o avião vai ser a nossa proteção na ilha.\n\n"
              + "A noite passa e vocês conseguem restabelecer a calma dentro do possível pois o avião estava “atracado”.\n",
              nome, nome, nome);
        }
      } else {
        System.out.printf(
            "Com sua grande experiência em pousos você reconhece o melhor local para o pouso na praia e com o \n"
                + "angulo correto você faz a aproximação e a colisão é leve e controlada. \n\n"
                + "(Sara):- %s, finalmente em terra firme, cheguei a achar que as coisas ficariam feias. \n"
                + "(%s):- Por um breve segundo eu também pensei, mas você sabe quem é que manda nesse bebê - Você aponta para o avião.  \n"
                + "(Sara):- As vezes acho que você gosta mais desse avião do que de mim... - Ela fala com tom de sarcasmo.\n"
                + "(%s):- ATENÇÃO TODOS OS NATIVOS, A RAINHA DO DRAMA ESTA AQUI. - Você grita aliviado por saber que estão em um paraíso tropical..\n"
                + "Você monta a poucos metros de distância do avião, a barraca que trouxeram. Acende uma fogueira, pega algum alimento e um vinho que estava nas bagagens, estende uma toalha de piquenique sobre o chão e convida- a a se sentar ao seu lado.\n Vocês ficam ali algumas horas, conversando sobre a vida, comendo, bebendo, rindo, depois entram na barraca, se aninham e dormem aguardando o que vos aguarda no grande dia de amanhã.",
            nome, nome, nome);
      }
      game = true;
    }
    return x;
  }

  static int ato2H(String nome, String escolha, int sorteado) {
    int x = 0;
    boolean game = false;
    while (game == false) {
      System.out.printf("Finalmente em solo firme e depois de passarem por um gigantesco problema, vocês começam admirar a paisagem.\n\n"
              + "A ilha é imensamente cheia de arvores, grandes, lindas e com um tom de verde muito agradável, frutas estão por\n"
              + " toda a parte, pássaros belos e nunca antes visto por vocês.\n\n"
              + "(%s): - Bom, pelo visto Sara, nós não teremos problemas com a fome.\n"
              + "(Sara): - Nem com água, olhe ali, parece que é um lago.\n\n" + "a - Ir ver se a água é doce\n"
              + "b - Ficar pela praia\n\n",
          nome);
      escolha = entrada.next();
      switch (escolha) {
      case "a":
      case "A":
        System.out.printf(
            "Vocês entram na mata, e reparam na beleza do ambiente. Depois de alguns minutos vocês chegam em um rio; \n"
                + "você pega um pouco da água com a mão e bebe.\n\n"
                + "(%s): - Olha que incrível! Sara isso é potável com certeza.\n"
                + "(Sara): - Nossa eu não posso acreditar.\n"
                + "(%s): - Exatamente, tem algo de muito estranho aqui - uma nuvem aparece do nada o motor do avião apaga - precisamos verificar isso para sair daqui.\n"
                + "(Sara): - Vamos sair daqui sim amor, mas antes vamos andar pela ilha e ver o que ela nos reserva...\n\n",
            nome, nome);
        break;
      case "b":
      case "B":
        System.out.printf("(Sara): - Eu acho bom nós andarmos pela ilha para ver o que nos espera.\n"
            + "(%s): - Ok, vamos pela praia.\n"
            + "Andando pela praia vocês encontram na areia algumas marcas estranhas pintadas nas pedras. Sara fala sobre a possibilidade de existirem nativos na região.\n"
            + "E por um breve momento você tem a sensação de estar sendo observado.\n\n", nome);
        break;
      }
      System.out.printf(
          "Após uma longa caminhada vocês chegam em uma clareira e o que vocês presenciam é incrível e quase inacreditável. \n"
              + "Aviões antigos e aviões modernos uma diversidade de anos e modelos; aquilo se aproximaria de um museu.\n\n"
              + "(%s): - Meu Deus meu bem, isso é inacreditável!\n" + "(Sara): - Eu estou sem palavras.\n"
              + "(%s): - Vamos ver se existe alguma coisa que podemos aproveitar aqui.\n\n"
              + "Vocês chegam a porta de um avião e você tenta girar a trava.\n\n",
          nome, nome);
      x = equacaoMedia(sorteado);
      if (x == 8) {
        System.out.printf("(%s): isso esta muito difícil, não vou conseguir.\n\n" + "a - Pedir ajuda a Sara.\n"
            + "b - Tentar sozinho novamente.\n", nome);
        escolha = entrada.next();
        boolean teste = false;
        int contGO = 0;
        while (teste == false) {
          contGO++;
          if (escolha.equalsIgnoreCase("a")) {
            
            x = equacaoSimples(sorteado);
            if (x == 8 && contGO == 2) {
              System.out.printf("\n(Sara): - Deixe isso pra la, não vale a pena.\n"
                  + "(%s): - Nós realmente precisamos pegar este, este avião parece mais inteiro do que os outros.\n\n Você sente sua cabeça doer, mas tenta mais uma vez.\n\n",
                  nome);
            } else if (x == 8 && contGO == 1) {
              System.out.printf("\n(Sara): - Deixe isso, vamos voltar.\n"
                  + "(%s): - De jeito nenhum, nosso rádio parou de funcionar e precisamos pegar o que esta ai dentro.\n",
                  nome);
            } else if (x == 8 && contGO == 3) {
              System.out.printf("\n(Sara): - Amor, você esta bem????.\n"
                  + "(%s): - Acho que.....exagerei......\n\n Você forçou demais sua mente, algo esta errado, sua cabeça esta latejando de dor e você não sente mais seus membros.",
                  nome);
              teste = true;
              game = true;
              break;
            }else{
              break;
            }
         
          } else if (escolha.equalsIgnoreCase("b")) {
           
            x = equacaoMedia(sorteado);
            if (x == 8 && contGO == 2) {
              System.out.printf("\n(Sara): - Deixe isso pra la, não vale a pena.\n"
                  + "(%s): - Nós realmente precisamos pegar este, este avião parece mais inteiro do que os outros.\n\n Você sente sua cabeça doer, mas tenta mais uma vez.\n\n",
                  nome);
            } else if (x == 8 && contGO == 1) {
              System.out.printf("\n(Sara): - Deixe isso, vamos voltar.\n"
                  + "(%s): - De jeito nenhum, nosso rádio parou de funcionar e precisamos pegar o que esta ai dentro.\n",
                  nome);
            } else if (x == 8 && contGO == 3) {
              System.out.printf("\n(Sara): - Amor, você esta bem????.\n"
                  + "(%s): - Acho que.....exagerei......\n\n Você forçou demais sua mente, algo esta errado, sua cabeça esta latejando de dor e você não sente mais seus membros.",
                  nome);
              teste = true;
              game = true;
              break;
            }
            else{
              break;
            }
          }
        }

      }
      System.out.printf("A porta se abre com uma dificuldade absurda mas tudo da certo; vocês estão dentro do avião agora, \n"
                + "um cheiro forte de podridão está no ambiente. Existem corpos dentro do avião, parecem estar ali a muito tempo, um deles com o rádio da aeronave nas mãos, \nparece ter tentado entrar em contato com alguém antes de morrer. Você retira o rádio e"
                + "vocês decidem sair, e voltar para suau aeronave com o este rádio em mãos.\n\nVoltando para a praia com o rádio em mãos vocês, tentam conectar ele no lugar do seu rádio\n\n");
                x = equacaoMedia(sorteado){
                  
                }

    }
    return x;
  }

  static void ato3H(String nome, String escolha, int sorteado) {
    System.out.printf("Depois deste momento horrivel você acorda ainda na praia, o avião continua ali, intacto, você levanta olha em \n"  
                + "volta meio assustado e um pouco tonto por causa do impacto, depois de olhar em volta você confere o combustivel \n"
                + "do avião e repara que tem o suficiente para a volta para casa, determidado como um herói você pega o rádio e \n"
                + "grita em alto em bom som: ");
                System.out.printf("((%s)): EU (%s), QUERO MINHA ESPOSA DE VOLTA!\n", nome);
                System.out.printf("Pelo rádio você escuta gritos e grunidos graves, os gritos são de sua esposa e os grunidos que não podem ser \n"
                + "compreendidos são daqueles homens e mulheres que a capturaram.\n"
                + "Obstinado, você corre para dentro da mata gritando pelo nome de sua esposa.\n"
                + "((%s)): SARA ONDE VOCÊ ESTÁ!?\n", nome);
                System.out.printf("E quanto mais corre para dentro da mata, os barulhos aumentam e você a encontra presa em uma árvore cercada pelos nativos.\n"
                + "Neste momento Sara tenta se soltar enquanto os nativos vão em sua direção de maneira calma\n");
                x = equacaoMedia(sorteado);
                if (x==8){
                  System.out.printf("você os atrae para longe dela, correndo para a direção da praia\n"
                + "((%s)): SARA SE SOLTA E VENHA PARA O AVIÃO!\n"
                + "Com uma pedra que estava ao seu lado Sara consegue cortar as cordas e faz o que lhe foi dito.\n");
                }
                else {
                  System.out.printf("Sara se solta e pede para que você vá para o avião.\n"
                + "(Sara): Corra para o avião eu te encontro lá! \n"
                + "Com uma pedra que estava ao seu lado, Sara consegue cortar as cordas e faz o que lhe foi dito.\n");
                }




  }

  static int ato1M(String nome, String escolha, int sorteado) {
    int x = 0;
    boolean game = false;

    while (game == false) {
      System.out.println("");
      System.out.println("Muito bem: " + nome + " seja muito bem vinda a Distopia Matemática.");
      System.out.print("");
      System.out.println("");
      System.out.println("");
      System.out.printf(
          "O ano é 2039, o mundo como você conhece não é o mesmo, há cerca de 8 anos uma guerra entre os EUA e a Rússia devastou o planeta, uma arma \n"
              + "de poder inimaginável foi utilizada pelo exército russo, ela atrapalhava o sitema cerebral dos atingidos, era como um PEM(pulso eletromagnético), na teoria desativava\n"
              + "cada parte da função cognitiva do soldado afetado por alguns minutos, na prática fez com que o cérebro de cada pessoa atingida virasse uma calculadora\n"
              + "ambulante, isso melhorava muito a capacidade de raciocinio lógico, e por conta disso, os atingidos passaram a ser chamados de Math's, porém, após\n"
              + "certo tempo efeitos colaterais começaram a aparecer, em momentos esporádicos, ao realizar uma ação, ora mundana, ora complexa, uma conta surgia em \n"
              + "suas mentes, para que essa ação acontecesse, o resultado precisava ser preciso. Vamos supor que um Math vai abrir uma porta, como num passe de mágica o \n"
              + "tempo parece parar a sua volta, e uma conta vem a mente, ele coloca a calculadora em sua mente para funcionar, resolve a conta e apresenta uma resposta,\n"
              + "se acertar, ele abre a porta sem problema algum, se errar, um movimento involuntário toma conta do seu corpo, e seu corpo não responde a essa ação, \n"
              + "e a conta reaparece em sua mente, erros excesivos causam problemas cerebrais que vão desde uma dor de cabeça simples, até um acidente vascular cerebral\n"
              + "que mais tarde leva a morte.\n"
              + "Após a guerra a arma foi deixada de lado pelas forças russas e caiu nas mãos de terroristas,  ela foi utilizada em diversos países e causou danos irreparaveis à milhares de pessoas.\n.\n.\n.\n"
              + "%s ao viajar para Paris a negócios 2 anos atrás, você caminhava próximo a Torre Eiffel, admirando aquela grandiosa construção, quando um zunido muito forte passou como um raio pelos seus ouvidos, e uma dor que você nunca sentiu antes tomou conta do seu cérebro, era como se mil abelhas ferroassem seu córtex cerebral, você não enxergava muita coisa a não ser os vultos das pessoas que ali estavam, fazendo o mesmo movimento que você, se contorcendo no chão até apagarem. Pouco tempo depois você acorda desnorteada, você abre seus olhos mas não enxerga muita coisa, alguns números passam pela sua mente, e embora confuso você se levanta, olha em volta e a cada passo que dá um número surge em sua mente. Contas surgem e você logo entende que sua vida nunca mais será a mesma...agora você é uma Math...\n\n",
          nome);

      System.out.printf(nome + ", você está viajando com seu marido, Alexandre, em seu avião em direção \n"
          + "as ilhas exponenciais, conhecidas por seus acidentes aéreos, você e seu marido estão \n"
          + " indo para lá com alguns objetivos simples, fotografar a região, por pura e simples curiosidade.");
      System.out.println("");
      System.out.println("");
      System.out.printf("Ás 17 horas desta sexta-feira vocês saem do território nacional e chegam ao \n"
          + "oceano atlântico, algumas alterações na rota de vôo serão necessárias, a ilha esta ao noroeste \n"
          + "e uma grande tempestade se aproxima. ");
      System.out.println("");
      System.out.println("");
      System.out.println("***Esta parte do jogo funcionará como um tutorial***");
      System.out.println(
          "***Você deve sempre digitar a letra da opção que desejar, seja em uma das escolhas do jogo, seja em uma das contas que lhe serão apresentadas.***");
      System.out.println(
          "***Você terá 3 chances para acertar a resposta das questões, recomenda-se utilizar uma calculadora ou rascunho como auxílio***");
      System.out.println(
          "***Caso desperdice as 3 chances, você sofrerá consequências, as vezes no contexto da história, outras vezes, causando Game Over, e voltando ao menu***");
      System.out.println("");
      System.out.println("O que você fará? ");
      System.out.println("a - Diminuir  a altitude de vôo. \n" + "b - Subir  a altitude  de vôo. \n"
          + "c - Apenas manter a altitude.");
      escolha = entrada.next();

      // qualquer letra chamara a funcao que contem contas simples
      switch (escolha) {
      case "a":
      case "A":
      case "b":
      case "B":
      case "c":
      case "C":
        x = equacaoSimples(sorteado);
      }
      if (x == 8) {
        game = true;
        soutGO();
        break;
      }
      System.out.println("");
      System.out.println("");
      System.out.println("Vocês entram na nuvem, grande, escura e quase maciça; \n"
          + "mas isto não te assusta nem um pouco, você é uma  Piloto renomada \n"
          + "e sabe o que deve ser feito nesta circunstancia.");
      System.out.println("");
      System.out.println("");
      boolean repeticao = false;
      while (repeticao != true) {
        System.out.println("Vamos lá " + nome + " tome a decisão correta: ");
        System.out.println("");
        System.out.println("a - Acompanhar os instrumentos e manter o controle da aeronave.");
        System.out.println("b - Tentar contato com a torre, para que a mesma possa te ajudar a sair dessa.");
        escolha = entrada.next();
        System.out.println("");
        if ("a".equalsIgnoreCase(escolha)) {
          x = equacaoSimples(sorteado);
          if (x == 8) {
            game = true;
            soutGO();
            break;
          } else
            System.out.println("Tudo certo, sua experiência faz com que você voe como se o clima não te impedisse.");
          System.out.println("");
          repeticao = true;

        } else if ("b".equalsIgnoreCase(escolha)) {
          System.out
              .println("Você não consegue contato com a torre de controle, seu rádio parece ter parado de funcionar.");
          System.out.println("");
        }
      }
      System.out.printf("Mas como em um piscar de olhos, os seus instrumentos ficam descontrolados. \n"
          + "(Ale): - O que houve %s? \n" + "(%s): - Não sei o que houve, isto nunca aconteceu!\n"
          + "(Ale): - Talvez seja a ilha, os boatos diziam isso. \n"
          + "(%s):- Amor você sabe que estes boatos não são verdadeiros, \n"
          + "isso é apenas um fenômeno natural... eu acho. \n"
          + "O avião começa a perder estabilidade, uma turbulência muito forte começa a afetar a estabilidade do \n"
          + " avião, Alexandre começa a gritar assustado, você tenta manter a calma e consegue continuar controlando \n"
          + "o avião e evitando qualquer problema maior; poucos segundos após isto um enorme raio branco acerta o seu \n"
          + "avião; vocês se assustam e gritam muito, ficam temporariamente cegos, durante isto você para de sentir o \n"
          + "motor do avião. \n Você agarra o manche na esperança de recuperar o controle: \n \n", nome, nome, nome);
      x = equacaoMedia(sorteado);
      if (x == 8) {
        System.out.printf(
            "Você sente algo diferente e logo repara que o avião esta perdendo sustentação e pode não haver mais o que fazer. \n "
                + "O avião começa a cair como uma pedra.");
        System.out.println("Você tenta novamente:");
        System.out.println("");
        x = equacaoMedia(sorteado);
        if (x == 8) {
          System.out.printf(
              " Nada parece estar dando certo hoje, você falha e o avião continua caindo como uma pedra em direção do oceano. \n"
                  + "Sem conseguir manter o controle do avião você e seu marido estão complemente assustados; a grande nuvem começa \n"
                  + "a desaparecer e na sua frente você vê a ilha ja encontrando o bico do seu avião..... \n \n \n");
          soutGO();
          game = true;
          break;
        } else {
          System.out.printf(
              "Você puxa o manche com toda a sua força e consegue estabilidade novamente, mas ainda sem os motores. \n");
        }
      } else {
        System.out.printf("Você é realmente uma exímio piloto e mantém o avião estável planando sem os motores. \n\n");
      }
      System.out.printf(" Agora sua missão é conseguir pousar com segurança na ilha.\n\n");
      x = equacaoMedia(sorteado);
      if (x == 8) {
        System.out.println(
            "Você ainda esta um pouco abalada pelo que aconteceu e algo esta atrapalhando suas habilidades como piloto, o avião começa a perder sustentação... você agora esta indo em direção a água");
        System.out.println(
            "Percebendo que não há mais tempo para um pouso calmo na praia, você tenta pousar de maneira suave sobre a água");
        System.out.printf("\n\n");
        x = equacaoMedia(sorteado);
        if (x == 8) {
          System.out.printf(
              "Mesmo tendo uma larga experiência em pousos você não consegue mais controlar esta aeronave e acaba acertando em cheio o oceano e não sobrevive ao impacto....");
          soutGO();
          game = true;
          break;
        } else {
          System.out.printf(
              "Você consegue com sua ampla experiencia como piloto pousar a aeronave sobre a água de maneira bem turbulenta, porém, segura. \nIsto por sua vez acaba chamando atenção desnecessária. \n Vocês estão próximos a costa, a noite ja esta caindo e nota-se muito movimento na água em torno do avião. \n"
                  + "Ao olhar pela janela se veem muitos peixes estranhos e criaturas aparentemente hostis:");
          System.out.printf("(Ale): - O que devemos fazer %s ? \n"
              + "(%s):- Vamos esperar, a maré vai nos levar ate a praia em algum tempo. \n"
              + "(Ale):- Mas isto não é seguro! Vamos tentar nadar até lá.\n"
              + "(%s):- De forma alguma, o avião vai ser a nossa proteção na ilha.\n\n"
              + "A noite passa e vocês conseguem restabelecer a calma dentro do possível pois o avião estava “atracado”.\n",
              nome, nome, nome);
        }
      } else {
        System.out.printf(
            "Com sua grande experiência em pousos você reconhece o melhor local para o pouso na praia e com o \n"
                + "angulo correto faz a aproximação tendo uma colisão leve e controlada. \n\n"
                + "(Ale):- %s, finalmente em terra firme, cheguei a achar que as coisas ficariam feias \n"
                + "(%s):- Por um breve segundo eu também pensei, mas você sabe quem é que manda nesse bebê - você aponta para o avião  \n"
                + "(Ale):- As vezes acho que você gosta mais desse avião do que de mim... - ele fala com tom de sarcasmo\n"
                + "(%s):- ATENÇÃO TODOS OS NATIVOS, A RAINHA DO DRAMA ESTA AQUI. - você grita aliviada por saber que estão em um paraíso tropical..seguros afinal\n\n"
                + "Você monta a poucos metros de distância do avião a barraca que trouxeram para vocês, acende uma fogueira, pega algum alimento e um vinho que estava nas bagagens, estende uma toalha de piquenique sobre o chão e convida-o a se sentar ao seu lado.\n Vocês ficam ali algumas horas, conversando sobre a vida, comendo, bebendo, rindo, depois entram na barraca, se aninham e dormem aguardando o que vos aguarda no dia de amanhã",
            nome, nome, nome);
      }

    }
    return x;
  }

  static int ato3M(String nome, String escolha, int sorteado){
    System.out.printf("Depois deste momento horrivel você acorda ainda na praia, o avião continua ali, intacto, você levanta olha em \n"  
                + "volta meio assustada e um pouco tonta por causa do impacto, depois de olhar em volta você confere o combustivel \n"
                + "do avião e repara que tem o suficiente para a volta para casa, determidada como uma heróina, você pega o rádio e \n"
                + "grita em alto em bom som: ");
                System.out.printf("((%s)): EU (%s), QUERO MEU ESPOSO DE VOLTA!\n", nome);
                System.out.printf("Pelo radio você escuta gritos e grunidos graves, os gritos são de seu marido e os grunidos que não podem ser \n"
                + "compriendidos são daqueles homens e mulheres que o capturaram.\n"
                + "Obstinada, você corre para dentro da mata gritando pelo nome de dele.\n"
                + "((%s)): ALEXANDRE ONDE VOCÊ ESTÁ!?\n", nome);
                System.out.printf("E quanto mais corre para dentro da mata, mais os barulhos aumentam e você o encontra preso em uma árvore cercado pelos nativos.\n"
                + "Neste momento Alexandre tenta se soltar enquanto os nativos vão em sua direção de maneira calma\n");
                x = equacaoMedia(sorteado);
                if (x==8){
                  System.out.printf("você os atrai para longe dele, correndo para a direção da praia.\n"
                + "((%s)): ALEXANDRE, SE SOLTA E VENHA PARA O AVIÃO!\n"
                + "Com uma pedra que estava ao lado de Alexandre, ele consegue cortar as cordas e faz o que lhe foi dito.\n");
                }
                else {
                  System.out.printf("Alexandre se solta e pede para que você vá para o avião.\n"
                + "(Alexandre): Corra para o avião eu te encontro lá! \n"
                + "Com uma pedra que estava ao seu lado, Alexandre consegue cortar as cordas e faz o que lhe foi dito.\n");
                }

  }

  // funcao para todo o desenrolar da historia
  static void historia() {
    String nome = "", sexo = "", simNao, escolha = "";
    // inteiro a ser randomizado
    int sorteado = 0;
    // recebe todos os testes sorteados
    int x = 0;

    // boolean para sempre que der "false" estrará dentro dos loops
    boolean teste = false;
    boolean game = false;
    while (game == false) {
      System.out.println(
          "Dentro dos próximos momentos você vai moldar a história do seu personagem dentro " + "da nossa aventura.");
      System.out.println("");
      while (teste != true) {
        System.out.println("Digite o nome do seu personagem:");
        nome = entrada.next();
        System.out.println("Seu nome agora é " + nome + " tem certeza disso? Responda SIM ou NÃO");
        simNao = entrada.next();
        teste = confirmador(simNao);
      }
      teste = false;
      while (teste != true) {
        System.out.println("Seu personagem é Homem ou Mulher?");
        sexo = entrada.next();
        System.out.println("Você escolheu ser " + sexo + " esta certo disso? Digite SIM ou NÃO");
        simNao = entrada.next();
        teste = confirmador(simNao);
      }
      // História para os que escolheram ser do sexo masculino
      if (sexo.equalsIgnoreCase("homem")) {
        x = ato1H(nome, escolha, sorteado);
        if (x == 8) {
          soutGO();
          game = true;
          break;
        }
        x = ato2H(nome, escolha, sorteado);
        if (x == 8) {
          soutGO();
          game = true;
          break;
        }

      }
      // História do jogo para os jogadores que escolheram ser do sexo feminino
      else if (sexo.equalsIgnoreCase("Mulher")) {
        x = ato1M(nome, escolha, sorteado);
        if (x == 8) {
          soutGO();
          game = true;
          break;
        }
      }
    }
  }

  // funcao para instrucoes de como jogar
  static void instrucoes() {
    System.out
        .printf("****INSTRUÇÕES**** \n" + "- Este jogo foi pensado para ser jogado de maneira facil e intuitiva. \n"
            + "- Utilize o teclado para selecionar as opções corretas");
    System.out.println(
        "- Sempre digite a letra da opção que desejar, seja em uma das escolhas do jogo, seja em uma das contas que lhe serão apresentadas.");
    System.out.println(
        "- Você terá 3 chances para acertar a resposta das questões, recomenda-se utilizar uma calculadora ou rascunho como auxílio");
    System.out.println(
        "- Caso desperdice as 3 chances, você sofrerá consequências, as vezes no contexto da história, outras vezes, causando Game Over, e voltando ao menu");
  }

  // funcao de creditos que contem os nomes dos criadores do jogo
  static void creditos() {
    System.out.println(
        "Este jogo foi produzido por quatro aluno do primeiro semestre de TADS da faculdade Senac Santo Amaro.");
    System.out.println("");
    System.out.println("História:");
    System.out.println("Alexandre Marcopoulos Henrique");
    System.out.println("Denys Roger A. B. dos Santos");
    System.out.println("Sara Caroline do Nascimento");
    System.out.println("Giovanna Prates");
    System.out.println("");
    System.out.println("Produção:");
    System.out.println("Alexandre Marcopoulos Henrique");
    System.out.println("Denys Roger A. B. dos Santos");
    System.out.println("Sara Caroline do Nascimento");
    System.out.println("");
    System.out.println("Referências:");
    System.out.println("CyberChase");
    System.out.println("The Forest");
    // System.out.println("Capitão América, risos");
    System.out.println("");
  }

  // funcao do menu principal
  static void menuPrincipal(String n1) {

    switch (n1) {

    case "A":
    case "a":
      instrucoes();
      break;

    case "B":
    case "b":
      historia();

      break;

    case "C":
    case "c":
      creditos();
      break;

    case "D":
    case "d":
      System.out.println("Obrigado por jogar");
      break;

    default:
      System.out.println("Código inválido!");
    }
  }

  // funcao para poder chamar todas as outras funcoes
  public static void main(String[] args) {
    String n1;

    do {

      System.out.println("");
      System.out.println("**DISTOPIA MATEMÁTICA**");
      System.out.println("A - INSTRUÇÕES");
      System.out.println("B - JOGAR");
      System.out.println("C - CRÉDITOS");
      System.out.println("D - SAIR");

      System.out.println("Entre com uma opção:");
      n1 = entrada.next();
      menuPrincipal(n1);

    } while (!(n1.equalsIgnoreCase("D")));
  }
}
