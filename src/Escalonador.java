public class Escalonador {
    // definir as lista de processos
    private ListasDeProcessos altaPrioridade;
    private ListasDeProcessos mediaPrioridade;
    private ListasDeProcessos baixaPrioridade;
    private ListasDeProcessos bloqueados;
    private ListasDeProcessos contagemAltaPrioridade;

    // permite que o escalonador seja chamado em qualquer lugar do código
    public Escalonador(){
        //criando listas novas para entrada de cada item de acordo com seus atributos/prioridades
        this.altaPrioridade = new ListaDeProcessos();
        this.baixaPrioridade = new ListaDeProcessos();
        this.mediaPrioridade = new ListaDeProcessos();
        this.bloqueados = new ListaDeProcessos();
        this.contagemAltaPrioridade = 0;


    }

    public void proximoCiclo(){
        //implementar lógica...
    }

}

