public class Software {
        private String nome;
        private String versao;
        private int idSoftware;

        public Software(String nome, String versao, int idSoftware) {
            this.nome = nome;
            this.versao = versao;
            this.idSoftware = idSoftware;
        }

    @Override
    public String toString() {
        return "Software{" +
                "nome='" + nome + '\'' +
                ", versao='" + versao + '\'' +
                ", idSoftware=" + idSoftware +
                '}';
    }

    public boolean acessar(Trader trader) {
            return true;
        }

        public void cadastrarPromotor(Promotor promotor) {
        }

        public void cadastrarRoteiro(Roteiro roteiro) {
        }

        public GrandeMercado indicarProximoMercado(Promotor promotor) {
            return null;
        }

}
