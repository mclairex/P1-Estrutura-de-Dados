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

    public void executarCicloDeCPU() {
        cicloAtual++;
        System.out.println("\n=== CICLO " + cicloAtual + " ===");

        // 1. Início do ciclo: desbloqueie o processo mais antigo da lista_bloqueados
        desbloquearProcesso();

        // 2. Mostrar estado atual (saída padronizada exigida)
        mostrarEstadoListas();

        // 3. Verificar regra de prevenção de inanição
        if (contadorCiclosAltaPrioridade >= 5) {
            System.out.println("🚨 REGRA ANTI-INANIÇÃO ATIVADA!");
            executarProcessoMediaOuBaixa();
            contadorCiclosAltaPrioridade = 0; // Contador é zerado após execução
            return;
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



    }


