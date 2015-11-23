class Aluno{
    string nome;
    int periodo;
    double coef;
public:
    Aluno(string novo_aluno){
        nome = novo_aluno;
        cout<<"Aluno criado"<<endl;
    }
    Aluno(string novo_aluno, int novo_periodo, int novo_coef){
        nome = novo_aluno;
        periodo = novo_periodo;
        coef = novo_coef;
        cout<<"Aluno criado"<<endl;
    }
    ~Aluno(){
        cout<<"Aluno Destruido"<<endl;
    }
    void inserePeriodo(int novo_periodo){
        periodo = novo_periodo;
        cout<<"Periodo adicionado"<<endl;
    }
    void insereCoef(double novo_coef){
        coef = novo_coef;
        cout<<"Coeficiente adicionado"<<endl;
    }
    void ImprimeDados(){
        cout<<""<<nome;
        cout<<""<<periodo;
        cout<<""<<coef<<endl;
    }
};
