public class Escalonador {
    // definir as lista de processos
    private ListaDeProcessos listaAltaPrioridade;
    private ListaDeProcessos listaMediaPrioridade;
    private ListaDeProcessos listaBaixaPrioridade;
    private ListaDeProcessos listaBloqueados;
    private int contadorCiclosAltaPrioridade;
    private int cicloAtual;

    public Escalonador() {
        this.listaAltaPrioridade = new ListaDeProcessos();
        this.listaMediaPrioridade = new ListaDeProcessos();
        this.listaBaixaPrioridade = new ListaDeProcessos();
        this.listaBloqueados = new ListaDeProcessos();
        this.contadorCiclosAltaPrioridade = 0;
        this.cicloAtual = 0;
    }

    // Adiciona processo na lista correspondente à sua prioridade
    public void adicionarProcesso(Processo processo) {
        switch(processo.prioridade) {
            case 1: // Alta prioridade
                listaAltaPrioridade.adicionarNoFinal(processo);
                break;
            case 2: // Média prioridade
                listaMediaPrioridade.adicionarNoFinal(processo);
                break;
            case 3: // Baixa prioridade
                listaBaixaPrioridade.adicionarNoFinal(processo);
                break;
            default:
                System.out.println("⚠️ Prioridade inválida para processo P" + processo.id);
        }
    }

}





