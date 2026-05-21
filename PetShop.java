public class PetShop {

    // ATRIBUTOS (estado da máquina)
    private String nomePet; //nome do pet
    private int agua; // quantidade de água
    private int shampoo; // quantidade de shampoo
    private boolean temPet; // se tem pet na máquina
    private boolean petLimpo; // se o pet já foi lavado
    private boolean precisaLimpar; // se precisa limpar a máquina

    // CONSTRUTOR (estado inicial)
    public PetShop() {
        this.agua = 0;
        this.shampoo = 0;
        this.temPet = false;
        this.petLimpo = false;
        this.precisaLimpar = false;
    }

    // COLOCAR PET NA MÁQUINA
    public void colocarPet(String nome) {
        if (temPet) {
            System.out.println("Já existe um pet na máquina!");
            return;
        }

        if (precisaLimpar) {
            System.out.println("A máquina precisa ser limpa antes de colocar outro pet!");
            return;
        }

        temPet = true;
        petLimpo = false;
        nomePet = nome;
        System.out.println("Pet " + nomePet + " colocado na máquina.");
    }

    // RETIRAR PET
    public void retirarPet() {
        if (!temPet) {
            System.out.println("Não há pet na máquina.");
            return;
        }

        if (!petLimpo) {
            precisaLimpar = true;
            System.out.println("Pet retirado sem estar limpo. Será necessário limpar a máquina!");
        } else {
            System.out.println("Pet " + nomePet + " retirado.");
        }

        temPet = false;
        nomePet = null;
    }

    // DAR BANHO
    public void darBanho() {
        if (!temPet) {
            System.out.println("Não há pet na máquina!");
            return;
        }

        if (agua < 10 || shampoo < 2) {
            System.out.println("Não há recursos suficientes para o banho!");
            return;
        }

        agua -= 10;
        shampoo -= 2;
        petLimpo = true;

        System.out.println("Banho realizado no pet " + nomePet + " com sucesso!");
    }

    // ABASTECER ÁGUA (2 litros por vez)
    public void abastecerAgua() {
        if (agua + 2 > 30) {
            System.out.println("Capacidade máxima de água atingida!");
            return;
        }

        agua += 2;
        System.out.println("Água abastecida. Nível atual: " + agua);
    }

    // ABASTECER SHAMPOO (2 litros por vez)
    public void abastecerShampoo() {
        if (shampoo + 2 > 10) {
            System.out.println("Capacidade máxima de shampoo atingida!");
            return;
        }

        shampoo += 2;
        System.out.println("Shampoo abastecido. Nível atual: " + shampoo);
    }

    // VER NÍVEL DE ÁGUA
    public void verificarAgua() {
        System.out.println("Nível de água: " + agua + " litros");
    }

    // VER NÍVEL DE SHAMPOO
    public void verificarShampoo() {
        System.out.println("Nível de shampoo: " + shampoo + " litros");
    }

    // VER SE TEM PET
    public void verificarPet() {
        if (temPet) {
            System.out.println("Há um pet na máquina.");
        } else {
            System.out.println("Não há pet na máquina.");
        }
    }

    // LIMPAR MÁQUINA
    public void limparMaquina() {
        if (!precisaLimpar) {
            System.out.println("A máquina já está limpa.");
            return;
        }

        if (agua < 3 || shampoo < 1) {
            System.out.println("Não há recursos suficientes para limpeza!");
            return;
        }

        agua -= 3;
        shampoo -= 1;
        precisaLimpar = false;

        System.out.println("Máquina limpa com sucesso!");
    }
}