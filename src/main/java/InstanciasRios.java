public enum InstanciasRios {
    TIETE(new Rio("Tiet�", 1000, 500, QualidadeAgua.MUITO_POLUIDA,
            DAO.getPrimeiraCuriosidade("Tiet�"),
            DAO.getSegundaCuriosidade("Tiet�"),
            DAO.getTerceiraCuriosidade("Tiet�"))),
    PINHEIROS(new Rio("Pinheiros", 4000, 2800, QualidadeAgua.POLUIDA,
            DAO.getPrimeiraCuriosidade("Pinheiros"),
            DAO.getSegundaCuriosidade("Pinheiros"),
            DAO.getTerceiraCuriosidade("Pinheiros"))),
    TAMANDUATEI(new Rio("Tamanduatei", 5000, 3600, QualidadeAgua.EXTREMAMENTE_POLUIDA,
            DAO.getPrimeiraCuriosidade("Tamanduatei"),
            DAO.getSegundaCuriosidade("Tamanduatei"),
            DAO.getTerceiraCuriosidade("Tamanduatei"))),
    PIRACICABA(new Rio("Piracicaba", 3000, 2300, QualidadeAgua.EXTREMAMENTE_POLUIDA,
            DAO.getPrimeiraCuriosidade("Piracicaba"),
            DAO.getSegundaCuriosidade("Piracicaba"),
            DAO.getTerceiraCuriosidade("Piracicaba"))),
    ANHANGABAU(new Rio("Anhangaba�", 7000, 4000, QualidadeAgua.POLUIDA,
            DAO.getPrimeiraCuriosidade("Anhangaba�"),
            DAO.getSegundaCuriosidade("Anhangaba�"),
            DAO.getTerceiraCuriosidade("Anhangaba�"))),
    PARAIBADOSUL(new Rio("Para�ba do Sul", 4500, 3600, QualidadeAgua.MUITO_POLUIDA,
            DAO.getPrimeiraCuriosidade("Para�ba do Sul"),
            DAO.getSegundaCuriosidade("Para�ba do Sul"),
            DAO.getTerceiraCuriosidade("Para�ba do Sul"))),
    ARICANDUVA(new Rio("Aricanduva", 2800, 2000, QualidadeAgua.EXTREMAMENTE_POLUIDA,
            DAO.getPrimeiraCuriosidade("Aricanduva"),
            DAO.getSegundaCuriosidade("Aricanduva"),
            DAO.getTerceiraCuriosidade("Aricanduva"))),
    KURUPIRA(new Rio("Kurupira", 45, 35, QualidadeAgua.MUITO_POLUIDA,
            DAO.getPrimeiraCuriosidade("Kurupira"),
            DAO.getSegundaCuriosidade("Kurupira"),
            DAO.getTerceiraCuriosidade("Kurupira"))),
    JACARE(new Rio("Jacare", 60, 35, QualidadeAgua.EXTREMAMENTE_POLUIDA,
            DAO.getPrimeiraCuriosidade("Jacare"),
            DAO.getSegundaCuriosidade("Jacare"),
            DAO.getTerceiraCuriosidade("Jacare"))),
    PEIXE(new Rio("Peixe", 90, 45, QualidadeAgua.POLUIDA,
            DAO.getPrimeiraCuriosidade("Peixe"),
            DAO.getSegundaCuriosidade("Peixe"),
            DAO.getTerceiraCuriosidade("Peixe"))),
    GATO(new Rio("Gato", 50, 37, QualidadeAgua.POLUIDA,
            DAO.getPrimeiraCuriosidade("Gato"),
            DAO.getSegundaCuriosidade("Gato"),
            DAO.getTerceiraCuriosidade("Gato"))),
    MYU(new Rio("Myu", 120, 95, QualidadeAgua.MUITO_BOA,
            DAO.getPrimeiraCuriosidade("Myu"),
            DAO.getSegundaCuriosidade("Myu"),
            DAO.getTerceiraCuriosidade("Myu"))),
    PIRAPATA(new Rio("Pirapata", 500, 100, QualidadeAgua.BOA)),
    CAMBOIO(new Rio("Camboio", 350, 50, QualidadeAgua.BOA)),
    LEOPARDOCARURU(new Rio("Leopardo Caruru", 600, 150, QualidadeAgua.BOA)),
    BEAUTY(new Rio("Beauty", 800, 120, QualidadeAgua.BOA)),
    PATACAMELO(new Rio("Patacamelo", 100, 40, QualidadeAgua.BOA)),
    PEDRINHAS(new Rio("Pedrinhas", 230, 60, QualidadeAgua.BOA)),
    PINAPORA(new Rio("Pinapora", 200, 20, QualidadeAgua.MUITO_BOA)),
    FERROJA(new Rio("Ferroja", 500, 100, QualidadeAgua.BOA)),
    AMAGUA(new Rio("Amagu�", 250, 60, QualidadeAgua.BOA)),
    CANTOS(new Rio("Cantos", 600, 100, QualidadeAgua.BOA)),
    MARTELO(new Rio("Martelo", 100, 30, QualidadeAgua.BOA)),
    DELTA(new Rio("Delta", 75, 10, QualidadeAgua.BOA)),
    ;

    private Rio rio;

    InstanciasRios(Rio rio) {
        this.rio = rio;
    }

    public Rio get() {
        return rio;
    }
}