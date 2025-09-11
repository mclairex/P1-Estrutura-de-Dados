public class Escalonador {
    // definir as lista de processos
    private ListasDeProcessos altaPrioridade;
    private ListasDeProcessos mediaPrioridade;
    private ListasDeProcessos baixaPrioridade;
    private ListasDeProcessos bloqueados;


    private int contagemAltaPrioridade;

    // permite que o escalonador seja chamado em qualquer lugar do código
    public Escalonador(){
        //criando listas novas para entrada de cada item de acordo com seus atributos/prioridades
        this.altaPrioridade = new ListaDeProcessos();
        this.baixaPrioridade = new ListaDeProcessos();
        this.mediaPrioridade = new ListaDeProcessos();
        this.bloqueados = new ListaDeProcessos();
        this.contagemAltaPrioridade = 0;
    }

    //Adicionar na lista baseado em sua prioridade

    public void adicionarProcessos(Processo processo){
        switch (processo.getPrioridade()){
            case 1:
                altaPrioridade.adicionarNoFinal(processo);
                break;

            case 2:
                mediaPrioridade.adicionarNoFinal(processo);

            case 3:
                baixaPrioridade.adicionarNoFnial(processo);

            default:
                System.out.println("Essa prioridade é inválida " + processo.getNome());
        }
    }

    public void executarCiclosDeCPU(){

        desbloqueioDeProcessos();

        //verifica se vai ser necessario o método anti inanição, implementado pela Maria Clara
        Processo processoParaExecutar = null;

        if (contagemAltaPrioridade >= 5){
            processoParaExecutar = obterProcessoAntiInanicao();
            if(processoParaExecutar != null){
                contagemAltaPrioridade = 0;
            }
        }else {
            processoParaExecutar = obterNovoProcesso();
        }




    }

}

