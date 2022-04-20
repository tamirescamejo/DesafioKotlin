package com.company.catalisa

import kotlin.system.exitProcess

fun main() {

    menuOpcoes()
    cadastrarNotasAluno()

}

fun menuOpcoes(){

    println("    ===========================" );
    println("   |       Novo Cálculo        |");
    println("   |        1 -> Sim           |");
    println("   |        2 -> Não           |");
    println("   ===========================\n");

    val opcao = readln().toInt()

    when(opcao){

        1 -> cadastrarNotasAluno()

        2 -> exitProcess(0)

        else -> {
            println("Número inválido!")
        }
    }
}

fun cadastrarNotasAluno() {

    println("Digite o nome do aluno: ")
    val nomeAluno = readln()

    val vetorNotasAluno = IntArray(4)

    for(i: Int in vetorNotasAluno.indices){
        print("Insira a ${i+1}° nota do aluno: ")
        vetorNotasAluno[i] = readln().toInt()

        if (vetorNotasAluno[i] < 0 || vetorNotasAluno[i] > 10){
            println("Nota inválida. Digite uma nota de 0 á 10")
            print("Insira a ${i+1}° nota do aluno: ")
            vetorNotasAluno[i] = readln().toInt()
        }

    }

    calcularMedia(vetorNotasAluno)
}

fun calcularMedia(vetorNotasAluno: IntArray){

    var soma = 0

    for(i: Int in vetorNotasAluno.indices) {

        soma += vetorNotasAluno[i]
    }
        val media = soma / 4

        println("====================================")
        println("A média semestral do aluno é: $media")
        println("====================================")

    menuOpcoes()
}