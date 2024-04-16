#language:pt
#Author: Henrique de Carvalho
#Data de criação: 16/04/2024
#Version: 1.0
#Encoding: UTF-8

@Teste @Regressivo
Funcionalidade: youtube

  @Teste01
  Cenario: Validar Pesquisa com sucesso
    Dado preenchar o campo com "sonia fala youtube" e clicar em procurar
    Entao Sera apresentado os videos
