/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ado_10_projeto;


import javax.swing.JOptionPane;

/**
 *
 * @author rafac
 */
public class ADO_10_PROJETO {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String nome;
        int chutes = 1;
        int tentativas = 0;
        int randon = (int) (1 + Math.random() * 100);
        int botao;
        boolean continuar = true;
        nome = JOptionPane.showInputDialog(null, "Olá,qual o seu nome?");

        while (continuar) {
            tentativas = Integer.parseInt(JOptionPane.showInputDialog(null, "Vamos começar,qual o número?"));

            for (int i = 0; i < 10; i++) {
                while (tentativas != randon && chutes < 5) {
                    if (tentativas < randon) {
                        JOptionPane.showMessageDialog(null, "Tente um numero maior " + nome + ".");
                    } else {
                        JOptionPane.showMessageDialog(null, "Tente um numero menor " + nome + ".");
                    }
                    tentativas++;
                    chutes++;
                    tentativas = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o número? "));
                }
            }
            if (tentativas == randon) {
                JOptionPane.showMessageDialog(null, "Parabéns " + nome + " você acertou na " + chutes + " tentativa(s)");
                botao = JOptionPane.showConfirmDialog(null, "Gostaria de jogar novamente?", "Jogo da Adivinhação", JOptionPane.YES_NO_OPTION);
                continuar = botao == JOptionPane.YES_OPTION; 
            } else {
                botao = JOptionPane.showConfirmDialog(null, "Acabaram suas chances!Quer Jogar de novo?", "Jogo da Adivinhação", JOptionPane.YES_NO_OPTION);
            }
            if (botao == JOptionPane.YES_OPTION) {
                continuar = true; 
            } else {
                continuar = true; 
            }
        }
        System.exit(0);
    }

}

