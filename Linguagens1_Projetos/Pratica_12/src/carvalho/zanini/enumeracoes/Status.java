package carvalho.zanini.enumeracoes;

public enum Status {
    PLATINADO{
        @Override
        public String toString() {
            return "Platinado";
        }
    },
    NAO_INICIADO{
        @Override
        public String toString() {
            return "Não Iniciado";
        }
    },
    TERMINADO{
        @Override
        public String toString() {
            return "Terminado";
        }
    },
    JOGANDO{
        @Override
        public String toString() {
            return "Jogando";
        }
    },
    ABANDONADO{
        @Override
        public String toString() {
            return "Não estou jogando, pois estou estudando, mas voltarei a jogar assim que possível!";
        }
    }
}
