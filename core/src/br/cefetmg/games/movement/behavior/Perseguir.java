package br.cefetmg.games.movement.behavior;

import br.cefetmg.games.movement.Direcionamento;
import br.cefetmg.games.movement.Pose;
import com.badlogic.gdx.math.Vector3;

/**
 *
 * @author Flávio Coutinho <fegemo@gmail.com>
 */
public class Perseguir extends Algoritmo {

    private static final char NOME = 's';

    public Perseguir(float maxVelocidade) {
        this(NOME, maxVelocidade);
    }

    protected Perseguir(char nome, float maxVelocidade) {
        super(nome);
        this.maxVelocidade = maxVelocidade;
    }

    @Override
    public Direcionamento guiar(Pose agente) {
        Direcionamento output = new Direcionamento();
               
        // Cria um vetor auxiliar para guardar a posição do alvo
        Vector3 aux = new Vector3(this.alvo.getObjetivo());
        aux.sub(agente.posicao);
        aux.nor();
        aux.scl(maxVelocidade);
        
        
        output.velocidade = aux;
        //output.0

        // Calcula a direção para onde o agente deve ir
        // Input: a posicao do objetivo (this.alvo) e deste agente
        // ..
        // ..
        // ..
        // ..
        // Output: vetor velocidade (apontando na direção encontrada) 
        //         limitado pela maxVelocidade (tangencial)
        // PS: não é necessário definir a rotação
        return output;
    }

}
