Algoritmo "AVIAGEM"
//PROJETO DE MENU EM PSEUDOCODIGO PARA AGENCIA DE VIAGEM
//Aluno: ALAN MORAES
//TURMA: T3 SQUAD 027
//RECODE 2022
const
valor = 200
Var

numeroMenu:inteiro
i,j: inteiro
cliente, cdestino, continue: caracter
nome: vetor [1..valor,1..4] de caracter
destino: vetor[1..valor,1..3] de caracter

Inicio


Enquanto verdadeiro faca
Escreval ("=========================== AVIAGEM ==============================")

Escreval ("---Area do Cliente---")
Escreval ("(1) Cadastrar Cliente")
Escreval ("(2) Cadastrar Destino")
Escreval ("(3) Consultar Cliente")
Escreval ("(4) Consultar Destino")
Escreval ("(5) Sair")
leia (numeroMenu)

escolha numeroMenu

caso 1
Limpatela
Escreval ("=========================== AVIAGEM ==============================")
   escreval("---Area do Cliente---")
   escreval ("Cadastro de Cliente")
   para i de 1 ate valor faca
   escreval ("Digite o Nome Completo")
   leia (nome[i])
   para j de 1 ate 1 faca
   escreval ("Digite o CPF")
   leia (nome[i,2])
   escreval ("Digite o email")
   leia (nome[i,3])
   escreval ("Digite seu Endereço")
   leia (nome[i,4])
   Escreval ("Cadastro Finalizado com Sucesso!")
   interrompa
   fimpara

   Escreval ("Deseja Cadastrar outro cliente? (S/N)")
   leia(continue)
   se (continue <> "S") e (continue <> "s")entao
       interrompa
       limpatela
       fimse
fimpara

caso 2
 Limpatela
Escreval ("=========================== AVIAGEM ==============================")
   escreval("---Area do Cliente---")
   escreval ("Cadastro de Destino")
   para i de 1 ate valor faca
   escreval ("Destino: ")
   leia (destino[i])
   para j de 1 ate 1 faca
   escreval ("Estado: ")
   leia (destino[i,2])
    escreval ("País: ")
   leia (destino[i,3])
   Escreval ("Cadastro Finalizado com Sucesso!")
   interrompa
fimpara
   Escreval ("Deseja Cadastrar outro destino? (S/N)")
   leia(continue)
   se (continue <> "S") e (continue <> "s") entao
       interrompa
       limpatela
       fimse

fimpara

caso 3
Limpatela
 para i de 1 ate valor faca
Escreval ("=========================== AVIAGEM ==============================")
   escreval("---Area do Cliente---")
   escreval ("---Consultar cliente---")
   escreval ("Digite o nome do cliente que deseja consultar: ")
   leia (cliente)
   se (cliente) = (nome[i]) entao
   escreval ("===============================================================")
   escreval ("Nome: ", nome[i])
   escreval ("CPF: ", nome[i,2])
   escreval ("Email: ", nome[i,3])
   escreval ("Endereço: ", nome[i,4])
   senao
   Escreval("Cliente não encontrado")
   fimse
   Escreval ("Deseja Pesquisar outro cliente? (S/N)")
   leia(continue)
   se (continue <> "S") e (continue <> "s") entao
       interrompa
       limpatela
       fimse
fimpara
caso 4
     Limpatela
para i de 1 ate valor faca
Escreval ("=========================== AVIAGEM ==============================")
   escreval("---Area do Cliente---")
   escreval ("---Consultar destino---")
   escreval ("Digite o destino que deseja consultar: ")
   leia (cdestino)
   se (cdestino) = (destino[i]) entao
   escreval ("===============================================================")
   escreval ("Destino: ", destino[i])
   escreval ("Cidade: ", destino[i,2])
   escreval ("Estado: ", destino[i,3])
   senao
   Escreval("Destino não encontrado")
   fimse
    Escreval ("Deseja Pesquisar outro destino? (S/N)")
   leia(continue)
   se (continue <> "S") e (continue <> "s") entao
       interrompa
       limpatela
       fimse
fimpara

caso 5
limpatela
escreval ("========================= VOLTE SEMPRE ===========================")
escreval ("================= OBRIGADO POR UTILIZAR AVIAGEM ==================")
   fimalgoritmo
   outrocaso
   limpatela
   escreval("Codigo Inexistente!")
   fimescolha
fimenquanto
Fimalgoritmo