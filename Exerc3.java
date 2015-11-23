class Aluno{
    string nome;
    int periodo;
    double coef;
public:
    Aluno(string novo_aluno);;
    Aluno(string novo_aluno, int novo_periodo, int novo_coef);
    ~Aluno();
    void inserePeriodo(int novo_periodo);
    void insereCoef(double novo_coef);
    void ImprimeDados();
};
