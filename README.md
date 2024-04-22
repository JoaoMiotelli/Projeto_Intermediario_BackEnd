# Projeto Intermediario BackEnd

## Imports e Pacotes:

O código importa classes necessárias do Spring Framework, como @Autowired, @RestController, ResponseEntity, @RequestBody, e outras. Também existem importações de classes dos próprios pacotes do projeto, como AjudaDTO, AjudaService, AnimeService, AnimeData e AnimeModel.

## Definição do Controlador AnimeController:

O controlador AnimeController é uma classe que define endpoints para lidar com solicitações HTTP relacionadas a animes. Ele é anotado com @RestController e @RequestMapping para definir o prefixo de rota para todos os endpoints. Possui dois métodos de endpoint:

    getAnimeFact(): Um endpoint GET que retorna uma resposta com um fato aleatório sobre anime. Este método chama o método getAnimeFact() do AnimeService para obter o fato do anime.
    processData(): Um endpoint POST que recebe dados como um corpo da solicitação e retorna uma resposta processada. Este método chama o método processData() do AnimeService para processar os dados recebidos.

## Definição do Controlador AjudaController:

Dentro do controlador AnimeController, há uma classe interna AjudaController que define um endpoint para obter informações de ajuda. Este endpoint está mapeado para "/ajuda" e retorna um objeto AjudaDTO com informações sobre o estudante e o projeto. Esse endpoint chama o método getAjuda() do AjudaService para obter essas informações.

## Classes de Modelo:

As classes AjudaDTO, AnimeData e AnimeModel são classes de modelo que representam os dados usados pelo sistema. AjudaDTO contém informações sobre o estudante e o projeto. AnimeData contém dados sobre um anime específico, como seu ID, nome e imagem. AnimeModel é um modelo que envolve uma lista de AnimeData e também contém um indicador de sucesso.

## Serviços:

AjudaService é um serviço que fornece informações de ajuda ao controlador AjudaController. AnimeService é um serviço que lida com chamadas a uma API externa para obter fatos aleatórios sobre anime e para processar dados recebidos em um endpoint POST.

## Injeção de Dependência:

O AnimeController possui uma dependência de AnimeService, que é injetada por meio de construtor. O AjudaController possui uma dependência de AjudaService, que é injetada automaticamente usando a anotação @Autowired.
