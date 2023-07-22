# Projeto Final - Java: aplicando Orientação a Objetos

***

![Static Badge](https://img.shields.io/badge/Status-Done-dark_green)

*Projeto Final do curso Java: aplicando Orientação a Objetos da Alura*

### Sistema para áudio: músicas e podcasts

Registre cada áudio especificando título, duração em segundos e ano de lançamento.
O áudio pode ainda ser do tipo Música ou Podcast. Para música, especifique artista performista,
autor e álbum a que pertence. Se for podcast, especifique produtor, apresentador e sua série.


Reproduza, curta e exiba a ficha técnica de cada faixa. Veja sua avaliação, determinada pelo percentual de curtidas sobre
o número total de reproduções. Dependendo do quão alto é esse percentual, mensagens diferentes
aparecem na tela aplicando o filtro de recomendação.

#### Principal

Na classe *Principal*, crio os objetos *primeiraMusica* e *segundaMusica*, do tipo *Musica*, e *primeiroPodcast* e *segundoPodcast*
do tipo *Podcast*. Especifico seus atributose executo os métodos *reproduzir()* e *curtir()* diversas vezes. Então exibo suas fichas técnicas através do método *exibeFichaTecnica()*. O programa me retorna uma mensagem com os
atributos definidos e a classificação do objeto em relação às suas curtidas e reproduções.