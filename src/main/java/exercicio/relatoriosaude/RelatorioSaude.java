/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicio.relatoriosaude;

import java.util.Scanner;

/**
 *
 * @author Masso
 */
public class RelatorioSaude {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        String name = teclado.nextLine();
        
        System.out.print("Digite o seu sobrenome: ");
        String surename = teclado.nextLine();
        
        System.out.print("Digite o seu gênero: ");
        String gender = teclado.nextLine();
        
        System.out.print("Digite o dia que nasceu: ");
        int day = teclado.nextInt();
        
        System.out.print("Digite o mes que nasceu: ");
        int month = teclado.nextInt();
        
        System.out.print("Digite o ano que nasceu: ");
        int year = teclado.nextInt();
        
        System.out.print("Digite a sua altura: ");
        double height = teclado.nextDouble();
        
        System.out.print("Digite o seu peso: ");
        double weight = teclado.nextDouble();
        
        HealthProfile profile = new HealthProfile(name, surename, gender, day, month, year, height, weight);
        
        int age = profile.getAge(2023);
        double imc = profile.getIMC();
        System.out.format("Olá %s ! Você tem %d anos e o seu IMC é %.1f", name, age, imc);
    }
}
