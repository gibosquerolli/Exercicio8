package com.mycompany.exercicio8;

import javax.swing.JOptionPane;

public class Exercicio8 {

    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        int num1 = Integer.parseInt(input1);
        
        String input2 = JOptionPane.showInputDialog("Digite o segundo número: ");
        int num2 = Integer.parseInt(input2);
        
        int soma = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "A soma é: " + soma);
        
    }
}
